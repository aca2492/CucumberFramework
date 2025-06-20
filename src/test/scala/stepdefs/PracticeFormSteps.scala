package stepdefs

import io.cucumber.scala.{EN, ScalaDsl}
import testdata.PracticeFormData.{continentText, dateText, fileUploadText, firstNameText, lastNameText}
import pages.PracticeFormPage.{browserpLaunch, continentSelect, dateInput, experienceSelect, fileUploadInput, firstNameInput, formSubmitted, genderSelect, lastNameInput, passCookies, professionSelect, scrollGender, submitForm}

class PracticeFormSteps extends ScalaDsl with EN {

  Given("""the user is on the form submission page""") { () =>
    passCookies()
  }

  When("""the user enters first name, surname and date""") { () =>
    firstNameInput(firstNameText)
    lastNameInput(lastNameText)
    dateInput(dateText)
  }

  And("""the user clicks on radio buttons and checkbox""") { () =>
    scrollGender()
    genderSelect()
    experienceSelect()
    professionSelect()
  }

  And("""the user selects dropdown option and uploads file""") { () =>
    continentSelect(continentText)
    fileUploadInput(fileUploadText)
  }

  And("""the user clicks the submit button""") { () =>
    submitForm()
//    formSubmitted = false
  }

  Then("""the form should be submitted""") { () =>
    if(formSubmitted){
      println("Form has been submitted")
    }
  }
}