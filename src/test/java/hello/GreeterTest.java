package hello;

import org.junit.*;
import static org.junit.Assert.*;

public class GreeterTest {
    
    private Greeter greet;
    
    @Before
    public void initTest() {
        greet = new Greeter();
    }
    
    @After
    public void afterTest() {
        greet = null;
    }
      
}