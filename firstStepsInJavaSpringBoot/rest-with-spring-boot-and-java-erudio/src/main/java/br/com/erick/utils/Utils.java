package br.com.erick.utils;

public class Utils {
	
	//Valida se o número pode ser convertido e converte
	public static Double convertToDouble(String strNumber) {
		if (strNumber == null)
			return 0D;

		String number = strNumber.replaceAll(",", ".");
		if (isNumeric(number))
			return Double.parseDouble(number);

		return 0D;
	}

	//Verifica se o número é número
	public static boolean isNumeric(String strNumber) {
		if (strNumber == null)
			return false;

		String number = strNumber.replaceAll(",", ".");

		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
}
