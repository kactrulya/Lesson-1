package org.example;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestMTS {

    WebDriver driver = new ChromeDriver();

    @BeforeEach
    public void initDriver() {

        driver.get("https://www.mts.by/");
    }


    @Test
    @DisplayName("проверка блока Онлайн пополнение без комиссии")
    public void someTest() {
        System.out.println(driver.getCurrentUrl());
        WebElement input = driver.findElement(By.id("cookie-agree"));  // получить доступ к элементу
        input.getText();


        WebElement block = driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/h2"));
        block.getText();
        Assertions.assertEquals(block.getText(), "Онлайн пополнение\nбез комиссии");

    }

    @Test
    @DisplayName("проверка лого Visa")
    public void someTest1() {
        WebElement visa = driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/div[2]/ul/li[1]/img"));
        visa.getAttribute("alt");
        Assertions.assertEquals(visa.getAttribute("alt"), "Visa");

        WebElement verVisa = driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/div[2]/ul/li[2]/img"));
        verVisa.getAttribute("alt");
        Assertions.assertEquals(verVisa.getAttribute("alt"), "Verified By Visa");

        WebElement masterCard = driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/div[2]/ul/li[3]/img"));
        masterCard.getAttribute("alt");
        Assertions.assertEquals(masterCard.getAttribute("alt"), "MasterCard");

        WebElement masterCardSecure = driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/div[2]/ul/li[4]/img"));
        masterCardSecure.getAttribute("alt");
        Assertions.assertEquals(masterCardSecure.getAttribute("alt"), "MasterCard Secure Code");

        WebElement belcard = driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/div[2]/ul/li[5]/img"));
        belcard.getAttribute("alt");
        Assertions.assertEquals(belcard.getAttribute("alt"), "Белкарт");
    }

    @Test
    @DisplayName("проверка работы ссылки \"подробнее о сервисе")
    public void someTest2() {
        WebElement cooki = driver.findElement(By.id("cookie-agree"));
        cooki.click();
        WebElement service = driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/a"));
        service.click();
    }

    @Test
    @DisplayName("проверка полей")
    public void someTest3() {
        WebElement cooki = driver.findElement(By.id("cookie-agree"));
        cooki.click();
        WebElement phone = driver.findElement(By.id("connection-phone"));
        phone.sendKeys("297777777");

        WebElement sum = driver.findElement(By.id("connection-sum"));
        sum.sendKeys("297");

        WebElement acceptButton = driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/div[1]/div[2]/form[1]/button"));
        acceptButton.click();
    }

   @AfterEach
    public void closeDriver() {
        driver.quit();
   }

}
