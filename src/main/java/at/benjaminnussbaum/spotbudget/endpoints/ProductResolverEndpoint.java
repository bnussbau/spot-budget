package at.benjaminnussbaum.spotbudget.endpoints;

import at.benjaminnussbaum.spotbudget.service.SparProductResolverService;
import io.spotnext.core.persistence.query.QueryResult;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

@Controller
public class ProductResolverEndpoint {
	
	@Resource
	SparProductResolverService sparProductResolverService;
	
	@GetMapping("/resolveProducts")
	public ResponseEntity<String> resolveProducts(){
		QueryResult<at.benjaminnussbaum.spotbudget.types.itemtypes.product.Product> products =
				sparProductResolverService.resolveProducts();
		return ResponseEntity.ok().body("hello");
	}
	
}

