package aula03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocalizadoresCSS {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        // Tag id: tag#id
        //driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts"); com a tag
        driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts"); // sem a tag

        // Tag class: tag.classname
        //driver.findElement(By.cssSelector("input.search-box-test")).sendKeys("Shorts");
        driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Shorts");

        // Tag attribute: Tag [attribute="value"]
        //driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("shoes");
        driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("shoes");

        // Tag class attribute: tag.classname[attribute="value"]
        //driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("hat");
        driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("hat");
    }
}
