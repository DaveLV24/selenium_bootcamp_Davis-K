package classTests.day1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementTest {

    private WebDriver driver;
    private String url = "https://kristinek.github.io/site/examples/actions";


    @Before
    public void setDriver() {
        String userdirLib =  System.getProperty("user.dir") + "\\lib\\";
        System.setProperty("webdriver.chrome.driver", userdirLib + "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
  // test need to be anotation, also unit can be, but on import all After,before,test should be the same
    @Test
    public void findBy(){
        driver.get(url);

        WebElement inputText = driver.findElement(By.id("text"));
        inputText.clear();
        inputText.sendKeys("Hey, i sent text here");

        WebElement resultButton = driver.findElement(By.id("result_button_text"));
        resultButton.click();

        WebElement checkBox1 = driver.findElement(By.cssSelector("[id='vfb-6-0'"));
        checkBox1.click();
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

}
