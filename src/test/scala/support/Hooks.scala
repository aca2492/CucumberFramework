package support

import io.cucumber.scala.{EN, ScalaDsl}
import org.openqa.selenium.chrome.{ChromeDriver, ChromeOptions}
import pages.PracticeFormPage.{browserpLaunch, formCapture, formSubmitted}


class Hooks extends ScalaDsl with EN {

  val options = new ChromeOptions()
  options.addArguments("--headless=new")

  Before ("@Form"){
    println("Launching browser before scenario...")
    DriverManager.driver = new ChromeDriver(options)
    DriverManager.driver.manage().window().maximize()
    browserpLaunch()
  }

  After {
    println("Closing browser after scenario...")
    if(formSubmitted){
      DriverManager.driver.quit()
    }else if(!formSubmitted){
      formCapture()
      DriverManager.driver.quit()
    }

  }
}
