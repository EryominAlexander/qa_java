import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import com.example.Cat;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatGetSoundTest {
    private final String expectedSound = "Мяу";

    @Mock
    Cat cat;
    @Test
    public void getSoundTest(){
        Mockito.when(cat.getSound()).thenReturn("Мяу");
        assertEquals(expectedSound, cat.getSound());
    }
}
