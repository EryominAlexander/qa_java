import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionExceptionTest {
    @Test(expected = Exception.class)
    public void exceptionTest() throws Exception {
        Lion lion = new Lion("Тест");
    }
}
