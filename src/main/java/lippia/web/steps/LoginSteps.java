package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.LoginService;
import lippia.web.services.PaginaPrincipalService;

public class LoginSteps extends PageSteps {


    @Given("El usuario se encuentra en la pagina princicpal")
    public void elUsuarioSeEncuentraEnLaPaginaPrincicpal() {
        PaginaPrincipalService.navegarWeb();
    }

    @And("El usuario hace click en 'Log in'")
    public void elUsuarioHaceClickEnLogIn() {
        PaginaPrincipalService.clickOnLogin();
    }
    @When("El usuario hace click en 'Log in manually'")
    public void elUsuarioHaceClickEnLogInManually() {
        LoginService.logInManually();
    }

    @And("El usuario ingresa el email '(.*)'")
    public void elUsuarioIngresaElEmailOblivion1609HotmailCom(String email) {
        LoginService.setEmail(email);
    }

    @And("El usuario ingresa la contraseña '(.*)'")
    public void elUsuarioIngresaLaContraseñaSnapShot33(String contra) {
        LoginService.setContra(contra);
    }

    @And("El usuario hace click en el boton 'Log In'")
    public void elUsuarioHaceClickEnElBotonLogIn() {
        LoginService.clickLogin();
    }


    @Given("El usuario se encuentra en el Time Tracker con usuario '(.*)' y contraseña '(.*)'")
    public void elUsuarioSeEncuentraEnElTimeTrackerConUsuarioOblivionHotmailComYContraseñaSnapShot(String email, String contra) {
        PaginaPrincipalService.navegarWeb();
        PaginaPrincipalService.clickOnLogin();
        LoginService.logInManually();
        LoginService.setEmail(email);
        LoginService.setContra(contra);
        LoginService.clickLogin();

    }


    @Then("El usuario visualiza mensaje '(.*)' de contraseña incorrrecta")
    public void elUsuarioVisualizaMensajeInvalidEmailOrPasswordDeContraseñaIncorrrecta(String error) {
        PaginaPrincipalService.verifyError(error);
    }
}
