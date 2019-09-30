package hello;

import org.junit.*;

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
    
    @Test
    public void testPrint() 
    {
        System.out.println(greet.sayHello());
    }
      
}