import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class StringTest {
    @Test
    public void stringDrink() {
        StringDrink drink = new StringDrink("ABCD");
        Assertions.assertEquals("ABCD", drink.getText());
        drink.setText("DCBA");
        Assertions.assertEquals("DCBA", drink.getText());
    }
}
