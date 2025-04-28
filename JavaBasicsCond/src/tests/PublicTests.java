package tests;

import static org.junit.Assert.*;
import org.junit.Test;

import programs.*;

import java.io.ByteArrayOutputStream;

public class PublicTests {
	private static String INPUT_FILE_NAME_EXT = "Input.txt";
	private static String EXPECTED_RESULTS_EXT = "ExpectedResults.txt";
	
	@Test
	public void pubArea1() throws Exception, Throwable {
		String testName = "pubArea1", expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		
		/* Redirecting standard input and output */
		TestingSupport.redirectStandardInputToFile(testName + INPUT_FILE_NAME_EXT);
		ByteArrayOutputStream newOutput = TestingSupport.redirectStandardOutputToByteArrayStream();
		
		/* Running program */
		Area.main(null);
		
		/* Restoring standard input and output */
		TestingSupport.restoreStandardIO();
		
		String results = newOutput.toString();
		TestingSupport.generateExpectedResultsFile(results, expectedResultsFileName);
		
		/* Verifying whether correct results generated */
		assertTrue(TestingSupport.correctResults(expectedResultsFileName, results));
	}
	
	@Test
	public void pubDivisible1() throws Exception, Throwable {
		String testName = "pubDivisible1", expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		
		/* Redirecting standard input and output */
		TestingSupport.redirectStandardInputToFile(testName + INPUT_FILE_NAME_EXT);
		ByteArrayOutputStream newOutput = TestingSupport.redirectStandardOutputToByteArrayStream();
		
		/* Running program */
		Divisible.main(null);
		
		/* Restoring standard input and output */
		TestingSupport.restoreStandardIO();
		
		String results = newOutput.toString();
		TestingSupport.generateExpectedResultsFile(results, expectedResultsFileName);
		
		/* Verifying whether correct results generated */
		assertTrue(TestingSupport.correctResults(expectedResultsFileName, results));
	}
	
	@Test
	public void pubColorGenerator1() throws Exception, Throwable {
		String testName = "pubColorGenerator1", expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		
		/* Redirecting standard input and output */
		TestingSupport.redirectStandardInputToFile(testName + INPUT_FILE_NAME_EXT);
		ByteArrayOutputStream newOutput = TestingSupport.redirectStandardOutputToByteArrayStream();
		
		/* Running program */
		ColorGenerator.main(null);
		
		/* Restoring standard input and output */
		TestingSupport.restoreStandardIO();
		
		String results = newOutput.toString();
		TestingSupport.generateExpectedResultsFile(results, expectedResultsFileName);
		
		/* Verifying whether correct results generated */
		assertTrue(TestingSupport.correctResults(expectedResultsFileName, results));
	}
	
	@Test
	public void pubColorGenerator2() throws Exception, Throwable {
		String testName = "pubColorGenerator2", expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		
		/* Redirecting standard input and output */
		TestingSupport.redirectStandardInputToFile(testName + INPUT_FILE_NAME_EXT);
		ByteArrayOutputStream newOutput = TestingSupport.redirectStandardOutputToByteArrayStream();
		
		/* Running program */
		ColorGenerator.main(null);
		
		/* Restoring standard input and output */
		TestingSupport.restoreStandardIO();
		
		String results = newOutput.toString();
		TestingSupport.generateExpectedResultsFile(results, expectedResultsFileName);
		
		/* Verifying whether correct results generated */
		assertTrue(TestingSupport.correctResults(expectedResultsFileName, results));
	}
}