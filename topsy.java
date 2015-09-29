package topsy;


import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
public class topsy {

	/**
	 * The main method.
	 *SOumik
	 * @param args the arguments
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d1=new FirefoxDriver();
		EventFiringWebDriver driver=new EventFiringWebDriver(d1);
		d1.get("http://topsy.com/tweets");
		d1.findElement(By.xpath(".//*[@id='module-homesearch']/div/div/div[2]/div/form/div/input")).sendKeys("hello");				  //sends the password
		d1.findElement(By.xpath(".//*[@id='module-homesearch']/div/div/div[2]/div/form/div/button")).click(); 
		int n=1;
		
		ArrayList<tweet> arr=new ArrayList<tweet>();
		
		int c=1;
		String arg;
		
		 while(c<=10 )
		 {
		
		 arg=Integer.toString(c);
		 System.out.println(arg);
		 if(arg!= null)
		 {
			 tweetxpath1 path = new tweetxpath1(n);
			 tweet t=new tweet();
			
		 path.setXpath1(arg);
		 path.setXpath2(arg);
		 path.setXpath3(arg);
		
		 
		
	        WebElement e1=d1.findElement(By.xpath(path.getXpath1()));
	        WebElement e2=d1.findElement(By.xpath(path.getXpath2()));
	        WebElement e3=d1.findElement(By.xpath(path.getXpath3()));
	       
	      System.out.println(e1.getText());
	      System.out.println(e2.getText());
	      System.out.println(e3.getText());
	      
	        t.setTweetteeuname(e1.getText());
	        t.setTweettee(e2.getText());
	        t.setTweets(e3.getText());
	       
	        arr.add(t);
	        
	        
	        
	        c++;
		 }else System.out.println("null");
		
		 }
		 n++; 
		 Thread.sleep(4000L);
	        driver.executeScript("scroll(0,600)");
	        d1.findElement(By.xpath(".//*[@id='body']/div[4]/div[2]/div/div[2]/div/a")).click();
		 while(n<3)					//scrolls down 
	        {
			 c=1;
			 while(c<=10)
			 {
				 arg=Integer.toString(c);
				 
			 tweetxpath1 path = new tweetxpath1(n);
			 tweet t=new tweet();
		 path.setXpath1(arg);
		 path.setXpath2(arg);
		 path.setXpath3(arg);
		 
		
		 
		
	        WebElement e1=d1.findElement(By.xpath(path.getXpath1()));
	        WebElement e2=d1.findElement(By.xpath(path.getXpath2()));
	        WebElement e3=d1.findElement(By.xpath(path.getXpath3()));
	       

		      System.out.println(e1.getText());
		      System.out.println(e2.getText());
		      System.out.println(e3.getText());
	        t.setTweetteeuname(e1.getText());
	        t.setTweettee(e2.getText());
	        t.setTweets(e3.getText());
	       
	        arr.add(t);
	        c++;
	       
			 }
	        
	        Thread.sleep(2000L);
	        driver.executeScript("scroll(0,600)");
	        d1.findElement(By.xpath(".//*[@id='body']/div[4]/div[2]/div/div[2]/div/a[2]")).click();
	        
	        Thread.sleep(4000L);
	        n++;
		}
	int count=0;
		while(count<arr.size()) {
			
			
			tweet t=arr.get(count);
			System.out.println(t.getTweetteeuname());
			System.out.println(t.getTweettee());
			System.out.println(t.getTweets());
			count++;
			
		}
			
				
	}

}
