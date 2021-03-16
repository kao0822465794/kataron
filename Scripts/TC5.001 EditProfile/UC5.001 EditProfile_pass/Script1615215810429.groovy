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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/projectalumni/index.php/alumni/login')

WebUI.setText(findTestObject('Object Repository/Page_Log in/input_Log in_u_email'), '614259006@webmail.npru.ac.th')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in/input_Log in_u_pass'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Page_Log in/button_Sign in'))

WebUI.navigateToUrl('http://localhost/projectalumni/index.php/Alumni/profile?id=1')

WebUI.click(findTestObject('Object Repository/Page_profile/div_                                       _b3fc7f'))

WebUI.setText(findTestObject('Object Repository/Page_profile/input__u_major'), 'ไปโรงเรียน')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_profile/input__u_pass'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_profile/input__u_rpass'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Page_profile/button_'))

WebUI.navigateToUrl('http://localhost/projectalumni/index.php/Alumni/profile?id=1')

WebUI.verifyTextPresent('เจษฏากร', false)

WebUI.closeBrowser()

