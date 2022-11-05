package tqa.account

import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil

import tqa.base.BasePage

public class HeaderSection extends BasePage {

	@FindBy(css='[class="page-title"]') private WebElement pageTitle
	@FindBy(css='[href="https://shop.demoqa.com"]') private WebElement shoppingLink

	public HeaderSection() {
		super()
	}

	/**
	 * Get page title
	 * @return page ttile
	 * @throws Exception
	 */
	@Keyword(keywordObject="HeaderSection")
	public String getPageTitle() throws Exception {
		try {
			pageTitle.getText()
		} catch(Exception e) {
			KeywordUtil.logInfo("Error: Failed to get page title " + e.getMessage())
			throw e
		}
	}

	/**
	 * Click Tools Demo Site Link
	 * @return true
	 * @throws Exception
	 */
	@Keyword(keywordObject="HeaderSection")
	public boolean clickToolsDemoSiteLink() throws Exception {
		try {
			shoppingLink.click()
			return true
		} catch(Exception e) {
			KeywordUtil.logInfo("Error: Failed to click tools demo site link " + e.getMessage())
			throw e
		}
	}
}
