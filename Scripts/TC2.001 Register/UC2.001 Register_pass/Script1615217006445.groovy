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

WebUI.navigateToUrl('http://localhost/projectalumni/index.php/alumni/register')

WebUI.setText(findTestObject('Object Repository/Page_register/input__u_std'), '614259021')

WebUI.setText(findTestObject('Object Repository/Page_register/input__u_gen'), '61/47')

WebUI.setText(findTestObject('Object Repository/Page_register/input__u_year'), '2555')

WebUI.setText(findTestObject('Object Repository/Page_register/input__u_major'), 'วิศวกรรมซอฟต์แวร์')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_register/select_                                    _74d20e'), 
    'คณะวิทยาศาสตร์และเทคโนโลยี', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_register/select_                                    _33d318'), 
    'นาย', true)

WebUI.setText(findTestObject('Object Repository/Page_register/input__u_fname'), 'กรวิชญ์ออ')

WebUI.setText(findTestObject('Object Repository/Page_register/input__u_lname'), 'อู่อรุณ')

WebUI.setText(findTestObject('Object Repository/Page_register/input_E-mail_u_email'), '614259087@webmail.npru.ac.th')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_register/input__u_pass'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_register/input__u_rpass'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.setText(findTestObject('Object Repository/Page_register/input_Facebook_u_fb'), 'Kaooooooowwwww')

WebUI.setText(findTestObject('Object Repository/Page_register/input__a_h_number'), '97')

WebUI.setText(findTestObject('Object Repository/Page_register/input__a_home'), '44')

WebUI.setText(findTestObject('Object Repository/Page_register/input__a_road'), 'มาลาย')

WebUI.setText(findTestObject('Object Repository/Page_register/input__a_zone'), 'กำกกำ')

WebUI.setText(findTestObject('Object Repository/Page_register/input__a_district'), 'กำดสา')

WebUI.setText(findTestObject('Object Repository/Page_register/input__a_province'), 'จันทบุรี')

WebUI.setText(findTestObject('Object Repository/Page_register/input__a_code'), '73142')

WebUI.setText(findTestObject('Object Repository/Page_register/input__a_h_phone'), '034000444')

WebUI.setText(findTestObject('Object Repository/Page_register/input__a_phone'), '0633333333')

WebUI.click(findTestObject('Object Repository/Page_register/label_'))

WebUI.click(findTestObject('Object Repository/Page_register/button_'))

WebUI.verifyTextPresent('Log in', false)

WebUI.closeBrowser()

