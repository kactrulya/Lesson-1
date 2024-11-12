package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acceptCookies() {
        driver.findElement(By.id("cookie-agree")).click();
    }

    public String getTopUpText() {
        return driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/h2")).getText();
    }

    public String getVisText() {
        return driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/div[2]/ul/li[1]/img")).getAttribute("alt");
    }

    public String getVerVisaText() {
        return driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/div[2]/ul/li[2]/img")).getAttribute("alt");
    }

    public String getMasterCardText() {
        return driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/div[2]/ul/li[3]/img")).getAttribute("alt");
    }

    public String getMasterCardSecureText() {
        return driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/div[2]/ul/li[4]/img")).getAttribute("alt");
    }

    public String getbelcardText() {
        return driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/div[2]/ul/li[5]/img")).getAttribute("alt");
    }

    public void clickDetailsService() {
        driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/a")).click();
    }

    public void enterPhoneNumber(String phoneNumber) {
        driver.findElement(By.id("connection-phone")).sendKeys(phoneNumber);
    }

    public void enterAmount(String amount) {
        driver.findElement(By.id("connection-sum")).sendKeys(amount);
    }

    public void clickAcceptButton() {
        driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/div[1]/div[2]/form[1]/button")).click();
    }

    public void selectPhone() {
        driver.findElement(By.className("select__header")).click();
        driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[1]/p")).click();

    }

    //Домашний интернет
    public void selectHomePhone() {
        driver.findElement(By.className("select__header")).click();
        driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[2]/p")).click();

    }

    //Рассрочка
    public void selectInstallment () {
        driver.findElement(By.className("select__header")).click();
        driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[3]/p")).click();

    }

    //Задолженность
    public void selectDebt () {
        driver.findElement(By.className("select__header")).click();
        driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/div[1]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[4]/p")).click();
    }

    public String getPhonePlaceholder(){
        return driver.findElement(By.className("phone")).getAttribute("placeholder");
    }

    public String getSumPlaceholder(){
        return driver.findElement(By.className("total_rub")).getAttribute("placeholder");
    }

    public String getEmailPlaceholder(){
        return driver.findElement(By.className("email")).getAttribute("placeholder");
    }

    public String getHomePhonePlaceholder(){
        return driver.findElement(By.id("internet-phone")).getAttribute("placeholder");
    }

    public String getScorePlaceholder(){
        return driver.findElement(By.className("score")).getAttribute("placeholder");
    }

    public String getDebtPlaceholder(){
        return driver.findElement(By.id("score-arrears")).getAttribute("placeholder");
    }

    public String getHeaderText() {
        return driver.findElement(By.className("ng-tns-c46-1")).getText();

    }


    //переключение на фрейм
    public void getFrame() {
        driver.switchTo().frame("bepaid-iframe");
    }

    public void switchToBepaidIframe() {
        WebElement iframe = driver.findElement(By.className("bepaid-iframe"));
        driver.switchTo().frame(iframe);
    }
}
