package pageObject.day1;

import core.BaseFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ChapterOnePage extends BaseFunc {

    public ChapterOnePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how= How.ID, using = "html5div")
    private WebElement textBox;

    @FindBy(how = How.ID, using = "multiplewindow")
    private WebElement windowLink;

    @FindBy (how = How.ID, using ="verifybutton")
    private WebElement verButton;

    @FindBy (how = How.CLASS_NAME, using = "mainheading")
    private WebElement beginnersGuide;

    public void setTextBox(String textToSend){
        textBox.clear();
        textBox.sendKeys(textToSend);
    }
    public void getTextOfWindowLink() {
        String text = windowLink.getText();
        System.out.println(text);
    }
    public void printAttributeVerifyButton() {
        String value = verButton.getAttribute("value");
        System.out.print(value);
    }
    public void printCssValueguide () {
        System.out.println(beginnersGuide.getCssValue("color"));
    }
}