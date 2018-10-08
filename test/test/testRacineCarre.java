/**
 * 
 */
package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import programme.racineCarre;

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
	public void testParamsA_inf_B(){
		try{
			racineCarre rc = new racineCarre(11,8);
		}catch(Exception e){
			e.getMessage();
		}		
	}

	@Test
	public void tailleTableauPositif(){
		int A = 1;
		int B = 5;
		//+2 car a et b compris dans le tableau
		racineCarre rc = new racineCarre(A, B);
		rc.racineCarre();
		int tailleIdeal = (B-A) + 1;
		assertTrue("Le tableau ne comprend pas [A..B] resultat", tailleIdeal == rc.tab.length);
	}

	@Test
	public void tailleTableauNegatif(){
		int A = -5;
		int B = -1;
		//+2 car a et b compris dans le tableau
		racineCarre rc = new racineCarre(A, B);
		rc.racineCarre();
		int tailleIdeal = (Math.abs(B) - Math.abs(A)) + 1;
		
		assertTrue("Le tableau ne comprend pas [A..B] resultat", tailleIdeal == rc.tab.length);
	}

	@Test
	public void tailleTableauWithZero(){
		int A = -5;
		int B = 5;
		//+2 car a et b compris dans le tableau
		racineCarre rc = new racineCarre(A, B);
		rc.racineCarre();
		int tailleIdeal = Math.abs(B-A) + 1;
		assertTrue("Le tableau ne comprend pas [A..B] resultat", tailleIdeal == rc.tab.length);
	}
	
	

}

	