
package tests;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.LoginPage;
import pages.ProductPage;
import pages.CartPage;

public class CartTest extends BaseTest{

 @Test
 public void openCart(){

  LoginPage login = new LoginPage(driver);
  login.login("standard_user","secret_sauce");

  ProductPage product = new ProductPage(driver);
  product.openCart();

  CartPage cart = new CartPage(driver);
  cart.clickCheckout();

 }

}
