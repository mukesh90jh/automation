package testcase;

import listener.CustomListener;

import org.junit.Test;
import org.junit.runner.JUnitCore;

public class ExecuteWithRunListener {

	/**
	 * @param args
	 */
	@Test
	public void runTest(){
		JUnitCore runner = new JUnitCore();
		//Adding listener here
		runner.addListener(new CustomListener());
		runner.run(PriorityTCDemo.class);

	}

}
