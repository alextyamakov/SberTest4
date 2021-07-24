package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ScenarioSteps {

    MainPageSteps mainPageSteps = new MainPageSteps();
    AllProgramSteps allProgramSteps = new AllProgramSteps();
    TravelInsuranceSteps travelInsuranceSteps = new TravelInsuranceSteps();
    PolicyCoverSteps policyCoverSteps = new PolicyCoverSteps();
    SendAppSteps sendAppSteps = new SendAppSteps();

    @When("^Закрыто уведомление о куках \"(.+)\"$")
    public void selectStepMenuCookie(String menuItem) {mainPageSteps.selectStepMenuCookie(menuItem);    }

    @When("^Выбран раздел страхование \"(.+)\"$")
    public void selectMenuInsurance(String menuItem){mainPageSteps.selectStepMenuInsurance(menuItem);    }

    @When("^Выбраны все страховые программы \"(.+)\"$")
    public void selectStepMenuAllPrograms(String menuItem){mainPageSteps.selectStepMenuAllPrograms(menuItem);    }

    @When("^Выбран тип страхование путешественников \"(.+)\"$")
    public void selectStepTravelInsurance(String menuItem){allProgramSteps.selectStepTravelInsurance(menuItem);   }

    @Then("^Заголовок страницы - Страхование путешественников равен \"(.+)\"$")
    public void selectStepCheckPageTitle(String expectedTitle){travelInsuranceSteps.selectStepCheckPageTitle(expectedTitle);   }

    @When("^Выбрана кнопка Оформить онлайн \"(.+)\"$")
    public void selectStepTravelInsuranceOrder(String menuItem){travelInsuranceSteps.selectStepTravelInsuranceOrder(menuItem);   }

    @When("^Выбрано минимальное покрытие \"(.+)\"$")
    public void stepSelectMinimalCover(String menuItem){policyCoverSteps.stepSelectMinimalCover(menuItem);   }

    @When("^Выполнено нажатие на кнопку Оформить$")
    public void stepSelectSendAppBtn(){policyCoverSteps.stepSelectSendAppBtn();   }

    @When("^заполняются поля:$")
    public void fillForm(DataTable fields){
        fields.asMap(String.class, String.class)
                .forEach((field, value) -> sendAppSteps.fillField(field, value));
    }

    @When("^Выбран пол \"(.+)\"$")
    public void stepSelectSex(String value){sendAppSteps.stepSelectSex(value);}

    @Then("^значения полей равны:$")
    public void checkFillForm(DataTable fields){
        fields.asMap(String.class, String.class)
                .forEach((field, value) -> sendAppSteps.checkFillField(field, value));
    }

    @When("^Отправлена заявка \"(.+)\"$")
    public void stepSelectSendAppBtn (String value) {sendAppSteps.stepSelectSendAppBtn(value);}

    @Then("^в поле \"(.+)\" присутствует сообщение об общей ошибке \"(.+)\"$")
    public void checkErrorMessage(String field, String errorMessage){
        sendAppSteps.checkErrorMessageField(field, errorMessage);
    }

    @Then("^в поле \"(.+)\" присутствует сообщение об ошибке телефона \"(.+)\"$")
    public void checkFieldPhone(String field, String value){
        sendAppSteps.checkFieldPhone(field, value);
    }

    @Then("^в поле \"(.+)\" присутствует сообщение об ошибке email \"(.+)\"$")
    public void checkFieldEmail(String field, String value){
        sendAppSteps.checkFieldEmail(field, value);
    }

    @Then("^в поле \"(.+)\" присутствует сообщение об ошибке повтора email \"(.+)\"$")
    public void checkFieldRepeatEmail(String field, String value){
        sendAppSteps.checkFieldRepeatEmail(field, value);
    }





}
