package org.budgetcalculator.com;

import org.browser.com.Browser;
import org.pages.com.HomePage;
import org.screenshot.com.Screenshot;
import org.testng.Assert;
import org.testng.Reporter;
import org.testscripts.com.AdvancedBudgetCalculatorScripts;
import org.testscripts.com.BudgetCalculatorScripts;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class budgetCalculator {
	private BudgetCalculatorScripts calculator;
	private AdvancedBudgetCalculatorScripts adcalc;
	private boolean isExterior;
	private boolean isSelectPaints = false;
	private boolean isSelectTextures = false;
	private boolean isSelectWallpaper = false;

//	******************************************************Background***********************************************//
//	For Opening the Browser
	@Given("User open the browser")
	public void user_open_the_browser() throws Exception {
		Browser.setDriver();
		Browser.maximizeWindow();
		calculator = new BudgetCalculatorScripts();
		adcalc = new AdvancedBudgetCalculatorScripts();
	}

//	Opening the Application
	@When("User Enter the url")
	public void user_enter_the_url() {
		calculator.openApplication();
	}

//	Hovering on Paints And Textures Tab
	@And("User hover on Paints and Texture tab")
	public void user_hover_on_paints_and_texture_tab() {
		calculator.hoverOnPaintsAndTexturesLink();
	}

//	*****************************************************Simple Budget Calculator**************************************************//
//	Click  the Budget Calculator Link under Dropdown
	@And("User Clicks on the Paint Budget Calculator Link")
	public void user_clicks_on_the_paint_budget_calculator_link() throws Exception {
		calculator.clickOnPaintsBudgetCalculator();
	}

//	For Choosing the project type
	@And("User select type of project")
	public void user_select_type_of_project() throws Exception {
		String type = calculator.selectTypeOfProject();
		isExterior = (type == "Exterior") ? true : false;
	}

//	Selecting Space
	@And("User select space")
	public void user_select_space() {
		calculator.selectSpace();
	}

//	Selecting Size of the home
	@And("Size of home")
	public void size_of_home() {
		if (!isExterior)
			calculator.selectSizeOfHome();
	}

//	Entering Carpet Area Data
	@And("User enters Carpet area")
	public void user_enters_carpet_area() {
		calculator.enterCarpetArea();
	}

//	Clicking on the Calculate Now Button
	@Then("User Click on the Calculate Now button")
	public void user_click_on_the_calculate_now_button() {
		calculator.clickOnCalculateNowBtn();
	}

//	Verifying the Expected And Actual Result
	@And("Verify whether the recommended products are showing or not")
	public void verify_whether_the_recommended_products_are_showing_or_not() throws Exception {
		try {
			Assert.assertTrue(calculator.verifyResult());
			Screenshot.screenShot("calculator");
			Reporter.log("Pass");
		} catch (AssertionError e) {
			System.out.println("in verify the products are showing or not method");
			Reporter.log("Fail");
		}
	}

//	*****************************************************Advanced Budget Calculator***************************************************//
	@And("User Clicks on Advanced Calculator Link")
	public void user_clicks_on_advanced_calculator_link() throws InterruptedException {
		adcalc.clickOnAdvancedCalculatorLink();
	}

//	Selecting the Painting type
	@And("User Select Painting type")
	public void user_select_painting_type() {
		adcalc.selectPaintingType();
	}

//	Selecting the Space for Paints
	@And("User Select space Interior for Paints")
	public void user_select_space_for_paints() throws Exception {
		adcalc.selectSpace();

	}

	@And("User Select number of rooms {string}")
	public void user_select_number_of_rooms(String numOfRooms) {
		adcalc.selectNumberOfRooms();
	}

	@And("User enters Width {string} Height {string} Length {string} of the room")
	public void user_enters_width_height_length_of_the_room(String width, String height, String length) {
		adcalc.enterWidth(width);
		adcalc.enterLength(length);
		adcalc.enterHeight(height);
	}

	@And("User enters number of windows {string} and doors {string}")
	public void user_enters_number_of_windows_and_doors(String windows, String doors) throws Exception {
		adcalc.enterWindow(windows);
		adcalc.enterDoor(doors);
	}

	@And("User Select type of paint for WallA")
	public void user_select_type_of_paint_for_wall_a() throws Exception {
		String type = adcalc.selectPaintsForWallA();
		this.selectedPaintsType(type);

	}

	@And("User Select type of paint for WallB")
	public void user_select_type_of_paint_for_wall_b() throws Exception {
		String type = adcalc.selectPaintsForWallB();
		this.selectedPaintsType(type);

	}

	@And("User Select type of paint for WallC")
	public void user_select_type_of_paint_for_wall_c() throws Exception {
		String type = adcalc.selectPaintsForWallC();
		this.selectedPaintsType(type);
	}

	@And("User Select type of paint for WallD")
	public void user_select_type_of_paint_for_wall_d() throws Exception {
		String type = adcalc.selectPaintsForWallD();
		this.selectedPaintsType(type);

	}

	@And("User Select including ceiling or not {string}")
	public void user_select_including_ceiling_or_not(String includeCeiling) throws Exception {
		adcalc.clickOnIncludingCeiling(includeCeiling);
	}

	@And("User choose paints type and select paints")
	public void user_choose_paints_type_and_select_paints() throws Exception {
		adcalc.choosePaintsTypeAndSelectPaints(isSelectPaints);
	}

	@And("User choose textures type and select textures")
	public void user_choose_textures_type_and_select_textures() throws Exception {
		adcalc.chooseTexturesTypeAndSelectTextures(isSelectTextures);
	}

	@And("User choose wallpaper type and select wallpaper")
	public void user_choose_wallpaper_type_and_select_wallpaper() throws Exception {
		adcalc.chooseWallpaperTypeAndSelectWallpaper(isSelectWallpaper);
	}

	@Then("User Clicks on the Calculate now button")
	public void user_clicks_on_the_calculate_now_button() {
		adcalc.clickOnCalculateNowBtn();
	}

	@And("Verify whether user gets the paints within this budget")
	public void verify_whether_user_gets_the_paints_within_this_budget() {
		try {
			Assert.assertTrue(adcalc.verifyResult());
			Screenshot.screenShot("Advcalculator");
			Reporter.log("Pass");
		} catch (Exception e) {
			System.out.println("In verify the paints budget method");
			Reporter.log("Fail");
		}
	}

	public void selectedPaintsType(String type) {
		if (type.equalsIgnoreCase("paint"))
			isSelectPaints = true;
		else if (type.equalsIgnoreCase("texture"))
			isSelectTextures = true;
		else if (type.equalsIgnoreCase("wallpaper"))
			isSelectWallpaper = true;
	}

	@When("User Select Painting type {string}")
	public void user_select_painting_type(String type) {
		adcalc.selectPaintingType(type);
	}

	@When("User Select space Exterior for Paints")
	public void user_select_space_exterior_for_paints() {
		adcalc.selectExteriorSpace();
	}

	@When("User Enters carpet Area data {string}")
	public void user_enters_carpet_area_data(String area) {
		adcalc.enterCarpetArea(area);
	}

	@Then("User Click on the Calculate Now button for Exterior")
	public void user_click_on_the_calculate_now_button_for_exterior() throws Exception {
		adcalc.clickOnCalculateNowBtnForExterior();
	}

	@And("User Enters invalid carpet Area data {string}")
	public void user_enters_invalid_carpet_area_data(String carpetArea) {
		adcalc.enterCarpetArea(carpetArea);
	}

	@And("Verify whether user gets the exterior paints within this budget")
	public void verify_whether_user_gets_the_exterior_paints_within_this_budget() throws Exception {
		try {
			Assert.assertTrue(adcalc.verifyResult());
			Screenshot.screenShot("Advcalculator");
			Reporter.log("Pass");
		} catch (AssertionError e) {
			System.out.println("In verify for invalid carpet Area");
			Reporter.log("Fail");
		}
	}

	@And("Verify whether user gets the error message {string}")
	public void verify_whether_user_gets_the_error_message(String string) throws Exception {
		try {
			Assert.assertTrue(adcalc.verifyForInvalid(string));
			Screenshot.screenShot("Advcalculator");
			Reporter.log("Pass");
		} catch (AssertionError e) {
			System.out.println("In verify for invalid carpet Area");
			Reporter.log("Fail");
		}
	}
	
	@And("User enters Width {string}")
	public void user_click_on_width(String width) throws Exception {
		adcalc.enterWidth(width);
	}
	
	@Then("Verify whether user gets error message for invalid width")
	public void verify_whether_user_gets_error_message_for_invalid_width() throws Exception {
		try {
			Assert.assertTrue(adcalc.verifyInvalidWidthResult());
			Reporter.log("Pass");
			Screenshot.screenShot("InvalidWidth");
		} catch (AssertionError e) {
			 System.out.println("In Invalid Width");
			 Reporter.log("Fail");
		}
	}
	
	@And("User enters length {string}")
	public void user_click_on_length(String length) throws Exception {
		adcalc.enterLength(length);
	}
	
	@Then("Verify whether user gets error message for invalid length")
	public void verify_whether_user_gets_error_message_for_invalid_length() throws Exception {
		try {
			Assert.assertTrue(adcalc.verifyInvalidLengthResult());
			Reporter.log("Pass");
			Screenshot.screenShot("InvalidLength");
		} catch (AssertionError e) {
			 System.out.println("In Invalid Length");
			 Reporter.log("Fail");
		}
	}
	
	@And("User enters height {string}")
	public void user_click_on_height(String height) throws Exception {
		adcalc.enterHeight(height);
	}
	
	@Then("Verify whether user gets error message for invalid height")
	public void verify_whether_user_gets_error_message_for_invalid_height() throws Exception {
		try {
			Assert.assertTrue(adcalc.verifyInvalidHeightResult());
			Reporter.log("Pass");
			Screenshot.screenShot("InvalidHeight");
		} catch (AssertionError e) {
			 System.out.println("In Invalid Height");
			 Reporter.log("Fail");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

//	For Closing the Browser
	@And("Closed the browser")
	public void closed_the_browser() {
		Browser.closeBrowser();
	}
}
