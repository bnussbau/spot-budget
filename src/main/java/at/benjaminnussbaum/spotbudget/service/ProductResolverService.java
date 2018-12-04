package at.benjaminnussbaum.spotbudget.service;

import io.spotnext.core.infrastructure.service.ModelService;
import io.spotnext.core.persistence.service.QueryService;

import javax.annotation.Resource;

public abstract class ProductResolverService {
	@Resource
	private ModelService modelService;
	
	@Resource
	private QueryService queryService;
	
	public abstract void resolveProduct(String productCode);
	public abstract void resolveAllProducts();
	
	public ModelService getModelService() {
		return modelService;
	}
	
	public QueryService getQueryService() {
		return queryService;
	}
}
