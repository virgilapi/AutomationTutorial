package tests;

import org.testng.annotations.Test;
import pages.AlertFrameWindowPage;
import pages.IndexPage;
import pages.WindowPage;
import sharedData.SharedData;
import suite.Suite;

public class WindowTest extends SharedData {


    @Test(groups = {Suite.REGRESSION_SUITE,Suite.SANITY_SUITE,Suite.ALERTWINDOWFRAME_SUITE})
    public void windowTestMethod(){

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.interactOnAlertsFrameWindowMenu();

        AlertFrameWindowPage alertFrameWindowPage = new AlertFrameWindowPage(getDriver());
        alertFrameWindowPage.interactWithWindowSubMenu();

        WindowPage windowPage = new WindowPage(getDriver());
        windowPage.interactWithTab();
        windowPage.interactWithWindow();
    }
}
