package tqa.account

import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil

import tqa.base.BasePage

public class NavLinksSection extends BasePage {
	
	@FindBy(xpath='//a[contains(text(), "Dashboard")]') private WebElement dashboardLink
	@FindBy(xpath='//a[contains(text(), "recent orders")]') private WebElement recentOrdersLink
	@FindBy(xpath='//a[contains(text(), "Downloads")]') private WebElement downLoadsLink
	@FindBy(xpath='//a[contains(text(), "Addresses")]') private WebElement addressesLink
	@FindBy(xpath='//a[contains(text(), "Account details")]') private WebElement accountDetailsLink
	@FindBy(xpath='//a[contains(text(), "Logout")]') private WebElement logoutLink

	public NavLinksSection() {
		super()
	}

	/**
	 * Click Dash board Link
	 * @return true
	 * @throws Exception
	 */
	@Keyword(keywordObject="NavLinksSection")
	public boolean clickDashboardLink() throws Exception {
		try {
			dashboardLink.click()
			return true
		} catch(Exception e) {
			KeywordUtil.logInfo("Error: Failed to click dashboard link " + e.getMessage())
			throw e
		}
	}

	/**
	 * Click recent orders Link
	 * @return true
	 * @throws Exception
	 */
	@Keyword(keywordObject="NavLinksSection")
	public boolean clickRecentOrdersLink() throws Exception {
		try {
			recentOrdersLink.click()
			return true
		} catch(Exception e) {
			KeywordUtil.logInfo("Error: Failed to click recent orders link " + e.getMessage())
			throw e
		}
	}

	/**
	 * Click Downloads Link
	 * @return true
	 * @throws Exception
	 */
	@Keyword(keywordObject="NavLinksSection")
	public boolean clickDownloadsLink() throws Exception {
		try {
			downLoadsLink.click()
			return true
		} catch(Exception e) {
			KeywordUtil.logInfo("Error: Failed to click Downloads link " + e.getMessage())
			throw e
		}
	}

	/**
	 * Click Addresses Link
	 * @return true
	 * @throws Exception
	 */
	@Keyword(keywordObject="NavLinksSection")
	public boolean clickAddressesLink() throws Exception {
		try {
			addressesLink.click()
			return true
		} catch(Exception e) {
			KeywordUtil.logInfo("Error: Failed to click Addresses link " + e.getMessage())
			throw e
		}
	}

	/**
	 * Click Account details Link
	 * @return true
	 * @throws Exception
	 */
	@Keyword(keywordObject="NavLinksSection")
	public boolean clickAccountDetailsLink() throws Exception {
		try {
			accountDetailsLink.click()
			return true
		} catch(Exception e) {
			KeywordUtil.logInfo("Error: Failed to click account details link " + e.getMessage())
			throw e
		}
	}

	/**
	 * Click Logout Link
	 * @return true
	 * @throws Exception
	 */
	@Keyword(keywordObject="NavLinksSection")
	public boolean clickLogoutLink() throws Exception {
		try {
			logoutLink.click()
			return true
		} catch(Exception e) {
			KeywordUtil.logInfo("Error: Failed to click logout link " + e.getMessage())
			throw e
		}
	}
}
