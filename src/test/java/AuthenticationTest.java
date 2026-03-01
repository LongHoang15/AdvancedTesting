import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthenticationTest {
    WebDriver driver;
    String baseUrl = "https://vitimex.com.vn";
    String email = "testautomation123456@gmail.com";
    String password = "123456";
    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @Test
    public void register(){
        driver.get(baseUrl+"/account/register");
        driver.findElement(By.id("first_name")).sendKeys("long");
        driver.findElement(By.id("last_name")).sendKeys("hoang");
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(
                By.cssSelector("form#create_customer input[type='submit']")
        ).click();
        System.out.println("Đăng đý thành công!");
    }

    @Test
    public  void testLogin() {
        driver.get(baseUrl+"/account/login");
        driver.findElement(By.id("customer_email")).sendKeys(email);
        driver.findElement(By.id("customer_password")).sendKeys(password);
        driver.findElement(
                By.cssSelector("form#customer_login input[type='submit']")
        ).click();
        System.out.println("Đăng nhập thành công!");
    }

    @AfterEach
    public void teardown() {
        driver.quit();
    }
}
