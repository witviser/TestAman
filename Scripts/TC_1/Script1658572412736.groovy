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
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//WebUI.openBrowser('')
//WebUI.authenticate('https://juice-shop.herokuapp.com/#/login', 'a@a.com', 'Password@123', 10)
//WebUI.authenticate('http://the-internet.herokuapp.com/basic_auth', 'admin', 'admin', 12)
//WebUI.back()
//WebUI.check(findTestObject('Object Repository/Test_the_internet/checkbox'))
//WebUI.clearText(findTestObject('Object Repository/Test_the_internet/Inputbox'))
//WebUI.click(findTestObject('Object Repository/Test_the_internet/Inputbox'))
//WebUI.sendKeys(findTestObject('Test_the_internet/InputBox'), 'abc')
/*
 * WebUI.openBrowser('google.com')
 * 
 * WebUI.executeJavaScript('window.open()', [])
 * 
 * currentwindow = WebUI.getWindowIndex()
 * 
 * WebUI.switchToWindowIndex(currentwindow + 1)
 * 
 * WebUI.navigateToUrl("Yahoo.com")
 * 
 * Nextwindow = currentwindow + 1
 * 
 * Title = WebUI.getWindowTitle()
 * 
 * WebUI.closeWindowIndex(Nextwindow)
 * 
 * println(Nextwindow + "---->>" + Title)
 */
//WebUI.comment("I am Here")
//abc = WebUI.concatenate(((['abc', 'zyz','ssss']) as String))
//WebUI.deleteAllCookies(FailureHandling.STOP_ON_FAILURE)
// not working WebUI.deselectAllOption(findTestObject('Test_the_internet/checkbox'))
//WebUI.openBrowser('')
//WebUI.navigateToUrl(GlobalVariable.url)
/*
 * WebUI.navigateToUrl(GlobalVariable.demo)
 * 
 * WebUI.click(findTestObject('Test_the_internet/Alerttext'))
 * 
 * text = WebUI.getAlertText()
 * 
 * println(text)
 */
/*
 * WebUI.openBrowser('https://demo.automationtesting.in/')
 * 
 * list = WebUI.getAllLinksOnCurrentPage(true, [])
 * 
 * println(list)
 */
//WebUI.openBrowser('https://demo.automationtesting.in/Alerts.html')
//text1 = WebUI.modifyObjectProperty(findTestObject('Test_the_internet/Alerttext'), 'xpath', 'equals', '//a[@href=\"#CancelTab\"]',  false)
/*
 * new_btn =
 * WebUI.modifyObjectProperty(findTestObject('Test_the_internet/Leftside'),
 * 'xpath', 'equals', '/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a', true)
 * 
 * abc =
 * WebUI.modifyObjectProperty(findTestObject('Test_the_internet/Leftside'),
 * 'xpath', 'equals', '/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a', true)
 * 
 * WebUI.click(new_btn)
 * 
 * WebUI.click(abc)
 */
//WebUI.setEncryptedText(findTestObject('Test_the_internet/EncryptedTextenter'), '8ylGA/40/qI=')
/*
 * WebUI.openBrowser('https://demo.automationtesting.in/Alerts.html')
 * WebUI.click(findTestObject('Test_the_internet/Alerttext'))
 * 
 * WebUI.verifyAlertPresent(0, FailureHandling.STOP_ON_FAILURE)
 */
//WebUI.openBrowser('https://demo.automationtesting.in/Alerts.html')
//WebUI.verifyAllLinksOnCurrentPageAccessible(false, [])
//WebUI.verifyElementAttributeValue(findTestObject('Test_the_internet/Alerttext'), 'class', 'btn btn-danger', 0)
/*
 * WebUI.waitForElementNotHasAttribute(findTestObject('Test_the_internet/
 * Alerttext'), '', 0, FailureHandling.STOP_ON_FAILURE)
 * 
 * WebUI.getText(findTestObject(null))
 */
//CustomKeywords.'com.kms.katalon.keyword.excel.ExcelKeywords.getWorkbook'('')
text = findTestData('New Test Data')

value1 = text.getValue(2, 1)

//println(value1)
/*
 * int iterations = 50000 int[] arraySize = new int[iterations]
 * 
 * println(arraySize.length)
 */
/*
 * long start, end;
 * 
 * List<Integer> a = new ArrayList<Integer>();
 * 
 * for (int i = 0; i < 222; i++) { a.add(i); }
 * 
 * int size = a.size();
 * 
 * start = System.currentTimeMillis(); for (int i = size; --i >= 0;) { int x =
 * a.get(i) + 3; }
 * 
 * end = System.currentTimeMillis();
 * 
 * println(end)
 */
//long start=0, end = 0, delta = 0;
//int[] a = new int[2500000];
/*
 * List<Integer> a = new ArrayList<Integer>(); int x = 0;
 * 
 * for (int i = 0; i < 2500; i++) { a.add(i); } for (int ctr = 0; ctr < 10;
 * ctr++) { start = System.currentTimeMillis();
 * 
 * for (int i = 0; i < a.size(); i++) { x = a.get(i) + 3; println(i) } end =
 * System.currentTimeMillis(); delta += end - start;
 * 
 * 
 * }
 */
//missing number
int[] input1 = [11, 14, 15]

int cnt = 0

for (int i = input1[0]; i <= (input1[(input1.length - 1)]); i++) {
    if ((input1[cnt]) == i) {
        cnt++
    } else {
        println(i)
    }
}

//Duplicate value
int[] input = [11, 14, 15, 11, 22, 14]

b = ''

// HashSet<Integer> duplicate = new HashSet<Integer>();
Set<String> duplicate = new HashSet<Integer>()

//  ArrayList a = new ArrayList();
for (int itr : input) {
    if (duplicate.add(itr) == false) {
        b = ((b + itr.toString()) + '\r')
    }
}

println(b)

WebUI.acceptAlert()

