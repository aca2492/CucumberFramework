package utils

import org.openqa.selenium.io.FileHandler
import org.openqa.selenium.{OutputType, TakesScreenshot, WebDriver}

import java.io.File
import java.text.SimpleDateFormat
import java.util.Date

object ScreenshotUtils {

  def screenCapture(driver: WebDriver): Unit = {

    val timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date())
    val srcTimestamp: File = driver.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.FILE)
    FileHandler.copy(srcTimestamp, new File(s"/Users/adam.chery/Documents/screenshots/Form_Submission_Failure_$timeStamp.png"))

  }

}