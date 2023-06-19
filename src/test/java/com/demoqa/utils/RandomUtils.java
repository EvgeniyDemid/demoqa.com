package com.demoqa.utils;

import com.github.javafaker.Faker;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class RandomUtils {

	Faker faker = new Faker(new Locale("en"));
	public String getCity(String state) {
		String cityOfState;
		switch (state) {
			case "NCR":
				cityOfState = faker.options().option("Delhi", "Gurgaon", "Noida");
				break;
			case "Uttar Pradesh":
				cityOfState = faker.options().option("Agra", "Lucknow", "Merrut");
				break;
			case "Haryana":
				cityOfState = faker.options().option("Karnal", "Panipat");
				break;
			case "Rajasthan":
				cityOfState = faker.options().option("Jaipur", "Jaiselmer");
				break;

			default:
				cityOfState = null;
		}
		return cityOfState;
	}
}
