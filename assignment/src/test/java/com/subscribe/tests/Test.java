package com.subscribe.tests;

import com.subscribe.base.BaseTest;
import com.subscribe.pages.HomePage;

public class Test extends BaseTest {

	HomePage home;

	@org.testng.annotations.Test
	public void testBahrainPackage() {

		home = new HomePage();
		test=extent.createTest("Bahrain Subscription Package Test");
		home.validatePackage("Bahrain");
		

	}

	@org.testng.annotations.Test
	public void testKSAPackage() {
		test=extent.createTest("KSA Subscription Package Test");
		home.validatePackage("KSA");
	}

	@org.testng.annotations.Test
	public void testKuwaitPackage() {
		test=extent.createTest("Kuwait Subscription Package Test");
		home.validatePackage("Kuwait");
	}

}
