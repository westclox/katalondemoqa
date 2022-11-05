import com.kms.katalon.core.util.KeywordUtil

import internal.GlobalVariable

try {
	assert CustomKeywords.'tqa.base.TQAWebUI.openBrowser'()
	assert CustomKeywords.'wd.utils.DriverUtils.navigateToPage'(url)
	assert CustomKeywords.'tqa.home.LandingPage.isLandingPageDisplayed'()
	assert CustomKeywords.'tqa.home.LandingPage.clickDismissLink'()
	assert CustomKeywords.'tqa.home.LandingPage.clickMyAccountLink'()
	assert CustomKeywords.'tqa.account.HeaderSection.getPageTitle'() == pageTitle
	
	assert CustomKeywords.'tqa.account.LoginSection.loginValidCredentials'(userName, userPwd)
	String infoText = CustomKeywords.'tqa.account.ContentSection.getLoggedInText'()
	String[] parsedText = infoText.split('\\n')
	assert parsedText[0].split('\\(')[0].trim() == "Hello " + loggedInUser
	
	assert CustomKeywords.'tqa.home.TopNav.clickMyAccountLink'()
	assert CustomKeywords.'tqa.account.NavLinksSection.clickLogoutLink'()
	assert CustomKeywords.'tqa.base.TQAWebUI.closeBrowser'()
} catch(Exception e) {
	KeywordUtil.logInfo("Error Failed test " + e.getMessage())
	assert false
}