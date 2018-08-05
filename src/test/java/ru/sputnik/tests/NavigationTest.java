package ru.sputnik.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.sputnik.pages.SpunikHomePage;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class NavigationTest extends SpunikHomePage {
        @Test
    public void navigationTest(){
        SpunikHomePage spunikHomePage = new SpunikHomePage();

        open(SPUTNIKURL);

        spunikHomePage.getNewsLink().click();
        spunikHomePage.getSputnikLink().exists();
        Assert.assertEquals(WebDriverRunner.url(),NEWSURL);
        spunikHomePage.getSputnikLink().click();

        spunikHomePage.getMapsLink().click();
        getMapsLens().exists();
        getSputnikFromMapsLink().click();
        getSputnikFind().exists();

        open(SPUTNIKURL);
        spunikHomePage.searchFor(SEARCHREQUEST);
        getPenzaWeatther().exists();
        }
}
