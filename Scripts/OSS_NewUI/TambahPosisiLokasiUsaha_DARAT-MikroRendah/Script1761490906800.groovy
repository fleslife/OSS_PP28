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

WebUI.callTestCase(findTestCase('OSS_NewUI/Login_MikroRendah'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('OSS_NewUI/goTo_FormPenambahanPosisiLokasiUsaha'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OSS_Staging/Page_OSS Berbasis Risiko/radio_Darat'))

WebUI.click(findTestObject('Object Repository/OSS_Staging/Page_OSS Berbasis Risiko/checkbox_MikroRendah'))

WebUI.setText(findTestObject('Object Repository/OSS_Staging/Page_OSS Berbasis Risiko/input_Koordinat'), '((-6.917098749953945,107.59823888540271))')

WebUI.click(findTestObject('Object Repository/OSS_Staging/Page_OSS Berbasis Risiko/button_GunakanLokasiIni'))

WebUI.setText(findTestObject('Object Repository/OSS_Staging/Page_OSS Berbasis Risiko/input_LuasLahan'), '1.000,12')

WebUI.click(findTestObject('Object Repository/OSS_Staging/Page_OSS Berbasis Risiko/dropDown_JenisLuasLahan'))

WebUI.click(findTestObject('Object Repository/OSS_Staging/Page_OSS Berbasis Risiko/div_Ha_v-list-item-title'))

WebUI.setText(findTestObject('Object Repository/OSS_Staging/Page_OSS Berbasis Risiko/textarea_M_input-v-0-26'), 'TestDARAT-MikroRendah')

WebUI.setText(findTestObject('Object Repository/OSS_Staging/Page_OSS Berbasis Risiko/input_Provinsi_input-v-0-30'), 'Jawa Barat')

WebUI.click(findTestObject('Object Repository/OSS_Staging/Page_OSS Berbasis Risiko/div_Simpan Posisi Lokasi_v-list-item-title_1'))

WebUI.setText(findTestObject('Object Repository/OSS_Staging/Page_OSS Berbasis Risiko/input_KotaKabupaten_input-v-0-35'), 
    'Bandung Barat')

WebUI.click(findTestObject('Object Repository/OSS_Staging/Page_OSS Berbasis Risiko/div_Simpan Posisi Lokasi_v-list-item-title'))

WebUI.setText(findTestObject('Object Repository/OSS_Staging/Page_OSS Berbasis Risiko/input_Kecamatan_input-v-0-40'), 'Lembang')

WebUI.click(findTestObject('Object Repository/OSS_Staging/Page_OSS Berbasis Risiko/div_Simpan Posisi Lokasi_v-list-item-title_2'))

WebUI.setText(findTestObject('Object Repository/OSS_Staging/Page_OSS Berbasis Risiko/input_Kelurahan_input-v-0-45'), 'lembang')

WebUI.click(findTestObject('Object Repository/OSS_Staging/Page_OSS Berbasis Risiko/div_Simpan Posisi Lokasi_v-list-item-title_3'))

WebUI.setText(findTestObject('Object Repository/OSS_Staging/Page_OSS Berbasis Risiko/input_Kode Pos_input-v-0-49'), '12345')

WebUI.uploadFile(findTestObject('Object Repository/OSS_Staging/Page_OSS Berbasis Risiko/span_Dokumen Lokasi Administratif_v-btn__content'), 
    '')

WebUI.uploadFile(findTestObject('Object Repository/OSS_Staging/Page_OSS Berbasis Risiko/span_Dokumen Foto Tampak Depan_v-btn__content'), 
    '')

WebUI.click(findTestObject('Object Repository/OSS_Staging/Page_OSS Berbasis Risiko/span_Kembali_v-btn__content'))

