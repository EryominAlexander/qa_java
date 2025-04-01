import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    private final List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
    public final int expectedCountKittens = 1;

    @Spy
    Feline feline;

    @Test(expected = Exception.class)
    public void exceptionTest() throws Exception {
        Lion lion = new Lion("Тест", feline);
    }

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertTrue(expectedList.containsAll(lion.getFood()) && lion.getFood().containsAll(expectedList));
    }

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertEquals( expectedCountKittens, lion.getKittens());
    }
}
