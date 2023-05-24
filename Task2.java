package class03;

import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
   /* Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D
    Enter valid username
    Leave password field empty
    Click on login button
    Verify error message with text “Password cannot be empty” is displayed.*/

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input[name='txtUsername']")).sendKeys("fatima");
       WebElement logInBtn= driver.findElement(By.cssSelector("input[name='Submit']"));
       logInBtn.click();
      WebElement textMessage= driver.findElement(By.cssSelector("span[id='spanMessage']"));
      textMessage.getText();
      driver.close();
    }
}
