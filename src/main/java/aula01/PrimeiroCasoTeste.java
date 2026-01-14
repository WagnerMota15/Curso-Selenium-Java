package aula01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Abrir browser -> abrir URL -> validar se o titula será "Your store" -> fechar browser
public class PrimeiroCasoTeste {
    public static void main(String[] args) {
        // Abrir browser (chrome)
        //ChromeDriver driver = new ChromeDriver();
        WebDriver driver = new ChromeDriver();

        // Abrir URL
        driver.get("https://www.example.com");
        // validar título:
        String act_title = driver.getTitle();

        if(act_title.equals("Example Domain")){
            System.out.println("Teste passou!");
        }
        else
            System.out.println("Teste falhou");
        // fechar browser

    }
}
