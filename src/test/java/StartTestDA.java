import DouFind.DApages.AuthorizeThinClient;
import DouFind.DApages.VerificationStation;
import org.testng.annotations.Test;

public class StartTestDA extends TestRunner {


    @Test
    public void dA() {
        AuthorizeThinClient authorizeThinClient = new AuthorizeThinClient(driver);
        VerificationStation verificationStation = new VerificationStation(driver);

        authorizeThinClient
                .open_AuthorizeThinClientPage()
                .inputLOGIN_AuthorizeThinClientPage()
                .inputPASSWORD_AuthorizeThinClientPage()
                .clickPROCEED_AuthorizeThinClientPage();


        verificationStation
                .openVerificationStation()
                .openBatch()
                .VendorID()
                .Date()
                .Number()
                .RuleConfirm()
                .SaveBlocks()
                .ClickSummit();

    }
}