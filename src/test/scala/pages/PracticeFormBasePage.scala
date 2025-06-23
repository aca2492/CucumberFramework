package pages

import locators.PracticeFormTitleLocators.expectedHeader
import org.openqa.selenium.support.ui.Select
import org.openqa.selenium.{By, JavascriptExecutor, WebDriver, WebElement}
import utils.{ConfigReader, DriverFactory}
import utils.ScreenshotUtils.screenCapture

trait PracticeFormBasePage {

  val driver: WebDriver = DriverFactory.driver
  val jsExecutor: JavascriptExecutor = driver.asInstanceOf[JavascriptExecutor]
  var formSubmitted: Boolean = true

  def browserpLaunch(): Unit = {
    val testUrl = ConfigReader.get("pbase.url")
    driver.get(testUrl)
  }

  def failureQuit(): Unit = {
    formCapture()
    driver.quit()
  }

  def findById(id: String): WebElement = driver.findElement(By.id(id))
  def findByName(name: String): WebElement = driver.findElement(By.name(name))
  def findByLinkText(link: String): WebElement = driver.findElement(By.linkText(link))
  def findByPartialLinkText(partialLink: String): WebElement = driver.findElement(By.partialLinkText(partialLink))
  def findByTagName(tag: String): WebElement = driver.findElement(By.tagName(tag))
  def findByCssSelector(css: String): WebElement = driver.findElement(By.cssSelector(css))
  def findByXpath(xpath: String): WebElement = driver.findElement(By.xpath(xpath))


  def inputText(selector: By, text: String): Unit =
    driver.findElement(selector).sendKeys(text)

  def clickOn(selector: By): Unit = {
    driver.findElement(selector).click()
  }

  def selectDropdown(selector: By, text: String): Unit = {
    val select = new Select(driver.findElement(selector))
    select.selectByVisibleText(text)
  }

  def getText(selector: By): String =
    driver.findElement(selector).getText

  def formCapture(): Unit = {
    screenCapture(driver)
  }


  def headerConfirm(selector: By, text: String): Unit = {
    if (driver.findElement(selector).getText == expectedHeader) {
      println("Form Page Confirmed")
    }
  }

  def cookiesAccept(selector: By): Unit ={
    driver.findElement(selector).click()
  }

  def scrollTo(selector: By): Unit = {
    val element: WebElement = driver.findElement(selector)
    jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element)
  }

}
