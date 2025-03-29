import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import com.example.Lion;

import java.util.List;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class LionGetFoodTest {
    private final List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
    @Mock
    Lion lion;
    @Test
    public void getFoodTest() throws Exception {
        Mockito.when(lion.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        assertTrue(expectedList.containsAll(lion.getFood()) && lion.getFood().containsAll(expectedList));
    }
}
