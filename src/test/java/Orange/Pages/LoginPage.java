package Orange.Pages;

import Orange.Steps.ButtonPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    //Llamado de una clase en otro paquete
        private ButtonPage buttonPage;

    //Esto es encontrar un elemento en la pagina
    @FindBy(how = How.NAME, using = "username")
    private WebElement txtUser;

    @FindBy(how = How.NAME, using = "password")
    private WebElement txtPassword;

    //esto es un constructor
    public LoginPage(WebDriver driver){

        PageFactory.initElements(driver, this);

        //instancia de clases
        this.buttonPage = new ButtonPage(driver);
    }

    //metodo
    public void llenarLogin(String userName, String password){
        txtUser.sendKeys(userName);
        txtPassword.sendKeys(password);
        buttonPage.btnLogin();
    }
}
