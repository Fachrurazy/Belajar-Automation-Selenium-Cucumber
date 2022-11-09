import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.image.Kernel;
import java.security.Key;

public class Registrasi {
    WebDriver driver = null;
    @Given("Open browser")
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aji\\IdeaProjects\\Belajar-Automation\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @And("Open website")
    public void openWebsite() throws InterruptedException {
        driver.get("https://form.jotform.com/223084345230447");
        driver.manage().window().maximize();
        Thread.sleep(2000);
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
    public void userEnterLastName(String lastnamevalue) {
        driver.findElement(By.xpath("//input[@id='last_4']")).sendKeys(lastnamevalue);
    }

    @When("User Enter Student ID {string}")
    public void userEnterStudentID(String studentidvalue) {
        driver.findElement(By.xpath("//input[@id='input_5']")).sendKeys(studentidvalue);
    }

    @When("User Enter Student Email {string}")
    public void userEnterStudentEmail(String studentemailvalue) {
        driver.findElement(By.xpath("//input[@id='input_6']")).sendKeys(studentemailvalue);
    }

    @When("User Enter Gender")
    public void userEnterGender() {
        Select se = new Select(driver.findElement(By.xpath("//select[@id='input_3']")));
        se.selectByIndex(1);
    }

    @When("User Enter List of Classes")
    public void userEnterListOfClasses() {
        Select se = new Select(driver.findElement(By.xpath("//select[@id='input_7']")));
        se.selectByIndex(4);
    }

    @When("User Enter Date")
    public void userEnterDate() throws InterruptedException {
        driver.findElement(By.xpath("//img[@id='input_8_pick']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//td[@class='selected today']")).click();
    }

    @When("User Choice Multiple")
    public void userChoiceMultiple() {

    }

    @When("User Choice Single")
    public void userChoiceSingle() {
    }

    @When("User Enter File Upload")
    public void userEnterFileUpload() {
    }

    @Then("Notification Successful")
    public void notificationSuccessful() {
    }
}
