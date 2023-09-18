// src/test/java/unibet/test/SearchTest.java
// This is the test class for Search functionality.
// It includes test cases to verify search results with various inputs.

package unibet.test;

import org.testng.annotations.Test;
import org.testng.Assert;

public class SearchTest extends BaseTest {

    @Test
    public void testHappyFlowWithMatchingString() {
        // Perform a search for the query "Football"
        unibetBlogPage.search("Football");
        
        // Get the search results text and assert that it matches the expected format (e.g., "X results found")
        String results = unibetBlogPage.getSearchResultsText();
        Assert.assertTrue(results.matches("\\d+ results found"));
    }

    @Test
    public void testUnhappyFlowWithNoResultsFound() {
        // Perform a search with an unlikely query to simulate no results found
        unibetBlogPage.search("ajahdkjahdjhaksdhjka");
        
        // Get the actual error message and assert that it matches the expected message
        String actualErrorMessage = unibetBlogPage.getNoResultsMessage();
        Assert.assertEquals(actualErrorMessage, "Sorry, no results were found.");
    }

    @Test
    public void testSearchWithSpecialCharacters() {
        // Perform a search with special characters as the query
        unibetBlogPage.search("!@#$%^");
        
        // Get the actual error message and assert that it matches the expected message
        String actualErrorMessage = unibetBlogPage.getNoResultsMessage();
        Assert.assertEquals(actualErrorMessage, "Sorry, no results were found.");
    }
}




