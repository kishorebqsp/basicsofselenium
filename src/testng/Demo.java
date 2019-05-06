package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
@Test(priority=1,invocationCount=4)
public void test1()
{
	Reporter.log("test1 pass",true);
}

@Test(enabled=false)
public void test2()
{
	Reporter.log("test2 pass",true);
}
@Test(priority=-1)
public void test3()
{
	Reporter.log("test3 pass",true);
}
	
}
