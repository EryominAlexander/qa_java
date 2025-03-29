import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class FelineEatMeatTest {
    private final List<String> expectedFoodList = List.of("Животные", "Птицы", "Рыба");
    @Mock
    Feline feline;
    @Test
    public void getEatTest() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertTrue( expectedFoodList.containsAll(feline.eatMeat()) &&
                feline.eatMeat().containsAll(expectedFoodList));
    }
}
