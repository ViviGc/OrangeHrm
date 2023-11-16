package Orange.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ButtonPage {

    @FindBy(how = How.XPATH, using = "//Button[@type='submit']")
    private WebElement btnLogin;

    @FindBy(how = How.XPATH, using = "//ul//li//a//span[text ()='PIM' ]")
    private WebElement btnPim;

    @FindBy(how = How.XPATH, using = "//button[text()=' Add ']")
    private WebElement btnAdd;

    @FindBy(how = How.XPATH, using = "//button[text()=' Add ']")
    private WebElement btnSave;

    //metodos
        public ButtonPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
  public void btnLogin(){
            btnLogin.isDisplayed();
            btnLogin.click();

  }
    public void btnPim() {
          btnPim.isDisplayed();
          btnPim.click();

        }
    public void btnAdd() {
        btnAdd.isDisplayed();
        btnAdd.click();
    }
    public void BtnSave() {
        btnAdd.isDisplayed();
        btnAdd.click();
    }

}
