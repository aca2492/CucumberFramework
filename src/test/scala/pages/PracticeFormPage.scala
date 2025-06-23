package pages

import locators.PracticeFormLocators.{Submit, continent, cookiesAcceptLocator, date, experience, fileUpload, firstName, gender, lastName, profession}

object PracticeFormPage extends PracticeFormBasePage{

  def firstNameInput(text: String): Unit = {
    inputText(firstName, text)
  }

  def lastNameInput(text: String): Unit = {
    inputText(lastName, text)
  }

  def dateInput(text: String): Unit = {
    inputText(date, text)
  }

  def genderSelect(): Unit = {
    clickOn(gender)
  }

  def experienceSelect(): Unit = {
    clickOn(experience)
  }

  def professionSelect(): Unit = {
    clickOn(profession)
  }

  def continentSelect(text: String): Unit = {
    selectDropdown(continent, text)
  }

  def submitForm(): Unit = {
    clickOn(Submit)
  }

  def passCookies(): Unit = {
    clickOn(cookiesAcceptLocator)
  }

  def scrollGender(): Unit = {
    scrollTo(gender)
  }

  def scrollContinent(): Unit = {
    scrollTo(continent)
  }

  def fileUploadInput(text: String): Unit = {
    inputText(fileUpload, text)
  }

}
