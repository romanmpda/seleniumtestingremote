package ru.sputnik.tests;

import com.codeborne.selenide.WebDriverRunner;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.sputnik.pages.SpunikHomePage;
import static com.codeborne.selenide.Selenide.*;

@Slf4j
public class NavigationTest {
    @Test

    public void navigationTest(){
        SpunikHomePage spunikHomePage = new SpunikHomePage();

        log.info("Демо тест использования селенид");
        open(spunikHomePage.SPUTNIKURL);
        spunikHomePage.getNewsLink().click();
        spunikHomePage.getSputnikLink().exists();
        Assert.assertEquals(WebDriverRunner.url(),spunikHomePage.NEWSURL);
        spunikHomePage.getSputnikLink().click();

        spunikHomePage.getMapsLink().click();
        spunikHomePage.getMapsLens().exists();
        spunikHomePage.getSputnikFromMapsLink().click();
        spunikHomePage.getSputnikFind().exists();

        open(spunikHomePage.SPUTNIKURL);
        spunikHomePage.searchFor(spunikHomePage.SEARCHREQUEST);
        spunikHomePage.getPenzaWeatther().exists();
        log.info("Демо тест использования селенид завершен");
        }
}
