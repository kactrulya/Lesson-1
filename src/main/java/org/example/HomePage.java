package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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
        driver.findElement(By.className("button")).click();
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

    //проверка счета 297.00BYN
    public String getHeaderText() {
        return driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[1]/span[1]")).getText();

    }

    //номер карты
    public String getHeaderCardText() {

        return driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[1]/label")).getText();

    }

    //срок действия
    public String getValidityPeriodText() {
        return driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[2]/div[1]/app-input/div/div/div[1]/label")).getText();

    }
    //CVC
    public String getCVCText() {
        return driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[2]/div[3]/app-input/div/div/div[1]/label")).getText();

    }

    //имя держателя
    public String getNameHolderText() {
        return driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[3]/app-input/div/div/div[1]/label")).getText();

    }
    //текст на кнопке
    public String getButtonText() {
        return driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/button/text()")).getText();

    }

    //переключение на фрейм
    public void getFrame() {
        driver.switchTo().frame("iframe.bepaid-iframe");

    }
    public By bepaidIframe = By.xpath("/html/body/div[8]/div/iframe");

    public void switchToBepaidIframe() {
        driver.switchTo().parentFrame();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // Настройка ожидания
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className(".bepaid-iframe")));


    }

    public WebElement waitAndGetElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void switchToDefaultContent() {
        driver.switchTo().defaultContent();
    }
}
