package blake.junit;
/*******************************************************************
 *  AssertTests Class
 *  Description:  There are 9 JUnit Assert tests that are
 *  contained in this class.  I referenced the following
 *  two URLs during the completion of this assignment.
 *  https://www.tutorialspoint.com/junit/junit_using_assertion.htm
 *  http://sqa.fyicenter.com/FAQ/JUnit/Why_Does_JUnit_Only_Report_the_First_Failed_Asse.html
 *******************************************************************/

// Imported Libraries
import org.junit.*;
import java.util.Arrays;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.junit.Assert.*;

public class AssertTests {

    String str1 = new String ("abc");
    //String str2 = new String ("abc");
    //String str3 = null;
    String str4 = "abc";
    //String str5 = "abc";

    String str2 = new String ("abcd");
    String str3 = "Not null";
    String str5 = "abcd";

    //int val1 = 5;
    int val2 = 6;

    int val1 = 7;

    //String[] expectedArray = {"one", "two", "three"};
    String[] resultArray =  {"one", "two", "three"};

    String[] expectedArray = {"one", "four", "three"};

    //String[] parentArray = {"xXx", "yYy", "zZz"};
    String[] childArray = {"yYy", "zZz"};

    String[] parentArray = {"xXx", "aAa", "zZz"};


    @Test
    public void testCondition1() {
        // Check that two objects are equal
        assertEquals("Objects aren't equal. ", str1, str2);
    }

    @Test
    public void testCondition2() {
        // Check that a condition is true
        assertTrue ("Condition is false. ", val1 < val2);
    }

    @Test
    public void testCondition3() {
        // Check that a condition is false
        assertFalse("Condition is true. ", val1 > val2);
    }

    @Test
    public void testCondition4() {
        // Check that an object isn't null
        assertNotNull("Object is null. ", str1);
    }

    @Test
    public void testCondition5() {
        // Check that an object is null
        assertNull("Object isn't null. ", str3);
    }

    @Test
    public void testCondition6() {
        // Check if two object references point to the same object
        assertSame("Objects reference different objects. ", str4,str5);
    }

    @Test
    public void testCondition7() {
        // Check if two object references not point to the same object
        assertNotSame("Objects reference same object. ", str1,str3);
    }

    @Test
    public void testCondition8() {
        // Check whether two arrays are equal to each other.
        assertArrayEquals("Arrays are not equal. ", expectedArray, resultArray);
    }

    @Test
    public void testCondition9() {
        // Check something specific, in this case check if the parent
        // array has the specific items in the child array
        assertThat("Parent array does not contain child array members. ", Arrays.asList(parentArray), hasItems(childArray));
    }

}
