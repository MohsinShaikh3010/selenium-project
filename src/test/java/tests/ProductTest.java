
package tests;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.LoginPage;
import pages.ProductPage;

public class ProductTest extends BaseTest{

 @Test
 public void addProduct(){

  LoginPage login = new LoginPage(driver);
  login.login("standard_user","secret_sauce");

  ProductPage product = new ProductPage(driver);
  product.addFirstProduct();

 }

}
