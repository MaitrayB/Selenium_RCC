package Regression_Tests;

import org.testng.annotations.Test;

import Admin_Survey_Page.Marketing_survey_page;
import coaching_center_base.FrameworkMethods;

public class Survey_Test {
	@Test(priority = 1)
	public void verifySurveyDetail() throws Exception {
		FrameworkMethods.logger = FrameworkMethods.extent.createTest("Verify survey detail");
		Marketing_survey_page surveyPage= new Marketing_survey_page();
		surveyPage.navigateToSurveys();
		surveyPage.verifyMarketingSurvey();
		surveyPage.verifyCountShouldNotZero();
	}

}
