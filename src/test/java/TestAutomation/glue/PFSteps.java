package TestAutomation.glue;

import TestAutomation.Pages.PFPage;
import TestAutomation.Pages.PFPage;
//import TestAutomation.Pages.loginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

public class PFSteps extends BaseStepClass {
	@Given("I am Navigating to properyfinder")
	public void Navigation_QA_page() throws InterruptedException {
		PFPage.launchurlqa();

	}

	@When("select buy")
	public void seelctbuy() throws InterruptedException {
		PFPage.navigation_menu();

	}

	@When("searching the filter")
	public void searching_filter() {
		PFPage.searching();

	}

	@Given("Navigate to properyfinder1")
	public void customer_view_tab_is_active() throws InterruptedException {
		PFPage.launchurlqe();

	}

	@When("search find")
	public void search() throws InterruptedException {
		PFPage.search();
	}

	@When("select first element")
	public void click_search_button() throws InterruptedException, IOException {
		PFPage.searchgridFullname();

	}

}
