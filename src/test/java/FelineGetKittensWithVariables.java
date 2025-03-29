import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineGetKittensWithVariables {
    private final int expectedCount = 10;
    @Spy
    Feline feline;
    @Test
    public void getKittensWithVariablesTest(){
        assertEquals( expectedCount, feline.getKittens(10));
    }
}
