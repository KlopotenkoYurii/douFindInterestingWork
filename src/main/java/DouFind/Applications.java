package DouFind;

import DouFind.DocAlpha.Authorization.AuthorizeAcumatica;
import DouFind.DocAlpha.Authorization.AuthorizeThinClient;
import DouFind.DocAlpha.TestCases.AcumaticaTC2;
import DouFind.DocAlpha.TestCases.LineItemValidationTC3;
import DouFind.DocAlpha.TestCases.VerificationStationTC1;
import DouFind.PagesOfLinkedin.Authorization_page;

import DouFind.PagesOfLinkedin.MyNetwork_page;
import DouFind.TestActions.TestSomeActions;
import org.openqa.selenium.WebDriver;

public class Applications {
    private WebDriver driver;


    private Authorization_page authorization_page;
    private MyNetwork_page myNetwork_page;

    private AuthorizeThinClient authorizeThinClient;
    private VerificationStationTC1 verificationStationTC1;
    private AuthorizeAcumatica authorizeAcumatica;
    private AcumaticaTC2 acumaticaTC2;
    private LineItemValidationTC3 lineItemValidationTC3;

    private TestSomeActions testSomeActions;



    public Applications(WebDriver driver) {this.driver = driver;
        authorization_page = new Authorization_page(driver);
        myNetwork_page = new MyNetwork_page(driver);

        authorization_page = new Authorization_page(driver);
        verificationStationTC1 = new VerificationStationTC1(driver);
        authorizeAcumatica = new AuthorizeAcumatica(driver);
        acumaticaTC2 = new AcumaticaTC2(driver);
        lineItemValidationTC3 = new LineItemValidationTC3(driver);

        testSomeActions = new TestSomeActions(driver);
    }



    public Authorization_page getAuthorization_page(){ return authorization_page;}
    public MyNetwork_page getMyNetwork_page(){ return  myNetwork_page;}

    public AuthorizeThinClient getAuthorizeThinClient(){ return authorizeThinClient;}
    public VerificationStationTC1 getVerificationStation(){ return verificationStationTC1;}
    public AuthorizeAcumatica authorizeAcumatica(){return authorizeAcumatica;}
    public AcumaticaTC2 acumaticaTC2(){return acumaticaTC2;}
    public LineItemValidationTC3 lineItemValidationTC3(){return lineItemValidationTC3;}

    public TestSomeActions testSomeActions(){return  testSomeActions;}

}
