package locators

import org.openqa.selenium.By

object PracticeFormLocators {

  val firstName: By = By.name("firstname")
  val lastName: By = By.name("lastname")
  val date: By = By.id("datepicker")
  val gender: By = By.id("sex-0")
  val experience: By = By.id("exp-3")
  val profession: By = By.id("profession-0")
  val continent: By = By.id("continents")
  val fileUpload: By = By.cssSelector("input[type='file']")
  val Submit: By = By.cssSelector("button[id='submit']")
  val cookiesAcceptLocator: By = By.id("ez-accept-necessary")

}
