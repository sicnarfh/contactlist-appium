package Pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class ContactListSummaryPage extends Page {

    public ContactListSummaryPage(){
        super();
    }

    public void openContactDetails(String contactName) {
        getDriver().findElement(By.id(contactName)).click();
    }
}
