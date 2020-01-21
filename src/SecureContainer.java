
public class SecureContainer {
	//input format "######-######"
	public static void main(String[] args) {
		String[] input = args[0].split("-");
		Integer lower = Integer.parseInt(input[0]);
		Integer upper = Integer.parseInt(input[1]);
		Integer total = 0;
		
		for (Integer current = lower; current <= upper; current++) {
			/*
			 * digits don't decrease
			 * two adjacent digit are the same
			 */
			Boolean valid = true;
			Boolean hasDouble = false;
			String number = current.toString();
			int scan;
			for (scan = 1; scan < 6; scan++) {
				if (!valid) {
					break;
				}
				if (number.charAt(scan) < number.charAt(scan-1)) {
					valid = false;
				}
				if (number.charAt(scan) == number.charAt(scan-1)) {
					hasDouble = true;
				}
			}
			
			if (!hasDouble) {
				valid = false;
			}
			
			if (valid) {
				total++;
			}
		}
		System.out.println(total);
		
	}

}
