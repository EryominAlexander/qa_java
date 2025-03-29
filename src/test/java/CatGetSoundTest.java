import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import com.example.Cat;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class CatGetSoundTest {
    private final String expectedSound = "Мяу";
    @Mock
    Feline feline;
    @Test
    public void getSoundTest(){
        Cat cat = new Cat(feline);
        assertTrue(expectedSound.equals(cat.getSound()));
    }
}
