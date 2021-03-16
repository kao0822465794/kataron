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

WebUI.setText(findTestObject('Object Repository/Page_register/input__u_std'), '614225544')

WebUI.setText(findTestObject('Object Repository/Page_register/input__u_gen'), '62/75')

WebUI.setText(findTestObject('Object Repository/Page_register/input__u_year'), '2456')

WebUI.setText(findTestObject('Object Repository/Page_register/input__u_major'), 'วิสฟหกฟ')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_register/select_                                    _74d20e'), 
    'คณะมนุษยศาสตร์และสังคมศาสตร์', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_register/select_                                    _33d318'), 
    'นาย', true)

WebUI.setText(findTestObject('Object Repository/Page_register/input__u_fname'), 'ฟหกฟหก')

WebUI.setText(findTestObject('Object Repository/Page_register/input__u_lname'), 'ๆไดๆดๆ')

WebUI.setText(findTestObject('Object Repository/Page_register/input_E-mail_u_email'), 'sdwdqqdw@hotmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_register/input__u_pass'), 'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_register/input__u_rpass'), 'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.setText(findTestObject('Object Repository/Page_register/input_Facebook_u_fb'), 'kasodaopsd')

WebUI.setText(findTestObject('Object Repository/Page_register/input__a_h_number'), '62232')

WebUI.setText(findTestObject('Object Repository/Page_register/input__a_home'), '4451')

WebUI.setText(findTestObject('Object Repository/Page_register/input__a_road'), 'หกดหกดไห')

WebUI.setText(findTestObject('Object Repository/Page_register/input__a_zone'), 'หกดหกด')

WebUI.setText(findTestObject('Object Repository/Page_register/input__a_district'), 'หกดฟดกฟฟ')

WebUI.setText(findTestObject('Object Repository/Page_register/input__a_province'), 'ชัยนาท')

WebUI.setText(findTestObject('Object Repository/Page_register/input__a_code'), '78554')

WebUI.click(findTestObject('Object Repository/Page_register/input__a_h_phone'))

WebUI.sendKeys(findTestObject('Object Repository/Page_register/input__a_h_phone'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_register/input__a_code'), '78554')

WebUI.setText(findTestObject('Object Repository/Page_register/input__a_h_phone'), '052356922')

WebUI.setText(findTestObject('Object Repository/Page_register/input__a_phone'), '0231546687')

WebUI.click(findTestObject('Object Repository/Page_register/label_'))

WebUI.click(findTestObject('Object Repository/Page_register/button_'))

WebUI.setText(findTestObject('Object Repository/Page_register/input__a_phone'), '0831546687')

WebUI.click(findTestObject('Object Repository/Page_register/button_'))

WebUI.verifyTextPresent('Log in', false)

WebUI.closeBrowser()

