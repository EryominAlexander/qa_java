import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    private final List<String> expectedFoodList = List.of("Животные", "Птицы", "Рыба");
    private final String expectedFamily = "Кошачьи";
    private final int expectedKittensCountWithOutVariables = 1;
    private final int expectedKittensCountWithVariables = 10;

    @Spy
    Feline feline;
    @Test
    public void getEatTest() throws Exception {
        assertEquals( expectedFoodList, feline.eatMeat() );
    }

    @Test
    public void getFamilyTest(){
        assertEquals( expectedFamily, feline.getFamily());
    }
    @Test
    public void getKittensWithOutVariablesTest(){
        Mockito.when( feline.getChildren() ).thenReturn(1);
        assertEquals( expectedKittensCountWithOutVariables, feline.getChildren());
    }
    @Test
    public void getKittensWithVariablesTest(){
        assertEquals( expectedKittensCountWithVariables, feline.getChildren(10));
    }
}
