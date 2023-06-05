package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Browsers.FIREFOX;

public class TestBase {
	@BeforeAll
	static void beforeAll() {
		Configuration.baseUrl = "https://demoqa.com";
		Configuration.pageLoadStrategy = "eager";
		Configuration.browser = FIREFOX;
	}
}
