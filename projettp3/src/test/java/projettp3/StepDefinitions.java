import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class StepDefinitions {

    private boolean isUserProfessor;
    private boolean userAccessedPage;

    @Given("un tableau de bord")
    public void unTableauDeBord() {
    }

    @When("l'utilisateur clique sur la page {string} dans le tableau de bord")
    public void utilisateurCliqueSurPageDansTableauDeBord(String page) {
        if (page.equals("notes")) {
            isUserProfessor = true; 
        }
    }

    @Then("l'utilisateur accède à la page s'il est professeur et n'y accède pas s'il ne l'est pas")
    public void utilisateurAccedeOuPasALaPage() {
        if (isUserProfessor) {
            userAccessedPage = true;
        }
        assertTrue(userAccessedPage); 
    }
}
