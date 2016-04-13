import org.junit.*;
import static org.junit.Assert.*;
import java.io.*;

/**
*Author:
*  Benjamin Polstra
*
*Note: the following methods cannot be tested
*  due to their accessibility being private:
*  -resolveConnectors
*  -makeArrays
*  -isTableDup
*
*Professor has explicitly said that parseSaveFile method
*  should not be tested, so it is ignored
*
*Finally, I'm not sure how I can test the openFile method,
*   so let me know what I should do. Other than that, 
*   let me know you have any other concern regarding to
*   this file. Thanks!
*/

public class TestEdgeConvertFileParser
{
   EdgeConvertFileParser ecfp;
   File file;
   
   @Before
   public void setUp()throws Exception
   {
      file = new File("Courses.edg");
      ecfp = new EdgeConvertFileParser(file);   
   }
   
   @Test
   public void testParseEdgeFile()
   {
      try{
         ecfp.parseEdgeFile();
         assertTrue("The parseEdgeFile method is successful", true);
      }
      catch(IOException ioe)
      {
         fail("The parseEdgeFile method has failed. IOException is thrown");
      }
   }
   
   @Test
   public void testGetEdgeTables()
   {
      assertNotNull("The array of EdgeTable is not null", ecfp.getEdgeTables());
   }
   
   @Test
   public void testGetEdgeFields()
   {
      assertNotNull("The array of EdgeField is not null", ecfp.getEdgeFields());
   }
}