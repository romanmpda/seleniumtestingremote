package ru.sputnik.pages;


import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.SelenideElement;

public class SpunikHomePage {
        public  String SPUTNIKURL = "https://www.sputnik.ru/";
        public  String NEWSURL = "https://news.sputnik.ru/";
        public  String SEARCHREQUEST = "Погода в Пензе";
        private SelenideElement newsLink = $(byText("Новости"));
        private SelenideElement mapsLink = $(byText("Карты"));
        private SelenideElement sputnikLink = $("[title='Спутник']");
        private SelenideElement mapsLens = $ ("[class='panel-icon-search ux-cursor-pointer ux-no-outline']");
        private SelenideElement sputnikFromMapsLink = $("[title='Спутник / Карты']");
        private SelenideElement sputnikFind = $(byText("Поиск"));
        private SelenideElement penzaWeatther = $(byText("Пенза"));

        public SelenideElement getPenzaWeatther() {
                return penzaWeatther;
        }

        public void searchFor(String text) {
                $(By.name("q")).val(text).pressEnter();
        }

        public SelenideElement getSputnikFind() {
                return sputnikFind;
        }

        public SelenideElement getSputnikFromMapsLink() {
                return sputnikFromMapsLink;
        }

        public SelenideElement getMapsLens() {
                return mapsLens;
        }

        public SelenideElement getNewsLink() {
                return newsLink;
        }

        public SelenideElement getMapsLink() {
                return mapsLink;
        }

        public SelenideElement getSputnikLink() {
                return sputnikLink;
        }
}
