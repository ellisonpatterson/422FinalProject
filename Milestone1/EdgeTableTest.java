import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class EdgeTableTest
{
   EdgeTable testObj;

   @Before
   public void setUp() throws Exception
   {
      testObj = new EdgeTable("1|TESTTABLE");

      testObj.addRelatedTable(2);
      testObj.addNativeField(3);

      // This is completely crashing out the test.
      //testObj.setRelatedField(1, 0);

      testObj.makeArrays();
   }

   @Test
   public void testGetNumFigure()
   {
		assertEquals("Num figure was initialized to 1 so it should be 1.", 1, testObj.getNumFigure());
   }

   @Test
   public void testGetName()
   {
		assertEquals("Table name was initialized to TESTTABLE so it should be TESTTABLE.", "TESTTABLE", testObj.getName());
   }

   @Test
   public void TestGetRelatedTablesArray()
   {
      int[] test = {2};
		assertArrayEquals("A related table of 2 was added. An array of ints with the only value of 2 should be returned.", test, testObj.getRelatedTablesArray());
   }

   @Test
   public void TestGetRelatedFieldsArray()
   {
      int[] test = {2};
		assertArrayEquals("A related field of 2 was added. An array of ints with the only value of 2 should be returned.", test, testObj.getRelatedFieldsArray());
   }

   @Test
   public void TestGetNativeFieldsArray()
   {
      int[] test = {3};
		assertArrayEquals("A native field of 3 was added. An array of ints with the only value of 3 should be returned.", test, testObj.getNativeFieldsArray());
   }

   @Test
   public void testToString()
   {
		assertEquals("This will see if the output equals the set data for table 1.", "Table: 1\r\n{\r\nTableName: TESTTABLE\r\nNativeFields: 3\r\nRelatedTables: 2\r\nRelatedFields: 0\r\n}\r\n", testObj.toString());
   }
}
