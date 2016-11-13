package Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.remote.MobilePlatform;
import org.junit.rules.TestName;

import java.util.List;

import static junit.framework.TestCase.assertNotNull;

public class ContactListDetailsPage extends Page {

    @AndroidFindBy(id = "nz.co.kiwiandroiddev.materialcontactlist:id/fragment_contact_details_name")
    @iOSFindBy(id = "contactDetailsTableNameRow")
    MobileElement nameRow;

    public ContactListDetailsPage(){
        loadPage();
    }

    public String getContactName(){
        return nameRow.getAttribute("name");
    }
}
