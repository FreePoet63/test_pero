package com.example.demo;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class ProductPage {
    // Локаторы элементов
    private final SelenideElement productTitle = $x("//h1");
    private final SelenideElement price = $x("//h2");
    private final SelenideElement description = $x("//div[starts-with(@class, 'vkitShowMoreText__text')]");

    // Метод проверки отображения элементов на экране
    public void verifyElementsDisplayed() {
        checkProductTitleVisibility();
        checkPriceVisibility();
        checkDescriptionVisibility();
    }

    // Метод проверки текста элементов
    public void verifyText() {
        checkProductTitleText();
        checkPriceText();
        checkDescriptionText();
    }

    // Отдельные шаги для детализации
    private void checkProductTitleVisibility() {
        productTitle.shouldBe(visible);
    }

    private void checkPriceVisibility() {
        price.shouldBe(visible);
    }

    private void checkDescriptionVisibility() {
        description.shouldBe(visible);
    }

    private void checkProductTitleText() {
        productTitle.shouldHave(text("фываф"));
    }

    private void checkPriceText() {
        price.shouldHave(text("бесплатно"));
    }

    private void checkDescriptionText() {
        description.shouldHave(text("testing product"));
    }
}
