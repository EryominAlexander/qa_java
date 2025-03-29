import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import com.example.Lion;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionGetKittensTest {
    public final int expectedCountKittens = 1;

    @Mock
    Lion lion;

    @Test
    public void getKittensTest(){
        Mockito.when(lion.getKittens()).thenReturn(1);
        assertEquals( expectedCountKittens, lion.getKittens());
    }
}
