package automatizado.test;



import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Keys;


import automatizado.Page.GooglePO;


public class googleTest extends BaseTest {
    
    private static GooglePO googlePage;
    @BeforeClass
    public static void prepararTestes(){
        googlePage = new GooglePO(driver);
    }
    @Test
    public void testar_chrome(){

        googlePage.inputPesquisa.sendKeys("batata frita" + Keys.ENTER);
        String resultado = googlePage.divResultadoPesquisa.getText();
        assertTrue(resultado, resultado.contains("Todas"));
   
    };

}
