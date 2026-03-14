
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

 WebDriver driver;

 By firstProductAdd = By.xpath("(//button[contains(text(),'Add to cart')])[1]");
 By cartIcon = By.className("shopping_cart_link");

 public ProductPage(WebDriver driver){
  this.driver = driver;
 }

 public void addFirstProduct(){
  driver.findElement(firstProductAdd).click();
 }

 public void openCart(){
  driver.findElement(cartIcon).click();
 }

}
