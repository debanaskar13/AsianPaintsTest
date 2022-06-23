package org.paintstextures.com;

import org.browser.com.Browser;
import org.testng.Assert;
import org.testng.Reporter;
import org.testscripts.com.InteriorKidsWorldScripts;
import org.testscripts.com.InteriorStencilsScripts;
import org.testscripts.com.InteriorWallPaintsScripts;
import org.testscripts.com.InteriorWallTexturesScripts;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaintsAndTextures {
	private InteriorWallPaintsScripts ipaints;
	private InteriorWallTexturesScripts itextures;
	private InteriorKidsWorldScripts ikids;
	private InteriorStencilsScripts istencils;
	
	@Given("User opens the browser")
	public void user_opens_the_browser() throws Exception {
		Browser.setDriver();
		Browser.maximizeWindow();
		ipaints = new InteriorWallPaintsScripts();
		itextures = new InteriorWallTexturesScripts();
		ikids = new InteriorKidsWorldScripts();
		istencils = new InteriorStencilsScripts();
	}

	@When("User enters the url")
	public void user_enters_the_url() throws Exception {
		ipaints.openApplication();
	}

	@And("User moves cursor to Paints and Texture tab")
	public void user_moves_cursor_to_paints_and_texture_tab() throws Exception {
		ipaints.hoverOnPaintsTextures();
	}

//	******* For Wall Paints *********

	@And("User Click on the Wall Paints Link")
	public void user_click_on_the_wall_paints_link() throws Exception {
		ipaints.clickOnWallPaints();
	}
	
	@And("User select type and Click on that type")
	public void user_click_on_button() throws Exception {
		ipaints.selectTypeOfPaintsAndClick();
	}

	@Then("Verify All the Wall Paints products are shown or not")
	public void verify_all_the_wall_paints_products_are_shown_or_not() throws Exception {
		try {
			Assert.assertTrue(ipaints.verifyResult());
			Reporter.log("Pass");
		} catch (AssertionError e) {
			System.out.println(e);
			Reporter.log("Fail");
		}
	}

//	******* For Wall Textures *********
	
	@And("User Click on the Wall Textures Link")
	public void user_click_on_the_wall_textures_link() throws Exception {
	    itextures.clickOnWallTextures();
	}

	@And("User Click on filter by button")
	public void user_click_on_filter_by_button() throws Exception {
		itextures.clickOnFilterBtn();
	}

	@And("User select type and Click on that type textures")
	public void user_click_on_textures() throws Exception {
	    itextures.selectOption();
	}

	@Then("Verify All the Wall Textures products are shown or not")
	public void verify_all_the_wall_textures_products_are_shown_or_not() {
	    try {
			Assert.assertTrue(itextures.verifyResult());
			Reporter.log("Pass");
		} catch (AssertionError e) {
			 System.out.println(e);
			 Reporter.log("Fail");
		}
	}
	
////	******* For Kids World *********
	
	@And("User Click on the Kids World Link")
	public void user_click_on_the_kids_world_link() throws Exception {
	    ikids.clickOnKidsWorld();
	}

	@And("User Click on the kids category")
	public void user_click_on_the_kids_category() throws Exception {
	    ikids.selectCategory();
	}

	@And("Verify All the Kids World products are shown or not")
	public void verify_all_the_kids_world_products_are_shown_or_not() {
	    try {
			Assert.assertTrue(ikids.verifyResult());
			Reporter.log("Pass");
		} catch (AssertionError e) {
			 System.out.println(e);
			 Reporter.log("Fail");
		}
	}
	
////	******* For Stencils *********
	
	@When("User Clicks on the Stencils link")
	public void user_clicks_on_the_stencils_link() throws Exception {
	    istencils.clickOnStencilLink();
	}

	@When("User Select and Clicks on the stencils type")
	public void user_clicks_on_the_stencils() throws Exception {
	    istencils.selectStencilsTypeAndClick();
	}

	@When("User Clicks on Filter By button")
	public void user_clicks_on_filter_by_button() throws Exception {
	    istencils.clickOnFilterByBtn();
	}

	@When("User Select and Clicks on tones")
	public void user_clicks_on_tones() {
	    istencils.selectAndClickOnTones();
	}

	@When("User Clicks on the Apply button in stencils")
	public void user_clicks_on_the_apply_button_in_stencils() throws Exception {
	    istencils.clickOnApplyBtn();
	}

	@Then("Verify All the stencils products are showing or not")
	public void verify_all_the_stencils_products_are_showing_or_not() {
	    try {
			Assert.assertTrue(istencils.verifyResult());
			Reporter.log("Pass");
		} catch (AssertionError e) {
			 System.out.println(e);
			 Reporter.log("Fail");
		}
	}

	@And("Close the browser")
	public void close_the_browser() {
		Browser.closeBrowser();
	}
}
