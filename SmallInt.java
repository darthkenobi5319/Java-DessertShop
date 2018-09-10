public class SmallInt{
	private int value;
	public static int MAXVALUE = 1000; 
	
	//constructor
	SmallInt(){ }
	SmallInt(int parameter){
		if (parameter < 0 || parameter > MAXVALUE) {
			System.out.println("Error: value out of range; 0 is used as value;");
			setDec(0);
		}
		else {
			setDec(parameter);
		}
	}
	
	
	
	/**
	 * Gets the String representation of the decimal integer
	 * @return the String representation of the private int: value
	 */
	public String getDec() {
		return "" + this.value;
	}
	
	/**
	 * Sets the decimal value;
	 * @param parameter the input of integer;
	 */
	public void setDec(int parameter) {
		if (parameter < 0 || parameter > MAXVALUE) {
			this.value = 0;
		}
		else {
			this.value = parameter;
		}
		
	}
	
	/**
	 * Transfer the decimal value into a binary value;
	 * The idea is to first determine how many powers of 2 to use, and then determines the coefficient;
	 * Later, puts 0s and 1s into an array to generate output.
	 * For example, number 6 would generate an array of [1,1,0], and number 7 would be [1,1,1]
	 * @return the String representation of the value of the decimal value, transferred into binary.
	 */
	public String getBin() {
		if (this.value == 0) {
			return "0";
		}
		int count = 0;
		int temp = this.value;
		String tempString = "";
		while (temp != 0) {
			temp = temp/2;
			count ++;
		}
		int[] power = new int[count];
		temp = this.value;
		while (temp != 0) {
			count = count -1;
			power[count] = temp % 2;
			temp = temp/2;
		}
		for (int i = 0; i < power.length; i++) {
			tempString += power[i];
		}
		return tempString;
	}
	
	
	/**
	 * Transfer the decimal value into a hex value;
	 * The idea is to first determine how many powers of 16 to use, and then determines the coefficient;
	 * Later, puts numbers into an array to generate output.
	 * For example, number 16 would generate an array of ["1","0"], and number 31 would be ["1","F"]
	 * @return the String representation of the value of the decimal value, transferred into hexValue.
	 */

	public String getHex() {
		if (this.value == 0) {
			return "0";
		}
		int count = 0;
		int temp = this.value;
		String tempString = "";
		while (temp != 0) {
			temp = temp/16;
			count ++;
		}
		String[] power = new String[count];
		temp = this.value;
		int remainder = 0;
		while (temp != 0) {
			count = count -1;
			remainder = temp % 16;
			if (remainder < 10) {
			power[count] = "" + remainder;
			}
			else {
				power[count] = "" + (char) ('A' + remainder - 10);
			}
			
			temp = temp/16;
		}
		for (int i = 0; i < power.length; i++) {
			tempString += power[i];
		}
		return tempString;
	}
	
	
	/**
	 * The method tests whether the entered hex value is equal to a binary value
	 * The main algorithm is transform the binary value to a decimal, and from that decimal to a hex value. 
	 * @param hex the String representation of a hex value
	 * @param bin the String representation of a binary value
	 * @return return true if the same, false if not
	 */
	public boolean sameValue(String hex, String bin) {
		int count = bin.length();
		String[] binList = new String[count];
		for (int i = 0; i < count; i++) {
			binList[i] ="" + bin.charAt(i);
		}
		int temp = count;
		int sum = 0;
		for (int i = 0; i < count; i++) {
			temp = temp - 1; 
			sum += Integer.parseInt(binList[i]) * (int) Math.pow(2, temp);			 
		}
		String newHex = transHex(sum);
		return newHex.equalsIgnoreCase(hex);
	}
	
	/**
	 * This method is identical to getHex() except that it takes an input and transfers it into a hexValue
	 * @param input a decimal integer
	 * @return the String representation of the hexValue
	 */
	public static String transHex(int input) {
		if (input == 0) {
			return "0";
		}
		int count = 0;
		int temp = input;
		String tempString = "";
		while (temp != 0) {
			temp = temp/16;
			count ++;
		}
		String[] power = new String[count];
		temp = input;
		int remainder = 0;
		while (temp != 0) {
			count = count -1;
			remainder = temp % 16;
			if (remainder < 10) {
			power[count] = "" + remainder;
			}
			else {
				power[count] = "" + (char) ('A' + remainder - 10);
			}
			temp = temp/16;
		}
		for (int i = 0; i < power.length; i++) {
			tempString += power[i];
		}
		return tempString;
	}
}