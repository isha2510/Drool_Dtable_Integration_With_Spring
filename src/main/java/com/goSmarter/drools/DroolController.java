package com.goSmarter.drools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by u558967 on 2/9/2018.
 */

@Controller
public class DroolController {
    @Autowired
    private PricingRuleDTExample pricingRule;

    @RequestMapping("/test")
    @ResponseBody
    public Policy test() {

        System.out.println("Initialising driver and policy");
        Driver d = new Driver();
        Policy p = new Policy();
        String result = "Result not found";
        try {

            result = "Drool Result = " + pricingRule.executeExample(d, p);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return p;
    }

    public PricingRuleDTExample getPricingRule() {
        return pricingRule;
    }

    public void setPricingRule(PricingRuleDTExample pricingRule) {
        this.pricingRule = pricingRule;
    }
}
