import org.junit.Before;
import org.junit.Test;
import sample.Student;

import static org.junit.Assert.assertEquals;


public class Tests {
    Student testStudent1;
    Student testStudent2;

    @Before
    public void setUp(){
        testStudent1 = new Student("Tony","Smith", 12, "chemistry", "Business Education", "Physical Education");
        testStudent2 = new Student("Morty","Sanchez", 10, "Biology", "Sociology", "Home Economics");

    }
    @Test
    public void testStudent1() {

        }
    }
