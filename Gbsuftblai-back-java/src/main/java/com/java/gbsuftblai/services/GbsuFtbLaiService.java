package com.java.gbsuftblai.services;

import org.springframework.stereotype.Service;

@Service
public class GbsuFtbLaiService {

	public static String convertNumber(Integer inputNumber) {

		String result = returnStringByDevision(inputNumber).append(returnStringByAppearence(inputNumber)).toString();
		return result.equals("") ? inputNumber.toString() : result;
	}

	private static StringBuilder returnStringByDevision(Integer inputNumber) {

		StringBuilder resultByDevisionSB = new StringBuilder();
		if (inputNumber % 3 == 0) {
			resultByDevisionSB.append("Gbsu");
		}
		if (inputNumber % 5 == 0) {
			resultByDevisionSB.append("Ftb");
		}
		return resultByDevisionSB;
	}

	private static StringBuilder returnStringByAppearence(Integer inputNumber) {

		StringBuilder resultByAppearenceSB = new StringBuilder();

		inputNumber.toString().chars().forEach(x -> {
			switch (x) {
			case '3':
				resultByAppearenceSB.append("Gbsu");
				break;
			case '5':
				resultByAppearenceSB.append("Ftb");
				break;
			case '7':
				resultByAppearenceSB.append("Lai");
				break;
			}
		});
		return resultByAppearenceSB;
	}

}
