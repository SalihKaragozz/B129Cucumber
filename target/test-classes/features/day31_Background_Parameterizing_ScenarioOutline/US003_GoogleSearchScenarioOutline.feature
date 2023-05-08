@GoogleSearchScenarioOutline
Feature: Google_Search

  Background: kullanici_google_anasayfaya_gider
    Given kullanici_google_anasayfaya_gider





    Scenario Outline: Google_aramalari
      When kullanici googleda "<Aranacak_Kelime>" aratir
      Then title'in "<Aranacak_Kelime>" içerdigini dogrula
      And sayfayi_kapatir
      Examples:
        | Aranacak_Kelime |
        | Java            |
        | Sql             |
        | JDBC            |
        | Selenium        |
        | Lambda          |