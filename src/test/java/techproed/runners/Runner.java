package techproed.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
/*
Runner class ını testNG deki .xml file larda belirttiğimiz clasları package ları veya methodlar nasıl
çalıştırıyorsak cucumber frameworkundede runner classındaki tags parametresi ile belirttiğimiz
senaryoyu çalıştırabiliriz


 */



//Cucumber ile JUnit'in entegre olmasını sağlayan test çalıştırıcı notasyonudur
@RunWith(Cucumber.class)
//Seneryoların nerede ve nasıl çalışacağı, hangi raporu kullanacağıyla alakalı seçenekleri ayarlarız
@CucumberOptions(features = "src/test/resources/features/",
        glue = {"techproed/stepDefinitions"},//Bu parametre ile kodlarımızı yazdığımız stepDefinition
        //class'ının packege'ını belirtiriz
        tags = "@DataTable" ,
        dryRun = false    )

/*
features ===> features'ların olduğu packega nın yolunu ver(ContentRoot)
glue ====> stepDefinition'ların olduğu packega nın yolunu ver(Source Root)
tags ====> çalıştırmak istediğin grubu yaz
dryRun = true ===> Missining step definitionsn(Eksik) tespiti için kullanılır testi çalıştırmaz
 */

public class Runner {

}