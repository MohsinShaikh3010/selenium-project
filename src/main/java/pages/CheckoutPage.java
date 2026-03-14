
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

 WebDriver driver;

 By firstName = By.id("first-name");
 By lastName = By.id("last-name");
 By postal = By.id("postal-code");
 By continueBtn = By.id("continue");
 By finishBtn = By.id("finish");

 public CheckoutPage(WebDriver driver){
  this.driver = driver;
 }

 public void enterDetails(){
  driver.findElement(firstName).sendKeys("John");
  driver.findElement(lastName).sendKeys("Doe");
  driver.findElement(postal).sendKeys("400001");
  driver.findElement(continueBtn).click();
 }

 public void finishOrder(){
  driver.findElement(finishBtn).click();
 }

}
