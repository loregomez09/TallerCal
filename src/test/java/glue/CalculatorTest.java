package glue;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;
import java.util.Collection;



public class CalculatorTest {

    private int numero_01;
    private int numero_02;
    private int numero_03;
    private int numero_04;
    private int resultado;
    private  int resultado_div;
    private WebElement espacio_01;
    private WebElement espacio_02;
    private ChromeDriver driver;

    @Given("Ingreso a basic calculator multiplicacion ingresa {int} multiplicado por {int}")
    public void ingreso_a_basic_calculator_multiplicacion(int numero_01, int numero_02) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usuario\\Desktop\\Escritorio\\10mo semestre\\CALIDAD DE SOFTWARE\\TallerCal\\src\\test\\java\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        WebElement espacio_01 = driver.findElement(By.name("number1"));
        WebElement espacio_02 = driver.findElement(By.name("number2"));
        espacio_01.sendKeys(String.valueOf(numero_01));
        espacio_02.sendKeys(String.valueOf(numero_02));WebElement menuDesplegable = driver.findElement(By.xpath("//select[@id='selectOperationDropdown']")); // Reemplaza con el ID del menú
        Select select = new Select(menuDesplegable);
        select.selectByVisibleText("Multiply");
        WebElement calcular = driver.findElement(By.id("calculateButton"));
        calcular.click();

    }

    @When("seleccione tipo de operacion")
    public void ingreso_y_multiplico_por() {


    }
    @Then("me deberia dar {int}")
    public void me_deberia_dar(int resultadoEsperado) {

    }

    @Given("Ingreso este numero {int} dividido por {int}")
    public void ingreso_a_basic_calculator_division(int numero_03,int numero_04) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usuario\\Desktop\\Escritorio\\10mo semestre\\CALIDAD DE SOFTWARE\\TallerCal\\src\\test\\java\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        WebElement espacio_01 = driver.findElement(By.name("number1"));
        WebElement espacio_02 = driver.findElement(By.name("number2"));
        espacio_01.sendKeys(String.valueOf(numero_03));
        espacio_02.sendKeys(String.valueOf(numero_04));WebElement menuDesplegable = driver.findElement(By.xpath("//select[@id='selectOperationDropdown']")); // Reemplaza con el ID del menú
        Select select = new Select(menuDesplegable);
        select.selectByVisibleText("Divide");
        WebElement calcular = driver.findElement(By.id("calculateButton"));
        calcular.click();
        resultado = numero_03 /numero_04;
    }

    @When("seleccion de division")
    public void ingreso_y_y_divido_por(Integer numero_03, Integer numero_04) {

    }

    @Then("me deberia dar division {int}")
    public void me_deberia_dar_division(int resultadoEsperado) {
        Assert.assertEquals(resultadoEsperado, resultado);
    }
}

