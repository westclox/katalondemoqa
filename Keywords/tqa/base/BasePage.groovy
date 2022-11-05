package tqa.base

import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.PageFactory
import org.openqa.selenium.support.ui.WebDriverWait

import com.kms.katalon.core.annotation.Keyword

import wd.utils.DriverUtils

public abstract class BasePage {

	int TIMEOUT = 5
	DriverUtils driverUtils = new DriverUtils()
	WebDriver driver = driverUtils.getDriver()
	WebDriverWait wait = driverUtils.getWait(TIMEOUT)

	@Keyword(keywordObject="BasePage")
	public BasePage() {
		PageFactory.initElements(driver, this)
		System.out.println("Super class object hashcode :" +  this.hashCode());
	}
}
