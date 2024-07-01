package String;

	import java.util.Arrays;

	public class Wrapperutil {

		    //  to find the maximum value in an array of integers.
		    public static Integer findMax(Integer[] numbers) {
		        if (numbers == null || numbers.length == 0) {
		            return null;
		        }
		        Integer max = numbers[0];
		        for (Integer num : numbers) {
		            if (num > max) {
		                max = num;
		            }
		        }
		        return max;
		    }

		    //to calculate the average of an array of doubles
		    public static Double calculateAverage(Double[] numbers) {
		        if (numbers == null || numbers.length == 0) {
		            return null;
		        }
		        Double sum = 0.0;
		        for (Double num : numbers) {
		            sum += num;
		        }
		        return sum / numbers.length;
		    }

		    //to convert a binary string to a Boolean array
		    public static Boolean[] convertToBooleanArray(String binaryString) {
		        Boolean[] booleanArray = new Boolean[binaryString.length()];
		        for (int i = 0; i < binaryString.length(); i++) {
		            booleanArray[i] = binaryString.charAt(i) == '1';
		        }
		        return booleanArray;
		    }

		    //to convert a Boolean array to a binary string
		    public static String convertToBinaryString(Boolean[] booleanArray) {
		        StringBuilder binaryString = new StringBuilder();
		        for (Boolean bool : booleanArray) {
		            binaryString.append(bool ? '1' : '0');
		        }
		        return binaryString.toString();
		    }

		    // Main method for testing
		    public static void main(String[] args) {
		        Integer[] intArray = {2, 7, 5, 3, 9};
		        Double[] doubleArray = {2.5, 3.5, 4.5, 1.0};
		        String binaryString = "1101";

		        System.out.println("Max value: " + findMax(intArray));
		        System.out.println("Average value: " + calculateAverage(doubleArray));
		        System.out.println("Boolean array from binary string: " + Arrays.toString(convertToBooleanArray(binaryString)));

		        Boolean[] booleanArray = {true, false, true, true};
		        System.out.println("Binary string from Boolean array: " + convertToBinaryString(booleanArray));
		    }
		}

