import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    private final List<String> expectedFoodList = List.of("Животные", "Птицы", "Рыба");
    private final String expectedSound = "Мяу";

    @Mock
    Cat catMock;
    @Mock
    Feline feline;

    @Test
    public void getFoodTest() throws Exception {
        Mockito.when(catMock.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(expectedFoodList, catMock.getFood());
    }

    @Test
    public void getSoundTest() {
        Cat cat = new Cat(feline);
        assertTrue(expectedSound.equals(cat.getSound()));
    }


}
