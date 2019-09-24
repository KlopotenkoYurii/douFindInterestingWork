import DouFind.DApages.AuthorizeThinClient;
import org.testng.annotations.Test;

public class StartTestDA extends TestRunner {


    @Test
    public void dA() {
        AuthorizeThinClient authorizeThinClient = new AuthorizeThinClient(driver);

        authorizeThinClient
                .open_AuthorizeThinClientPage()
                .inputLOGIN_AuthorizeThinClientPage()
                .inputPASSWORD_AuthorizeThinClientPage()
                .clickPROCEED_AuthorizeThinClientPage();

    }
}