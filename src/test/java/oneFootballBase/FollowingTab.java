package oneFootballBase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FollowingTab extends BaseClassLocatorFind {
	
//	public FollowingTab()
//	{
//		PageFactory.initElements(driver);
//	}
	
    @Test (priority=0)
	public void Loggin() {
		launchBrowser();
		loadUrl("https://onefootball.com/payments/sign-in");
		maxBrowser();
		PageFactory.initElements(driver, POMLoactor.class);
    	POMLoactor.AcceptCookies.click();
    	POMLoactor.EmailButton.click();
    	POMLoactor.Email.sendKeys("allwinvinoaj486039@gmail.com");
    	POMLoactor.Password.sendKeys("AllWin@01");
    	POMLoactor.SignInButton.click();
		
	}
    @Test (priority=1,dependsOnMethods = "Loggin",enabled=false)
	public void FavoriteclubMyTeams() {
		PageFactory.initElements(driver, POMLoactor.class);
		String ss = driver.getTitle();
		System.out.println(ss);
		String s = POMLoactor.MyInterestHeader.getText();
		System.out.println(s);
		POMLoactor.AddFavClub.click();
		POMLoactor.SearchCountry.sendKeys("spain");
		POMLoactor.ClickCountry.click();
    	POMLoactor.ClickGoToFollowing.click();
	}
    @Test (priority=1)
    public void FavClubUnselectMyTeams() {
    	PageFactory.initElements(driver, POMLoactor.class);
		POMLoactor.AddFavClub.click();
		POMLoactor.SearchCountry.sendKeys("spain");
		POMLoactor.ClickCountry.click();
    	POMLoactor.ClickGoToFollowing.click();	
    }
    @Test (priority=2,enabled=false)
    public void ClickOnFavClubDetailsPage() {
    	PageFactory.initElements(driver, POMLoactor.class);
    	POMLoactor.ClickYourFavTeam.click();
    }
    @Test (enabled=false)
    public void MyFavoriteCompetitions() {
    	PageFactory.initElements(driver, POMLoactor.class);
    	String GetText = POMLoactor.GetCompetitonsHeader.getText();
    	System.out.println(GetText);
        POMLoactor.AddYourFavCompetetons.click();
        POMLoactor.SearchTextBox.sendKeys("india");
        POMLoactor.SelectYourFavLeagueIndia.click();
        POMLoactor.ClickToMainPage.click();
    }
    @Test (enabled=false)
    public void UnselectFavCompetitons() {
    	PageFactory.initElements(driver, POMLoactor.class);
    	 POMLoactor.AddYourFavCompetetons.click();
         POMLoactor.SearchTextBox.sendKeys("india");
         POMLoactor.SelectYourFavLeagueIndia.click();
         POMLoactor.ClickToMainPage.click();
    }
    @Test (dependsOnMethods = "MyFavoriteCompetitions",enabled=false)
    public void ClickCompetitionDetailsPage() {
    	PageFactory.initElements(driver, POMLoactor.class);
    	POMLoactor.DetailsPageCompetitons.click();
    }
    @Test (priority=1 ,enabled=false)
	public void SelectFavoritePlayer() {
    	PageFactory.initElements(driver, POMLoactor.class);
    	POMLoactor.GetTextMyPlayers.getText();
    	POMLoactor.ClickFavPlayerButton.click();
    	POMLoactor.SearchPlayerName.sendKeys("griez");
    	POMLoactor.ClickSearchedPlayer.click();
    	POMLoactor.ClickGoToFollowing.click();

    }
    @Test (enabled=false)
    public void favPlayerDetailsPage() {
    	PageFactory.initElements(driver, POMLoactor.class);
        POMLoactor.PlayerDetailsPage.click();
    }
    @Test (priority=1,enabled=false)
    public void EditFavTeam() throws InterruptedException {
    	PageFactory.initElements(driver, POMLoactor.class);
        POMLoactor.EditYourInternationalTeam.click();
        POMLoactor.ClickCancelIcon.click();
        POMLoactor.AddNewFavTeam.click();
        Thread.sleep(4000);
        POMLoactor.searchYourNewFavTeam.sendKeys("argentina");
        Thread.sleep(4000);
        POMLoactor.ClickNewFavTeam.click();
    }
}
