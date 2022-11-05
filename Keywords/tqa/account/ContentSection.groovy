package tqa.account

import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil

import tqa.base.BasePage

public class ContentSection extends BasePage {
	
	@FindBy(css="[class='woocommerce-MyAccount-content']") private WebElement loggedInText;
	
	public ContentSection() {
		super();
	}

	/**
	 * Get logged in text
	 * @return logged in user info text
	 * @throws Exception
	 */
	@Keyword(keywordObject="ContentSection")
	public String getLoggedInText() throws Exception {
		try {
			return loggedInText.getText();
		} catch(Exception e) {
			KeywordUtil.logInfo("Error: Failed to get logged in user info text " + e.getMessage());
			throw(e);
		}
	}
}
