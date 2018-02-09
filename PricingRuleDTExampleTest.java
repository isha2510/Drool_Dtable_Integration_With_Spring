package com.goSmarter.drools;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( { "classpath:price-rule-config.xml" })
public class PricingRuleDTExampleTest {

	@Autowired
	PricingRuleDTExample ruleRunner;

	@Test
	public void testExecuteExample() throws Exception {
        Driver driver = new Driver();
        Policy policy = new Policy();

		assertTrue( ruleRunner.executeExample(driver, policy) == 120);
	}
}
