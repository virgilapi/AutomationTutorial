package tests;

import org.testng.annotations.Test;
import pages.AlertFrameWindowPage;
import pages.AlertPage;
import pages.IndexPage;
import sharedData.SharedData;
import suite.Suite;

public class AlertsTest extends SharedData {



    @Test(groups = {Suite.REGRESSION_SUITE,Suite.SANITY_SUITE,Suite.ALERTWINDOWFRAME_SUITE})
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
