package tqa.base

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class TQAWebUI {

	/**
	 * Get Driver Instance
	 * NOTE: Since we are using Katalon Framework must invoke 
	 * Katalon open browser to get access to the driver object
	 * to be able to get access to the driver object
	 * @return true
	 * @throws Exception
	 */
	@Keyword(keywordObject="TQAWebUI")
	public boolean openBrowser() throws Exception {
		try {
			WebUI.openBrowser(null)
			return true
		} catch (StepFailedException  e) {
			KeywordUtil.logInfo("Error: Failed to open browser " + e.getMessage())
			throw(e)
		}
	}

	/**
	 * Close browser
	 * @return true
	 * @throws Exception
	 */
	@Keyword(keywordObject = "TQAWebUI")
	public boolean closeBrowser() throws Exception {
		try {
			WebUI.closeBrowser()
			return true
		} catch (StepFailedException e) {
			KeywordUtil.logInfo("Error: Failed to close browser " + e.getMessage())
			throw(e)
		}
	}
}
