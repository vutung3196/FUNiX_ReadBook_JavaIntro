package webex_13;

// 21. Write a program to read in a command line integer between -999,999,999 and 999,999,999
// and print the English equivalent.
public class NumberToEnglish {

	public static void main(String[] args) {
		//int num = Integer.valueOf(args[0]);
		int num = 0;
		if (num == 0) {
			System.out.println("0: zero");
			return;
		}
		System.out.print(num + ":");
		System.out.print(num < 0 ? " negative" : "");
		num = num < 0 ? -num : num;
		
		String[] digits = {"", " one", " two", " three", " four", " five", " six", " seven", " eight", " nine"};
		String[] teens = {" ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen",
					     " seventeen", " eighteen", " nineteen"};
		String[] tens = {"", "", " twenty", " thirty", " fourty", " fifty", " sixty", " seventy", " eighty", " ninety"};
		String[] levels = {"", " thousand", " million"};
		
		String word = "";
		int index = 0;
		do {
			// group of 3 digits
			int n = (int) (num % 1000);
			if (num != 0) {
				String str = "";
				int hundred = n % 100;
				if (hundred < 10) {
					str += digits[hundred];
				} else if (hundred < 20) {
					str += teens[hundred % 10];
				} else {
					str = tens[hundred / 10] + digits[hundred % 10];
				}
				str = (hundred / 100 > 0) ? digits[hundred / 100] + " hundred" + str : str;
				word = str + levels[index] + word;
			}
			index++;
			num /= 1000;
		} while (num > 0);
		
		System.out.println(word);
	}

}
