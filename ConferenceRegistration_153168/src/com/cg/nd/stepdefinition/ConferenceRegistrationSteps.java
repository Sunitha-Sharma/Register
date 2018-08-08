package com.cg.nd.stepdefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import com.cg.nd.pom.Page1;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ConferenceRegistrationSteps {

	
	private WebDriver driver;
	Page1 pg;
		
	
	@Given("^user want to access conference registration page$")
	public void user_want_to_access_conference_registration_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\sunitsha\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("D:\\BDD_Workspace\\ConferenceRegistration_153168\\src\\ConferenceRegistration.html");
		pg=PageFactory.initElements(driver, Page1.class);
	}

	@Given("^user enters First Name$")
	public void user_enters_First_Name() throws Throwable {
	   //WebElement fname=driver.findElement(By.xpath("//*[@id=\"txtFirstName\"]"));
	   pg.fname.sendKeys("Sunitha");
	}

	@Given("^user enters Last Name$")
	public void user_enters_Last_Name() throws Throwable {
		WebElement lname=driver.findElement(By.xpath("//*[@id=\"txtLastName\"]"));
		   lname.sendKeys("Sharma");
	}

	@Given("^user enters EmailId$")
	public void user_enters_EmailId() throws Throwable {
		WebElement mail=driver.findElement(By.xpath("//*[@id=\"txtEmail\"]"));
		   mail.sendKeys("sunithasharma20@gmail.com");
	}

	@Given("^user enters mobile number$")
	public void user_enters_mobile_number() throws Throwable {
		WebElement cnum=driver.findElement(By.xpath("//*[@id=\"txtPhone\"]"));
		   cnum.sendKeys("9874561231");
	}

	@Given("^user enters count of people attending$")
	public void user_enters_count_of_people_attending() throws Throwable {
		WebElement count=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/select/option[1]"));
		   
		count.click();
	}

	@Given("^user enters his Building Name and Room No$")
	public void user_enters_his_Building_Name_and_Room_No() throws Throwable {
		WebElement area1=driver.findElement(By.xpath("//*[@id=\"txtAddress1\"]"));
		   area1.sendKeys("No:2/1 Xyz 2nd street");
	}

	@Given("^user enters Area Name$")
	public void user_enters_Area_Name() throws Throwable {
		WebElement area2=driver.findElement(By.xpath("//*[@id=\"txtAddress2\"]"));
		   area2.sendKeys("Pqrst");
	}

	@Given("^user enters city$")
	public void user_enters_city() throws Throwable {
		WebElement city=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[9]/td[2]/select/option[4]"));
		   city.click();
	}

	@Given("^user enters state$")
	public void user_enters_state() throws Throwable {
		WebElement state=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[10]/td[2]/select/option[4]"));
		   state.click();
	}

	@Given("^user selects Conference full-Access\\(member\\)$")
	public void user_selects_Conference_full_Access_member() throws Throwable {
		WebElement mem=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[12]/td[2]/input"));
		   mem.click();
	}

	@Given("^user then clicks next$")
	public void user_then_clicks_next() throws Throwable {
		WebElement next=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[14]/td/a"));
		   next.click();
		   Thread.sleep(2000);
	}

	@Given("^alert message for validating personal details will be displayed$")
	public void alert_message_for_validating_personal_details_will_be_displayed() throws Throwable {
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		assertEquals("Personal details are validated.",alert.getText());
		alert.accept();
	}

	/*@Given("^user want to access Payment details page$")
	public void user_want_to_access_Payment_details_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\sunitsha\\Desktop\\chromedriver.exe");
		driver1 = new ChromeDriver();
		driver1.get("D:\\BDD_Workspace\\ConferenceRegistration_153168\\src\\PaymentDetails.html");
	}*/

	@Given("^user enters his/her Card Holder Name$")
	public void user_enters_his_her_Card_Holder_Name() throws Throwable {
		WebElement name=driver.findElement(By.xpath("//*[@id=\"txtCardholderName\"]"));
		   name.sendKeys("Sunitha Sharma");
	}

	@Given("^user enters his/her Debit Card Number$")
	public void user_enters_his_her_Debit_Card_Number() throws Throwable {
		WebElement cardnum=driver.findElement(By.xpath("//*[@id=\"txtDebit\"]"));
		   cardnum.sendKeys("113114104067");
	}

	@Given("^user enters his/her CVV$")
	public void user_enters_his_her_CVV() throws Throwable {
		WebElement cvvnum=driver.findElement(By.xpath("//*[@id=\"txtCvv\"]"));
		   cvvnum.sendKeys("123");
	}

	@Given("^user enters his/her Expiration Month$")
	public void user_enters_his_her_Expiration_Month() throws Throwable {
		WebElement month=driver.findElement(By.xpath("//*[@id=\"txtMonth\"]"));
		   month.sendKeys("July");
	}

	@Given("^user enters his/her Expiration Year$")
	public void user_enters_his_her_Expiration_Year() throws Throwable {
		WebElement month=driver.findElement(By.xpath("//*[@id=\"txtYear\"]"));
		   month.sendKeys("2030");
	}

	@Given("^user then clicks register on make payment button$")
	public void user_then_clicks_register_on_make_payment_button() throws Throwable {
		WebElement next=driver.findElement(By.xpath("//*[@id=\"btnPayment\"]"));
		   next.click();
		   Thread.sleep(2000);
	}

	@Then("^alert message for the successfully booking conference room will be displayed$")
	public void alert_message_for_the_successfully_booking_conference_room_will_be_displayed() throws Throwable {
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		assertEquals("Conference Room Booking successfully done!!!",alert.getText());
		alert.accept();
	}

	


}
