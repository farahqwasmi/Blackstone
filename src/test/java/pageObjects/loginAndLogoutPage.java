package pageObjects;

import org.openqa.selenium.By;
import helpers.PageHelpers;

public class loginAndLogoutPage extends PageHelpers {
    private final static By emailTxtField = By.xpath("//input[contains(@placeholder , 'Enter Email')]");
    private final static By passwordTxtField = By.xpath("//input[contains(@placeholder , 'Enter Password')]");
    private final static By loginButton = By.cssSelector("login  button");
    private final static By userList = By.xpath("//div[@class='user']");
    private final static By logoutButton = By.cssSelector("div.user  li:nth-child(3)");



    public static void assignCreds() {
        explicitlyWaitForWebElement("Presence", emailTxtField);
        sendKeys(emailTxtField, "store@admin.com");
        sendKeys(passwordTxtField, "P@ssw0rd");


    }


    public static void login() {
        click(loginButton);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        explicitlyWaitForWebElement("Presence", userList);
        element(userList).isDisplayed();

    }


    public static void logout() {
        explicitlyWaitForWebElement("Presence", userList);
        click(userList);
        explicitlyWaitForWebElement("Presence", logoutButton);
        click(logoutButton);
        explicitlyWaitForWebElement("Presence", emailTxtField);

        element(emailTxtField).isDisplayed();

    }

}
