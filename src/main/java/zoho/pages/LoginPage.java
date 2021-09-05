package zoho.pages;

import zoho.managers.WebDriverManager;

public class LoginPage {
	
    WebDriverManager app;
	
	public LoginPage(WebDriverManager app) {
		this.app=app;
	}
	
	
	public void doLogin() throws InterruptedException {
		app.log("Trying to login into Zoho");
		app.type("username_id", app.getProperty("userid"));
		app.click("nextbutton_xp");
		Thread.sleep(500);
		app.type("password_name",app.getProperty("pass"));
	
		Thread.sleep(500);
		app.click("signinbutton_xp");
		Thread.sleep(15500);
		app.click("crm_xp");
	//	
		
		
		

	}

}
