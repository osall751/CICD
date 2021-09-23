package TestTestCI;
import TestCI.Person;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class PersonTest {
    private Person runner;
    @Before
    public void init() {
        runner = new Person("diattara",30);
    }
    @Test
    public void TestGetAge(){
        assertEquals(runner.getAge(), 30);
    }
    @Test
    public void TestGetName(){
        assertEquals(runner.getName(), "diattara");
    }
}
