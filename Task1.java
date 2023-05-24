package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
   /* Open chrome browser
    Go to “http://practice.syntaxtechs.net/input-form-demo.php%E2%80%9D
    fill in the complete form*/

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");
        driver.manage().window().maximize();
        WebElement firstName=driver.findElement(By.xpath("//input[@name='first_name']"));
        firstName.sendKeys("fatima");
        driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("hayat");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("fatimahayat@gmail.com");
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("123-42-5676");
        driver.findElement(By.xpath("//input[@name='address']")).sendKeys("street123");
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Alexandria");
        driver.findElement(By.xpath("//select[@name='state']")).sendKeys("Virginia");
        driver.findElement(By.xpath("//input[@name='zip']")).sendKeys("33221");
        driver.findElement(By.xpath("//input[@name='website']")).sendKeys("www.google.com");
       WebElement hosting= driver.findElement(By.xpath("//input[@name='hosting']"));
       hosting.click();
       driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("working");
       Thread.sleep(5000);
       driver.close();
    }
}
