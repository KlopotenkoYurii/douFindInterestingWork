package DouFind;

import DouFind.DocAlpha.Authorization.AuthorizeAcumatica;
import DouFind.DocAlpha.Authorization.AuthorizeThinClient;
import DouFind.DocAlpha.TestCases.VerificationStationTC1;
import DouFind.PagesOfLinkedin.Authorization_page;

import DouFind.PagesOfLinkedin.MyNetwork_page;
import org.openqa.selenium.WebDriver;

public class Applications {
    private WebDriver driver;


    private Authorization_page authorization_page;
    private MyNetwork_page myNetwork_page;

    private AuthorizeThinClient authorizeThinClient;
    private VerificationStationTC1 verificationStationTC1;
    private AuthorizeAcumatica authorizeAcumatica;



    public Applications(WebDriver driver) {this.driver = driver;
        authorization_page = new Authorization_page(driver);
        myNetwork_page = new MyNetwork_page(driver);

        authorization_page = new Authorization_page(driver);
        verificationStationTC1 = new VerificationStationTC1(driver);
        authorizeAcumatica = new AuthorizeAcumatica(driver);
    }



    public Authorization_page getAuthorization_page(){ return authorization_page;}
    public MyNetwork_page getMyNetwork_page(){ return  myNetwork_page;}

    public AuthorizeThinClient getAuthorizeThinClient(){ return authorizeThinClient;}
    public VerificationStationTC1 getVerificationStation(){ return verificationStationTC1;}
    public AuthorizeAcumatica authorizeAcumatica(){return authorizeAcumatica;}


}
