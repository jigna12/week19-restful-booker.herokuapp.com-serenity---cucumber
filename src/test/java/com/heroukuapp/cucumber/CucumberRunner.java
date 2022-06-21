package com.heroukuapp.cucumber;

import com.heroukuapp.testbase.BookingTestBase;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Created by krishna
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/java/resources/feature/",
tags = "@Smoke")//feature contactpath
public class CucumberRunner extends BookingTestBase {


}
