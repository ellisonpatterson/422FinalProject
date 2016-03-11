/**
* Test file for CreateDDLMySQL
* @author Brianna Buttaccio
* 3/11/2016
**/

package test;
import main.EdgeConnector;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import main.EdgeTable;
import difflib; //must import library

public class CreateDDLMySQLTest {
   EdgeConvertFileParser testObj;

   @Before
	public void setUp() throws Exception {
      EdgeTable[] inputTables = new EdgeTable[1];
      inputTables[0] = new EdgeTable("1|TESTTABLE");
                        
      EdgeField[] inputFields = new EdgeField[1];
      inputFields[0] = new EdgeField("1|testName|3|4|5|6|testName|testDefaultValue");
      
      StringBuffer sb = new StringBuffer();
      CreateDDLMySQL testObj = new CreateDDLMySQL(inputTables, inputFields);
   }

	@Test
	public void testCreateDDL() {
      testObj.createDDL();
      //representing an empty StringBuffer;
      String a = "MySQLDB";
      String b = testObj.getDatabaseName;
      //the boolean should be false because the StringBuffer should have been written to
      boolean equal = a.equals(b);
      assertEquals("createDDL sets a value for databaseName",true,equal);
	}
   
   @Test
	public void generateDatabaseName() {
      assertEquals("Database name was set to default MySQLDB","MySQLDB",testObj.generateDatabaseName());
	}
   
   @Test
	public void getDatabaseName() {
      testObj.createDDL();
      assertEquals("Database name was set to default MySQLDB","MySQLDB",testObj.getDatabaseName);
	}
   
   @Test
	public void getProductName() {
      assertEquals("Prodect name assigned to MySQL","MySQL",testObj.getProductName);
	}
   
   @Test
	public void getSQLString() {
      //representing an empty StringBuffer;
      String a = "";
      //The string returned when the method is called
      String b = testObj.getSQLString;
      //the boolean should be false because the StringBuffer should have been written to
      boolean equal = a.equals(b);
      assertEquals("The StringBuffer was written to and returns String version of StringBuffer",false,equal);

	}
   
}
