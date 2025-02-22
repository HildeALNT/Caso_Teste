package automatizado.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePO extends BasePO {

    @FindBy(name = "q")
    public WebElement inputPesquisa;
    @FindBy(id = "hdtb-sc")
    public WebElement divResultadoPesquisa;

    /**
     * Construtor para criação da página do Google
     * @param driver
     */
    public GooglePO(WebDriver driver) {
        super(driver);
    }
    


}
