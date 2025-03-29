import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineGetFamilyTest {
    private final String expectedFamily = "Кошачьи";
    @Spy
    Feline feline;
    @Test
    public void getFamilyTest(){
        assertEquals( expectedFamily, feline.getFamily());
    }
}
