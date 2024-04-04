package test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TESTNG {

		@Test(invocationCount = 5)
		public void test()
		{
			Reporter.log("signup");
		}

	}

