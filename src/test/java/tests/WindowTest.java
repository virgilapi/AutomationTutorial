package tests;

import org.testng.annotations.Test;
import pages.AlertFrameWindowPage;
import pages.IndexPage;
import pages.WindowPage;
import sharedData.SharedData;

public class WindowTest extends SharedData {


    @Test
    public void windowTestMethod(){

        IndexPage indexPage = new IndexPage(driver);
        indexPage.interactOnAlertsFrameWindowMenu();

        AlertFrameWindowPage alertFrameWindowPage = new AlertFrameWindowPage(driver);
        alertFrameWindowPage.interactWithWindowSubMenu();

        WindowPage windowPage = new WindowPage(driver);
        windowPage.interactWithTab();
        windowPage.interactWithWindow();
    }
}
