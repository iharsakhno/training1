import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class testWebDriver {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.linkedin.com/");
        Thread.sleep(2000);
        System.out.println("Page was opened successful");
        WebElement searchInput = driver.findElement(By.name("session_key"));
        searchInput.sendKeys("sugarok88@gmail.com");
        System.out.println("insert login successful");
        WebElement searchInput1 = driver.findElement(By.name("session_password"));
        searchInput1.sendKeys("ab1234cd56");
        System.out.println("Password correct");
        WebElement searchBtn = driver.findElement(By.xpath("/html/body/nav/section[2]/form/div[2]/button"));
        searchBtn.click();
        Thread.sleep(1000);
        WebElement ProfileBtn = driver.findElement(By.id("nav-settings__dropdown-trigger"));
        ProfileBtn.click();
        Thread.sleep(2000);
        WebElement logoutBtn = driver.findElement(By.linkText("Sign out"));
        logoutBtn.click();
        System.out.println("LogOut correct");
        Thread.sleep(3000);
        driver.quit();

    }

}
