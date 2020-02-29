package blake.junit;
/*******************************************************************
 *  RunTests Class
 *  Description: This class runs the AssertTests class and all
 *  tests contained in it, and then displays all of the failure
 *  messages if there are any, with a general statement at
 *  the end before terminating the program.
 *  https://www.tutorialspoint.com/junit/junit_using_assertion.htm
 *  http://sqa.fyicenter.com/FAQ/JUnit/Why_Does_JUnit_Only_Report_the_First_Failed_Asse.html
 *******************************************************************/

// Imported Libraries
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunTests {
    public static void main(String[] args) {
        // Run the tests
        Result result = JUnitCore.runClasses(AssertTests.class);
        // Loop and print through the failures
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        // Display overall tests results
        System.out.println("\nWere all the tests successful? " + result.wasSuccessful());
    }
}