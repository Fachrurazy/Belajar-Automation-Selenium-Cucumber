package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.image.Kernel;
import java.security.Key;

public class Registrasi {
    WebDriver driver = null;
    @Given("Open browser")
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "D:\\Belajar Coding\\Java\\Belajar-Automation-Selenium-Cucumber\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @And("Open website")
    public void openWebsite() throws InterruptedException {
        driver.get("https://form.jotform.com/223084345230447");
        driver.manage().window().maximize();
        Thread.sleep(1000);
    }

    @And("Located on Registration page")
    public void locatedOnRegistrationPage() {
        driver.findElement(By.xpath("//h1[@id='header_1']")).isDisplayed();
    }

    @When("User Enter First Name {string}")
    public void userEnterFirstName(String firstnamevalue) {
        driver.findElement(By.xpath("//input[@id='first_4']")).sendKeys(firstnamevalue);
    }

    @When("User Enter Last Name {string}")
    public void userEnterLastName(String lastnamevalue) throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='last_4']")).sendKeys(lastnamevalue);
        //Thread.sleep(2000);
    }

    @When("User Enter Student ID {string}")
    public void userEnterStudentID(String studentidvalue) throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='input_5']")).sendKeys(studentidvalue);
        //Thread.sleep(1000);
    }

    @When("User Enter Student Email {string}")
    public void userEnterStudentEmail(String studentemailvalue) throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='input_6']")).sendKeys(studentemailvalue);
        //Thread.sleep(1000);
    }

    @When("User Enter Gender")
    public void userEnterGender() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//label[@id='label_3']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",element);

        Select se = new Select(driver.findElement(By.xpath("//select[@id='input_3']")));
        se.selectByIndex(1);
        //Thread.sleep(1000);
    }

    @When("User Enter List of Classes")
    public void userEnterListOfClasses() throws InterruptedException {
        Select se = new Select(driver.findElement(By.xpath("//select[@id='input_7']")));
        se.selectByIndex(4);
        //Thread.sleep(1000);
    }

    @When("User Enter Date")
    public void userEnterDate() throws InterruptedException {
//        WebElement element = driver.findElement(By.xpath("//img[@id='label_8']"));
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",element);

        driver.findElement(By.xpath("//img[@id='input_8_pick']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//td[@class='selected today']")).click();
        //Thread.sleep(2000);
    }

    @When("User Choice Multiple")
    public void userChoiceMultiple() throws InterruptedException {
        driver.findElement(By.xpath("//label[@id='label_input_11_0']")).click();
        driver.findElement(By.xpath("//label[@id='label_input_11_2']")).click();
        //Thread.sleep(2000);
    }

    @When("User Choice Single")
    public void userChoiceSingle() throws InterruptedException {
        driver.findElement(By.xpath("//label[@id='label_input_16_1']")).click();
        //Thread.sleep(2000);
    }

    @When("User Enter File Upload")
    public void userEnterFileUpload() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//input[@class='fileupload-input']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",element);

        WebElement file = driver.findElement(By.xpath("//input[@class='fileupload-input']"));
        //file.click();
        file.sendKeys("D:\\Jurnal_Aji.pdf");
        Thread.sleep(3000);
    }

    @Then("Notification Successful")
    public void notificationSuccessful() throws InterruptedException {
        driver.findElement(By.xpath("//button[@id='input_2']")).click();
        //Thread.sleep(3000);
    }
}
