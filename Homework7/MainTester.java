public class MainTester {
	public static void main(String[] args) {
        System.out.println("*** MAIN TESTER ***");
        System.out.println("    IF failure -> Asserts error,");
        System.out.println("    OTHERWISE -> nothing thrown or returned (should see no output.)");

        System.out.println("\n--- BEGIN TESTING ---\n");

	System.out.println("    Running Edge Field Tester...");
	EdgeConvertTest ect = new EdgeConvertTest();
        System.out.println("    ...SUCCESSFUL EXECUTION. Passed all tests.\n");

	System.out.println("    Running Edge Table Tester...");
        CreateDDLTest cdt = new CreateDDLTest;
        System.out.println("    ...SUCCESSFUL EXECUTION. Passed all tests.\n");

        System.out.println("\n--- FINISH TESTING ---\n");

        System.out.println("*** END OF MAIN TESTER ***");
	}
}

public class TestData{
	
}
