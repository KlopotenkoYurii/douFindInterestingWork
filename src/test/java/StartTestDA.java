import DouFind.DocAlpha.Authorization.AuthorizeAcumatica;
import DouFind.DocAlpha.Authorization.AuthorizeThinClient;
import DouFind.DocAlpha.TestCases.AcumaticaTC2;
import DouFind.DocAlpha.TestCases.VerificationStationTC1;
import org.testng.annotations.Test;


public class StartTestDA extends TestRunner {


    @Test
    public void TestCase1() {
        AuthorizeThinClient authorizeThinClient = new AuthorizeThinClient(driver);
        VerificationStationTC1 verificationStationTC1 = new VerificationStationTC1(driver);

        authorizeThinClient
                .open_AuthorizeThinClientPage()
                .inputLOGIN_AuthorizeThinClientPage()
                .inputPASSWORD_AuthorizeThinClientPage()
                .clickPROCEED_AuthorizeThinClientPage();

        verificationStationTC1
                .openVerificationStation()
                .openBatch()
                .VendorID()
                .Date()
                .Number()
                .AddRow()
                .InventoryID()
                .Quantity()
                .UOM()
                .Branch()
                .RuleConfirm()
                .SaveBlocks()
                .ClickSummit();
    }
    @Test
    public void TestCase2(){
        AuthorizeAcumatica authorizeAcumatica = new AuthorizeAcumatica(driver);
        AcumaticaTC2 acumaticaTC2 = new AcumaticaTC2(driver);

            authorizeAcumatica
                .openAcumatica()
                .authorizeLogin()
                .authorizePassword()
                .clickSignIn();

            acumaticaTC2
                    .openPayables()
                    .openBillsAndAdjustments()
                    .pushBatchid()
                    .getDataText()
                    .getVendorRef()
                    .SysyOut();

    }
}