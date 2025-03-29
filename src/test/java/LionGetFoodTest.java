import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import com.example.Lion;

import java.util.List;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class LionGetFoodTest {
    private final List<String> expectedList = List.of("Животные", "Птицы", "Рыба");


    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самец");
        Lion lionSpy = Mockito.spy(lion);
        assertTrue(expectedList.containsAll(lionSpy.getFood()) && lionSpy.getFood().containsAll(expectedList));
    }
}
