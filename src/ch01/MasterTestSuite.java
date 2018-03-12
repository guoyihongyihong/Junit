package ch01;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(value=Suite.class)
@SuiteClasses(value={ch01.TestCaseA.class,ch01.TestCaseB.class})
public class MasterTestSuite {
	
	

}
