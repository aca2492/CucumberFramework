package locators

import org.openqa.selenium.{By, WebElement}
import pages.PracticeFormPage.driver

object PracticeFormTitleLocators {

  // Login Page
  val PracticeFormHeader: By = By.tagName("h3")
  val expectedHeader: String = "Demo Automation Practice Form"

}
