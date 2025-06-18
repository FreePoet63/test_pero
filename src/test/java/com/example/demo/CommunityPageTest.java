package com.example.demo;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Selenide.open;

public class CommunityPageTest {
    private CommunityPage communityPage;

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        Configuration.pageLoadStrategy = "eager";
        Configuration.timeout = 60000;
    }

    @BeforeEach
    public void setUp() {
        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");
        open("https://vk.com/club225299895");
        communityPage = new CommunityPage();
    }

    @Test
    public void testCommunityTitleAndTotalCard() throws InterruptedException {
        communityPage.verifyTitleCommunityDisplayed();
        communityPage.verifyTotalCard();
    }

    @Test
    public void testCommunityTotalService() throws InterruptedException {
        communityPage.verifyTotalService();
    }
}