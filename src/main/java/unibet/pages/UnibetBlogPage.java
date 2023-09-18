// src/main/java/unibet/pages/UnibetBlogPage.java
package unibet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UnibetBlogPage {
    private WebDriver driver;

    public UnibetBlogPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locator for the search input field
    By searchInputField = By.xpath("//form[@action='/blog/search/']//input[@placeholder='Search']"); 

    
    // Locator for Search Result text message
    By searchResultsTextMessage = By.cssSelector("span.result-num");

    
    // Locator for No Result Message
    By noResultsTextMessage = By.xpath("//h3[contains(text(),'Sorry, no results were found.')]");

    // Method to perform a search with a given query
    public void search(String query) {
        WebElement searchBoxElement = driver.findElement(searchInputField);
        searchBoxElement.sendKeys(query);
        searchBoxElement.sendKeys(Keys.ENTER);
    }

    // Method to retrieve the search results text
    public String getSearchResultsText() {
        return driver.findElement(searchResultsTextMessage).getText();
    }

    // Method to retrieve the no results message
    public String getNoResultsMessage() {
        return driver.findElement(noResultsTextMessage).getText();
    }
}



