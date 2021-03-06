//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import java.time.Duration;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//public class Main {
//    @SuppressWarnings("deprecation")
//    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "C:\\TestTools\\drivers\\chromedriver\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        WebDriverWait wait = new WebDriverWait(driver, 1000);
//
//        PageObject po = new PageObject();
//        po.login("");
//
//        try {
//            driver.get("http://127.0.0.1:5500/index.html");
//            Thread.sleep(5000);
//
//            WebElement e1 = driver.findElement(By.id("a"));
//            WebElement e2 = driver.findElement(By.id("b"));
//            WebElement e3 = driver.findElement(By.id("c"));
//
//            e1.click();
//
//            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//            alert.accept();
//
//            e2.click();
//
//            Alert prompt = wait.until(ExpectedConditions.alertIsPresent());
//            prompt.sendKeys("Got, it!");
//            prompt.accept();
//
//            Alert alert2 = wait.until(ExpectedConditions.alertIsPresent());
//            Thread.sleep(4000);
//            alert2.accept();
//
//            e3.click();
//            Alert alert3 = wait.until(ExpectedConditions.alertIsPresent());
//            alert3.dismiss();
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } finally {
//            driver.quit();
//        }
//
//
//
//        }
//
//
//
//
//        }

//
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//
//    WebDriverWait wait = new WebDriverWait(driver, 1000);
//
//        try {
//        driver.get("http://127.0.0.1:5500/index.html");
//        Thread.sleep(5000);
//
//        WebElement e1 = driver.findElement(By.id("a"));
//        WebElement e2 = driver.findElement(By.id("b"));
//        WebElement e3 = driver.findElement(By.id("c"));
//
//        e1.click();
//
//
//
//        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//        alert.accept();
//
//        e2.click();
//        Alert prompt = wait.until(ExpectedConditions.alertIsPresent());
//
//
//        prompt.sendKeys("Got it!");
//        prompt.accept();
//
//
//        Alert alert2 = wait.until(ExpectedConditions.alertIsPresent());
//        Thread.sleep(4000);
//        alert.accept();
//
//        e3.click();
//        Alert alert3 = wait.until(ExpectedConditions.alertIsPresent());
//        alert3.dismiss();
//
//
//    } catch (InterruptedException e) {
//        e.printStackTrace();
//    } finally {
//        driver.quit();
//    }



//        driver.get("https://pagination.js.org/");
//        Thread.sleep(2000);
//        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='data-container']/ul/li"));
//        List<WebElement> pages = driver.findElements(By.xpath("//div[@class='paginationjs-pages']/ul/li"));
//
//        String text = elements.get(5).getText();
//        System.out.println(text);
//
//
//        pages.get(2).click();
//        wait.until(ExpectedConditions.stalenessOf(elements.get(5)));
//        elements = driver.findElements(By.xpath("//div[@class='data-container']/ul/li"));
//
//
//        text = elements.get(5).getText();
//        System.out.println(text);
//        driver.quit();














