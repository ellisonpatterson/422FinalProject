/**
* Test file for CreateDDLMySQL
* @author Brianna Buttaccio
* 3/11/2016
**/

import org.junit.*;
import static org.junit.Assert.*;
import static org.junit.Assume.*;
import org.junit.Before;
import org.junit.Test;

public class CreateDDLTest {
   CreateDDL testObj;
   TestData data;
   
   public CreateDDLTest(int intA, String stringA, String stringB, int inB, int intC, int intD, int intE, String stringC, String, stringD, String stringE, String stringF){
   	this.data = data;
   	setUp();
   	testCreateDDL();
   	generateDatabaseName();
   	getDatabaseName();
   	getProductName();
   	getSQLString();
   }

   @Before
   public void setUp() throws Exception {
      //EdgeTable[] inputTables = new EdgeTable[1];
      EdgeTable[] inputTables = new EdgeTable[intA];
      //inputTables[0] = new EdgeTable("1|TESTTABLE");
      inputTables[0] = new EdgeTable(intA + "|" + StringA);
                        
      //EdgeField[] inputFields = new EdgeField[1];
      EdgeField[] inputFields = new EdgeField[intA];
      //inputFields[0] = new EdgeField("1|testName|3|4|5|6|testName|testDefaultValue");
      inputFields[0] = new EdgeField(intA + "|" + stringB + "|" + intB + "|" 
         + intC + "|" + intD + "|" + intE + "|" + stringB + "|" + stringC);
      
      StringBuffer sb = new StringBuffer();
      testObj = new CreateDDLMySQL(inputTables, inputFields);
   }

   @Test
   public void testCreateDDL() {
      testObj.createDDL();
      //representing an empty StringBuffer;
      //String a = "MySQLDB";
      String a = stringD;
      String b = testObj.getDatabaseName();
      //the boolean should be false because the StringBuffer should have been written to
      boolean equal = a.equals(b);
      assertEquals("createDDL sets a value for databaseName",true,equal);
   }

   @Test
   public void generateDatabaseName() {
      //assertEquals("Database name was set to default MySQLDB","MySQLDB",testObj.generateDatabaseName());
      assertEquals("Database name was set to default MySQLDB",stringD ,testObj.generateDatabaseName());
   }
   
   @Test
   public void getDatabaseName() {
      testObj.createDDL();
      //assertEquals("Database name was set to default MySQLDB","MySQLDB",testObj.getDatabaseName());
      assertEquals("Database name was set to default MySQLDB",stringD ,testObj.getDatabaseName());
   }
   
   @Test
   public void getProductName() {
      //assertEquals("Prodect name assigned to MySQL","MySQL",testObj.getProductName());
      assertEquals("Prodect name assigned to MySQL",stringE ,testObj.getProductName());
   }
   
   @Test
   public void getSQLString() {
      //representing an empty StringBuffer;
      //String a = "";
      String a = stringF;
      //The string returned when the method is called
      String b = testObj.getSQLString();
      //the boolean should be false because the StringBuffer should have been written to
      boolean equal = a.equals(b);
      assertEquals("The StringBuffer was written to and returns String version of StringBuffer",false,equal);

   }
   
}
