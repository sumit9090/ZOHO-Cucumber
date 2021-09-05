package zoho.teststeps;

import java.util.List;
import java.util.Map;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import zoho.context.TestContext;
import zoho.managers.CustomListeners;
import zoho.pages.CreateLeadPage;
import zoho.pages.LeadDescriptionPage;
import zoho.pages.LeadsDetailPage;
import zoho.teststeps.data.LeadData;

public class Leads {
// One more feature
// Complete steps of both feature files	
// Take screenshots and embed in reports
// Parallel Execution - GRID
// Run the project with Maven
// GIT and Jenkins connectivity	
	
	
	
	public TestContext context;
    public LeadsDetailPage leadDetailPage;
    public CreateLeadPage createLeadPage;
    public LeadDescriptionPage leadDescriptionPage;
    public CustomListeners customListeners;
    

	
	public Leads(TestContext context) {
		this.context=context;
		this.leadDetailPage=context.getPageObjectManager().getleadsDetailPage();
		this.createLeadPage=context.getPageObjectManager().getCreateLeadPage();
		this.leadDescriptionPage=context.getPageObjectManager().getLeadDescriptionPage();
		
	}
	
	@Before
	public void before(Scenario scenario) {		
		context.createScenario(scenario.getName());
		context.log("Starting scenario "+ scenario.getName());
	}
	
	@After
	public void after(Scenario scenario) {
		context.log("Ending scenario "+ scenario.getName());
		context.endScenario();
		context.getPageObjectManager().getWebDriverManager().quit();
		System.out.println("-------------------------------------------------");
	}
	
	 @When("I go to create lead page")
	 public void goToCreateLead() {
		 leadDetailPage.goToCreateLeadPage();
	 }
	
	@And("enter and submit lead details")
	public void submitDetails(List<LeadData> leadData) {
		context.log("enter and submit lead details "+ leadData.size());
		context.log("enter and submit lead details "+ leadData.get(0).firstName);
		createLeadPage.submitLeadDetails(leadData);
		
	}
	
	@DataTableType
    public LeadData entry(Map<String, String> entry) {
		System.out.println(entry.toString());
        return new LeadData(entry.get("FirstName"),entry.get("LastName"),entry.get("Email"),entry.get("Company"));
    }
	
	@Then("Lead Description Page should load")
	public void verifyLeadDetailPage() {
		leadDescriptionPage.hasLoaded();
	}
	
	@And("I verify lead details")
	public void verifyLeadDetails() {
		context.log("I verify lead details");
		// you
	}
	
	@Then("Lead {string} should {string} inside the grid")
	public void verifyLeadCreation(String leadName, String condition) {
        if (condition.equals("be present")) {
            	 leadDetailPage.validateLeadPresent(leadName);
        }else {
            	 leadDetailPage.validateLeadNotPresent(leadName);
        }

	}
	
    @When("I select the lead {string}")
    public void selectLead(String leadName) {
    	context.log("Selecting the lead "+ leadName);
    	leadDetailPage.selectLead(leadName);
    }
    
    @And("I click on delete button")
    public void deleteLead() {
    	
    }


	

}
