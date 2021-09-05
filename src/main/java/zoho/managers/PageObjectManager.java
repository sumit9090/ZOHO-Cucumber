package zoho.managers;

import zoho.pages.CreateLeadPage;
import zoho.pages.HomePage;
import zoho.pages.LeadDescriptionPage;
import zoho.pages.LeadsDetailPage;
import zoho.pages.LoginPage;
import zoho.pages.TopMenuComponent;


public class PageObjectManager {
	
	HomePage homePage;
	LoginPage loginPage;
	TopMenuComponent topMenu;
    LeadsDetailPage leadsDetailPage;
    CreateLeadPage createLeadPage;
    LeadsDetailPage leadDetailPage;
    public LeadDescriptionPage leadDescriptionPage;
    
    
  

	WebDriverManager app;
	
	public PageObjectManager() {
		this.app = new WebDriverManager();
	}
	
	
	public WebDriverManager getWebDriverManager() {
		return app;
	}
	
	
	public HomePage getHomePage() {
		if(homePage == null)
			homePage = new HomePage(app);
		
		return homePage;
	}
	
	

	public LoginPage getLoginPage() {
		if(loginPage == null)
			loginPage = new LoginPage(app);
		
		return loginPage;
	}
	

	
	public TopMenuComponent getTopMenu() {
		if(topMenu == null)
			topMenu = new TopMenuComponent(app);
		
		return topMenu;
	}
	
	public LeadsDetailPage getleadsDetailPage() {
		if(leadsDetailPage == null)
			leadsDetailPage	= new LeadsDetailPage(app);	
		return leadsDetailPage;
	}
	
	public CreateLeadPage getCreateLeadPage() {
		if(createLeadPage == null)
			createLeadPage	= new CreateLeadPage(app);	
		return createLeadPage;
	}
	public LeadDescriptionPage getLeadDescriptionPage() {
		if(leadDescriptionPage == null)
			leadDescriptionPage	= new LeadDescriptionPage(app);	
		return leadDescriptionPage;
	}

	
	
	
	
}

