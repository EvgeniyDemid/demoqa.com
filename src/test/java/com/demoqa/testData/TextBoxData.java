package com.demoqa.testData;

public class TextBoxData {
	public static TextBox[] textBoxes = new TextBox[]{
			TextBox.builder()
					.fullName("Petrov Ivan")
					.email("qwert@mail.ru")
					.permanentAddress("Moskovskaya 7 kv.89")
					.currentAddress("Petorpavlovskaya 89 apt. 89")
					.build()
	};
}
