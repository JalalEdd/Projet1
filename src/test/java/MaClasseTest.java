
import static org.junit.Assert.*;
import be.umons.ac.MaClasse;
import org.junit.Test;

/**
 *
 * @author Jalal-Eddine Afrigh
 */
public class MaClasseTest {
    
   @Test 
   public void test1() {
       assertEquals(18, MaClasse.sommeTab(new int []{9,9}));
   }
   @Test 
   public void test2() {
       assertEquals(17, MaClasse.sommeTab(new int []{8,9}));
   }
}
