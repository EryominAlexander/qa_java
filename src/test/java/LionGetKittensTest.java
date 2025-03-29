import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import com.example.Lion;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionGetKittensTest {
    public final int expectedCountKittens = 1;

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самец");
        Lion lionSpy = Mockito.spy(lion);
        assertEquals( expectedCountKittens, lionSpy.getKittens());
    }
}
