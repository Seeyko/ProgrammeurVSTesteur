/**
 * 
 */
package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author andrieut
 *
 */

public class testRacineCarre {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	public boolean a_inf_b(int a, int b){
		if(a < b){
			return true;
		}else return false;
	}
	
	public boolean tailleTableau(int t[], int a, int b){
		int taille = b-a;
		if(t.length > taille){
			return false;
		}else return true;
	}
	
	

}
