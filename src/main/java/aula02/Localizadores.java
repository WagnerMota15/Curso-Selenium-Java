package aula02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Localizadores {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com.br/ref=nav_logo");
        driver.manage().window().maximize();

        //name
        driver.findElement(By.name("field-keywords")).sendKeys("Monitor");

        //id
        boolean statusDisplay = driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
        System.out.println(statusDisplay);

        //linktext && partialLinkText
        driver.findElement(By.linkText("Ofertas do Dia")).click();
        //driver.findElement(By.partialLinkText("Mais Vendidos")).click();

        //classname
        List<WebElement> headerLinks = driver.findElements(By.className("nav-left"));
        System.out.println("Total de número de links no cabecerario a esquerda e: " + headerLinks.size());

        //tagname
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total de links: " + links.size());
        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("Total de imagens: " + images.size());
    }
}
