package be.umons.ac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Jalal-Eddine Afrigh
 */
public class MaClasseTest {
    
   @Test 
   public void test1() {
       Assertions.assertEquals(18, MaClasse.sommeTab(new int []{9,9}));
   }
   @Test 
   public void test2() {
	   Assertions.assertEquals(17, MaClasse.sommeTab(new int []{8,9}));
   }
}
