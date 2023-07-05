package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public class TestBase {
	@BeforeAll
	static void beforeAll() {
		Configuration.baseUrl = "https://demoqa.com";
		Configuration.pageLoadStrategy = "eager";
		Configuration.browserSize = "1920x1080";
	}
	public void removingFooterBanners() {
		executeJavaScript("$('#fixedban').remove()");
		executeJavaScript("$('footer').remove()");
	}
}
