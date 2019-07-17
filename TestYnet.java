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
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[1]/a/img")).click(); //�����
		String c1 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[2]/a/img")).click(); //�����
		String c2 = driver.getTitle();
		WEc2 = driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[3]/a/img")); //�����
		WEc2.click();
		String c3 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[4]/a/img")).click(); //�����
		String c4 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[5]/a/img")).click(); //������
		String c5 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[6]/a/img")).click(); //������
		String c6 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[7]/a/img")).click(); //������
		String c7 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[8]/a/img")).click(); //�����
		String c8 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[9]/a/img")).click(); //���
		String c9 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[10]/a/img")).click(); //����
		String c10 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[11]/a/img")).click(); //����
		String c11 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[12]/a/img")).click(); //������
		String c12 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[13]/a/img")).click(); //������
		String c13 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[14]/a/img")).click(); //����� ����
		String c14 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[15]/a/img")).click(); //�����
		String c15 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[16]/a/img")).click(); //�����
		String c16 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[17]/a/img")).click(); //�������
		String c17 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[18]/a/img")).click(); //����
		String c18 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[19]/a/img")).click(); //mynet
		String c19 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[20]/a/img")).click(); //�����
		String c20 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[21]/a/img")).click(); //��� ���
		String c21 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[22]/a/img")).click(); //���
		String c22 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[23]/a/img")).click(); //�����
		String c23 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[24]/a/img")).click(); //winwin
		String c24 = driver.getTitle();
		driver.findElement(By.xpath(".//*[@id='hdr_main_links']/ul[1]/li[24]/a/img")).click(); //allJobs
		String c25 = driver.getTitle();	
		

		///////////////////////////////
		System.out.printf("%s %s%n", "Home Page title is: ",hPageName);
		System.out.printf("%s %s%n", "Category1- �����: ",c1);
		System.out.printf("%s %s%n", "Category2- �����: ",c2);
		System.out.printf("%s %s%n", "Category3- �����: ",c3);
		System.out.printf("%s %s%n", "Category1- �����: ",c4);
		System.out.printf("%s %s%n", "Category2- �����: ",c5);
		System.out.printf("%s %s%n", "Category3- �����: ",c6);
		System.out.printf("%s %s%n", "Category1- �����: ",c7);
		System.out.printf("%s %s%n", "Category2- �����: ",c8);
		System.out.printf("%s %s%n", "Category3- �����: ",c9);
		System.out.printf("%s %s%n", "Category1- �����: ",c10);
		System.out.printf("%s %s%n", "Category2- �����: ",c11);
		System.out.printf("%s %s%n", "Category3- �����: ",c12);
		System.out.printf("%s %s%n", "Category1- �����: ",c13);
		System.out.printf("%s %s%n", "Category2- �����: ",c14);
		System.out.printf("%s %s%n", "Category3- �����: ",c15);
		System.out.printf("%s %s%n", "Category1- �����: ",c16);
		System.out.printf("%s %s%n", "Category2- �����: ",c17);
		System.out.printf("%s %s%n", "Category3- �����: ",c18);
		System.out.printf("%s %s%n", "Category1- �����: ",c19);
		System.out.printf("%s %s%n", "Category2- �����: ",c20);
		System.out.printf("%s %s%n", "Category3- �����: ",c21);
		System.out.printf("%s %s%n", "Category1- �����: ",c22);
		System.out.printf("%s %s%n", "Category2- �����: ",c23);
		System.out.printf("%s %s%n", "Category3- �����: ",c24);
		System.out.printf("%s %s%n", "Category3- �����: ",c25);

//		for(int x=1;x<26;x++){
//			System.out.printf("%s %s%n", "Category" + x + "- �����: ",'c'+x);
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
