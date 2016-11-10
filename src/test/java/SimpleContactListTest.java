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

    private IOSDriver<MobileElement> driver;

    @Before
    public void setUp () throws MalformedURLException {
        setupDesiredCapabilities();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void testContactDetailsPage() {
        driver.findElement(By.id("Clementina DuBuque")).click();

        MobileElement table = driver.findElementByClassName("UIATableView");
        assertNotNull(table);

        List<MobileElement> rows = table.findElementsByClassName("UIATableCell");
        List<MobileElement> nameRow = rows.get(0).findElementsByClassName("UIAStaticText");

        takesScreenshot(name.getMethodName());

        assertEquals("Clementina DuBuque", nameRow.get(1).getAttribute("name"));
    }

    private void takesScreenshot(String testName) {
        File screenshot = driver.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File("screenshots/" + testName + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void setupDesiredCapabilities () throws MalformedURLException {
        File app = new File("app/ContactList.app");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.1");
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        capabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
        driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
}
