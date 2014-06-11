package org.beh.gamedev;

public class Util {

	public static String[] CsvSpliter(String csv){
		return CsvSpliter(csv, Constant.CSV_VALUE_AMOUNT);
	}
	
	public static String[] CsvSpliter(String csv, int fieldAmount){
		String[] values = new String[fieldAmount];
		boolean quoted = false;
		int index, length=csv.length();
		int last = 0, counter = 0;
		for (index=0; index<length; index++){
			char c = csv.charAt(index);
			if (c=='\"'){
				quoted = !quoted;
			}
			if (c==',' && !quoted){
				String value = csv.substring(last, index);
				values[counter++] = value;
				last = index+1;
			}
		}
		//截止后
		values[counter] = csv.substring(last);
		return values;
	}
}
