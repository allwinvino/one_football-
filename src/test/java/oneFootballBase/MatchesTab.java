package oneFootballBase;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MatchesTab extends BaseClassLocatorFind{
	long StartTime;
	long EndTime;
	long TotalTime;
	@Test (priority=0)
   public void MatchesLogin() {
	   LoginToContinue();
   }
	@Test (priority=1,enabled=false)
	public void MatchesTabStandings() throws InterruptedException {
		TimeCtrl();
		PageFactory.initElements(driver, POMLoactor.class);
		Thread.sleep(3000);
		POMLoactor.ClickMatchesTab.click();
		String LeagueTitle = POMLoactor.GetTextOfTheLeague.getText();
		System.out.println(LeagueTitle);
        POMLoactor.ClickPremierLeague.click();
        POMLoactor.ClickTablesInPremierLeague.click();
        POMLoactor.ClickCityManchester.click();
        POMLoactor.ClickSquadCity.click();
        POMLoactor.ClickHaaland.click();
	}
	@Test (priority = 1,enabled=false)
	public void WatchMatches() throws InterruptedException {
		TimeCtrl();
		Thread.sleep(3000);
		PageFactory.initElements(driver, POMLoactor.class);
		POMLoactor.ClickMatchesTab.click();
      //  POMLoactor.ClickArrowRight.click();
        POMLoactor.ClickWatchNowButton.click();
        POMLoactor.ClickAllMatchesLink.click();
	}
	@Test (priority=1,enabled=false)
	public void LiveNowButton() throws InterruptedException {
		TimeCtrl();
		Thread.sleep(3000);
		PageFactory.initElements(driver, POMLoactor.class);
		POMLoactor.ClickMatchesTab.click();
		POMLoactor.ClickLiveNowOption.click();
		String details = POMLoactor.GetTextLiveMatchesDateandTime.getText();
		System.out.println(details);
	}
	@Test  (priority=1,enabled=false)
	public void ClickInstagramPageFromMatchesTab() {
		PageFactory.initElements(driver, POMLoactor.class);
		POMLoactor.ClickMatchesTab.click();
		POMLoactor.ClickInstagramPageToRedirect.click();
	}
	@Test (priority=1,enabled=false)
	public void ClickFBPageFromMatchesTab() {
		PageFactory.initElements(driver, POMLoactor.class);
		POMLoactor.ClickMatchesTab.click();
		POMLoactor.ClickFacebookPagetoRedirect.click();
	}
	@Test  (priority=1,enabled=false)
	public void ClickTwitterPageFromMatchesTab() {
		PageFactory.initElements(driver, POMLoactor.class);
		POMLoactor.ClickMatchesTab.click();
		POMLoactor.ClickTwitterPagetoRedirect.click();
	}
	@Test  (priority=1,enabled=false)
	public void ClickYoutubePageFromMatchesTab() {
		PageFactory.initElements(driver, POMLoactor.class);
		POMLoactor.ClickMatchesTab.click();
		POMLoactor.ClickYoutubePagetoRedirect.click();
	}
	@Test  (priority=1,enabled=false)
	public void ClickTiktokPageFromMatchesTab() {
		PageFactory.initElements(driver, POMLoactor.class);
		POMLoactor.ClickMatchesTab.click();
		POMLoactor.ClickTokTokPagetoRedirect.click();
	}
	@Test (priority=1)
	public void ClickaudioboomPageFromMatchesTab() {
		PageFactory.initElements(driver, POMLoactor.class);
		POMLoactor.ClickMatchesTab.click();
		POMLoactor.ClickAudioboomPagetoRedirect.click();
	}
	@Test (enabled=false)
	public void QuitThePage() {
		EndTime = System.currentTimeMillis();
		TotalTime = EndTime-StartTime;
		System.out.println("The Total Time To Login and To work in Matches Tab is " + TotalTime);
		//driver.quit();
	}
}
