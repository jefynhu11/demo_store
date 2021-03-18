package com.demo.store.suites;

import com.demo.store.testcases.DemoStoreTestCase;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({DemoStoreTestCase.class,})
//@SelectPackages("testcases")
public class DemoStoreSuite {
}
