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
 * String [] abc = [1,2,3,4,2,1]
 * 
 * Set<String> duplicate = new HashSet<String>()
 * 
 * for(String itr : abc) { if(duplicate.add(itr) == false) { println(itr+ "") }
 * }
 */

/*
 * int [] insert = [1,2,2,3,4,1,1,1,4] abc = "" Set<Integer> dup = new
 * HashSet<>()
 * 
 * for(int itr : insert)
 * 
 * { if(dup.add(itr) == false) {
 * 
 * println(itr) }
 * 
 * }
 */



/*
 * int [] insert = [1,2,4,5,3,3,4,3,5]
 * 
 * int result = insert[0]
 * 
 * for(int i =0; i<insert.length; i++)
 * 
 * { result ^= insert[i]
 * 
 * }
 * 
 * println(result)
 */
	/*
	 * // Use Bitwise 'exclusive or' operator to find unique value int result =
	 * array[0]; for (int i = 1; i < array.length; i++) { result ^= array[i]; }
	 * System.out.println(result); } }
	 */

	/*
	 * // //int [] insert = [1,2,3,5,8,9,9,7,5,3] // //Set<Integer> dup = new
	 * HashSet<Integer>() // // //for(int itr : insert) // //{ // // if(dup.add(itr)
	 * == false) // { // // println(itr) // } // //}
	 */


int[] test = [2,3,4,5,6,7,8,9,10,12,13,14, 18, 32 ];

/*get the missing integer*/

int max = test[test.length - 1];
int min = test[0];
int sum = Arrays.stream(test).sum();
int actual = (((max*(max+1))/2)-min+1);
//Find:

//the missing value
System.out.println(actual - sum);
//the slot
System.out.println(actual - sum - min);

