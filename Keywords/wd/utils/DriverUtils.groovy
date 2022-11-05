package wd.utils

import java.util.concurrent.TimeUnit

import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.ui.WebDriverWait

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory

public class DriverUtils {

	/*
	 *  uses the open browser call to get access to a webdriver using DriverFactory Class
	 *  once the call the browser is instantiated, we initialize our driver object
	 *  See WebUIUtils class for details
	 */
	private WebDriver driver = DriverFactory.getWebDriver()

	static final int TIMEOUT = 5
	private WebDriverWait wdWait = null

	/**
	 * Get Driver Instance
	 * NOTE: We need to invoke Katalon open browser first
	 * to be able to get access to the driver object
	 * @return webdriver instance
	 * @throws Exception
	 */
	@Keyword(keywordObject="DriverUtils")
	public WebDriver getDriver() throws Exception {
		try {
			return this.driver
		} catch (Exception e) {
			KeywordUtil.logInfo("Error: Failed to get driver instance " + e.getMessage())
			throw(e)
		}
	}

	/**
	 * Get a driver wait object
	 * @param timeout
	 * @return webdriver wait instance
	 * @throws Exception
	 */
	@Keyword(keywordObject = "DriverUtils")
	public WebDriverWait getWait(int timeout) {
		try {
			wdWait = new WebDriverWait(getDriver(), timeout)
			return wdWait
		} catch (Exception e) {
			KeywordUtil.logInfo("Error: Failed to create a web driver wait object " + e.getMessage())
			throw(e)
		}
	}
	
	/**
	 * Navigate To Page
	 * @param baseUrl
	 * @return true
	 * @throws Exception
	 */
	@Keyword(keywordObject = "DriverUtils")
	public boolean navigateToPage(String url) throws Exception {
		try {
			driver.navigate().to(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
			return true
		} catch (Exception e) {
			KeywordUtil.logInfo("Error: Failed to navigate to url " + e.getMessage())
			throw (e)
		}
	}
}
