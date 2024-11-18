package oneFootballBase;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassLocatorFind {
		public static WebDriver driver;
		public static Actions a;
		public static Robot r;
		public static Alert a1;
		public static TakesScreenshot ts; 
		public static JavascriptExecutor js;
		public static Select s;
		
	   
		public static void launchBrowser() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
	         }
		public static void loadUrl(String url) {
			driver.get(url);
		}	
	     public static void maxBrowser() {
			driver.manage().window().maximize();

    		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);    		
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
     
			
		}
	     public static void TimeCtrl() {
	    		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);    		
				driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	     }
		public static void pageTitle() {
			String title = driver.getTitle();
			System.out.println(title);
	        }
		public static void pageUrl() {
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
			}
		public static void quit() {
			driver.quit();
			}
		public static void SendText(WebElement element,String text) {
			element.sendKeys(text);
			}
		public static void buttonClick(WebElement element) {
	        element.click();
	        }
		public static void moveToElement(WebElement element) {
			a = new Actions(driver);
			a.moveToElement(element).perform();
			}
		public static void dragAndDrop(WebElement src,WebElement des) {
			a.dragAndDrop(src, des).perform();
	        }
		public static void doubleClick(WebElement element) {
			a.doubleClick(element).perform();
			}
		public static void contextClick(WebElement element) {
			a.contextClick(element).perform();
			}
		
		public static void enter() {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER );
	        }
		public static void down() {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
	        }
		public static void getText(WebElement element) {
			String text = element.getText();
			System.out.println(text);
			}
		public static void getAttributeValue(WebElement element) {
			String attribute = element.getAttribute("value");
			System.out.println(attribute);
	        }
		public static void accept() {
			a1.accept();
			}
		public static void dissmiss() {
			a1.dismiss();
			}
		public static void text(WebElement element,String text) {
			a1.sendKeys(text);
			}
		public static void getText() {
			String text = a1.getText();
			System.out.println(text);
			}
		
		public static void takeScrrenShotAs(WebElement element,File fl) {
			File src = ts.getScreenshotAs(OutputType.FILE);
			
			}
		public static void scrollDown(WebElement elementscrolldown , WebDriver driver) {
			js.executeScript("arguments[0].scrollIntoView(true);", elementscrolldown);
			}
		public static void scrollUp() {
			js.executeScript("arguments[0].scrollIntoview(false)", "pageUp");
			}
		public static void sendKeys(WebElement element,String text) {
			js.executeScript("arguments[0].setAttribute('Value','text')",element );
			}
		public static void getAttribute(WebElement element,String text) {
			js.executeScript("return arguments[0].getAttribute('Value')", text,element);
				}
		
	    public static void selectIndex(WebElement element,int num) {
	    	s.selectByIndex(num);
	    }
	    public static void selectVisible(String text) {
			s.selectByVisibleText(text);
			
	        }
	    public static void selectValue(String text) {
			s.selectByValue(text);
			}
	    public static void multiple() {
			boolean b = s.isMultiple();
			System.out.println(b);
			}
		public static void getOption( ) {
			 List<WebElement> options = s.getOptions();
			 System.out.println(options);
			 }
		public static void allSelected() {
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			System.out.println(allSelectedOptions);
			}
		public static void firstSelected() {
			WebElement firstSelectedOption = s.getFirstSelectedOption();
			System.out.println(firstSelectedOption);
			}
		public static void deselectIndex(Integer num) {
			 s.deselectByIndex(num);
			}
	    public static void deselectValue(String text) {
		      s.deselectByVisibleText(text);
	         }
	      public static void deselectbyValue(String text) {
			  s.deselectByValue(text);
	        }
	      public static void deselectAll() {
	    	  s.deselectAll();
			}
	      public static void frameId(Integer num) {
			driver.switchTo().frame(num);
			}
	     public static void frameName(String name) {
	    	 driver.switchTo().frame(name);
			}
	      public static void frameWebelement(String text) {
			driver.switchTo().frame(text);
			}
	     public static void frameIdString(Integer num) {
	    	 driver.switchTo().frame(num);
			
	         }
	     public static void parentFrame() {
			driver.switchTo().parentFrame();
	      }
	     public static void defaultContent() {
			driver.switchTo().defaultContent();
	       }
	     public static void windowUrl(String url) {
	    	 driver.switchTo().window(url);
				}
	     public static void windowTitle(String title) {
			driver.switchTo().window(title);
	        }
		  public static void windowsId(String windowsid) {
				driver.switchTo().window(windowsid);
	         }
		public static void windowHandle(String text) {
			driver.getWindowHandle();
	       }
	     public static void windowHandles() {
		     Set<String> windowHandles = driver.getWindowHandles();
		     System.out.println(windowHandles);
	       }
	     public static void  LoginToContinue()  {
	 		launchBrowser();
	 		loadUrl("https://onefootball.com/payments/sign-in?redirect=payments%2Fprofile%2Faccount");
	 		maxBrowser();
	 		PageFactory.initElements(driver, POMLoactor.class);
	 		TimeCtrl();
	 		POMLoactor.AcceptCookies.click();
	 		POMLoactor.EmailButton.click();
	     	POMLoactor.Email.sendKeys("allwinvinoaj486039@gmail.com");
	     	POMLoactor.Password.sendKeys("AllWin@01");
	     	POMLoactor.SignInButton.click();
	     	POMLoactor.SignOutButtonn.click();
	 		POMLoactor.EmailButton.click();
	     	POMLoactor.Email.sendKeys("allwinvinoaj486039@gmail.com");
	     	POMLoactor.Password.sendKeys("AllWin@01");
	     	POMLoactor.SignInButton.click();
	     	
	 	}
	     public void ClickPlayerInAClub() throws InterruptedException {
				PageFactory.initElements(driver, POMLoactor.class);
				//POMLoactor.ClickTeamsTab.click();
				Thread.sleep(4000);
				POMLoactor.SearchuttonInTeams.click();
				POMLoactor.SearchTextBoxInteams.sendKeys("Barcelona");
				POMLoactor.ClickBarcaInTeams.click();
				POMLoactor.ClickBarcaSquadInteams.click();
				POMLoactor.SelectLewandoskiInTeams.click();

		  }
	     public void championsleaguesearch() {
	    	    TimeCtrl();
				PageFactory.initElements(driver, POMLoactor.class);
				POMLoactor.SearchuttonInTeams.click();
				POMLoactor.SearchTextBoxInteams.sendKeys("Champions league");
				POMLoactor.ClickChampionsLeagueInComp.click();
	     }
		

	}    
	

