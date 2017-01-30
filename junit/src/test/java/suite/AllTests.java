package suite;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import testcase.ExecuteWithRunListener;
import testcase.MyRunner;
import testcase.PriorityTCDemo;

@RunWith(Suite.class)
@SuiteClasses({ PriorityTCDemo.class})
public class AllTests {

}
