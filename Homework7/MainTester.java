public class MainTester {
	public static void main(String[] args) {
		TestData data;
		/**
		 if(test object)
		 	data = oject;
 		else if (dataFile)
 			data = parseFile(dataFile);
 		else
 			data = getDefaultData();
		*/
		
	        runTest(TestData data);
	}
	
	private static void runTest();
		System.out.println("*** MAIN TESTER ***");
	        System.out.println("    IF failure -> Asserts error,");
	        System.out.println("    OTHERWISE -> nothing thrown or returned (should see no output.)");
	
	        System.out.println("\n--- BEGIN TESTING ---\n");
	
		System.out.println("    Running Edge Field Tester...");
		EdgeConvertTest ect = new EdgeConvertTest(data);
	        System.out.println("    ...SUCCESSFUL EXECUTION. Passed all tests.\n");
	
		System.out.println("    Running Edge Table Tester...");
	        CreateDDLTest cdt = new CreateDDLTest(data);
	        System.out.println("    ...SUCCESSFUL EXECUTION. Passed all tests.\n");
	
	        System.out.println("\n--- FINISH TESTING ---\n");
	
	        System.out.println("*** END OF MAIN TESTER ***");
	}
	
	private static TestData getDefaultData(){
		TestData data = new TestData();
		
		
	}
	
	private static TestData parseFile(String fileName){
      		TestData data = new TestData();
      		StringTokenizer tokenizer;
      
	        try{
	         
		        BufferedReader in = new BufferedReader (new FileReader(fileName));
		         
		        String line = in.readLine();
		        tokenizer = new StringTokenizer(line, "|");
		            
		        while(tokenizer.hasMoreTokens()) {
				int intA = Integer.parseInt(tokenizer.nextToken());
				String stringA = tokenizer.nextToken();;
				String stringB = tokenizer.nextToken();;
				int intB = Integer.parseInt(tokenizer.nextToken());
				int intC = Integer.parseInt(tokenizer.nextToken());
				int intD = Integer.parseInt(tokenizer.nextToken());
				int intE = Integer.parseInt(tokenizer.nextToken());
				String stringC = tokenizer.nextToken();;
				String stringD = tokenizer.nextToken();;
				String stringE = tokenizer.nextToken();;
				String stringF = tokenizer.nextToken();;
				String file = tokenizer.nextToken();;
		        }              
	      	}
	        catch(IOException e){
		        System.out.println(e);
		        System.err.println("File name is invalid.");
	        }
	}
}

public class TestData{
	//CreateDDLTest data
	public static int intA = 1;
	public static String stringA = "TESTTABLE";
	public static String stringB = "testName";
	public static int intB = 3;
	public static int intC = 4;
	public static int intD = 5;
	public static int intE = 6;
	public static String stringC = "testDefaultValue";
	public static String stringD = "MySQLDB";
	public static String stringE = "MySQL";
	public static String stringF = "";
	//EdgeConvertTest data
	public static String file = "Courses.edg";
	
	public TestData getDefaultData(){
		return this;
	}
}
