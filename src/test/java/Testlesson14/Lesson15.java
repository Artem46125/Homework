package Testlesson14;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Lesson15 {
    static WebDriver driver;
    @BeforeAll
    static void setupAll() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    @AfterEach
    public void test() {
        driver.get("https://www.mts.by");
        WebElement block = driver.findElement(By.xpath("//h2[normalize-space()='Онлайн пополнение без комиссии']"));
        String actualName = block.getText();
        String expectedName = "Онлайн пополнение";
        String expectedName2 = "без комиссии";
        assertTrue(actualName.contains(expectedName), "Первая часть блока не совпадает");
        assertTrue(actualName.contains(expectedName2), "Вторая часть блока не совпадает");
    }
    @Test
    public void test2() {
        driver.get("https://www.mts.by");
        WebElement logoDisplayed = driver.findElement(By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/div[2]/ul/li[3]/img"));
        assertTrue(logoDisplayed.isDisplayed(), "Логотипы не найдены");
    }
    @Test
    public void test3() {
        driver.get("https://www.mts.by");
        WebElement service = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/a"));
        service.click();
        WebElement bePaid = driver.findElement(By.xpath("/html/body/div[6]/main/div/div[5]/ul[1]/li[5]/a"));
        assertTrue(bePaid.isDisplayed(), "Элемент отсутствует");
    }
    @Test
    public void test4() {
        driver.get("https://www.mts.by");
        WebElement communicationServices = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button"));
        communicationServices.click();
        WebElement inputPhoneNumber = driver.findElement(By.xpath("//*[@id=\"connection-phone\"]"));
        inputPhoneNumber.sendKeys("297777777");
        WebElement mooney = driver.findElement(By.xpath("//*[@id=\"connection-sum\"]"));
        mooney.sendKeys("10");
        WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button"));
        continueButton.click();
        assertTrue(continueButton.isDisplayed(), "Кнопка продолжить не работает");

    }
}
