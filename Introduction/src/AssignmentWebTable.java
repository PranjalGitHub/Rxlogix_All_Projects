import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pranjal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement table = driver.findElement(By.id("product"));
		int Rows = table.findElements(By.xpath("//table[@id='product']/tbody/tr")).size();
		int Columns = table.findElements(By.xpath("//table[@id='product']/tbody/tr/th")).size();
		
		System.out.println(Rows);
		System.out.println(Columns);
		
		for (int i=0;i<Rows;i++) {
			String RowData = table.findElements(By.xpath("//table[@id='product']/tbody/tr")).get(i).getText();
			System.out.println(RowData);
			for (int j=0;j<i;j++) {
				String ColumnData =  table.findElements(By.xpath("//table[@id='product']/tbody/tr/th")).get(j).getText();
				System.out.println(ColumnData);
			}
		}
	}

}
