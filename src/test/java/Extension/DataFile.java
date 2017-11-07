package Extension;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;

import java.awt.*;
import java.awt.event.InputEvent;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class DataFile {


    String stowCRX = "D:\\stow.crx";
    String chromeExtensionID = "chrome-extension://chglgidfokcdfofhlmmkbkkdebdejicf/content.html#";
    String stowExtPageVer = "//*[contains(text(),'Task')]";
    String task = "//*[contains(text(),'Task')]";
    String taskClose = "//*[contains(text(),'×')]";
    String addCollection = "//*[@class=\"add__collection__input\"]";
    String addCollection2 = "//*[@class=\"add__collection__input\"]";
    String googleVerify = "//*[@id=\"hplogo\"]";
    String wikipediaVerification = "//*[@id=\"p-logo\"]/a";
    String vigoreportVerification = "//*[contains(text(),'Login')]";
    String storeTab = "//*[contains(text(),'Store Tabs')]";
    String storeTabsVer = "//*[@class=\" tab-container\"]";
    String openTabsVefirify = "//*[contains(text(),'OPEN TABS')]";
    String listedTab = "//*[@class=\"col open-tabs--title\"]";
    String chromeDriver = "D:\\chromedriver.exe";
    String webDriver1 = "webdriver.chrome.driver";
    String clickOnShowHideButton = ".//*[@class=\"collection--count--inverse f--r btn btn-secondary\"]";
    String hideOpenTabSection = ".//*[@class=\"open-tabs-close\"]";
    String showOpenTabSection = ".//*[@class=\"col-3 col-md-3 col-xl-2 open-tabs\"]";
    String cancelTabButton = ".//div[@class=\"open__tabs__list\"]/div[2]//span[@class=\"col-1 dlt-btn p-r-l-n\"]";
    String backlog = "//*[@class=\"collection__item\"]";



    public void chromeWebdriver() {
        System.setProperty(webDriver1, chromeDriver);
    }

    public WebDriver driver;

    public void openChromeBrowser() {
        chromeWebdriver();
        ChromeOptions ChromeOptions = new ChromeOptions();
        ChromeOptions.addExtensions(new File(stowCRX));
        DesiredCapabilities DesiredCapabilities = org.openqa.selenium.remote.DesiredCapabilities.chrome();
        DesiredCapabilities.setCapability(ChromeOptions.CAPABILITY, ChromeOptions);
        driver = new ChromeDriver(DesiredCapabilities);
        driver.manage().window().maximize();
        driver.get(chromeExtensionID);
    }


    public void pressEnterKey(String xpath) {
        WebElement element = driver.findElement(By.xpath(xpath));
        element.sendKeys(Keys.RETURN);
    }

    public void clickOnElement(String xpath) {
        pause(2);
        WebElement element = driver.findElement(By.xpath(xpath));
        element.click();

    }

    public void sendKeyOnElement(String xpath, String Text) {
        WebElement element = driver.findElement(By.xpath(xpath));
        element.sendKeys(Text);
        pause(1);
    }

    public void pause(int secs) {
        try {
            Thread.sleep(secs * 1000);
        } catch (InterruptedException interruptedException) {
        }
    }

    public void verifyElementIsDisplay(String element) {
        pause(1);
        WebElement searchResult = driver.findElement(By.xpath(element));
        searchResult.isDisplayed();
    }

    public void verifyElementFromList(String element, String text) {
        boolean flag = false;
        List<WebElement> list = driver.findElements(By.xpath(element));
        for (WebElement el : list) {
            if (el.getText().equalsIgnoreCase(text)) {
                el.isDisplayed();
                flag = true;
            }
        }
    }

    public void openGoogleTab(String googleURL) {
        String newTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
        WebElement e = driver.findElement(By.xpath("//*[@class=\"active\"]"));
        e.sendKeys(newTab);
        e.sendKeys(Keys.CONTROL + "\t");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        //to wait some time in that tab
        e.sendKeys(Keys.CONTROL + "\t");
        driver.get(googleURL);
    }

    public void openNewTab() {
        String newTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
        WebElement e = driver.findElement(By.xpath("//*[@class=\"active\"]"));
        e.sendKeys(newTab);
        e.sendKeys(Keys.CONTROL + "\t");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        //to wait some time in that tab
        e.sendKeys(Keys.CONTROL + "\t");


    }

    public void openVigoreporturl(String vigoreportURL) throws InterruptedException {
        String oldTab = driver.getWindowHandle();
        String newTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
        WebElement e = driver.findElement(By.xpath("//*[@class=\"active\"]"));
        e.sendKeys(newTab);
        e.sendKeys(Keys.CONTROL + "\t");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        //to wait some time in that tab
        e.sendKeys(Keys.CONTROL + "\t");
        driver.get(vigoreportURL);
        Thread.sleep(1000);


    }

    public void openWikipediaturl(String wikipediaURL) throws InterruptedException {
        String oldTab = driver.getWindowHandle();
        String newTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
        WebElement e = driver.findElement(By.xpath("//*[@class=\"active\"]"));
        e.sendKeys(newTab);
        e.sendKeys(Keys.CONTROL + "\t");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        //to wait some time in that tab
        e.sendKeys(Keys.CONTROL + "\t");
        driver.get(wikipediaURL);
        pause(1);


    }

    public void switchTab(int value) {
        pause(2);

        ArrayList<String> tabs_windows = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs_windows.get(value));
    }

    public void quit() {
        pause(3);
        driver.quit();
    }
    public static void click(int x, int y) throws AWTException {
        Robot bot = new Robot();
        bot.mouseMove(x, y);
        bot.mousePress(InputEvent.BUTTON1_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_MASK);
    }
    public  void hower()  {
    Actions action = new Actions(driver);
    WebElement we = driver.findElement(By.xpath(listedTab));
action.moveToElement(we).moveToElement(driver.findElement(By.xpath(".//*[@src=\"images/cancel.svg\"]"))).click().build().perform();
    }
}
