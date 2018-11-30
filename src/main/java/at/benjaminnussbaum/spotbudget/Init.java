package at.benjaminnussbaum.spotbudget;

import io.spotnext.core.CoreInit;
import io.spotnext.core.infrastructure.exception.ImportException;
import io.spotnext.core.infrastructure.exception.ModuleInitializationException;
import io.spotnext.core.infrastructure.support.Logger;
import io.spotnext.core.infrastructure.support.init.ModuleInit;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"at.benjaminnussbaum.spotbudget"})
public class Init extends ModuleInit {
	
	@Override
	protected void initialize() throws ModuleInitializationException {
	}
	
	@Override
	protected void importInitialData() throws ModuleInitializationException {
		super.importInitialData();
	}
	
	@Override
	protected void importSampleData() throws ModuleInitializationException {
		super.importSampleData();
		try {
			importScript("/data/sample/payee.impex", "Importing Payee");
			importScript("/data/sample/account.impex", "Importing Accounts");
			importScript("/data/sample/product.impex", "Importing Products");
			importScript("/data/sample/receipt.impex", "Importing Receipts");
			importScript("/data/sample/receiptentry.impex", "Importing Receipt Entries");
			importScript("/data/sample/transaction.impex", "Importing Transactions");
		} catch (final ImportException e) {
			Logger.warn("Could not import initial data: " + e.getMessage());
		}
	}
	
	public static void main(final String[] args) throws Exception {
		ModuleInit.bootstrap(CoreInit.class, Init.class, (b) -> b.web(WebApplicationType.SERVLET), args);
	}
	
}
