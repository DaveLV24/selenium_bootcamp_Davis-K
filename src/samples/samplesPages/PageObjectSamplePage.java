package samplesPages;

import samplesPages.core.BaseFuncSample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//Class of how Page Object looks like, one of the ways how to do it.
public class PageObjectSamplePage {

    private BaseFuncSample baseFuncSample;

    //constructor, it is used for initializing variables of the class.
    public PageObjectSamplePage(BaseFuncSample baseFuncSample) {
        this.baseFuncSample = new BaseFuncSample();
    }

    // Locator to WebElement and this variable is constant, constants always initialized with capital letters
    // private - it will be used only in this class, final - it is final variable.
    private final By LOVE = By.id("love");
    private final By MORNING_SUNSHINE = By.name("sunshine");
    private final By LISTS = By.name("lists");


    //methods
    public void clickLove(){
        WebElement loveInAir =  baseFuncSample.getElement(LOVE);
        loveInAir.click();
    }


    public void getTextOfSunshine(){
         baseFuncSample.getElement(MORNING_SUNSHINE).getText();
    }

    //in order to get list of Elements using PageObject
    public void clickLove(){
        List<WebElement> elementsOnPage = getElements(LISTS);
        //work with list
    }

//mm
}
