package Stepdefs;

import Pages.ContactListSummaryPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class ContactSummaryStepdef {
    ContactListSummaryPage contactListSummaryPage = new ContactListSummaryPage();

    @Given("^I have opened the app$")
    public void i_have_opened_the_app() {
        //do something in the future...
    }

    @When("^I view a contact's detail$")
    public void i_view_a_contacts_detail() {
        contactListSummaryPage.openContactDetails("Clementina DuBuque");
    }
}
