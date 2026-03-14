
package tests;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.LoginPage;
import pages.ProductPage;
import pages.CartPage;
import pages.CheckoutPage;

public class CheckoutTest extends BaseTest{

 @Test
 public void completeCheckout(){

  LoginPage login = new LoginPage(driver);
  login.login("standard_user","secret_sauce");

  ProductPage product = new ProductPage(driver);
  product.addFirstProduct();
  product.openCart();

  CartPage cart = new CartPage(driver);
  cart.clickCheckout();

  CheckoutPage checkout = new CheckoutPage(driver);
  checkout.enterDetails();
  checkout.finishOrder();

 }

}
