package techproed.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import techproed.pages.BlueRentalCarPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

import java.util.List;
import java.util.Map;


public class BlueRentalCarStepDefinitions {
    BlueRentalCarPage blueRentalCarPage = new BlueRentalCarPage();
    @Given("kullanici blue rental car sayfasini gider")
    public void kullanici_blue_rental_car_sayfasini_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("bluerentalcar_Url"));

    }
    @When("login olur")
    public void login_olur(DataTable dataTable) {



        blueRentalCarPage.loginButton.click();
        blueRentalCarPage.emailBox.sendKeys(dataTable.row(1).get(0));//2 . satırın ilk ve ikinci sütunlarını kullanıyoruz
        blueRentalCarPage.passwordBox.sendKeys(dataTable.row(1).get(1));
        blueRentalCarPage.loginConfirm.click();
        //çıkış yapıp diğer data ile giriş yapacağız
        blueRentalCarPage.userDropDown.click();
        blueRentalCarPage.logOut.click();
        blueRentalCarPage.OK.click();
        // giriş işlemlerini tekrarlıyorum
        blueRentalCarPage.loginButton.click();
        blueRentalCarPage.emailBox.sendKeys(dataTable.row(2).get(0));//3 . satırın ilk ve ikinci sütunlarını kullanıyoruz
        blueRentalCarPage.passwordBox.sendKeys(dataTable.row(2).get(1));
        blueRentalCarPage.loginConfirm.click();



    }


    @When("login olur map")
    public void loginOlurMap(DataTable dataTable) throws InterruptedException {

    //    System.out.println(dataTable.asMaps().get(0).get("emailadress"));
    //    System.out.println(dataTable.asMaps().get(0).get("password"));

        //Datayı birinci satırı Key olarak kabul eden List<Map> data türüne çavirdik.
        List<Map<String, String>> bilgiler = dataTable.asMaps();

        for (Map<String, String> w: bilgiler) {//Herbir map i alara key değerlerini kullanarak value değerlerini çağırdık ve testimizde kullandık

         //   System.out.println(w.get("emailadress"));
         //   System.out.println(w.get("password"));
            blueRentalCarPage.loginButton.click();
            Thread.sleep(1500);
            blueRentalCarPage.emailBox.sendKeys(w.get("emailadress"));
            Thread.sleep(1500);
            blueRentalCarPage.passwordBox.sendKeys(w.get("password"));
            Thread.sleep(1500);
            blueRentalCarPage.loginConfirm.click();
            Thread.sleep(1500);

            //çıkış yapıp diğer data ile giriş yapacağız
            blueRentalCarPage.userDropDown.click();
            Thread.sleep(1500);
            blueRentalCarPage.logOut.click();
            Thread.sleep(1500);
            blueRentalCarPage.OK.click();
            Thread.sleep(1500);


        }

    }
}