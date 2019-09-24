package DouFind;

import DouFind.DApages.AuthorizeThinClient;
import DouFind.PagesOfLinkedin.Authorization_page;

import DouFind.PagesOfLinkedin.MyNetwork_page;
import org.openqa.selenium.WebDriver;

public class Applications {
    private WebDriver driver;


    private Authorization_page authorization_page;
    private MyNetwork_page myNetwork_page;

    private AuthorizeThinClient authorizeThinClient;



    public Applications(WebDriver driver) {this.driver = driver;
        authorization_page = new Authorization_page(driver);
        myNetwork_page = new MyNetwork_page(driver);

        authorization_page = new Authorization_page(driver);
    }



    public Authorization_page getAuthorization_page(){ return authorization_page;}
    public MyNetwork_page getMyNetwork_page(){ return  myNetwork_page;}

    public AuthorizeThinClient getAuthorizeThinClient(){ return authorizeThinClient;}


}
