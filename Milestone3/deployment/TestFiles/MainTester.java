import java.util.StringTokenizer; 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class MainTester {
	public static void main(String[] args) {
		
		String helpMessage = 
			"Please type one of the following Commands:\n"
			+"\tMainTester f {fileName}\n"
  			+"\tn {TestData object}\n"
  			+"\tMainTester\n\n"
			+"f:\n" 
			+"The thing following f is the name of the text file containing the test objects.\n"
			+"An example file name is \"testData.txt\".\n\n"
			+"n:\n"
			+"The things following n is the name of a test object that already exists.\n"
         +"The possible test objects are:\n
         +"\tTest1\n"
         +"\tTest2\n"
         +"\tTest3\n"
         +"\tTest4\n\n"
			+"If you do not enter a command after MainTester, the default data will be used to run"
			+"the tests.";
		
		if(args[0].equals("h")){
			System.out.println(helpMessage);
         	}
		else if(args[0].equals("n")){
			ArrayList<TestData> list = parseDataFile("dataFile.txt");
			TestData testA = null;
			for(TestData bla: list){
         			if((bla.testName).equals(args[1]))
         				testA = bla;
      	} 
      	runTest(testA);
      }
		else if(args[0].equals("f")){
			//If a data file is entered by the user, this code will run:
			ArrayList<TestData> list = parseFile(args[1]);
			for(TestData data: list){
         			runTest(data);
         }
      }   
		else{
			//If nothing is entered by the user, this code will run:
			runTest(getDefaultData());
		}
	}
	
	private static void runTest(TestData data){
		/*
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
       */     
	}
	
	private static TestData getDefaultData(){
		TestData data = new TestData();
		return data;
		
	}
	
	private static ArrayList<TestData> parseFile(String fileName){
      		TestData data;
      		StringTokenizer tokenizer;
      		ArrayList<TestData> testList = new ArrayList<>();
      
	        try{
	         
		        BufferedReader in = new BufferedReader (new FileReader(fileName));
		         
		        String line = in.readLine();
		        
		        while(line != null){
		            data = new TestData();

			         tokenizer = new StringTokenizer(line, "|");
			            
   					data.intA = Integer.parseInt(tokenizer.nextToken());
   					data.stringA = tokenizer.nextToken();
   					data.stringB = tokenizer.nextToken();
   					data.intB = Integer.parseInt(tokenizer.nextToken());
   					data.intC = Integer.parseInt(tokenizer.nextToken());
   					data.intD = Integer.parseInt(tokenizer.nextToken());
   					data.intE = Integer.parseInt(tokenizer.nextToken());
   					data.stringC = tokenizer.nextToken();
   					data.stringD = tokenizer.nextToken();
   					data.stringE = tokenizer.nextToken();
   					data.stringF = tokenizer.nextToken();
   					data.file = tokenizer.nextToken();
			       
			         testList.add(data);
                  line = in.readLine();
		       }
             

	      }
	        catch(IOException e){
		        System.out.println(e);
		        System.err.println("File name is invalid.");
	        }
	        return testList;
	}
	
	private static ArrayList<TestData> parseDataFile(String dataFile){
      		TestData data;
      		StringTokenizer tokenizer;
      		ArrayList<TestData> testList = new ArrayList<>();
      
	        try{
	         
		        BufferedReader in = new BufferedReader (new FileReader(dataFile));
		         
		        String line = in.readLine();
		        
		        while(line != null){
		           data = new TestData();
		           tokenizer = new StringTokenizer(line, "|");
		            
			   data.testName = tokenizer.nextToken();         
   		    	   data.intA = Integer.parseInt(tokenizer.nextToken());
   			   data.stringA = tokenizer.nextToken();
   			   data.stringB = tokenizer.nextToken();
   			   data.intB = Integer.parseInt(tokenizer.nextToken());
   			   data.intC = Integer.parseInt(tokenizer.nextToken());
   			   data.intD = Integer.parseInt(tokenizer.nextToken());
   			   data.intE = Integer.parseInt(tokenizer.nextToken());
   			   data.stringC = tokenizer.nextToken();
   		 	   data.stringD = tokenizer.nextToken();
   			   data.stringE = tokenizer.nextToken();
   			   data.stringF = tokenizer.nextToken();
   			   data.file = tokenizer.nextToken();
			       
			   testList.add(data);
                           line = in.readLine();
		       }
             

	        }
	        catch(IOException e){
		        System.out.println(e);
		        System.err.println("File name is invalid.");
	        }
	        return testList;
	}
}

class TestData {
	public String testName = "";
	//CreateDDLTest data
	public int intA = 7;
	public String stringA = "TESTTABLE";
	public String stringB = "testName";
	public int intB = 8;
	public int intC = 9;
	public int intD = 10;
	public int intE = 11;
	public String stringC = "testDefaultValue";
	public String stringD = "MySQLDB";
	public String stringE = "MySQL";
	public String stringF = "";
	//EdgeConvertTest data
	public String file = "Courses.edg";
}