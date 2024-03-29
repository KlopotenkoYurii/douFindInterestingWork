import DouFind.DocAlpha.Authorization.AuthorizeAcumatica;
import DouFind.DocAlpha.Authorization.AuthorizeThinClient;
import DouFind.DocAlpha.TestCases.AcumaticaTC2;
import DouFind.DocAlpha.TestCases.LineItemValidationTC3;
import DouFind.DocAlpha.TestCases.VerificationStationTC1;
import DouFind.TestActions.TestSomeActions;
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
    @Test
    public void TestCase3(){
        LineItemValidationTC3 lineItemValidationTC3 = new LineItemValidationTC3(driver);
        VerificationStationTC1 verificationStationTC1 = new VerificationStationTC1(driver);
                lineItemValidationTC3
                        .openVerification()
                        .enterLogin()
                        .enterPassword()
                        .enterLogIn();
                verificationStationTC1
                        .openBatch();
                lineItemValidationTC3
                        .changeProfile()
                        .addRow()
                        .poNumber()
                        .inventoryNumber()
                        .vendorID()
                        .clickSavesBlocks()
                        .clickOnRequest()
                        .vendorID()
                        .clickSavesBlocks()
                        .clickOnRequest()
                        .getText();
    }
    @Test
    public void TestSomeActions(){
        TestSomeActions testSomeActions = new TestSomeActions(driver);
                testSomeActions
                        .op()
                        .op2()
                        .op3()
                        .op4()
                        .op5();
    }
}