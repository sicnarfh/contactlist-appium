package Pages;

import io.appium.java_client.MobileElement;
import org.junit.rules.TestName;

import java.util.List;

import static junit.framework.TestCase.assertNotNull;

public class ContactListDetailsPage extends Page {

    public ContactListDetailsPage(){
        super();
    }

    public String getContactName(){
        MobileElement table = getDriver().findElementByClassName("UIATableView");
        assertNotNull(table);

        List<MobileElement> rows = table.findElementsByClassName("UIATableCell");
        List<MobileElement> nameRow = rows.get(0).findElementsByClassName("UIAStaticText");

        return nameRow.get(1).getAttribute("name");
    }
}
