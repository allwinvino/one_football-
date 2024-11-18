package oneFootballBase;



import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AccountTab extends BaseClassLocatorFind{
	@Test (priority=0)
	public void LogginAccount() {
		
		launchBrowser();
		TimeCtrl();
		loadUrl("https://onefootball.com/payments/sign-in");
		maxBrowser();
		PageFactory.initElements(driver, POMLoactor.class);
    	POMLoactor.AcceptCookies.click();
    	POMLoactor.EmailButton.click();
    	POMLoactor.Email.sendKeys("allwinvinoaj486039@gmail.com");
    	POMLoactor.Password.sendKeys("AllWin@01");
    	POMLoactor.SignInButton.click();
		
	}
	@Test  (priority=1,enabled=false)
	public void ResetPasswordLink() {
		TimeCtrl();
		POMLoactor.ClickAccountButtonInAccounts.click();
		POMLoactor.ClickResetPasswordInAccounts.click();
		POMLoactor.enterMailInAccounts.sendKeys("allwinvinoaj486039@gmail.com");
		POMLoactor.ClickSendResetLinkInAccounts.click();
		
	}
	@Test (priority =2 , dependsOnMethods = "ResetPasswordLink",enabled=false)
	public void SetNewPassword() {
		
		launchBrowser();
		TimeCtrl();
		loadUrl("https://onefootball.com/en/account/reset/d3rXMjcmDDhjwCCIqKU8V3Ew1x82A23ZEREEv8X1mkXce%2FMA6PzAFfVWpz3RIfvVTEdkkO%2B6CxIcJujbhoS1zO%2FjWuUBllEnzWF5IRl140ODpcgjTAJg9kb3Hasjzc3TI5Y6lvzxkAsI4EpYMrTfHS1LE5oKH%2F6UDRDENzxFy%2B3eZutpGPpfo734NzUFw%2FABwmzJeEnrQj6L4jaAvl%2FEXJyi6RE3S1p0kA");
		PageFactory.initElements(driver, POMLoactor.class);
		POMLoactor.AcceptCookies.click();
		POMLoactor.EnterNewPasswordInAccounts.sendKeys("AllWin@01");
		POMLoactor.ConfirmPasswordInAccounts.sendKeys("AllWin@01");
		POMLoactor.ShowPass.click();
		POMLoactor.UpDatePasswordInAccounts.click();
		String TextAfterReset = POMLoactor.GetTextAfterResetPasswordInAccounts.getText();
		System.out.println(TextAfterReset);
	}
	
	//negative cases
	@Test  (priority=1,dependsOnMethods = "LogginAccount",enabled=false)
	public void ResetPasswordLinkInavlidMail() {
		TimeCtrl();
		POMLoactor.ClickAccountButtonInAccounts.click();
		POMLoactor.ClickResetPasswordInAccounts.click();
		POMLoactor.enterMailInAccounts.sendKeys("allwinvioaj486039@gmail.com");
		POMLoactor.ClickSendResetLinkInAccounts.click();
		String IvalidMailText = POMLoactor.GetInvalidMailTextInaccounts.getText();
	    System.out.println(IvalidMailText);
}   
	@Test  (priority=1,dependsOnMethods = "LogginAccount",enabled=false)
	public void ResetPasswordLinkWithoutMail() {
		TimeCtrl();
		POMLoactor.ClickAccountButtonInAccounts.click();
		POMLoactor.ClickResetPasswordInAccounts.click();
		POMLoactor.enterMailInAccounts.sendKeys("");
		boolean ResetLinkButton = POMLoactor.ClickSendResetLinkInAccounts.isEnabled();
		System.out.println("The reset link button is not enabled"+ResetLinkButton);
		String Getextwithoutmail = POMLoactor.GetTextWithoutSendingMailInAccounts.getText();
		System.out.println(Getextwithoutmail);
		
	}
	@Test (priority =1)
	public void SetNewPasswordWithWrongMethod() {
		
		launchBrowser();
		TimeCtrl();
		loadUrl("https://onefootball.com/en/account/reset/d3rXMjcmDDhjwCCIqKU8V3Ew1x82A23ZEREEv8X1mkXce%2FMA6PzAFfVWpz3RIfvVTEdkkO%2B6CxIcJujbhoS1zO%2FjWuUBllEnzWF5IRl140ODpcgjTAJg9kb3Hasjzc3TI5Y6lvzxkAsI4EpYMrTfHS1LE5oKH%2F6UDRDENzxFy%2B3eZutpGPpfo734NzUFw%2FABwmzJeEnrQj6L4jaAvl%2FEXJyi6RE3S1p0kA");
		PageFactory.initElements(driver, POMLoactor.class);
		POMLoactor.AcceptCookies.click();
		POMLoactor.EnterNewPasswordInAccounts.sendKeys("aallwinn");
		POMLoactor.ConfirmPasswordInAccounts.sendKeys("aallwinn");
		POMLoactor.UpDatePasswordInAccounts.click();
		String GetTextProperPass = POMLoactor.NewPassShouldBeProper.getText();
		System.out.println(GetTextProperPass);
	}
	
	@Test (priority =1,enabled=false)
	public void SetNewPasswordEmptyRepeatPass() {
		
		launchBrowser();
		TimeCtrl();
		loadUrl("https://onefootball.com/en/account/reset/d3rXMjcmDDhjwCCIqKU8V3Ew1x82A23ZEREEv8X1mkXce%2FMA6PzAFfVWpz3RIfvVTEdkkO%2B6CxIcJujbhoS1zO%2FjWuUBllEnzWF5IRl140ODpcgjTAJg9kb3Hasjzc3TI5Y6lvzxkAsI4EpYMrTfHS1LE5oKH%2F6UDRDENzxFy%2B3eZutpGPpfo734NzUFw%2FABwmzJeEnrQj6L4jaAvl%2FEXJyi6RE3S1p0kA");
		PageFactory.initElements(driver, POMLoactor.class);
		POMLoactor.AcceptCookies.click();
		POMLoactor.EnterNewPasswordInAccounts.sendKeys("AllWin@01");
		POMLoactor.ConfirmPasswordInAccounts.sendKeys("");
		POMLoactor.UpDatePasswordInAccounts.click();
		boolean bo = POMLoactor.UpDatePasswordInAccounts.isEnabled();
		System.out.println(bo);
}
	@Test (priority =1,enabled=false)
	public void SetNewPasswordMismatch() {
		
		launchBrowser();
		TimeCtrl();
		loadUrl("https://onefootball.com/en/account/reset/d3rXMjcmDDhjwCCIqKU8V3Ew1x82A23ZEREEv8X1mkXce%2FMA6PzAFfVWpz3RIfvVTEdkkO%2B6CxIcJujbhoS1zO%2FjWuUBllEnzWF5IRl140ODpcgjTAJg9kb3Hasjzc3TI5Y6lvzxkAsI4EpYMrTfHS1LE5oKH%2F6UDRDENzxFy%2B3eZutpGPpfo734NzUFw%2FABwmzJeEnrQj6L4jaAvl%2FEXJyi6RE3S1p0kA");
		PageFactory.initElements(driver, POMLoactor.class);
		POMLoactor.AcceptCookies.click();
		POMLoactor.EnterNewPasswordInAccounts.sendKeys("AllWin@01");
		POMLoactor.ConfirmPasswordInAccounts.sendKeys("Allwin!01");
		POMLoactor.UpDatePasswordInAccounts.click();
		boolean bo = POMLoactor.UpDatePasswordInAccounts.isEnabled();
		System.out.println(bo);
		String PassNotMatch = POMLoactor.NewPassNotMatch.getText();
		System.out.println(PassNotMatch);
		
}
	@Test (priority =1,enabled=false)
	public void SetNewPasswordAllTextBoxEmpty() {
		
		launchBrowser();
		TimeCtrl();
		loadUrl("https://onefootball.com/en/account/reset/d3rXMjcmDDhjwCCIqKU8V3Ew1x82A23ZEREEv8X1mkXce%2FMA6PzAFfVWpz3RIfvVTEdkkO%2B6CxIcJujbhoS1zO%2FjWuUBllEnzWF5IRl140ODpcgjTAJg9kb3Hasjzc3TI5Y6lvzxkAsI4EpYMrTfHS1LE5oKH%2F6UDRDENzxFy%2B3eZutpGPpfo734NzUFw%2FABwmzJeEnrQj6L4jaAvl%2FEXJyi6RE3S1p0kA");
		PageFactory.initElements(driver, POMLoactor.class);
		POMLoactor.AcceptCookies.click();
		POMLoactor.EnterNewPasswordInAccounts.sendKeys("");
		POMLoactor.ConfirmPasswordInAccounts.sendKeys("");
		POMLoactor.UpDatePasswordInAccounts.click();
		boolean bo = POMLoactor.UpDatePasswordInAccounts.isEnabled();
		System.out.println(bo);
		String GetTextProperPass = POMLoactor.NewPassShouldBeProper.getText();
		System.out.println(GetTextProperPass);
		
		
}
	
}
