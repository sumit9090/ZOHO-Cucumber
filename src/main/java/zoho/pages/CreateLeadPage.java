package zoho.pages;

import java.util.List;

import zoho.managers.WebDriverManager;
import zoho.teststeps.data.LeadData;


public class CreateLeadPage {

	WebDriverManager app;
	
	public CreateLeadPage(WebDriverManager app) {
		this.app=app;
	}

	public void submitLeadDetails(List<LeadData> leadData) {
		app.type("lead_first_name_id", leadData.get(0).firstName);
		app.type("lead_last_name_id", leadData.get(0).lastName);
		app.type("lead_company_id", leadData.get(0).company);
		app.type("lead_email_id", leadData.get(0).email);
		app.click("save_btn_id");
	}
}
