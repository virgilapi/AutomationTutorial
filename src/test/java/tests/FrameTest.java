package tests;

import org.testng.annotations.Test;
import pages.AlertFrameWindowPage;
import pages.FramePage;
import pages.IndexPage;
import sharedData.SharedData;

public class FrameTest extends SharedData {


    @Test
    public void frameTestMethod() {
        IndexPage indexPage = new IndexPage(driver);
        indexPage.interactOnAlertsFrameWindowMenu();

        AlertFrameWindowPage alertFrameWindowPage = new AlertFrameWindowPage(driver);
        alertFrameWindowPage.interactWithFramesSubMenu();

        FramePage framePage = new FramePage(driver);
        framePage.dealWithBigFrame();
        framePage.dealWithSecondFrame();
    }
}
