package automatizado.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import automatizado.Page.LoginPO;

public class LoginTest extends BaseTest{
    
    private static LoginPO loginPage; 

    @BeforeClass
    public static void prepararTestes(){
        loginPage = new LoginPO(driver);
    };

    @Test
    public void TC001_LoginEmailEsenhaVazios(){

        loginPage.inputEmail.sendKeys("");
        loginPage.inputSenha.sendKeys("");

        loginPage.buttonEntrar.click();

       String mensagem = loginPage.obterMSG();

        assertEquals(mensagem,"Informe usuário e senha, os campos não podem ser brancos.");
    }
}
