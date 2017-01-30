package testcase;

import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
/*@RunWith(MyRunner.class)
*/
public class PriorityTCDemo {

	/**
	 * http://stackoverflow.com/questions/11762801/run-junit-suite-using-maven-command
	 * http://stackoverflow.com/questions/13911716/running-junit-test-suite-using-maven
	 * https://github.com/junit-team/junit4/wiki/Test-execution-order
	 * http://maven.apache.org/surefire/maven-surefire-plugin/test-mojo.html#runOrder
	 * http://memorynotfound.com/add-junit-listener-example/
	 * https://dzone.com/articles/junit-listener
	 * http://stackoverflow.com/questions/2846493/is-there-a-decent-html-junit-report-plugin-for-maven
	 * <plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-surefire-plugin</artifactId>
    <configuration>
        <runOrder>alphabetical</runOrder>
     </configuration>
      </plugin>
  
      http://stackoverflow.com/questions/2846493/is-there-a-decent-html-junit-report-plugin-for-maven
	 */

	@Test(timeout=5)
	public void test2() throws InterruptedException {
		System.out.println("test2");
		Thread.sleep(9000);
	}

	@Test
	public void test1() {
		System.out.println("test1");

	}


	@Test
	public void test3() {
		System.out.println("test3");

	}
	@Test
	public void test4() {
		System.out.println("test4");

	}

}
