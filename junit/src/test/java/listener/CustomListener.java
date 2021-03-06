package listener;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Augmenter;

public class CustomListener extends RunListener {
	
	private WebDriver driver;
	 /**
     * Called before any tests have been run.
     *
     * @param description describes the tests to be run
     */
    public void testRunStarted(Description description) throws Exception {
    	System.out.println("Number of testcases to execute : " + description.testCount());
    }

    /**
     * Called when all tests have finished
     *
     * @param result the summary of the test run, including all the tests that failed
     */
    public void testRunFinished(Result result) throws Exception {
    	System.out.println("Number of testcases executed : " + result.getRunCount());
    }

    /**
     * Called when an atomic test is about to be started.
     *
     * @param description the description of the test that is about to be run
     * (generally a class and method name)
     */
    public void testStarted(Description description) throws Exception {
    	System.out.println("Starting execution of test case : "+ description.getMethodName());
    }

    /**
     * Called when an atomic test has finished, whether the test succeeds or fails.
     *
     * @param description the description of the test that just ran
     */
    public void testFinished(Description description) throws Exception {
    	System.out.println("Finished execution of test case : "+ description.getMethodName());
    }

    /**
     * Called when an atomic test fails.
     *
     * @param failure describes the test that failed and the exception that was thrown
     */
    public void testFailure(Failure failure) throws Exception {
    	System.out.println("Execution of test case failed : "+ failure.getMessage());
    	/*try {
            File scrFile;
            WebDriver augmentedDriver;
            if (driver instanceof ChromeDriver) {
                augmentedDriver = new Augmenter().augment(driver);
                scrFile = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
            } else {
                scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            }
            //fileName = System.getProperty("user.dir") + "/test-output/" + tr.getInstanceName() + tr.getName() + ".png";
            File destFile = new File("D:\\junit\\screenshot"+".png");
           // File destFile = File.createTempFile("screenshot", ".png");
            FileUtils.copyFile(scrFile, destFile);
        } catch (Exception e) {
            Assert.fail("Exception while capturing screen shot");
        }
*/    }

    /**
     * Called when an atomic test flags that it assumes a condition that is
     * false
     *
     * @param failure describes the test that failed and the
     * {@link AssumptionViolatedException} that was thrown
     */
    public void testAssumptionFailure(Failure failure) {
    }

    /**
     * Called when a test will not be run, generally because a test method is annotated
     * with {@link org.junit.Ignore}.
     *
     * @param description describes the test that will not be run
     */
    public void testIgnored(Description description) throws Exception {
    	System.out.println("Execution of test case ignored : "+ description.getMethodName());
    }
	

}
