package tqa.home

import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil

import tqa.base.BasePage

public class TopNav extends BasePage {

	@FindBy(xpath='//a[contains(text(), "My Account")]') private WebElement accountLink

	public TopNav() {
		super()
	}

	/**
	 * Click My Account Link
	 * @return true
	 * @throws Exception
	 */
	@Keyword(keywordObject="TopNav")
	public boolean clickMyAccountLink() throws Exception {
		try {
			accountLink.click()
			return true
		} catch(Exception e) {
			KeywordUtil.logInfo("Error: Failed to click my account link " + e.getMessage())
			throw e
		}
	}
}
