package oneFootballBase;

import org.testng.annotations.Test;

public class BookMarksTab extends BaseClassLocatorFind{
	  @Test (priority=0)
      public void loginnn() {
    	  LoginToContinue();
      }
	@Test (priority=1)
	public void AddBookMarks() {
		POMLoactor.ClickBookMarksTab.click();
	}
}
