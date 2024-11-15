import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class MainTest {
    @Test
    public void testKaprekarOperation1() {
        // Prueba con el número 3524 (debe devolver 3087)
        Assertions.assertEquals(3087, kaprekarOp(3524));
    }


}
