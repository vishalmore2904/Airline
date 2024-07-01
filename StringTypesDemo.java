package String;

public class StringTypesDemo {

	public static void main(String[] args) {

		//concatenation
		long startTime = System.nanoTime();
		String s1 = "hello";
		for (int i =0; i < 10000; i++) {
		  s1 += "World";	
		}
		
		long endTime = System.nanoTime();
		long timeTaken = (endTime - startTime)/1000;
		System.out.println(timeTaken);
		
		//string buffer concatenation 
		startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer("Hello");
        for (int i =0; i < 10000; i++) {
  		      stringBuffer.append("World");	
  		}
        
        endTime = System.nanoTime();
        long timeTakenStringBuffer = (endTime - startTime);
        System.out.println(timeTakenStringBuffer);

        //String Builder Concatenation
        startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder("Hello");
        for (int i =0; i < 10000; i++) {
  		      stringBuilder.append("World");	
  		}
        
        endTime = System.nanoTime();
        long timeTakenStringBuilder = (endTime - startTime);
        System.out.println(timeTakenStringBuilder);

        // Demonstrate Immutability of String
        String immutableStr = "immutable";
        
	}

}
