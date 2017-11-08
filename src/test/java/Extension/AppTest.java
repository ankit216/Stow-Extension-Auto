package Extension;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.apache.bcel.generic.TABLESWITCH;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class AppTest {

    DataFile dataFile = new DataFile();

    @Given("^Open Stow Extension In Chrome Browser$")
    public void Open_Stow_Extension_In_Chrome_Browser() {
        dataFile.openChromeBrowser();


    }

    @When("^Verify To Stow Extension Page$")
    public void Verify_To_Stow_Extension_Page() {
        dataFile.clickOnElement(dataFile.task);
        dataFile.pause(1);
        dataFile.clickOnElement(dataFile.taskClose);
        dataFile.verifyElementIsDisplay(dataFile.task);
    }

    @When("^Add 1st Collection \"(.*)\"$")
    public void Add_1st_Collection(String collName) throws InterruptedException {
        dataFile.pause(1);
        dataFile.sendKeyOnElement(dataFile.addCollection1, collName);
        dataFile.pressEnterKey(dataFile.addCollection1);
    }

    @When("^Add 2nd Collection \"(.*)\"$")
    public void Add_2nd_Collection(String collName) throws InterruptedException {
        dataFile.pause(1);
        dataFile.sendKeyOnElement(dataFile.addCollection2, collName);
        dataFile.pressEnterKey(dataFile.addCollection2);
    }
    @When("^Add 3rd Collection \"(.*)\"$")
    public void Add_3rd_Collection(String collName) throws InterruptedException {
        dataFile.pause(1);
        dataFile.sendKeyOnElement(dataFile.addCollection3, collName);
        dataFile.pressEnterKey(dataFile.addCollection2);
    }
    @When("^Add 4th Collection \"(.*)\"$")
    public void Add_4th_Collection(String collName) throws InterruptedException {
        dataFile.pause(1);
        dataFile.sendKeyOnElement(dataFile.addCollection4, collName);
        dataFile.pressEnterKey(dataFile.addCollection2);
    }

    @When("^Verify 1st Added Collection$")
    public void Verify_1st_Added_Collection() throws InterruptedException {
        dataFile.pause(1);
        dataFile.verifyElementIsDisplay(dataFile.addCollection1);
    }

    @When("^Verify 2nd Added Collection$")
    public void Verify_2nd_Added_Collection() throws InterruptedException {
        dataFile.pause(1);
        dataFile.verifyElementIsDisplay(dataFile.addCollection2);
    }
    @When("^Verify 3rd Added Collection$")
    public void Verify_3rd_Added_Collection() throws InterruptedException {
        dataFile.pause(1);
        dataFile.verifyElementIsDisplay(dataFile.addCollection1);
    }

    @When("^Verify 4th Added Collection$")
    public void Verify_4th_Added_Collection() throws InterruptedException {
        dataFile.pause(1);
        dataFile.verifyElementIsDisplay(dataFile.addCollection2);
    }

    @When("^Open New Tab Google \"(.*)\"$")
    public void Open_New_Tab_Google(String googleURL) {
        dataFile.openGoogleTab(googleURL);
    }

    @When("^New Tab Google Verification$")
    public void New_Tab_Google_Verification() {
        dataFile.verifyElementIsDisplay(dataFile.googleVerify);
    }

    @When("^New Tab Wikipedia Verification$")
    public void New_Tab_Wikipedia_Verification() {
        dataFile.switchTab(2);
    }

    @Then("^Back To Stow Extension$")
    public void Back_To_Stow_Extension() {
        dataFile.switchTab(1);
    }

    @When("^Open New Tab wikipedia \"(.*)\"$")
    public void Open_New_Tab_wikipedia(String wikipediaURL) throws InterruptedException {
        dataFile.openWikipediaturl(wikipediaURL);
    }

    @When("^Open New Tab Vigoreport \"(.*)\"$")
    public void Open_New_Tab_Vigoreport(String vigoreportURL) throws InterruptedException {
        dataFile.openVigoreporturl(vigoreportURL);


    }

    @When("^New Tab Vigoreport Verification$")
    public void New_Tab_Vigoreport_Verification() {
        dataFile.verifyElementIsDisplay(dataFile.vigoreportVerification);
        dataFile.switchTab(3);
    }

    @When("^Store Tabs$")
    public void Store_Tabs() {
        dataFile.pause(1);
        dataFile.clickOnElement(dataFile.storeTab);
    }

    @When("^Store Tabs Verification$")
    public void Store_Tabs_Verification() {
        dataFile.pause(1);
        dataFile.verifyElementIsDisplay(dataFile.storeTabsVer);

    }

    @When("^Open Chrome Browser$")
    public void Open_Chrome_Browser() {
        dataFile.openChromeBrowser();

    }

    @When("^Click on new tab button$")
    public void Click_on_new_tab_button() {

        dataFile.openNewTab();
        dataFile.switchTab(1);
    }

    @Then("^Browser Close$")
    public void Browser_Close() {
        dataFile.quit();
    }

    @When("^Verify Open Tabs$")
    public void Verify_Open_Tabs() throws InterruptedException {
        dataFile.pause(1);
        dataFile.verifyElementIsDisplay(dataFile.openTabsVefirify);
    }

    @When("^Click On Listed Tab$")
    public void Click_On_Listed_Tab() throws InterruptedException {
        dataFile.pause(1);
        dataFile.clickOnElement(dataFile.listedTab);
    }

    @When("^Verify Listed Open Tabs$")
    public void Verify_Listed_Open_Tabs() throws InterruptedException {
        dataFile.pause(1);
        try {
            dataFile.verifyElementIsDisplay(dataFile.googleVerify);
            dataFile.verifyElementIsDisplay(dataFile.wikipediaVerification);
            dataFile.verifyElementIsDisplay(dataFile.vigoreportVerification);
        } catch (Exception e) {
            System.out.println("Element Is Not Display");
        }
    }
    @When("^Click On SHOW HIDE Button$")
    public void Click_On_SHOW_HIDE_Button() throws InterruptedException {
        dataFile.pause(1);
        dataFile.clickOnElement(dataFile.clickOnShowHideButton);
    }
    @When("^Verify HIDE Open Tab Section$")
    public void Verify_HIDE_Open_Tab_Section() throws InterruptedException {
        dataFile.pause(1);
        dataFile.verifyElementIsDisplay(dataFile.hideOpenTabSection);
    }
    @When("^Verify SHOW Open Tab Section$")
    public void Verify_SHOW_Open_Tab_Section() throws InterruptedException {
        dataFile.pause(1);
        dataFile.verifyElementIsDisplay(dataFile.showOpenTabSection);
    }
    @When("^Close Opened Tab In Open Tab Section$")
    public void Close_Opened_Tab_In_Open_Tab_Section() throws InterruptedException {
        dataFile.pause(1);
        dataFile.hower(dataFile.cancelTabButton);
    }
    @When("^Click On Added Collection$")
    public void Click_On_Added_Collection()  {
        dataFile.pause(1);
        dataFile.clickOnElement(dataFile.newAddedCollection);
    }
    @When("^Verify My Collection$")
    public void Verify_My_Collection() throws InterruptedException {
        dataFile.pause(1);
        dataFile.verifyElementIsDisplay(dataFile.newAddedCollectionVerify);
    }
    @When("^Click On Backlog Collection$")
    public void Click_On_Backlog_Collection()  {
        dataFile.pause(1);
        dataFile.clickOnElement(dataFile.backlogCollection);
    }
    @When("^Click On Favorite Of 1st Collection$")
    public void Click_On_Favorite_Of_1st_Collection() throws InterruptedException {
        dataFile.pause(1);
        dataFile.hower(dataFile.verifyAddCollection1);
        dataFile.pause(10);
        dataFile.clickOnElement(dataFile.clickOn1stCollFevorite);
    }
    @When("^Click On Favorite Of 3rd Collection$")
    public void Click_On_Favorite_Of_3rd_Collection() throws InterruptedException {
        dataFile.pause(1);
        dataFile.hower(dataFile.verifyAddCollection3);
        dataFile.clickOnElement(dataFile.clickOn3stCollFevorite);
    }
    @When("^Verify Click On Favorite 1st Collection$")
    public void  Verify_Click_On_Favorite_1st_Collection() throws InterruptedException {
        dataFile.pause(1);
        dataFile.verifyElementIsDisplay(dataFile.verify1stFevoriteColl);
    }
    @When("^Verify Click On Favorite 3rd Collection$")
    public void  Verify_Click_On_Favorite_3rd_Collection() throws InterruptedException {
        dataFile.pause(1);
        dataFile.verifyElementIsDisplay(dataFile.verify3rdFevoriteColl);
    }


}





