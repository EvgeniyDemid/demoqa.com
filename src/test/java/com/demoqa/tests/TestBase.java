package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.demoqa.config.WebConfig;
import com.demoqa.helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

import static com.codeborne.selenide.Selenide.*;

public class TestBase {
	static WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());

	@BeforeAll
	static void beforeAll() {
		Configuration.baseUrl = config.baseUrl();
		Configuration.browser = config.browser();
		Configuration.browserVersion = config.browserVersion();
		Configuration.pageLoadStrategy = "eager";
		Configuration.browserSize = config.browserSize();
		if (config.isRemote()) {
			Configuration.remote = config.remoteUrl();
		}
	}

	public void removingFooterBanners() {
		executeJavaScript("$('#fixedban').remove()");
		executeJavaScript("$('footer').remove()");
	}
	@BeforeEach
	void addListener() {
		SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
	}

	@AfterEach
	void addAttachments() {
		Attach.screenshotAs("Last screenshot");
		Attach.pageSource();
		Attach.browserConsoleLogs();
		Attach.addVideo();
		closeWebDriver();
	}
}
