package tqa.home

import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil

import tqa.base.BasePage

public class LandingPage extends BasePage {
	
	@FindBy(css='[class="woocommerce-store-notice__dismiss-link"]') private WebElement dismissLink
	@FindBy(css='[class="woocommerce-store-notice demo_store"][style="display: none;"]') private WebElement dismissLinkHidden
	@FindBy(css='[href="https://shop.demoqa.com/my-account/"]') private WebElement accountLink
	@FindBy(css='img[class="custom-logo"]') private WebElement logo

	public LandingPage() {
		super()
	}

	/**
	 * Is landing page displayed
	 * @return
	 * @throws Exception
	 */
	@Keyword(keywordObject="LandingPage")
	public boolean isLandingPageDisplayed()  throws Exception {
		try {
			return logo.displayed
		} catch(Exception e) {
			KeywordUtil.logInfo("Error: Failed to verify landing page is displayed  " + e.getMessage())
			throw e
		}
	}

	/**
	 * Click Dismiss Link
	 * @return true if dismiss link is hidden
	 * @throws Exception
	 */
	@Keyword(keywordObject="LandingPage")
	public boolean clickDismissLink() throws Exception {
		try {
			dismissLink.click()
			// displayed should return false (!false => true)
			if(!dismissLinkHidden.displayed) return true
			return false
		} catch(Exception e) {
			KeywordUtil.logInfo("Error: Failed to click dismiss link " + e.getMessage())
			throw e
		}
	}

	/**
	 * Click My Account Link
	 * @return true
	 * @throws Exception
	 */
	@Keyword(keywordObject="LandingPage")
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
