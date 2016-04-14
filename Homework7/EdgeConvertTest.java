import org.junit.*;
import static org.junit.Assert.*;
import java.io.*;

/**
*Author:
*  Benjamin Polstra
*/

public class EdgeConvertTest{
   EdgeConvertTest ecfp;
   File file;
   String edgeFileName
   
   public EdgeConvertTest(String edgeFileName){
      this.edgeFileName = edgeFileName;
      setUp();
      testParseEdgeFile();
      testGetEdgeTables();
      testGetEdgeFields();
   }
   
   @Before
   public void setUp()throws Exception {
      //file = new File("Courses.edg");
      file = new File(edgeFileName);
      ecfp = new EdgeConvertFileParser(file);   
   }
   
   @Test
   public void testParseEdgeFile(){
      try{
         ecfp.parseEdgeFile();
         assertTrue("The parseEdgeFile method is successful", true);
      }
      catch(IOException ioe){
         fail("The parseEdgeFile method has failed. IOException is thrown");
      }
   }
   
   @Test
   public void testGetEdgeTables(){
      assertNotNull("The array of EdgeTable is not null", ecfp.getEdgeTables());
   }
   
   @Test
   public void testGetEdgeFields(){
      assertNotNull("The array of EdgeField is not null", ecfp.getEdgeFields());
   }
}
