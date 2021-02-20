package com.meetSky.step_definitions;

import com.meetSky.pages.ProfilePage;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class ProfileStepDefs {

    @Then("user should see profile info")
    public void user_should_see_profile_info() {
        ProfilePage profile = new ProfilePage();
        String userID = profile.userID.getAttribute("title");
        String expectedUserID = "Employee";
        Assert.assertTrue(userID.contains(expectedUserID));
    }

}
