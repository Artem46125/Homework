package БлокОнлайнПополнениеБезКомиссииТесты;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import БлокОнлайнПополнениеБезКомиссии.PaymentPage;

import java.util.concurrent.TimeUnit;

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
        PaymentPage paymentPage = new PaymentPage(driver);
        String blockText = paymentPage.blockPaymentText();
        String expectedName = "Онлайн пополнение";
        String expectedName2 = "без комиссии";
        assertTrue(blockText.contains(expectedName), "Первая часть блока не совпадает");
        assertTrue(blockText.contains(expectedName2), "Вторая часть блока не совпадает");
    }

    @Test
    public void test2() {
        driver.get("https://www.mts.by");
        PaymentPage paymentPage = new PaymentPage(driver);
        assertTrue(paymentPage.logoDisplayed(), "Логотип не найден");

    }

    @Test
    public void test3() {
        driver.get("https://www.mts.by");
        PaymentPage paymentPage = new PaymentPage(driver);
        paymentPage.service();
        assertTrue(paymentPage.bePaid(), "Элемент отсутствует");
    }

    @Test
    public void test4() {
        driver.get("https://www.mts.by");
        PaymentPage paymentPage = new PaymentPage(driver);
        paymentPage.replenishPayment()
                .enterPhoneNumber("297777777")
                .enterSumma("10")
                .clickContinueButton();
        assertTrue(paymentPage.isContinueButtonDisplayed(), "Кнопка продолжить не работает");
    }

    @Test
    public void test5() {
        driver.get("https://www.mts.by");
        PaymentPage paymentPage = new PaymentPage(driver);
        paymentPage.instalmentSystem();
        paymentPage.choiceInstalmentSystem();
        assertEquals(paymentPage.getFieldNumberAccount(), "Номер счета на 44", "Неверная надпись");
        assertEquals(paymentPage.getFieldSumma(), "Сумма", "Неверная надпись");
        assertEquals(paymentPage.getFieldEmail(), "E-mail для отправки чека", "Неверная надпись");

    }
    @Test
    public void test6() {
        driver.get("https://www.mts.by");
        PaymentPage paymentPage = new PaymentPage(driver);
        paymentPage.debts();
        paymentPage.choiceDebts();
        assertEquals(paymentPage.getFieldNumberAccountDebts(),"Номер счета на 2073", "Неверная надпись");
        assertEquals(paymentPage.getFieldSumma(), "Сумма", "Неверная надпись");
        assertEquals(paymentPage.getFieldEmail(), "E-mail для отправки чека", "Неверная надпись");

    }
    @Test
    public void test7() {
        driver.get("https://www.mts.by");
        PaymentPage paymentPage = new PaymentPage(driver);
        paymentPage.homeInternet();
        paymentPage.choiceHomeInternet();
        assertEquals(paymentPage.getFieldNumberAbonent(),"Номер абонента", "Неверная надпись");
        assertEquals(paymentPage.getFieldSumma(), "Сумма", "Неверная надпись");
        assertEquals(paymentPage.getFieldEmail(), "E-mail для отправки чека", "Неверная надпись");
    }
    @Test
    public void test8() {
        driver.get("https://www.mts.by");
        PaymentPage paymentPage = new PaymentPage(driver);
        paymentPage.paymentReplenish();
        assertEquals(paymentPage.getFieldNumberPhone(),"Номер телефона", "Неверная надпись");
        assertEquals(paymentPage.getFieldSumma(), "Сумма", "Неверная надпись");
        assertEquals(paymentPage.getFieldEmail(), "E-mail для отправки чека", "Неверная надпись");
    }
    @Test
    public void test9() {
        driver.get("https://www.mts.by");
        PaymentPage paymentPage = new PaymentPage(driver);
        paymentPage.replenishPayment()
                .enterPhoneNumber("297777777")
                .enterSumma("10")
                .clickContinueButton();
        paymentPage.getA();
        assertTrue(paymentPage.isCardNumberLabelDisplayed(), "Метка 'Номер карты' не отображается");
        assertTrue(paymentPage.isValidityPeriodLabelDisplayed(), "Метка 'Срок действия' не отображается");
        assertTrue(paymentPage.isCvcLabelDisplayed(), "Метка 'CVC' не отображается");
        assertTrue(paymentPage.isNamePersonLabelDisplayed(), "Метка 'Имя держателя (как на карте)' не отображается");
    }
    @Test
    public void test10() {
        driver.get("https://www.mts.by");
        PaymentPage paymentPage = new PaymentPage(driver);
        paymentPage.replenishPayment()
                .enterPhoneNumber("297777777")
                .enterSumma("10")
                .clickContinueButton();
        paymentPage.getA();
        assertTrue(paymentPage.isCardDisplayed("visa-system.svg"), "Отсутсвует");
        assertTrue(paymentPage.isCardDisplayed("mastercard-system.svg"), "Отсутсвует");
        assertTrue(paymentPage.isCardDisplayed("belkart-system.svg"), "Отсутсвует");
        assertTrue(paymentPage.isCardDisplayed("maestro-system.svg"), "Отсутсвует");
        assertTrue(paymentPage.isCardDisplayed("mir-system-ru.svg"), "Отсутсвует");
    }
    @Test
    public void test11() {
        driver.get("https://www.mts.by");
        PaymentPage paymentPage = new PaymentPage(driver);
        paymentPage.replenishPayment()
                .enterPhoneNumber("297777777")
                .enterSumma("10")
                .clickContinueButton();
        paymentPage.getA();
        String expectedPhoneNumber = "Оплата: Услуги связи Номер:375297777777";
        String phoneNumberText = paymentPage.getPhoneNumberText();
        assertEquals(expectedPhoneNumber, phoneNumberText, "Номер телефона отображается некорректно");
    }
    @Test
    public void test12() {
        driver.get("https://www.mts.by");
        PaymentPage paymentPage = new PaymentPage(driver);
        paymentPage.replenishPayment()
                .enterPhoneNumber("297777777")
                .enterSumma("10")
                .clickContinueButton();
        paymentPage.getA();
        String displayedAmount = paymentPage.getDisplayedAmount();
        String expectedAmount = "10.00 BYN";
        if (displayedAmount.equals(expectedAmount)) {
            System.out.println("Сумма отображается корректно: " + displayedAmount);
        } else {
            System.out.println("Сумма отображается некорректно. Ожидалось: " + expectedAmount + ", но отображается: " + displayedAmount);
        }
    }
    @Test
    public void test13() {
        driver.get("https://www.mts.by");
        PaymentPage paymentPage = new PaymentPage(driver);
        paymentPage.replenishPayment()
                .enterPhoneNumber("297777777")
                .enterSumma("10")
                .clickContinueButton();
        paymentPage.getA();
        String expectedText = "Оплатить 10.00 BYN"; // Замените на ожидаемый текст
        String actualText = paymentPage.getDisplayedAmount2();
        assertEquals(expectedText, actualText, "Текст кнопки не совпадает");
    }
}

