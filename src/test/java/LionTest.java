import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    private final List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
    public final int expectedCountKittens = 1;


    @Test(expected = Exception.class)
    public void exceptionTest() throws Exception {
        Feline feline = Mockito.mock();
        Lion lion = new Lion("Тест", feline);
    }

    @Test
    public void getFoodTest() throws Exception {
        Feline feline = Mockito.mock();
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        Lion lion = new Lion("Самец", feline);
        assertEquals(expectedList, lion.getFood());
    }

    @Test
    public void getKittensTest() throws Exception {
        Feline feline = Mockito.mock();
        Mockito.when(feline.getChildren()).thenReturn(1);

        Lion lion = new Lion("Самец", feline);
        assertEquals( expectedCountKittens, lion.getKittens());
    }
}
