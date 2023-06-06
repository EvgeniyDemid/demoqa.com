package com.demoqa.testData;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TextBox {
	private String fullName;

	private  String email;

	private String currentAddress;

	private String permanentAddress;

}
