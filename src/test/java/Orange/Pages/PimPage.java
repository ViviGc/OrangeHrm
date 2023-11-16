package Orange.Pages;

import Orange.Steps.ButtonPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PimPage {

    private ButtonPage buttonPage;

    @FindBy(how = How.XPATH, using = "//input[@name = 'firstName']")
    private WebElement txtFirsName;

    @FindBy(how = How.XPATH, using = "//input[@name = 'middleName']")
    private WebElement txtMiddleName;

    @FindBy(how = How.XPATH, using = "//input[@name = 'lastName']")
    private WebElement txtLastName;

    public PimPage(WebDriver driver){
    this.buttonPage = new ButtonPage(driver);
    PageFactory.initElements(driver, this);

    }

    public void llegarAddEmployee(){
   buttonPage.btnPim();
   buttonPage.btnAdd();
    }

    public void agregarUsuario(String firstName,String middle, String lastName) {
        txtFirsName.sendKeys(firstName);
        txtMiddleName.sendKeys(middle);
        txtLastName.sendKeys(lastName);
        buttonPage.BtnSave();

    }
}
