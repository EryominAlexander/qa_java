import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    private final List<String> expectedFoodList = List.of("Животные", "Птицы", "Рыба");
    private final String expectedSound = "Мяу";

    @Test
    public void getFoodTest() throws Exception {

        Feline feline = Mockito.mock();
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        Cat cat = new Cat(feline);
        assertEquals(expectedFoodList, cat.getFood());
    }

    @Test
    public void getSoundTest() {
        Feline feline = Mockito.mock();
        Cat cat = new Cat(feline);
        assertTrue(expectedSound.equals(cat.getSound()));
    }


}
