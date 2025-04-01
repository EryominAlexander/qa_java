import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    private final List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
    public final int expectedCountKittens = 1;

    @Test(expected = Exception.class)
    public void exceptionTest() throws Exception {
        Lion lion = new Lion("Тест");
    }

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самец");
        Lion lionSpy = Mockito.spy(lion);
        assertTrue(expectedList.containsAll(lionSpy.getFood()) && lionSpy.getFood().containsAll(expectedList));
    }

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самец");
        Lion lionSpy = Mockito.spy(lion);
        assertEquals( expectedCountKittens, lionSpy.getKittens());
    }
}
