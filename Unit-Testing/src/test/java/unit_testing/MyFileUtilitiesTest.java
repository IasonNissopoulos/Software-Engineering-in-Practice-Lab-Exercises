package unit_testing;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

//import org.junit.Before;
//import java.io.InputStream;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;
//import org.junit.runners.Parameterized.Parameter;


public class MyFileUtilitiesTest {

	/*@RunWith(Parameterized.class)
	public class MyFileUtilitiesTest_FilePath_Parameterized {
		
		@Parameter(value = "src/test/resources/grades.txt")
		public String filepath;
	}*/
	
	
	MyFileUtilities mfu = new MyFileUtilities();
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	@Test
	public void test_readFile_RuleException() throws FileNotFoundException {
		thrown.expect(IllegalArgumentException.class);
		mfu.readFile("src/test/resources/not_ints.txt");
	}
	@Test
	public void testReadFile() throws FileNotFoundException {
		//ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		//InputStream file = classloader.getResourceAsStream("grades.txt");
		//ClassLoader classLoader = getClass().getClassLoader();
		//File file = new File(classLoader.getResource("somefile").getFile());
		//String filepath = this.getClass().getResource("/grades.txt").toURI();
		//System.out.println(file.getAbsolutePath());
		System.out.println("src/test/resources/grades.txt");
		int[] methodOutput = mfu.readFile("src/test/resources/grades.txt");
		System.out.println("src/test/resources/grades.txt");
		int[] expectedArray = {3,5,7,9,1,0,2,4,6,8};
		assertArrayEquals(expectedArray, methodOutput); 
		
	}
}