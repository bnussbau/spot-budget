package at.benjaminnussbaum.spotbudget.service;

import at.benjaminnussbaum.spotbudget.types.itemtypes.product.Product;
import io.spotnext.core.infrastructure.service.ModelService;
import io.spotnext.core.persistence.query.JpqlQuery;
import io.spotnext.core.persistence.query.QueryResult;
import io.spotnext.core.persistence.service.QueryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SparProductResolverService {
	@Resource
	private ModelService modelService;
	
	@Resource
	private QueryService queryService;
	
	public QueryResult<Product> resolveProducts(){
		final JpqlQuery<at.benjaminnussbaum.spotbudget.types.itemtypes.product.Product> query = new JpqlQuery<>(
				"SELECT p FROM Product p WHERE p.sparProductCode IS NOT NULL",
				at.benjaminnussbaum.spotbudget.types.itemtypes.product.Product.class);
		
	    final QueryResult<at.benjaminnussbaum.spotbudget.types.itemtypes.product.Product> result = queryService.query(query);

	    return result;
	    
	    
	}


}
