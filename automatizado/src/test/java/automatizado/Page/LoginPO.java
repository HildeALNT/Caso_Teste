package automatizado.Page;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPO extends BasePO {

    @FindBy(id = "email")
    public WebElement inputEmail;

    @FindBy(id = "senha")
    public WebElement inputSenha;

    @FindBy(id = "btn-entrar")
    public WebElement buttonEntrar;

    @FindBy(css ="form>div>span")
    public WebElement span; 


    public LoginPO(WebDriver driver) {
        super(driver);
    }

    public void escrever (WebElement input, String texto){
        input.clear();
        input.sendKeys(texto + Keys.TAB);
    }
    
    public String obtertMSG(){
        return span.getText();
    }

    public void executarAcaoLogar(String email, String senha){
        escrever(inputEmail, email);
        escrever(inputSenha, senha);;
        buttonEntrar.click();
    }

    public String obterTituloPagina(){
        return driver.getTitle();
    }
}
