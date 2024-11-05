package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import junit.framework.Assert;
import lippia.web.constants.TimeConstants;

import static com.crowdar.core.actions.ActionManager.*;

public class TimeService {

    public static void cargarFecha(String fecha){

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebActionManager.click(TimeConstants.DATE_INPUT3);
        WebActionManager.setInput(TimeConstants.DATE_INPUT3,fecha);

    }

    public static void horaInicio(String hora1) {

        WebActionManager.click(TimeConstants.INITIAL_TIME);
        WebActionManager.setInput(TimeConstants.INITIAL_TIME,hora1);
    }

    public static void horaFin(String hora2) {
        WebActionManager.click(TimeConstants.FINAL_TIME);
        WebActionManager.setInput(TimeConstants.FINAL_TIME,hora2);
    }

    public static void project(String project) {
        WebActionManager.click(TimeConstants.PROJECT);
        WebActionManager.waitVisibility(TimeConstants.SELECT_PROJECT);
        WebActionManager.click(TimeConstants.SELECT_PROJECT);
    }

    public static void descripcion(String desc) {
        WebActionManager.setInput(TimeConstants.DESCRIPCION,desc);
    }

    public static void add() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebActionManager.click(TimeConstants.ADD_TIME_ENTRY);
        WebActionManager.click(TimeConstants.ADD_TIME_ENTRY);
    }

    public static void verify() {


        WebActionManager.waitVisibility(TimeConstants.VERIFY_NEW_ENTRY);
        Assert.assertTrue(isVisible(TimeConstants.VERIFY_NEW_ENTRY));


    }
//-------------------------------------------SCENARIO 2-----------------------------------------------------------------------

    public static void clickTimer() {

        WebActionManager.click(TimeConstants.TIMER);
    }

    public static void clickStart() {

        WebActionManager.click(TimeConstants.START);
    }

    public static void clickMenu() {

        WebActionManager.click(TimeConstants.MENU);
    }

    public static void discard() {
        WebActionManager.click(TimeConstants.DISCARD);
    }

    public static void confirmDiscard() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebActionManager.click(TimeConstants.CONFIRM_DISCARD);
    }
    public static void verifyDiscard() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebActionManager.waitVisibility(TimeConstants.VERIFY_DISCARD);
        Assert.assertTrue(isVisible(TimeConstants.VERIFY_DISCARD));


    }
//-------------------------------------------SECENARIO 3-------------------------------------------------------------------------------




    public static void addMod(String mod) {
        WebActionManager.click(TimeConstants.ADD_MODIFY_DESC);
        WebActionManager.setInput(TimeConstants.ADD_MODIFY_DESC,mod,true);
    }
    public static void changeProject() {
        WebActionManager.click(TimeConstants.CHANGE_PROJECT1);
        WebActionManager.waitVisibility(TimeConstants.CHANGE_PROJECT2);
        WebActionManager.click(TimeConstants.CHANGE_PROJECT2);
    }

    public static void tag() {
        WebActionManager.click(TimeConstants.ADD_TAG1);
        WebActionManager.waitVisibility(TimeConstants.ADD_TAG2);
        WebActionManager.click(TimeConstants.ADD_TAG2);
    }

    public static void modifyStartTime(String startTime) {
        WebActionManager.click(TimeConstants.MOD_STRAT_TIME);
        WebActionManager.setInput(TimeConstants.MOD_STRAT_TIME,startTime);
    }


    public static void verifyModif() {
        WebActionManager.waitVisibility(TimeConstants.VERIFY_MOD);
        Assert.assertTrue(isVisible(TimeConstants.VERIFY_MOD));

    }
}
