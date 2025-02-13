package automatizado.Page;
/**
 * Classe base para criação das novas PagesObjects.
 * Todas as pages devem ser herdadas dessa classe
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePO {
    /** Driver base que será usado pelas pages */
    protected WebDriver driver;


    /**
     * construtor base para criação da fabrica de elementos(PageFactory)
     * @param driver driver da página atual.
     */
    public BasePO(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
