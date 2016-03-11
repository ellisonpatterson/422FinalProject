import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class EdgeConvertCreateDDLTest 
{
   EdgeConvertCreateDDL testObj;

   @Before
   public void setUp() throws Exception
   {
      EdgeTable[] tables = {new EdgeTable("1|TESTTABLE1"), new EdgeTable("2|TESTTABLE2"), new EdgeTable("3|TESTTABLE3")};
      EdgeField[] fields = {new EdgeField("1|TestField1"), new EdgeField("2|TestField2"), new EdgeField("3|TestField3")};

      testObj = new EdgeConvertCreateDDL(tables, fields) {
         public void createDDL() {};
         public String getSQLString() { return "true"; };
         public String getProductName() { return "true"; };
         public String getDatabaseName() { return "true"; };
      };
   }


   @Test
   public void defaultGetTable() {
      EdgeTable table = new EdgeTable("3|TESTTABLE3");
      Assert.assertEquals("Should return table info about one with an id of 3", table, testObj.getTable(2));
   }

   @Test
   public void defaultGetField() {
      EdgeField field = new EdgeField("2|TestField2");
      Assert.assertEquals("Should return field info about one with a field id of 3", field, testObj.getField(1));
   }
}
