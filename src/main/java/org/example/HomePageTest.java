package org.example;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageTest {

    WebDriver driver;
    HomePage homePage;



    @BeforeEach
    public void initDriver() {
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        homePage = new HomePage(driver);
    }


    @Test
    @DisplayName("проверка блока Онлайн пополнение без комиссии")
    public void testTopUpBlock() {
        homePage.acceptCookies();
        Assertions.assertEquals("Онлайн пополнение\nбез комиссии", homePage.getTopUpText());

    }

    @Test
    @DisplayName("проверка лого Visa")
    public void testVisaLogo() {
        homePage.acceptCookies();
        Assertions.assertEquals("Visa", homePage.getVisText());
        Assertions.assertEquals("Verified By Visa", homePage.getVerVisaText());
        Assertions.assertEquals("MasterCard", homePage.getMasterCardText());
        Assertions.assertEquals("MasterCard Secure Code", homePage.getMasterCardSecureText());
        Assertions.assertEquals("Белкарт", homePage.getbelcardText());

    }

    @Test
    @DisplayName("проверка работы ссылки \"подробнее о сервисе")
    public void testServiceLink() {
        homePage.acceptCookies();
        homePage.clickDetailsService();
    }

    @Test
    @DisplayName("проверка полей")
    public void testFormFields() {
        homePage.acceptCookies();
        homePage.enterPhoneNumber("297777777");
        homePage.enterAmount("297");
        homePage.clickAcceptButton();
    }

    @Test
    @DisplayName("Услуги связи")
    public void testHeaderPhone(){
        homePage.acceptCookies();
        homePage.selectPhone();
        Assertions.assertEquals("Номер телефона", homePage.getPhonePlaceholder());
        Assertions.assertEquals("Сумма", homePage.getSumPlaceholder());
        Assertions.assertEquals("E-mail для отправки чека", homePage.getEmailPlaceholder());
    }

    @Test
    @DisplayName("Домашний Интернет")
    public void testHeaderHomePhone(){
        homePage.acceptCookies();
        homePage.selectHomePhone();
        Assertions.assertEquals("Номер абонента", homePage.getHomePhonePlaceholder());
        Assertions.assertEquals("Сумма", homePage.getSumPlaceholder());
        Assertions.assertEquals("E-mail для отправки чека", homePage.getEmailPlaceholder());
    }

    @Test
    @DisplayName("Рассрочка")
    public void testHeaderInstallment(){
        homePage.acceptCookies();
        homePage.selectInstallment();
        Assertions.assertEquals("Номер счета на 44", homePage.getScorePlaceholder());
        Assertions.assertEquals("Сумма", homePage.getSumPlaceholder());
        Assertions.assertEquals("E-mail для отправки чека", homePage.getEmailPlaceholder());
    }

    @Test
    @DisplayName("Задолженность")
    public void testHeaderDebt(){
        homePage.acceptCookies();
        homePage.selectDebt();
        Assertions.assertEquals("Номер счета на 2073", homePage.getDebtPlaceholder());
        Assertions.assertEquals("Сумма", homePage.getSumPlaceholder());
        Assertions.assertEquals("E-mail для отправки чека", homePage.getEmailPlaceholder());
    }

    @Test
    @DisplayName("Онлайн пополнение")
    public void testOnlineReplenishment() {
        homePage.acceptCookies();
        homePage.selectPhone();
        homePage.enterPhoneNumber("297777777");
        homePage.enterAmount("297");
        homePage.clickAcceptButton();
        homePage.getFrame();
        Assertions.assertEquals("297.00 BYN", homePage.getHeaderText());
        Assertions.assertEquals("Номер карты", homePage.getHeaderCardText());
        Assertions.assertEquals("Срок действия", homePage.getValidityPeriodText());
        Assertions.assertEquals("CVC", homePage.getCVCText());
        Assertions.assertEquals("Имя держателя (как на карте)", homePage.getNameHolderText());
        Assertions.assertEquals(" Оплатить  297.00 BYN ", homePage.getButtonText());

        
        homePage.switchToDefaultContent();

        
    }

   @AfterEach
    public void closeDriver() {
        driver.quit();
   }

}
