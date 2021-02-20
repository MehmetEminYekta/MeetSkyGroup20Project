package com.meetSky.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage{

    @FindBy(xpath = "//div[@aria-label='Settings']")
    public WebElement userAvatar;

    @FindBy(xpath = "//span[contains(@class,'user-status-menu-item__header')]")
    public WebElement userID;

}
