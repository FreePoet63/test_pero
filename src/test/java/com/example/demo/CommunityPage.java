package com.example.demo;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class CommunityPage {
    // Локаторы элементов
    private final SelenideElement communityTitle = $x("//h1");
    private final ElementsCollection totalCard = $$x("//li[@class=\"MarketItemPreviewList__item\"]");
    private final ElementsCollection widgets = $$x("//span[@class=\"ui_tab_content_new\"]");

    // Метод проверки отображения заголовка на экране
    public void verifyTitleCommunityDisplayed() {
        communityTitle.shouldBe(visible);
    }

    // Метод проверки количества товаров
    public void verifyTotalCard() {
        totalCard.shouldHave(sizeGreaterThan(0));
    }

    // Метод проверки количества услуг
    public void verifyTotalService() {
        widgets.get(1).click();
        totalCard.shouldHave(sizeGreaterThan(0));
    }


}