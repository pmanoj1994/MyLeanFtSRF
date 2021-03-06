package group1;

import com.hp.lft.sdk.web.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.hp.lft.sdk.*;
import com.hp.lft.verifications.*;

import unittesting.*;

public class LeanFtTest extends UnitTestClassBase {

    public LeanFtTest() {
        //Change this constructor to private if you supply your own public constructor
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        instance = new LeanFtTest();
        globalSetup(LeanFtTest.class);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        globalTearDown();
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws GeneralLeanFtException {
     //   Browser browser = BrowserFactory.launch(BrowserType.CHROME);
        Browser browser = SrfLab.launchBrowser(
                new BrowserDescription.Builder().type(BrowserType.CHROME)
                    .set("version","latest")
                    .set("osType","Windows")
                    .set("osVersion","10")
                    .set("testName","LeanFT/AOS-Java-remote").build());

        browser.navigate("http://www.advantageonlineshopping.com/#/");

        browser.describe(WebElement.class, new WebElementDescription.Builder()
                .tagName("SPAN").innerText("TABLETS").build()).click();

        browser.back();

        SrfLab.releaseEnvironment(browser);
    }

}