package tests;

import org.testng.annotations.Test;
import pages.AlertFrameWindowPage;
import pages.IndexPage;
import pages.WindowPage;
import sharedData.SharedData;

public class WindowTest extends SharedData {


    @Test
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
