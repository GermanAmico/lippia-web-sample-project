package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.TimeService;
import lippia.web.services.TimeTrackerService;

public class TimeSteps {



    @When("El usuario ingresa una fecha '(.*)'")
    public void elUsuarioIngresaUnaFecha(String fecha) {
        TimeService.cargarFecha(fecha);
    }

    @And("El usuario ingresa una hora inicio '(.*)'")
    public void elUsuarioIngresaUnaHoraInicio(String hora1) {
        TimeService.horaInicio(hora1);
    }

    @And("El usuario ingresa una hora final '(.*)'")
    public void elUsuarioIngresaUnaHoraFinal(String hora2) {
        TimeService.horaFin(hora2);
    }


    @And("El usuario selecciona el projecto '(.*)'")
    public void elUsuarioSeleccionaElProjectoProjectoA(String project) {
        TimeService.project(project);
    }

    @And("El usuario agrega la descripcion '(.*)'")
    public void elUsuarioAgregaLaDescripcionDescripcionDePrueba(String desc) {
        TimeService.descripcion(desc);
    }


    @And("El usuario hace click en ADD")
    public void elUsuarioHaceClickEnADD() {
        TimeService.add();
    }

    @Then("El usuario verifica que se cargaron las horas")
    public void elUsuarioVerificaQueSeCargaronLasHoras() {
        TimeService.verify();
    }
//-----------------------------------------------SCENARIO 2---------------------------------------------------------------------------

    @When("El usuario hace click en Timer")
    public void elUsuarioHaceClickEnTimer() {
        TimeService.clickTimer();
    }

    @And("El usuario hace click en START")
    public void elUsuarioHaceClickEnSTART() {
        TimeService.clickStart();
    }


    @And("El usuario hace click en el menu de tres puntos")
    public void elUsuarioHaceClickEnElMenuDeTresPuntos() {
        TimeService.clickMenu();
    }

    @And("El usuario hace click en discard para cancelar la entrada de tiempo iniciada")
    public void elUsuarioHaceClickEnDiscardParaCancelarLaEntradaDeTiempoIniciada() {
        TimeService.discard();
    }

    @Then("El usuario reafirma la accion haciendo click en DISCARD")
    public void elUsuarioReafirmaLaAccionHaciendoClickEnDISCARD() {
        TimeService.confirmDiscard();
    }
    @And("El usuario visualiza mensaje Timer cancelled")
    public void elUsuarioVisualizaMensajeTimerCancelled() {
        TimeService.verifyDiscard();
    }

//---------------------------------------------SCENARIO 3---------------------------------------------------------------------------------




    @When("El usuario modifica la descripcion actual por '(.*)'")
    public void elUsuarioModificaLaDescripcionActualPorYaModificado(String mod) {
        TimeService.addMod(mod);
    }
    @And("El usuario selecciona  projecto")
    public void elUsuarioSeleccionaProjecto() {
        TimeService.changeProject();
    }

    @And("El usuario selecciona una etiqueta")
    public void elUsuarioSeleccionaUnaEtiqueta() {
        TimeService.tag();
    }

    @And("El usuario modifica la hora inicio '(.*)'")
    public void elUsuarioModificaLaHoraInicio(String startTime) {
        TimeService.modifyStartTime(startTime);
    }


    @Then("El usuario visualiza un mensaje que indica que la hora inicial se modifico")
    public void elUsuarioVisualizaUnMensajeQueIndicaQueLaHoraInicialSeModifico() {
        TimeService.verifyModif();
    }
}