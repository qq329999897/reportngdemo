package com.reportngdemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.Reporter;

public class NewTest {
  @Test
  public void add01() {
	  System.setProperty("org.uncommons.reportng.escape-output", "false");
	  Reporter.log("<span style=\"color:#16A05D\"><H1>hello</H1>");
	  Assert.assertEquals(1, 1);
  }
  @Test
  public void add02() {
	  Assert.assertEquals(2, 1);
  }
}
