package com.demoqa.utils;

import java.util.Arrays;
import java.util.List;

public class RandomUtils {
	List<String> listSubjects = Arrays.asList(
			"Hindi", "English", "Maths", "Physics", "Chemistry", "Biology",
			"Computer Science", "Commerce", "Accounting", "Economics", "Arts",
			"Social Studies", "History", "Civics");
	List<String> listHobbies = Arrays.asList("Sports", "Reading", "Music");
	List<String> listState = Arrays.asList("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");
	List<String> listCityNcr = Arrays.asList("Delhi", "Gurgaon", "Noida");
	List<String> listCityUttarPradesh = Arrays.asList("Agra", "Lucknow", "Merrut");
	List<String> listCityHaryana = Arrays.asList("Karnal", "Panipat");
	List<String> listCityRajasthan = Arrays.asList("Jaipur", "Jaiselmer");

	public String getSubject() {
		return listSubjects.get(0 + (int) (Math.random() * (listSubjects.size() - 1)));
	}

	public String getHobby() {
		return listHobbies.get((0 + (int) (Math.random() * (listHobbies.size() - 1))));
	}

	public String getState() {
		return listState.get((0 + (int) (Math.random() * (listState.size() - 1))));
	}

	public String getCity(String state) {
		String cityOfState;
		switch (state) {
			case "NCR":
				cityOfState = listCityNcr.get((0 + (int) (Math.random() * (listCityNcr.size() - 1))));
				break;
			case "Uttar Pradesh":
				cityOfState = listCityNcr.get((0 + (int) (Math.random() * (listCityUttarPradesh.size() - 1))));
				break;
			case "Haryana":
				cityOfState = listCityHaryana.get((0 + (int) (Math.random() * (listCityNcr.size() - 1))));
				break;
			case "Rajasthan":
				cityOfState = listCityRajasthan.get((0 + (int) (Math.random() * (listCityNcr.size() - 1))));
				break;

			default:
				cityOfState = null;
		}
		return cityOfState;
	}
	public String getmonth(){
		int month = (int) (Math.random()*12);
		String monthStr;
		switch (month){
			case 1:monthStr = "January";
			break;
			case 2:monthStr = "February";
				break;
			case 3:monthStr = "March";
				break;
			case 4:monthStr = "April";
				break;
			case 5:monthStr = "May";
				break;
			case 6:monthStr = "June";
				break;
			case 7:monthStr = "July";
				break;
			case 8:monthStr = "August";
				break;
			case 9:monthStr = "September";
				break;
			case 10:monthStr = "October";
				break;
			case 11:monthStr = "November";
				break;
			case 12:monthStr = "December";
				break;
			default:monthStr=null;
		}
		return monthStr;
	};


}
