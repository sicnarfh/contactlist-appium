package Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.By;

import java.util.List;

public class ContactListSummaryPage extends Page {

    public ContactListSummaryPage(){
        super();
    }

    public void openContactDetails(String contactName) {
        switch(platform){
            case MobilePlatform.IOS:
                getDriver().findElement(By.tagName(contactName)).click();
                break;

            case MobilePlatform.ANDROID:
                List<MobileElement> rows = getDriver().findElements(By.id("nz.co.kiwiandroiddev.materialcontactlist:id/list_contact_row_name"));
                for(int i=0; i < rows.size() ; i++){
                    if(rows.get(i).getAttribute("text").equals(contactName)){
                        rows.get(i).click();
                        break;
                    }
                }
                break;
        }
    }
}
