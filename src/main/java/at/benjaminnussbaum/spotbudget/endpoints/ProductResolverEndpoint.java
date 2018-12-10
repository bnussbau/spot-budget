package at.benjaminnussbaum.spotbudget.endpoints;

import at.benjaminnussbaum.spotbudget.service.SparProductResolverService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class ProductResolverEndpoint {
	
	@Resource
	SparProductResolverService sparProductResolverService;
	
	/*@GetMapping("/fetchProduct/{id}")
	public ResponseEntity resolveProducts(@PathVariable("id") String id, @RequestParam("resolver") String resolverClass){
		sparProductResolverService.resolveProduct(id);
		return ResponseEntity.ok().build();
	}
	*/
	@GetMapping("/fetchProducts")
	public ResponseEntity resolveProducts(@RequestParam("resolver") String resolverClass){
		sparProductResolverService.resolveAllProducts();
		return ResponseEntity.ok().build();
	}
	
}

