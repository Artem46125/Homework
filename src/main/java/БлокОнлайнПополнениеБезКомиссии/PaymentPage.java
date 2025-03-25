package БлокОнлайнПополнениеБезКомиссии;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class PaymentPage {
    //Локаторы для задания 15
    private By blockPayment = By.xpath("//h2[normalize-space()='Онлайн пополнение без комиссии']");
    private By logoDisplayed = By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/div[2]/ul/li[3]/img");
    private By service = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/a");
    private By bePaid = By.xpath("/html/body/div[6]/main/div/div[5]/ul[1]/li[5]/a");
    private By communicationServices = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button");
    private By inputPhoneNumber = By.xpath("//*[@id=\"connection-phone\"]");
    private By summa = By.xpath("//*[@id=\"connection-sum\"]");
    private By continueButton = By.xpath("//*[@id=\"pay-connection\"]/button");

    //Локаторы надписей для Услуг связи(communicationServices)
    private By numberPhone = By.xpath("//input[@placeholder='Номер телефона']");
    private By email = By.xpath("//input[@placeholder='E-mail для отправки чека']");
    private By sum = By.xpath("//input[@placeholder='Сумма']");
    //Локаторы надписей для Домашнего интернета(homeInternet)
    private By homeInternet = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[2]");
    private By numberAbonent = By.xpath("//input[@placeholder='Номер абонента']");
    //для Рассрочки(instalmentSystem)
    private By instalmentSystem = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[3]");
    private By numberAccount = By.xpath("//input[@placeholder='Номер счета на 44']");
    //для Задолженности(Debts)
    private By debts = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[4]");
    private By numberAccountDebts = By.xpath("//input[@placeholder='Номер счета на 2073']");
    //Локаторы для фрейма оплаты
    private By iframeLocator = By.cssSelector("iframe.bepaid-iframe");
    private By displayingAmount = By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[1]/div[1]/span");
    private By displayingNumberPhone = By.xpath("//span[contains(text(), 'Оплата: Услуги связи')]");
    private By cardNumber = By.xpath("//label[text()='Номер карты']");
    private By validityPeriod = By.xpath("//label[text()='Срок действия']");
    private By cvc = By.xpath("//label[text()='CVC']");
    private By namePerson = By.xpath("//label[text()='Имя держателя (как на карте)']");

    //Локаторы иконок платежных систем
    private By imgPaysystem = By.cssSelector(".cards-brands img");
    private By amountButton = By.xpath("//span[text()='10.00 BYN']");
    private By amountDisplay = By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/button/text()");

    private WebDriverWait wait;
    public WebDriver driver;
    public PaymentPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(70));
    }
    //test1
    public String blockPaymentText() {
        WebElement block = driver.findElement(blockPayment);
        return block.getText();
    }
    //test2
    public boolean logoDisplayed() {
        WebElement logo = driver.findElement(logoDisplayed);
        return logo.isDisplayed();
    }
    //test3
    public void service() {
        WebElement serviceLink = driver.findElement(service);
        serviceLink.click();
    }
    public boolean bePaid() {
        WebElement bePaidDisplayed = driver.findElement(bePaid);
        return bePaidDisplayed.isDisplayed();
    }
    //test4
    public PaymentPage replenishPayment() {
        driver.findElement(communicationServices).click();
        return this;
    }
    public PaymentPage enterPhoneNumber(String phoneNumber) {
        driver.findElement(inputPhoneNumber).sendKeys(phoneNumber);
        return this;
    }
    public PaymentPage enterSumma(String amount) {
        driver.findElement(summa).sendKeys(amount);
        return this;
    }
    public void clickContinueButton() {
        driver.findElement(continueButton).click();
    }
    public boolean isContinueButtonDisplayed() {
        return driver.findElement(continueButton).isDisplayed();
    }
    //test5-8
    public void paymentReplenish() {
        driver.findElement(communicationServices).click();
    }
    public void homeInternet(){
        driver.findElement(communicationServices).click();
    }
    public void choiceHomeInternet() {
        driver.findElement(homeInternet).click();
    }
    public void instalmentSystem() {
        driver.findElement(communicationServices).click();
    }
    public void choiceInstalmentSystem() {
        driver.findElement(instalmentSystem).click();
    }
    public void debts() {
        driver.findElement(communicationServices).click();
    }
    public void choiceDebts() {
        driver.findElement(debts).click();
    }
    public String getFieldNumberPhone() {
        WebElement fieldNumberPhone = wait.until(ExpectedConditions.presenceOfElementLocated(numberPhone));
        return fieldNumberPhone.getAttribute("placeholder");
    }
    public String getFieldEmail() {
        WebElement fieldEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(email));
        return fieldEmail.getAttribute("placeholder");
    }
    public String getFieldSumma() {
        WebElement fieldSumma = wait.until(ExpectedConditions.visibilityOfElementLocated(sum));
        return fieldSumma.getAttribute("placeholder");
    }
    public String getFieldNumberAbonent() {
        WebElement fieldNumberAbonent = wait.until(ExpectedConditions.visibilityOfElementLocated(numberAbonent));
        return fieldNumberAbonent.getAttribute("placeholder");
    }
    public String getFieldNumberAccount() {
        WebElement fieldNumberAccount = wait.until(ExpectedConditions.visibilityOfElementLocated(numberAccount));
        return fieldNumberAccount.getAttribute("placeholder");
    }
    public String getFieldNumberAccountDebts() {
        WebElement fieldNumberAccountDebts = wait.until(ExpectedConditions.visibilityOfElementLocated(numberAccountDebts));
        return fieldNumberAccountDebts.getAttribute("placeholder");
    }
    //test 9
    public void getA() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframeLocator));
    }
// для лейблов реквизитов карты
    public boolean isCardNumberLabelDisplayed() {
        WebElement label = wait.until(ExpectedConditions.visibilityOfElementLocated(cardNumber));
        return label.isDisplayed();
    }
    public boolean isValidityPeriodLabelDisplayed() {
        WebElement label = wait.until(ExpectedConditions.visibilityOfElementLocated(validityPeriod));
        return label.isDisplayed();
    }
    public boolean isCvcLabelDisplayed() {
        WebElement label = wait.until(ExpectedConditions.visibilityOfElementLocated(cvc));
        return label.isDisplayed();
    }
    public boolean isNamePersonLabelDisplayed() {
        WebElement label = wait.until(ExpectedConditions.visibilityOfElementLocated(namePerson));
        return label.isDisplayed();
    }
    //test10
    public List<WebElement> getCardImages() {
        return driver.findElements(imgPaysystem);
    }

    public boolean isCardDisplayed(String cardImageName) {
        List<WebElement> cardImages = getCardImages();
        for (WebElement cardImage : cardImages) {
            if (cardImage.getAttribute("src").contains(cardImageName)) {
                return true;
            }
        }
        return false;
    }
    //test 11
    public WebElement getPhoneNumberElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), 'Номер:')]")));
    }
    public String getPhoneNumberText() {
        return getPhoneNumberElement().getText();
    }
    //test 12
    public String getDisplayedAmount() {
        WebElement button = driver.findElement(amountButton);
        return button.getText();
    }
    //test 13
    public String getDisplayedAmount2() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(amountDisplay));
        WebElement amountElement = driver.findElement(amountDisplay);
        return amountElement.getText();
    }


}
