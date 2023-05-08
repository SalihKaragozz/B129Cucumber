Feature: US001_Amazon_Sayfasinda_Urun_Aratma

  #Background:Her Scenario öncesi çalışır
  Background: kullanici_amazon_sayfasina_gider
    Given kullanici_amazon_sayfasina_gider

  Scenario: TC01_Amazon_sayfasinda_Selenium_Aratma
    When arama_kutusunda_Selenium_aratir
    Then sayfayi_kapatir

  Scenario: TC02_Amazon_sayfasinda_Java_Aratma
    When arama_kutusunda_Java_aratir
    Then sayfayi_kapatir

  Scenario: TC03_Amazon_sayfasinda_Sql_Aratma
    When arama_kutusunda_SQL_aratir
    Then sayfayi_kapatir