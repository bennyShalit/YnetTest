package automation.co.il;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestYnet {

	public static void main(String[] args) {
		System.out.println("------Test start------");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.ynet.co.il");   
		String hPageName = driver.getTitle();
		
		WebElement WEc2;

//		System.out.printf("%s %s%n, Home Page title is: ",hPageName  );
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[1]/a/img")).click(); //חדשות
		String c1 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[2]/a/img")).click(); //כלכלה
		String c2 = driver.getTitle();
		WEc2 = driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[3]/a/img")); //ספורט
		WEc2.click();
		String c3 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[4]/a/img")).click(); //תרבות
		String c4 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[5]/a/img")).click(); //רכילות
		String c5 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[6]/a/img")).click(); //בריאות
		String c6 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[7]/a/img")).click(); //דיגיטל
		String c7 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[8]/a/img")).click(); //יהדות
		String c8 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[9]/a/img")).click(); //רכב
		String c9 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[10]/a/img")).click(); //חופש
		String c10 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[11]/a/img")).click(); //אוכל
		String c11 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[12]/a/img")).click(); //צרכנות
		String c12 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[13]/a/img")).click(); //קריירה
		String c13 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[14]/a/img")).click(); //סביבה ומדע
		String c14 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[15]/a/img")).click(); //יחסים
		String c15 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[16]/a/img")).click(); //הורים
		String c16 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[17]/a/img")).click(); //מעורבות
		String c17 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[18]/a/img")).click(); //נדלן
		String c18 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[19]/a/img")).click(); //mynet
		String c19 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[20]/a/img")).click(); //קניות
		String c20 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[21]/a/img")).click(); //ביג דיל
		String c21 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[22]/a/img")).click(); //הוט
		String c22 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[23]/a/img")).click(); //עברית
		String c23 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[24]/a/img")).click(); //winwin
		String c24 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[24]/a/img")).click(); //allJobs
		String c25 = driver.getTitle();	
		

		///////////////////////////////
		System.out.printf("%s %s%n", "Home Page title is: ",hPageName);
		System.out.printf("%s %s%n", "Category1- חדשות: ",c1);
		System.out.printf("%s %s%n", "Category2- כלכלה: ",c2);
		System.out.printf("%s %s%n", "Category3- ספורט: ",c3);
		System.out.printf("%s %s%n", "Category1- חדשות: ",c4);
		System.out.printf("%s %s%n", "Category2- כלכלה: ",c5);
		System.out.printf("%s %s%n", "Category3- ספורט: ",c6);
		System.out.printf("%s %s%n", "Category1- חדשות: ",c7);
		System.out.printf("%s %s%n", "Category2- כלכלה: ",c8);
		System.out.printf("%s %s%n", "Category3- ספורט: ",c9);
		System.out.printf("%s %s%n", "Category1- חדשות: ",c10);
		System.out.printf("%s %s%n", "Category2- כלכלה: ",c11);
		System.out.printf("%s %s%n", "Category3- ספורט: ",c12);
		System.out.printf("%s %s%n", "Category1- חדשות: ",c13);
		System.out.printf("%s %s%n", "Category2- כלכלה: ",c14);
		System.out.printf("%s %s%n", "Category3- ספורט: ",c15);
		System.out.printf("%s %s%n", "Category1- חדשות: ",c16);
		System.out.printf("%s %s%n", "Category2- כלכלה: ",c17);
		System.out.printf("%s %s%n", "Category3- ספורט: ",c18);
		System.out.printf("%s %s%n", "Category1- חדשות: ",c19);
		System.out.printf("%s %s%n", "Category2- כלכלה: ",c20);
		System.out.printf("%s %s%n", "Category3- ספורט: ",c21);
		System.out.printf("%s %s%n", "Category1- חדשות: ",c22);
		System.out.printf("%s %s%n", "Category2- כלכלה: ",c23);
		System.out.printf("%s %s%n", "Category3- ספורט: ",c24);
		System.out.printf("%s %s%n", "Category3- ספורט: ",c25);

//		for(int x=1;x<26;x++){
//			System.out.printf("%s %s%n", "Category" + x + "- חדשות: ",'c'+x);
//		}
	
	driver.close();
	driver.quit();
	System.out.println("------Test complite------");
	
	
	}

}

//public void Click(WebElement el){
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].setAttribute('style', arguments[1]);", el, "border: 2px solid green;");
//	 el.click();
