package com.tecuniversity.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.tecuniversity.test.endpoint.LoginEndpointTest;


@RunWith(Suite.class)
@SuiteClasses({ LoginEndpointTest.class })
public class AllTests {

}
