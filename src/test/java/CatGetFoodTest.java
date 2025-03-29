import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import com.example.Cat;
import java.util.List;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class CatGetFoodTest {
    private final List<String> expectedFoodList = List.of("Животные", "Птицы", "Рыба");
    @Mock
    Cat cat;
    @Test
    public void getFoodTest() throws Exception {
        Mockito.when(cat.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertTrue(expectedFoodList.containsAll(cat.getFood()) && cat.getFood().containsAll(expectedFoodList));
    }

}
