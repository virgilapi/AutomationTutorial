package tests;

import org.testng.annotations.Test;
import pages.AlertFrameWindowPage;
import pages.AlertPage;
import pages.IndexPage;
import sharedData.SharedData;

public class AlertsTest extends SharedData {



    @Test
    public void alertsTestMethod() {

        IndexPage indexPage = new IndexPage(driver);
        indexPage.interactOnAlertsFrameWindowMenu();

        AlertFrameWindowPage alertFrameWindowPage = new AlertFrameWindowPage(driver);
        alertFrameWindowPage.interactWithAlertsSubMenu();

        AlertPage alertPage = new AlertPage(driver);
        alertPage.alertOK();
        alertPage.alertWaitOk();
        alertPage.alertCancel();
        alertPage.fillAlert("blabla");
    }
}
