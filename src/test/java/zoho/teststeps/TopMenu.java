package zoho.teststeps;

import io.cucumber.java.en.When;
import zoho.context.TestContext;
import zoho.pages.TopMenuComponent;

public class TopMenu {
    public TestContext context;
    public TopMenuComponent topMenu;
    
    
	public TopMenu(TestContext context) {
		this.context=context;
		this.topMenu=context.getPageObjectManager().getTopMenu();
	}
	
	@When("I click on {string} in top menu")
	public void loadPage(String menuOption) {
		context.log("I click on "+menuOption+" in top menu");
		topMenu.load(menuOption);
		
	}

}
