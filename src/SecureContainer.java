
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
			Character curr;
			Character prev;
			Integer streak = 0;
			for (scan = 1; scan < 6; scan++) {
				curr = number.charAt(scan);
				prev = number.charAt(scan-1);
				
				if (curr < prev) {
					valid = false;
					break;
				}
				
				if (curr == prev) {
					streak++;
				} else {
					if (streak == 1) {
						hasDouble = true;
					}
					streak = 0;
				}
			}
			
			if (streak == 1) {
				hasDouble = true;
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
