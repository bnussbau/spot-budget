package at.benjaminnussbaum.spotbudget.service;

import at.benjaminnussbaum.spotbudget.resolver.DefaultSparProductResolver;
import at.benjaminnussbaum.spotbudget.types.beans.ProductData;
import at.benjaminnussbaum.spotbudget.types.enumerations.PriceProviderType;
import at.benjaminnussbaum.spotbudget.types.itemtypes.product.Product;
import at.benjaminnussbaum.spotbudget.types.itemtypes.product.price.PriceRow;
import io.spotnext.core.infrastructure.service.ModelService;
import io.spotnext.core.persistence.query.JpqlQuery;
import io.spotnext.core.persistence.query.QueryResult;
import io.spotnext.core.persistence.service.QueryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@Service
public class SparProductResolverService extends ProductResolverService {
	@Resource
	private ModelService modelService;
	
	@Resource
	private QueryService queryService;
	
	@Override
	public void resolveProduct(String productCode) {
		final JpqlQuery<at.benjaminnussbaum.spotbudget.types.itemtypes.product.Product> query = new JpqlQuery<>(
				"SELECT p FROM Product p WHERE p.sparProductCode IS NOT NULL",
				at.benjaminnussbaum.spotbudget.types.itemtypes.product.Product.class);
		final QueryResult<Product> result = getQueryService().query(query);
		
	}
	
	@Override
	public void resolveAllProducts() {
		final JpqlQuery<at.benjaminnussbaum.spotbudget.types.itemtypes.product.Product> query = new JpqlQuery<>(
				"SELECT p FROM Product p WHERE p.sparProductCode IS NOT NULL",
				at.benjaminnussbaum.spotbudget.types.itemtypes.product.Product.class);
		final QueryResult<Product> result = getQueryService().query(query);
		for (Product p : result.getResults()){
			ProductData productData = new DefaultSparProductResolver().resolveSparProduct(p.getSparProductCode());
			p.setFullName(productData.getFullName());
			p.setPictureUrl(productData.getPictureUrl());
			
			PriceRow productPrice = new PriceRow();
			productPrice.setAmount(productData.getAmount());
			productPrice.setProvider(PriceProviderType.WEBSERVICE);
			productPrice.setDate(LocalDateTime.now());
			productPrice.setProduct(p);
			
			//p.setPriceRows(Collections.singleton(productPrice));
			
			getModelService().save(p);
		}
	}


}
