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
        /*
         Если я правильно понял тему.
         Тут нужен шпион для Feline т.к. класс Cat зависит от Feline.
         Изпользовать полноценный Feline не можем т.к. тестируем только Cat.
         Если использовать мок для Feline, метод getFood() вернёт постой список т.к.
         в нем используется метод который не относится к классу Cat - predator.eatMeat().
         */
        Feline feline = Mockito.spy();
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
