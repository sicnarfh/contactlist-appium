package Stepdefs;

import Pages.ContactListDetailsPage;
import Pages.ContactListSummaryPage;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;

public class ContactDetailsStepdef {
    ContactListDetailsPage contactListDetailsPage = new ContactListDetailsPage();

    @Then("^I can see their name$")
    public void i_can_see_their_name() {
        assertEquals("Clementina DuBuque", contactListDetailsPage.getContactName());
    }
}
