import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver

// xpath = //tagname [@atribute = 'value']
WebUI.openBrowser('https://www.google.com/')

login1('qbc')

WebUI.click(findTestObject('2nd option')) /*
 * 
 * 
 * //////////////////////////////////////////////////////////////////////
 * 
 * 
 * WebDriver driver = DriverFactory.getWebDriver()
 * 
 * //WebElement bodyElement =
 * driver.findElement(By.xpath("//div[@id='res']//a[@href]"));
 * 
 * 
 * //List<WebElement> element11 =
 * WebUiCommonHelper.findWebElement(findTestObject('Object Repository/1st
 * value'),30)
 * 
 * List<WebElement> refList =
 * driver.findElements(By.xpath("//div[@id='res']//a[@href]"));
 * 
 * //for( i= 1; i < refList.size() ;i ++){ //WebElement we for(WebElement we :
 * refList) { // System.out.println(refList[i].getAttribute("href"));
 * 
 * System.out.println(we.getAttribute("href")); }
 * 
 * 
 * 
 * for(WebElement we : refList)
 * 
 * 
 * 
 * 
 * abc = WebUI.getAllLinksOnCurrentPage(false, ['https://www.google.com/'])
 * 
 * System.out.println(URLs)
 * 
 * 
 * /////////////////////////////////////////////////////////////////////////////
 * //////////
 */

CustomKeywords.'testaman.test12.getlinkvalues'("//div[@id=\'res\']//a[@href]")

def login1(def searchtext) {
    WebUI.sendKeys(findTestObject('Google_Search_Textbox'), searchtext)

    System.out.println('rte')
}

