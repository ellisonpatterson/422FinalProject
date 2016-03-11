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
	public void testGetTableID() {
		assertEquals("tableID was initialized to 0",0,testObj.getTableID());
	}
	
	@Test
	public void testGetTableBound() {
		assertEquals("tableBound was initialized to 0",0,testObj.getTableBound());
	}
	
	@Test
	public void testGetFieldBound() {
		assertEquals("fieldBound was initialized to 0",0,testObj.getFieldBound());
	}
	
	@Test
	public void testGetDisallowNull() {
		assertEquals("disallowNull should be false",false,testObj.getDisallowNull());
	}
	
	@Test
	public void testGetIsPrimaryKeyl() {
		assertEquals("isPrimaryKey should be false",false,testObj.getIsPrimaryKey());
	}
	
	@Test
	public void testGetDefaultValue() {
		assertEquals("defaultValue was initialized to \" \"","",testObj.getDefaultValue());
	}
	
	@Test
	public void testGetVarcharValue() {
		assertEquals("varcharValue was initialized to 1",1,testObj.getVarcharValue());
	}
	
	@Test
	public void testGetDataType() {
		assertEquals("dataType was initialized to 0",0,testObj.getDataType());
	}
	
	@Test
	public void testGetStrDataType() {
		String[] testStrDataType = {"Varchar", "Boolean", "Integer", "Double"};
		assertEquals("strDataType was initialized to 1",testStrDataType,testObj.getStrDataType());
	}
	
	
}
