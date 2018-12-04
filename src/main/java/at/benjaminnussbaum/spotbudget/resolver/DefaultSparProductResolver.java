package at.benjaminnussbaum.spotbudget.resolver;

import at.benjaminnussbaum.spotbudget.types.beans.ProductData;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlHeading1;
import com.gargoylesoftware.htmlunit.html.HtmlImage;
import com.gargoylesoftware.htmlunit.html.HtmlLabel;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import io.spotnext.core.infrastructure.support.Logger;

import java.io.File;
import java.net.URI;
import java.net.URL;
import java.text.NumberFormat;
import java.util.Locale;


public class DefaultSparProductResolver {
	public static final String BASE_URL = "https://www.interspar.at/shop/lebensmittel/p/";
	
	public ProductData resolveSparProduct(String productCode){
		String productId = productCode;
		final ProductData productData = new ProductData();
		
		WebClient client = new WebClient();
		client.getOptions().setCssEnabled(false);
		client.getOptions().setJavaScriptEnabled(false);
		try {
			String searchUrl = BASE_URL + productId;
			
			HtmlPage page = null;
			File webSiteFile = null;
			URL fileUrl = getClass().getResource(String.format("/data/sample/scrapedWebsites/%s.html",productId));
			if (fileUrl != null){
			webSiteFile = new File(fileUrl.getFile());
			} else {
				URL websiteFolderUrl = getClass().getResource("/data/sample/scrapedWebsites/");
				File parentDirectory = new File(new URI(websiteFolderUrl.toString()));
				webSiteFile = new File(parentDirectory, String.format("%s.html",productId));
			}
			
			if (webSiteFile.exists()){
				page = client.getPage(webSiteFile.toURL());
			} else {
				page = client.getPage(searchUrl);
			}
			
			if (page != null) {
				HtmlHeading1 heading = page.getFirstByXPath("//h1[@class='productDetailsName']");
				String productTitle = heading.getAttribute("title");
				
				HtmlLabel priceLabel = page.getFirstByXPath("//*[@id='productDetailsPageCenterWrapper']/div[2]/div[2]/div[3]/div[1]/label[2]");
				String price = priceLabel.asText();
				
				String productPictureUrl = ((HtmlImage) page.getFirstByXPath("//*[@id='productDetailsPageCenterWrapper']/div[2]/div[2]/div[2]/img")).getAttribute("data-desktop-zoom-src");
				
				Logger.info(String.format("%s / %s / %s", productTitle, price, productPictureUrl));
				
				productData.setFullName(productTitle);
				productData.setPictureUrl(productPictureUrl);
				
				NumberFormat format = NumberFormat.getInstance(Locale.GERMANY);
				Number localizedPrice = format.parse(price);
				productData.setAmount(localizedPrice.doubleValue());
				
				if (!webSiteFile.exists()) {
					page.save(webSiteFile);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return productData;
	}
}
