import java.io.*;
import java.util.*;


public class MainTester {
	public static void main(String[] args) {
		
		String helpMessage = 
			"Please type one of the following Commands:\n"
			+"\tMainTester f {fileName}\n"
  			+"\tn {TestData object}\n"
  			+"\tMainTester\n\n"
			+"f:\n" 
			+"The thing following f is the name of the text file containing the test objects.\n"
			+"An example file name is \"dataFile.txt\".\n"
         		+"The test objects in the file are expected to be in the following format:\n"
         		+"\tint|String|String|int|int|int|int|String|String|String|String|EgdeFile.edg\n\n"
			+"n:\n"
			+"The things following n is the name of a test object that already exists.\n"
         		+"A possible test object is:\n"
        		+"\t15|TESTTABLE|testName|45|78|37|96|testDefaultValue|MySQLDB|MySQL|tester|Courses.edg\n\n"
			+"If you do not enter a command after MainTester, the default data will be used to run"
			+"the tests.";
		
		if(args[0].equals("h")){
			System.out.println(helpMessage);
      		}
		else if(args[0].equals("n")){
			TestData testA = parseObject(args[1]);
			runTest(testA);
      		}
		else if(args[0].equals("f")){
			//If a data file is entered by the user, this code will run:
			ArrayList<TestData> list = parseUserFile(args[1]);
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
		return data;
	}
	
	private static ArrayList<TestData> parseUserFile(String fileName){
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
	
	private static TestData parseObject(String object){
      		TestData data = new TestData();
            	List<String> list = new ArrayList<String>(Arrays.asList(object.split("|")));
            	data.intA = Integer.parseInt(list.get(0));				
            	data.stringA = list.get(1);
		data.stringB = list.get(2);
		data.intB = Integer.parseInt(list.get(3));
		data.intC = Integer.parseInt(list.get(4));
		data.intD = Integer.parseInt(list.get(5));
		data.intE = Integer.parseInt(list.get(6));
		data.stringC = list.get(7);
		data.stringD = list.get(8);
		data.stringE = list.get(9);
		data.stringF = list.get(10);
		data.file = list.get(11);
         	return data;
	}
}

class TestData {
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
