package oneFootballBase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CompetitonsTab extends BaseClassLocatorFind {

	 @Test (priority=0)
	  public void CompLogin()  {
		   LoginToContinue();
	   }
	 @Test (enabled=false)
	 public void TablesInComp() {
		 	    championsleaguesearch();
			POMLoactor.ClickTablesInComp.click();
			POMLoactor.ClickBarcaInComp.click();
			
	 }
	 @Test (priority =1,enabled = false)
	 public void fixturessInComp() {
		    championsleaguesearch();
			POMLoactor.ClickFixturesTabInComp.click();
			POMLoactor.ClickAMatchInFixturesInComp.click();
	 }
	 @Test (priority =1)
	 public void transferDetailsCompetitonsTab() throws InterruptedException {
		 Thread.sleep(3000);	
		championsleaguesearch();
		POMLoactor.TransfersTabInComp.click();
	 }
	 @Test (priority =1,enabled = false)
	 public void resultsInComp() {
		 championsleaguesearch();
		 POMLoactor.resultsTabInComp.click();
		 POMLoactor.CheckResultsforanyMatchInComp.click();
	 }
	 @Test (priority =1,enabled = false)
	 public void newInComp() {
		 championsleaguesearch();
		 POMLoactor.NewsTabInComp.click();
		 POMLoactor.AddNewsToBookMarksInComp.click();
	 }
}
