package Pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

/**
 * Created by francish on 10/11/16.
 */
public class ContactListSummaryPage extends Page {

    public ContactListSummaryPage(){
        super();
    }

    public void openContactDetails(String contactName) {
        getDriver().findElement(By.id(contactName)).click();
    }
}
