import DouFind.PagesOfLinkedin.Authorization_page;
import DouFind.PagesOfLinkedin.MyNetwork_page;
import org.testng.annotations.Test;

public class StartTestLinkedin extends TestRunner {

    @Test
    public void qaJobsTest() {
        Authorization_page authorization_page = new Authorization_page(driver);
        MyNetwork_page myNetwork_page = new MyNetwork_page((driver));

        authorization_page
                .openAuthorizationPage()
                .goToSignIn()
                .inputLogin()
                .inputPassword()
                .submitPress()
                .goToFriendsTab();

        myNetwork_page
                .scrollDown()
                .addContact();
    }
}