package support

import io.cucumber.scala.{EN, ScalaDsl}
import org.openqa.selenium.chrome.{ChromeDriver, ChromeOptions}
import pages.PracticeFormPage.{browserpLaunch, failureQuit, formCapture, formSubmitted}
import utils.DriverFactory


class Hooks extends ScalaDsl with EN {

  val options = new ChromeOptions()
  options.addArguments("--headless=new")

  Before ("@Form"){
    println("Launching browser before scenario...")
    DriverFactory.driver = new ChromeDriver(options)
    DriverFactory.driver.manage().window().maximize()
    browserpLaunch()
  }

  After {
    println("Closing browser after scenario...")
    if(formSubmitted){
      DriverFactory.driver.quit()
    }else if(!formSubmitted){
      failureQuit()
    }

  }
}
