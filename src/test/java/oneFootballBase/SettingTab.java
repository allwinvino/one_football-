package oneFootballBase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SettingTab extends BaseClassLocatorFind {
	  @Test (priority=0)
	  public void TeamsLogin() throws InterruptedException {
		   LoginToContinue();
	   }
	  @Test (enabled = false)
	  public void SetLanguageSpanish() {
		  TimeCtrl();
		  PageFactory.initElements(driver, POMLoactor.class);
		  POMLoactor.clickSettingsButtonInSettings.click();
		  POMLoactor.ChangeLanguageToSpanishInSettings.click();
		  
	  }
	  @Test (enabled = false)
	  public void SetLanguageEnglish() {
		  TimeCtrl();
		  PageFactory.initElements(driver, POMLoactor.class);
		  POMLoactor.clickSettingsButtonInSettings.click();
		  POMLoactor.changeLanguageToEnglishInSettings.click();
		  
	  }
	  @Test (enabled = false)
	  public void SetBackgroundColorDark() {
		  TimeCtrl();
		  PageFactory.initElements(driver, POMLoactor.class);
		  POMLoactor.clickSettingsButtonInSettings.click();
		  POMLoactor.changeBackgroundDarkcolorInSettings.click();
		  
	  }
	  @Test (priority =1)
	  public void setLanguageAndColor() throws InterruptedException {
		  TimeCtrl();
		  PageFactory.initElements(driver, POMLoactor.class);
		  POMLoactor.clickSettingsButtonInSettings.click();
		  POMLoactor.ChangeLanguageToSpanishInSettings.click();
		  Thread.sleep(3000);
		  POMLoactor.changeLanguageToEnglishInSettings.click();
		  POMLoactor.changeBackgroundDarkcolorInSettings.click();
		  
	  }
	  
	
}
