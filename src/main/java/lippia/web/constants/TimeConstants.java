package lippia.web.constants;

public class TimeConstants {

    public static final String DATE_INPUT3 = "xpath://*[@id=\"layout-main\"]/div/tracker2/div/div/div/time-tracker-recorder/div/div/div/div[2]/div/single-date-picker2/div[3]/input";
    public static final String INITIAL_TIME = "xpath:/html/body/app-root/default-layout/div[1]/main/div/tracker2/div/div/div/time-tracker-recorder/div/div/div/div[2]/div/single-date-picker2/div[1]/input-time-ampm[1]/input";
    public static final String FINAL_TIME = "xpath:/html/body/app-root/default-layout/div[1]/main/div/tracker2/div/div/div/time-tracker-recorder/div/div/div/div[2]/div/single-date-picker2/div[1]/input-time-ampm[2]/input";
    public static final String PROJECT = "xpath://span[@class='cl-ml-2 cl-max-width-100 cl-cut-text cl-first-letter-uppercase']";
    public static final String SELECT_PROJECT = "xpath://button[text()='ProjectoA ']";
    public static final String DESCRIPCION = "xpath://input[@id='undefined']";
    public static final String ADD_TIME_ENTRY = "xpath://div[@class='ng-star-inserted']/app-button/button[@class='cl-btn cl-btn-primary cl-d-none cl-d-lg-custom-block']";

    public static final String VERIFY_NEW_ENTRY = "xpath://*[text()=' Time entry has been created ']";

    //-------------------------------------------SCENARIO 2--------------------------------------------------------------------------

    public static final String TIMER = "xpath://img[@alt='Track time using timer selected']";
    public static final String START = "xpath://button[@class='cl-btn cl-btn-primary cl-d-none cl-d-lg-custom-block']";
    public static final String MENU = "xpath://div[@class='pointer cl-non-selectable cl-d-flex cl-dropdown-toggle cl-no-arrow']";
    public static final String DISCARD = "xpath://a[@class='cl-dropdown-item cl-text-red']";
    public static final String CONFIRM_DISCARD = "xpath://button[@class='cl-btn cl-btn-primary']";
    public static final String VERIFY_DISCARD = "xpath://*[text()=' Timer cancelled ']";
    //-------------------------------------------SCENARIO 3----------------------------------------------------------------------------------------

    public static final String ADD_MODIFY_DESC = "xpath:/html/body/app-root/default-layout/div[1]/main/div/tracker2/div/div/div/div/entry-group[2]/div/time-tracker-entry/div/div[1]/span/div";
    public static final String CHANGE_PROJECT1 = "xpath:/html/body/app-root/default-layout/div[1]/main/div/tracker2/div/div/div/div/entry-group[1]/div/time-tracker-entry/div/div[2]/div/div/project-picker-label/a";
    public static final String CHANGE_PROJECT2 = "xpath:/html/body/app-root/default-layout/div[1]/main/div/tracker2/div/div/div/div/entry-group[1]/div/time-tracker-entry/div/div[2]/div/project-picker/section/ng-scrollbar/div/div/div/div/section/div/section/div[1]/div[2]/div/div[1]/div/button";
    public static final String ADD_TAG1 = "xpath:/html/body/app-root/default-layout/div[1]/main/div/tracker2/div/div/div/div/entry-group[1]/div/time-tracker-entry/div/div[3]/div/tag-names/div[2]/img";
    public static final String ADD_TAG2 = "xpath:/html/body/app-root/default-layout/div[1]/main/div/tracker2/div/div/div/div/entry-group[1]/div/time-tracker-entry/div/div[3]/div/app-tag-dropdown/div[1]/ng-scrollbar/div/div/div/div/div/div/div/div/div/label";
    public static final String MOD_STRAT_TIME = "xpath:/html/body/app-root/default-layout/div[1]/main/div/tracker2/div/div/div/div/entry-group[1]/div/time-tracker-entry/div/div[4]/div/single-date-picker2/div[1]/input-time-ampm[1]/input";


    public static final String VERIFY_MOD = "xpath://*[text()=' Start time has been updated ']";
}
