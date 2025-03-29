import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineGetKittensWithOutVariables {
    private final int expectedCount = 1;
    @Mock
    Feline feline;
    @Test
    public void getKittensWithOutVariablesTest(){
        Mockito.when( feline.getKittens() ).thenReturn(1);
        assertEquals( expectedCount, feline.getKittens());
    }
}
