package tqa.account

import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil

import tqa.base.BasePage

public class LoginSection extends BasePage {
	
	@FindBy(id='username') private WebElement username
	@FindBy(id='password') private WebElement userpwd
	@FindBy(name='login') private WebElement loginBtn

	public LoginSection() {
		super()
	}

	/**
	 * Set user name
	 * @param userName
	 * @return true
	 * @throws Exception
	 */
	@Keyword(keywordObject="LoginSection")
	public boolean setUserName(String userName) throws Exception {
		try {
			username.sendKeys(userName)
			return true
		} catch(Exception e) {
			KeywordUtil.logInfo("Error: Failed to get page title " + e.getMessage())
			throw e
		}
	}

	/**
	 * Set User password
	 * @param userPwd
	 * @return true
	 * @throws Exception
	 */
	@Keyword(keywordObject="LoginSection")
	public boolean setUserPwd(String userPassword) throws Exception {
		try {
			userpwd.sendKeys(userPassword)
			return true
		} catch(Exception e) {
			KeywordUtil.logInfo("Error: Failed to get page title " + e.getMessage())
			throw e
		}
	}

	/**
	 * Click login button
	 * @return true
	 * @throws Exception
	 */
	@Keyword(keywordObject="LoginSection")
	public boolean clickLoginButton() throws Exception {
		try {
			loginBtn.click()
			return true
		} catch(Exception e) {
			KeywordUtil.logInfo("Error: Failed to get page title " + e.getMessage())
			throw e
		}
	}

	/**
	 * Login with valid password
	 * @param userName
	 * @param userPwd
	 * @return true
	 * @throws Exception
	 */
	@Keyword(keywordObject="LoginSection")
	public boolean loginValidCredentials(String userName, String userPwd) throws Exception {
		try {
			setUserName(userName)
			setUserPwd(userPwd)
			return clickLoginButton()
		} catch(Exception e) {
			KeywordUtil.logInfo("Error: Failed to login " + e.getMessage())
			throw e
		}
	}
}
