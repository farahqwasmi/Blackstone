package helpers;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class PageHelpers {

    protected PageHelpers() {
    }


    protected static WebElement element(By by) {
        return WebDriverHelper.getWebDriver().findElement(by);
    }


    protected static void sendKeys(By by, String txt) {
        element(by).sendKeys(txt);
    }

    protected static void click(By by) {
        element(by).click();
    }

    public static void explicitlyWaitForWebElement(String waitStrategy, By webElement) {
        WebElement element = null;
        waitStrategy = waitStrategy.toLowerCase();
        waitStrategy = waitStrategy.toUpperCase();
        switch (waitStrategy) {
            case "CLICKABLE":
                element = new WebDriverWait(WebDriverHelper.getWebDriver(), Duration.ofSeconds(10))
                        .until(ExpectedConditions.elementToBeClickable(webElement));
                break;
            case "PRESENCE":
                element = new WebDriverWait(WebDriverHelper.getWebDriver(), Duration.ofSeconds(10))
                        .until(ExpectedConditions.presenceOfElementLocated((By) webElement));
                break;
            case "VISIBLE":
                element = new WebDriverWait(WebDriverHelper.getWebDriver(), Duration.ofSeconds(10))
                        .until(ExpectedConditions.visibilityOf(element(webElement)));
                break;
        }
    }


    public static  void printPageTitle() {

        System.out.println( "Page title  :  "+WebDriverHelper.getWebDriver().getTitle());

    }



    public static WebElement FindElementByText(String text) {
        WebElement m = WebDriverHelper.getWebDriver().findElement(By.xpath("//*[contains(text(),'" + text + "')]"));
        return m;
    }




}


