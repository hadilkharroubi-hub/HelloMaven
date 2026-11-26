package tn.enis.calcul;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculMetierTest {
	@Test
	public void testAddition() {
		CalculMetier metier = new CalculMetier();
		assertTrue(metier.addition(9,10)==19,"la somme est fausse");
	}
	@Test
	public void testProduit(){
		CalculMetier metier = new CalculMetier();
		assertTrue(metier.mutiplication(9,10)==90,"le produit est faux");
	}
		
}
