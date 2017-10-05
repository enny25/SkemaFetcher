package helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium {
    public static void main(String[] args) {
        SkemaMapper skemamapper = new SkemaMapper();
        
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\SkemaBackend\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(chromeOptions);
        WebDriverWait waitTwoSec = new WebDriverWait(driver, 2);
        String username = "";
        String pwd = "";
        
        driver.get("https://dk.timeedit.net/web/cphbusiness/db1/student");
        
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(pwd);
        driver.findElement(By.id("login")).click();
        driver.findElement(By.cssSelector(".leftlistcolumn a")).click();
        driver.findElement(By.id("ffsearchname")).sendKeys("al217");
        driver.findElement(By.className("ffsearchbutton")).click();
        waitTwoSec.until(ExpectedConditions.visibilityOfElementLocated(By.id("info0")));
        driver.findElement(By.id("info0")).click();
        driver.findElement(By.id("objectbasketgo")).click();
        String url = driver.getCurrentUrl();
        driver.get(url.replace(".html", ".json"));
        String pageSource = driver.getPageSource();
        pageSource = pageSource.substring(pageSource.indexOf("{"));
        pageSource = pageSource.substring(0, pageSource.length()-20);        
        System.out.println(pageSource);
        driver.quit();
        skemamapper.SkemaGetter(pageSource);
    }
}
