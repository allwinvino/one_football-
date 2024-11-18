package oneFootballBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POMLoactor {
	// For Login Page
	@FindBy(xpath="//*[@id=\"onetrust-accept-btn-handler\"]")
    public static WebElement AcceptCookies;
	@FindBy(xpath="//*[@id=\'__next\']/main/div/section/div/div/div[1]/button[4]/img")
	public static WebElement EmailButton;
	@FindBy(name="email")
	public static WebElement Email;
	@FindBy(name="password")
	public static WebElement Password;
	@FindBy (xpath="//*[@id=\'__next\']/main/div/section/div/div/div[2]/form/button")
	public static WebElement SignInButton;
	@FindBy(xpath="//span[text()='Sign out']")
	public static WebElement SignOut;
	
	// For Following Tab
	@FindBy (xpath="//p[text()='My Interest']")
	public static WebElement MyInterestHeader;
	@FindBy(xpath="//p[text()='Follow'][1]")
	public static WebElement AddFavClub;
	@FindBy(id="search")
	public static WebElement SearchCountry;
	@FindBy(xpath="//*[@id=\"__next\"]/main/section[1]/div/div/div[2]/div/section[2]/section/ul/li[1]/button")
	public static WebElement ClickCountry;
	@FindBy (xpath="//span[text()='Go To Following']")
	public static WebElement ClickGoToFollowing;
	
	
	//For Checking Individual Favorite Team Functionality
	@FindBy (xpath="//*[@id=\'__next\']/main/section/div/div/div[2]/div/section[2]/article[1]/div[2]/div[1]/a/div/p[1]")
	public static WebElement ClickYourFavTeam;
	
	//My Competitons Locators
	@FindBy(xpath="//p[text()='MY COMPETITIONS']")
	public static WebElement GetCompetitonsHeader;
	@FindBy (xpath="//*[@id=\"__next\"]/main/section/div/div/div[2]/div/section[2]/article[2]/ul/li[10]/a/div/p[2]")
	public static WebElement AddYourFavCompetetons;
	@FindBy (id="search")
	public static WebElement SearchTextBox;
	@FindBy (xpath="//*[@id=\"__next\"]/main/section[1]/div/div/div[2]/div/section[2]/section/ul/li[1]/button")
	public static WebElement SelectYourFavLeagueIndia;
	@FindBy (xpath="//span[text()='Go To Following']")
	public static WebElement ClickToMainPage;
	
	//Checking the Competitons Details Page
	@FindBy (xpath="//p[text()='UEFA Champions League']")
	public static WebElement DetailsPageCompetitons;
	
	//Checking Favorite Players Section 
	@FindBy (xpath="//p[text()='MY PLAYERS']")
	public static WebElement GetTextMyPlayers;
	@FindBy (xpath="//*[@id=\"__next\"]/main/section/div/div/div[2]/div/section[2]/article[3]/ul/li[8]/a/div/p[2]")
	public static WebElement ClickFavPlayerButton;
	@FindBy (id="search")
	public static WebElement SearchPlayerName;
	@FindBy (xpath="//span[text()='Antoine Griezmann']")
	public static WebElement ClickSearchedPlayer;
	
	
	   // Check Favorite Player Details Page
    @FindBy (xpath = "//p[text()='Lionel Messi']")
    public static WebElement PlayerDetailsPage;
    
    //To Edit your Favorite National Team
    
    @FindBy (xpath = "//button[text()='Edit']")
    public static WebElement EditYourInternationalTeam;
    @FindBy (xpath = "//button[@id=\"onetrust-accept-btn-handler\"]")
    public static WebElement ClickCancelIcon;
    @FindBy (xpath = "//p[text()='Add national team']")
    public static WebElement AddNewFavTeam;
    @FindBy (id = "search")
    public static WebElement searchYourNewFavTeam;
    @FindBy (xpath = "//*[@id=\"__next\"]/main/section[1]/div/div/div[2]/div/section[2]/section/ul/li[1]/button/div/img")
    public static WebElement ClickNewFavTeam;
    
    
    //Create New Account
    @FindBy (xpath = "//*[@id=\"__next\"]/main/div/section/div/div/div[1]/button[4]/img")
    public static WebElement ClickGmailButtonn;
    @FindBy (name = "email")
    public static WebElement EnterEmail;
    @FindBy (name = "password")
    public static WebElement EnterPassword;
    @FindBy (xpath = "//input[@type='checkbox'][1]")
    public static WebElement ClickShowPasswordCheckBox;
    @FindBy (name = "termsAndConditions")
    public static WebElement ClickTermsAndConditionsCheckBox;
    @FindBy (xpath = "(//p[@class='EmailSignUp_checkBoxLabelText__htMJ7'])[3]")
    public static WebElement ClickUpToDateCheckBox;
    @FindBy (xpath = "//button[@class='EmailSignUp_submitButton__Kix5N Button_root__RKQ4c Button_fill__AQ8Ba']")
    public static WebElement clickCreateAccountButtonnn;
    @FindBy (xpath = "//a[text()='Not now']")
    public static WebElement ClickNotNowButton;
    @FindBy (xpath = "(//span[@class='Snackbar_message__5iJTg'])[2]")
    public static WebElement GetTextAlreadyExistsText;
    @FindBy (xpath = "//*[@id=\"__next\"]/div/div/button/div/img")
    public static WebElement ClickCancelFromAlertEmailAlreadyExists;
    
    //Create New Account with invalid Email 
    @FindBy (xpath = "//span[text()='Create account']")
    public static WebElement CreateAccountDisabledButton;
    @FindBy (xpath = "//span[text()='Sign up failed. Please try later.']")
    public static WebElement GetAccountCreationFailedText;
    @FindBy (xpath = "//*[@id=\"__next\"]/div/div/button/div/img")
    public static WebElement CancelNotification;
    

   // CreateAccount using invalid Password
    @FindBy (xpath = "//strong[@class='EmailSignUp_inputDescriptionError__W8rxU EmailSignUp_inputDescriptionText__21TUX']")
    public static WebElement GetTextInvalidPassword;
    
    //BookMarksTab 
    @FindBy (xpath = "//a[text()='Bookmarks']")
    public static WebElement ClickBookMarksTab;
    
    //Matches Tab 
    @FindBy (xpath = "//*[@id=\"__next\"]/main/header/div[1]/nav/ul/li[7]/a/svg/path")
    public static WebElement ProfileButtonn;
    @FindBy (xpath = "//*[@id=\"__next\"]/main/header/div[1]/nav/ul/li[1]/a")
    public static WebElement ClickMatchesTab;
    @FindBy (xpath = "(//div[@class='SectionHeader_container__iVfZ9'])[1]")
    public static WebElement GetTextOfTheLeague;
    @FindBy (xpath = "(//a[@class='title-7-medium LinkWithArrow_container__AzozQ MatchCardsList_link__geDx5'])[1]")
    public static WebElement ClickGoToStandingsPage;
    @FindBy (xpath = "//p[text()='Manchester City']")
    public static WebElement ClickManCityClub;
    @FindBy (xpath = "//span[text()='Sign out']")
    public static WebElement SignOutButtonn;
    @FindBy(xpath = "//*[@id=\"__next\"]/main/div/div/div[5]/div/div/div/a/span[2]/img")
    public static WebElement ClickPremierLeague;
    @FindBy (xpath = "//*[@id=\"__next\"]/main/div/div/div[4]/div/nav/ul/li[4]/a")
    public static WebElement ClickTablesInPremierLeague;
    @FindBy (xpath = "//*[@id=\"__next\"]/main/div/div/div[6]/div/section/article/ul/div[4]/li/a/div[3]/p")
    public static WebElement ClickCityManchester;
    @FindBy (xpath = "//*[@id=\"__next\"]/main/div/div/div[4]/div/nav/ul/li[5]/a")
    public static WebElement ClickSquadCity;
    @FindBy (xpath = "//*[@id=\"__next\"]/main/div/div/div[9]/div/article/ul/li[1]/a")
    public static WebElement ClickHaaland;
    
    //Matches Tab Change to watch now option
    
    @FindBy (xpath = "(//button[@class='Button_root__RKQ4c Button_icon-only__sw1YU'])[2]")
    public static WebElement ClickArrowRight;
    @FindBy (xpath = "//*[@id=\"__next\"]/main/div/div/div[3]/div/div/div[2]/section/a[1]")
    public static WebElement ClickWatchNowButton;
    @FindBy (xpath = "//*[@id=\"__next\"]/footer/section/div/nav[1]/ul/li[1]/a/span")
    public static WebElement ClickAllMatchesLink;
    
    //Matches tab change to live now option
    @FindBy (xpath = "//*[@id=\"__next\"]/main/div/div/div[3]/div/div/div[2]/section/a[2]")
    public static WebElement ClickLiveNowOption;
    @FindBy (xpath = "//*[@id=\"__next\"]/main/div/div/div[4]/div/div/div")
    public static WebElement GetTextLiveMatchesDateandTime;
    
    //Click Links Insta,fb...
    @FindBy (xpath = "//*[@id=\"__next\"]/footer/nav/ul/li[1]")
    public static WebElement ClickInstagramPageToRedirect;
    @FindBy (xpath = "//*[@id=\"__next\"]/footer/nav/ul/li[2]")
    public static WebElement ClickFacebookPagetoRedirect;
    @FindBy (xpath = "//*[@id=\"__next\"]/footer/nav/ul/li[3]")
    public static WebElement ClickTwitterPagetoRedirect;
    @FindBy (xpath = "//*[@id=\"__next\"]/footer/nav/ul/li[4]")
    public static WebElement ClickYoutubePagetoRedirect;
    @FindBy (xpath = "//*[@id=\"__next\"]/footer/nav/ul/li[5]")
    public static WebElement ClickTokTokPagetoRedirect;
    @FindBy (xpath = "//*[@id=\"__next\"]/footer/nav/ul/li[6]")
    public static WebElement ClickAudioboomPagetoRedirect;
    
    // Teams Tab
    @FindBy (xpath = "//button[text()='Teams']")
    public static WebElement ClickTeamsTab;   
    @FindBy (xpath = "//ul/li[@class='Header_headerNavIconItem__QmWQy Header_headerNavListItemSearch__rVIFi']")
    public static WebElement SearchuttonInTeams;
    @FindBy (xpath = "/html/body/of-root/div/main/of-search-stream/div/div/label/input")
    public static WebElement SearchTextBoxInteams;
    @FindBy (xpath = "(//span[text()='Barcelona'])")
    public static WebElement ClickBarcaInTeams;
    @FindBy (xpath = "//*[@id=\"__next\"]/main/div/div/div[4]/div/nav/ul/li[5]/a")
    public static WebElement ClickBarcaSquadInteams;
    @FindBy (xpath = "//*[@id=\"__next\"]/main/div/div/div[9]/div/article/ul/li[7]")
    public static WebElement SelectLewandoskiInTeams;
    
    //TeamsTabPlayerSeason
    @FindBy (xpath = "/html/body/of-root/div/main/of-player-stream/section/of-xpa-layout-player/section[2]/of-xpa-switch-player/section/of-page-tabs/nav/ul/li[2]/a")
    public static WebElement PlayerSeasonInTeams;
    @FindBy (xpath = "/html/body/of-root/div/main/of-player-stream/section/of-xpa-layout-player/section[3]/of-xpa-switch-player/section/of-query-param-selector/div/label/select")
    public static WebElement SelectALeagueInTeams;
    
    //TeamsTabPlayerNews
    @FindBy (xpath = "/html/body/of-root/div/main/of-player-stream/section/of-xpa-layout-player/section[2]/of-xpa-switch-player/section/of-page-tabs/nav/ul/li[3]/a")
    public static WebElement NewsSubTabInTeams;
    @FindBy (xpath = "/html/body/of-root/div/main/of-player-stream/section/of-xpa-layout-player/section[3]/of-xpa-switch-player/section/of-gallery/section/of-news-teaser[1]/div/a/div[1]")
    public static WebElement NewsAboutPlayerInTeams;
    
    
    //Competitons tab
    @FindBy (xpath = "//span[text()='UEFA Champions League']")
    public static WebElement ClickChampionsLeagueInComp;
    @FindBy (xpath = "//a[text()='table']")
    public static WebElement ClickTablesInComp;
    @FindBy (xpath = "//p[text()='Barcelona']")
    public static WebElement ClickBarcaInComp;
    
    //Competitons tab fixtures
    @FindBy (xpath = "//a[text()='fixtures']")
    public static WebElement ClickFixturesTabInComp;
    @FindBy (xpath = "//*[@id=\"__next\"]/main/div/div/div[6]/div/div/div[2]/ul/li[6]/a")
    public static WebElement ClickAMatchInFixturesInComp;
    
    //Transfers tab in Competitons
    @FindBy (xpath = "//a[text()='Transfers']")
    public static WebElement TransfersTabInComp;
    
    //Results tab in Competitons 
    @FindBy (xpath = "//a[text()='results']")
    public static WebElement resultsTabInComp;
    @FindBy (xpath = "//*[@id=\"__next\"]/main/div/div/div[6]/div/div/div[2]/ul/li[12]/a")
    public static WebElement CheckResultsforanyMatchInComp;
    
    //News Tab in Competitons 
    @FindBy (xpath = "//a[text()='news']")
    public static WebElement NewsTabInComp;
    @FindBy (xpath = "(//span[text()='Add to your bookmarks'])[1]")
    public static WebElement AddNewsToBookMarksInComp;
    
    //settings tab 
    @FindBy (xpath = "//*[@id=\"__next\"]/main/section/nav/ul/li[5]/a")
    public static WebElement clickSettingsButtonInSettings;
    @FindBy (xpath = "//span[text()='Español']")
    public static WebElement ChangeLanguageToSpanishInSettings;
    @FindBy (xpath = "//span[text()='English']")
    public static WebElement changeLanguageToEnglishInSettings;
    @FindBy (xpath = "//span[text()='Dark']")
    public static WebElement changeBackgroundDarkcolorInSettings;
    
    //Account Tab 
    @FindBy (xpath = "//*[@id=\"__next\"]/main/section/nav/ul/li[4]/a")
    public static WebElement ClickAccountButtonInAccounts;
    @FindBy (xpath = "//*[@id=\"__next\"]/main/div/div[2]/ul/li[2]/a/p[1]")
    public static WebElement ClickResetPasswordInAccounts;
    @FindBy (name = "email")
    public static WebElement enterMailInAccounts;
    @FindBy (xpath = "//*[@id=\"__next\"]/main/div/form/button")
    public static WebElement ClickSendResetLinkInAccounts;
    @FindBy (xpath = "/html/body/of-root/div/main/of-reset-password/article/form/label[1]/div/input")
    public static WebElement EnterNewPasswordInAccounts;
    @FindBy (xpath = "/html/body/of-root/div/main/of-reset-password/article/form/label[2]/div/input")
    public static WebElement ConfirmPasswordInAccounts;
    @FindBy (xpath = "/html/body/of-root/div/main/of-reset-password/article/form/button/span")
    public static WebElement UpDatePasswordInAccounts;
    @FindBy (xpath = "/html/body/of-root/div/main/of-confirmation/div/of-empty-state/div")
    public static WebElement  GetTextAfterResetPasswordInAccounts;
    @FindBy (xpath = "//*[@id=\"__next\"]/div/div")
    public static WebElement GetInvalidMailTextInaccounts;
    @FindBy (xpath = "//*[@id=\"__next\"]/main/div/form/div/div/strong")
    public static WebElement GetTextWithoutSendingMailInAccounts;
    @FindBy (xpath = "/html/body/of-root/div/main/of-reset-password/article/form/label[1]/p")
    public static WebElement NewPassShouldBeProper;
    @FindBy (xpath = "/html/body/of-root/div/main/of-reset-password/article/form/label[2]/p")
    public static WebElement  NewPassNotMatch;
    @FindBy (xpath = "/html/body/of-root/div/main/of-reset-password/article/form/label[3]/input")
    public static WebElement ShowPass;
    
    
}

