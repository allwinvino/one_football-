package oneFootballBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TeamsTab extends BaseClassLocatorFind{
      @Test (priority=0)
	  public void TeamsLogin() {
		   LoginToContinue();
	   }	
      @Test (priority=1,enabled=false)
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
      @Test (priority=1,enabled=false)
      public void SeasonInTeamsTab() throws InterruptedException {
    	  ClickPlayerInAClub();
    	  POMLoactor.PlayerSeasonInTeams.click();
    	  WebElement elementt = driver.findElement(By.xpath("/html/body/of-root/div/main/of-player-stream/section/of-xpa-layout-player/section[3]/of-xpa-switch-player/section/of-query-param-selector/div/label/select"));  
    	  Select s = new Select(elementt);
    	  s.selectByVisibleText("UEFA Champions League");
    	    
      }
      @Test (priority=1)
      public void NewsTabInTeams() throws InterruptedException {
    	  ClickPlayerInAClub();
    	  POMLoactor.NewsSubTabInTeams.click();
    	  POMLoactor.NewsAboutPlayerInTeams.click();
    	  
      }
	
}

