import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import com.example.Lion;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionHaveManeTest {
 private final String sex;
 private final boolean expectedAnswer;

 public LionHaveManeTest( String sex, boolean expectedAnswer ){
     this.sex = sex;
     this.expectedAnswer = expectedAnswer;
 }

 @Parameterized.Parameters
 public static Object[][] getData(){
     return new Object[][] {
             { "Самец", true },
             { "Самка", false }
     };
 }
 @Before
 public void init(){
     MockitoAnnotations.initMocks(this);
 }

    @Test
    public void haveManeTest() throws Exception {
        Feline feline = Mockito.spy();
        Lion lion = new Lion(sex, feline);
        assertEquals(expectedAnswer, lion.doesHaveMane());

    }
}
