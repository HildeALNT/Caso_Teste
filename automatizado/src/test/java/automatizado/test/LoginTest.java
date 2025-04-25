package automatizado.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import automatizado.Page.LoginPO;

//Método que faz os testes serem executados em ordem ascendente
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginTest extends BaseTest {
    
    private static LoginPO loginPage;


    @BeforeClass
    public static void prepararTestes(){
        loginPage = new LoginPO(driver);
    }

    @Test
    public void TC001_CampoEsenhaVazios(){

        loginPage.executarAcaoLogar("", "");

        String mensagem = loginPage.obtertMSG();
        assertEquals(mensagem, "Informe usuário e senha, os campos não podem ser brancos." );
    };

    @Test
    public void TC002_EmailIncorretoSenhaVazia(){

        loginPage.executarAcaoLogar("teste", "");

        String mensagem = loginPage.obtertMSG();
        assertEquals(mensagem, "Informe usuário e senha, os campos não podem ser brancos." );
    };

    @Test
    public void TC003_EmailVazioSenhaIncorreta(){

        loginPage.executarAcaoLogar("", "teste");

        String mensagem = loginPage.obtertMSG();
        assertEquals(mensagem, "Informe usuário e senha, os campos não podem ser brancos." );
    };

    @Test
    public void TC004_EmailESenhaIncorretos(){

        loginPage.executarAcaoLogar("teste", "teste");

        String mensagem = loginPage.obtertMSG();
        assertEquals(mensagem, "E-mail ou senha inválidos" );
    };

    @Test
    public void TC005_EmailCorretoSenhaIncorreta(){

        loginPage.executarAcaoLogar("admin@admin.com", "teste");

        String mensagem = loginPage.obtertMSG();
        assertEquals(mensagem, "E-mail ou senha inválidos" );
    };

    @Test
    public void TC006_EmailErradoSenhaCorreta(){

        loginPage.executarAcaoLogar("aadmin@admin.com", "admin@123");

        String mensagem = loginPage.obtertMSG();
        assertEquals(mensagem, "E-mail ou senha inválidos" );
    };

    @Test
    public void TC007_EmailCorretoSenhaCorreta(){

        loginPage.executarAcaoLogar("admin@admin.com", "admin@123");

       assertEquals(loginPage.obterTituloPagina(), "Controle de Produtos");
        
    };
    

}
