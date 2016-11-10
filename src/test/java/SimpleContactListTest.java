import Pages.ContactListDetailsPage;
import Pages.ContactListSummaryPage;
import Pages.Page;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.apache.commons.io.FileUtils;
import org.junit.*;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SimpleContactListTest {
    @Rule
    public TestName name = new TestName();

    @Test
    public void testContactDetailsPage() {
        ContactListSummaryPage contactListSummaryPage = new ContactListSummaryPage();
        ContactListDetailsPage contactListDetailsPage = new ContactListDetailsPage();

        contactListSummaryPage.openContactDetails("Clementina DuBuque");

        assertEquals("Clementina DuBuque", contactListDetailsPage.getContactName());
    }
}
