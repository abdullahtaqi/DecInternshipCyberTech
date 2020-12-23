package step_definitions;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.CyberTechHomepage;
import techBase.BaseClass;

public class socialMedia extends BaseClass {
	
	CyberTechHomepage cb;
	
	public socialMedia() {
		super();
		cb = new CyberTechHomepage(); 
		
		}
	
	@Given("user is on the CyberTech homepage")
	public void user_is_on_the_cyber_tech_homepage() {
		initialization();
	}

	@When("user scroll down the footer links")
	public void user_scroll_down_the_footer_links() {
	   System.out.println("User Should be able to see the footer Links");
	}

	@Then("user clicks on Facebook link button")
	public void user_clicks_on_facebook_link_button() {
	   System.out.println("Social Media Logo Displayed");
	}

	@Then("user able to navigate the Facebook")
	public void user_able_to_navigate_the_facebook(By FacebookLink) {
	cb.clickSocialMedia(FacebookLink);
	   
	}

	@Then("user clicks on Twitter link button")
	public void user_clicks_on_twitter_link_button(By TwitterLink) {
	   cb.clickSocialMedia1(TwitterLink);
	}

	@Then("user clicks on LinkedIn link button")
	public void user_clicks_on_linked_in_link_button(By LinkedIn) {
	    cb.clickSocialMedia2(LinkedIn);
	}

	@Then("user clicks on YouTube link button")
	public void user_clicks_on_you_tube_link_button(By YouTubeLink) {
	   cb.clickSocialMedia2(YouTubeLink);
	}

	
}