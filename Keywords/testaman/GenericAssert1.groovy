package testaman

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.eclipse.persistence.jpa.jpql.Assert.AssertException

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil


class GenericAssert1 {

	/**
	 * Verify that the object passed in is null or not. If it's not null the verification step will be marked as failed
	 * @param object the object to be test
	 * @param description the description for the verification
	 */
	@Keyword
	static void isNull(object, String description, FailureHandling flowControl = FailureHandling.STOP_ON_FAILURE) {
		try{
			info "$description with object value is '$object'"
			String message = buildAssertMessage(description, "is null", object)
			if(object != null){
				handleError(message, flowControl)
			}
			else{
				pass("The object is null")
			}
		}
		catch(ex){
			handleError(ex, flowControl)
		}
	}

	/**
	 * Verify that the object passed in is null or not. If it's null the verification step will be marked as failed
	 * @param object the object to be test
	 * @param description the verification info
	 */
	@Keyword
	static void isNotNull(object, String description, FailureHandling flowControl = FailureHandling.STOP_ON_FAILURE) {
		try{
			info "$description with object value is '$object'"
			String message = buildAssertMessage(description, "is not null", object)
			if(object == null){
				handleError(message, flowControl)
			}
			else{
				pass("The object is not null")
			}
		}
		catch(ex){
			handleError(ex, flowControl)
		}
	}

	protected static String buildAssertMessage(String description, String expectedMessage, def actual){
		String lineSeparator = System.getProperty("line.separator")
		return "$description.${lineSeparator}Expected: $expectedMessage.${lineSeparator}Actual: $actual"
	}

	protected static void info(String message){
		KeywordUtil.logInfo(message)
	}

	protected static void pass(String message){
		KeywordUtil.markPassed(message)
	}

	protected static void handleError(String message, FailureHandling flowControl){
		switch(flowControl){
			case FailureHandling.STOP_ON_FAILURE:
				KeywordUtil.markFailedAndStop(message)
				break
			case FailureHandling.CONTINUE_ON_FAILURE:
				KeywordUtil.markFailed(message)
				break
			case FailureHandling.OPTIONAL:
				KeywordUtil.markWarning (message)
				break
			default:
				throw new AssertException(message)
		}
	}

	protected static void handleError(Exception ex, FailureHandling flowControl){
		handleError(ex.message, flowControl)
	}
}