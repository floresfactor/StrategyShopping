/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShoppingCartTest;


import app.PaypalStrategy;
import app.CreditCardStrategy;
import app.Item;
import app.ShoppingCart;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jf
 */

public class ShoppingCartTest {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item("1234",10);
		Item item2 = new Item("5678",40);
		
		cart.addItem(item1);
		cart.addItem(item2);
		
		//paypal
		cart.pay(new PaypalStrategy("floresfactor@gmail.com", "mypwd"));
		
		// credit card
		cart.pay(new CreditCardStrategy("Jose Flores", "1234567890123456", "786", "12/20"));
	}
}