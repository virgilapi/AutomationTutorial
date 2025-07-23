package tests;

import org.testng.annotations.Test;
import pages.AlertFrameWindowPage;
import pages.AlertPage;
import pages.IndexPage;
import sharedData.SharedData;

public class AlertsTest extends SharedData {



    @Test
    public void alertsTestMethod() {

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.interactOnAlertsFrameWindowMenu();

        AlertFrameWindowPage alertFrameWindowPage = new AlertFrameWindowPage(getDriver());
        alertFrameWindowPage.interactWithAlertsSubMenu();

        AlertPage alertPage = new AlertPage(getDriver());
        alertPage.alertOK();
        alertPage.alertWaitOk();
        alertPage.alertCancel();
        alertPage.fillAlert("blabla");
    }
}
