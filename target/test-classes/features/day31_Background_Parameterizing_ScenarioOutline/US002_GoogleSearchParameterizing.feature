@GoogleSearch
Feature: Google_Search
  Background: kullanici_google_anasayfaya_gider
    Given kullanici_google_anasayfaya_gider



    Scenario: TC01_Java_Search
      When kullanici googleda "Java" aratir
      Then title'in "Java" içerdigini dogrula
      And sayfayi_kapatir

  Scenario: TC02_Java_Search
    When kullanici googleda "Sql" aratir
    Then title'in "Sql" içerdigini dogrula
    And sayfayi_kapatir

  Scenario: TC03_Java_Search
    When kullanici googleda "JDBC" aratir
    Then title'in "JDBC" içerdigini dogrula
    And sayfayi_kapatir

  Scenario: TC04_Java_Search
    When kullanici googleda "Selenium" aratir
    Then title'in "Selenium" içerdigini dogrula
    And sayfayi_kapatir

  Scenario: TC05_Java_Search
    When kullanici googleda "Lambda" aratir
    Then title'in "Lambda" içerdigini dogrula
    And sayfayi_kapatir