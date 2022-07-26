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

/*
 * truecon = (1 == 1) falsecon = (1 == 2) expectcon = true
 * 
 * test = CustomKeywords.'testaman.BooleanAssert.isFalse'(falsecon, 'verifying',
 * FailureHandling.STOP_ON_FAILURE)
 * 
 * System.out.println(test)
 */
abc = ['abc', 'aaa', 'aaa', 'ppp']

WebUI.modifyObjectProperty(findTestObject('1st value'), '', '', '', false)

for (int i = 0; i < abc.size(); i++) {
    for (int j = i + 1; j < abc.size(); j++) {
        if ((abc[i]) == (abc[j])) {
            System.out.println(abc[i])
        }
    }
}

Set<String> Store = new HashSet<String>()

for (String name : abc) {
    if (Store.add(name) == false) {
        System.out.println('========>>' + name)
    }
}

int[] a = [1, 2, 3, 4, 5, 6, 7, 78, 6, 3, 1]

Set<String> abc = new HashSet<String>()

for (int ax : a) {
    if (abc.add(ax) == false) {
        System.out.println(ax)
    }
}

WebUI.acceptAlert()

