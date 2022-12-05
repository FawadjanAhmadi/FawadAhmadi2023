package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;


public class RetailSignInPage extends BaseSetup{

    public RetailSignInPage() {
        PageFactory.initElements(getDriver(), this);
    }
   
    
    @FindBy(id ="signinLink") public WebElement SignInBttn;
	 @FindBy(id ="email") public WebElement email;
	 @FindBy(id ="password") public WebElement password;
	 @FindBy(id ="loginBtn") public WebElement logInBttn;
	
	 @FindBy(id ="heroImage") public WebElement accountPage;
	 
	
	 
}
