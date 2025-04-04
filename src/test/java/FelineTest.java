import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    private final List<String> expectedFoodList = List.of("Животные", "Птицы", "Рыба");
    private final String expectedFamily = "Кошачьи";
    private final int expectedKittensCountWithOutVariables = 1;
    private final int expectedKittensCountWithVariables = 10;

    @Test
    public void getEatTest() throws Exception {
        Feline feline = new Feline();
        assertEquals( expectedFoodList, feline.eatMeat() );
    }

    @Test
    public void getFamilyTest(){
        Feline feline = new Feline();
        assertEquals( expectedFamily, feline.getFamily());
    }
    @Test
    public void getKittensWithOutVariablesTest(){
        Feline feline = new Feline();
        assertEquals( expectedKittensCountWithOutVariables, feline.getChildren());
    }
    @Test
    public void getKittensWithVariablesTest(){
        Feline feline = new Feline();
        assertEquals( expectedKittensCountWithVariables, feline.getChildren(10));
    }
}
