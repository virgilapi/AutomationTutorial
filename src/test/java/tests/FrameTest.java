package tests;

import org.testng.annotations.Test;
import pages.AlertFrameWindowPage;
import pages.FramePage;
import pages.IndexPage;
import sharedData.SharedData;

public class FrameTest extends SharedData {


    @Test
    public void frameTestMethod() {
        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.interactOnAlertsFrameWindowMenu();

        AlertFrameWindowPage alertFrameWindowPage = new AlertFrameWindowPage(getDriver());
        alertFrameWindowPage.interactWithFramesSubMenu();

        FramePage framePage = new FramePage(getDriver());
        framePage.dealWithBigFrame();
        framePage.dealWithSecondFrame();
    }
}
