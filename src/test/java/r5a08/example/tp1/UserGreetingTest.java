package r5a08.example.tp1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class UserGreetingTest {

    @Test
    public void should_return_name_in_parameter () {
        //Arrange
        String name = "Manoula";

        //Act
        String actual = UserGreeting.formatGreeting(name);
        String expected = "Bonjour Manoula";

        //Assert
        assertEquals("Bonjour Manoula", actual);

    }

    @Test
    public void when_parameter_is_null_should_return_exception () {
        //Arrange
        String name ="";

        //Act, Assert
        




    }
}
