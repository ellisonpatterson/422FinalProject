import org.junit.*;
import static org.junit.Assert.*;
import static org.junit.Assume.*;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Greg Zahn
 *
 */
public class EdgeFieldTest {
	EdgeField testObj;
	
	@Before
	public void setUp() throws Exception {
		testObj = new EdgeField("1|testName|3|4|5|6|testName|testDefaultValue");
     }
	 
	@Test
	public void testGetNumFigure() {
		assertEquals("numFigure was initialized to 1",1,testObj.getNumFigure());
	}
	
	@Test
	public void testGetName() {
		assertEquals("name was initialized to \"testname\"","testName",testObj.getName());
	}
	
	@Test
	public void testSetTableID() {
		testObj.setTableID(0);
		assertEquals("tableID was initialized to 0",0,testObj.getTableID());
	}
	
	@Test
	public void testSetTableBound() {
		testObj.setTableBound(0);
		assertEquals("tableBound was initialized to 0",0,testObj.getTableBound());
	}
	
	@Test
	public void testSetFieldBound() {
		testObj.setFieldBound(0);
		assertEquals("fieldBound was initialized to 0",0,testObj.getFieldBound());
	}
	
	@Test
	public void testSetDisallow() {
		testObj.setDisallowNull(false);
		assertEquals("disallowNull should be false",false,testObj.getDisallowNull());
	}
	
	@Test
	public void testSetIsPrimaryKey() {
		testObj.setIsPrimaryKey(false);
		assertEquals("isPrimaryKey should be false",false,testObj.getIsPrimaryKey());
	}
	
	@Test
	public void testSetDefaultValue() {
		testObj.setDefaultValue("");
		assertEquals("defaultValue was initialized to \" \"","",testObj.getDefaultValue());
	}
	
	@Test
	public void testSetVarcharValue() {
		testObj.setVarcharValue(1);
		assertEquals("varcharValue was initialized to 1",1,testObj.getVarcharValue());
	}
	
	@Test
	public void testSetDataType() {
		testObj.setDataType(0);
		assertEquals("dataType was initialized to 0",0,testObj.getDataType());
	}

	
	@Test
	public void testGetStrDataType() {
		String[] testStrDataType = {"Varchar", "Boolean", "Integer", "Double"};
		assertEquals("strDataType was initialized to 1",testStrDataType,testObj.getStrDataType());
	}
	
	@Test
	public void testToString() {
		String a = "1|testName|3|4|5|6|testName|testDefaultValue";
		assertEquals("toString was initialized to values in the constructor",a,testObj.toString());
	
	}
	
}
