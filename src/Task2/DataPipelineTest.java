package Task2;



import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.junit.Test;	
import static org.junit.Assert.*;
	


public class DataPipelineTest {

	@Test
	public void testValidData() throws IOException {
	    DataPipelineTester tester = new DataPipelineTester();
	    String validFilePath = "src/test/valid_data.csv";
	    assertTrue(tester.validateData(validFilePath), "The data should be valid.");
	}


    @Test
    public void testInvalidData() throws IOException {
        DataPipelineTester tester = new DataPipelineTester();
        String invalidFilePath = "src/test/invalid_data.csv";
        assertFalse(tester.validateData(invalidFilePath), "The data should be invalid.");
    }

    @Test
    public void testMissingFile() {
        DataPipelineTester tester = new DataPipelineTester();
        String missingFilePath = "src/test/missing.csv";
        assertThrows(IOException.class, () -> {
            tester.validateData(missingFilePath);
        }, "Should throw IOException for missing file.");
    }
    
    @Test
    public void testEmptyFile() throws IOException {
        DataPipelineTester tester = new DataPipelineTester();
        String emptyFilePath = "src/test/empty_data.csv";
        assertFalse(tester.validateData(emptyFilePath), "An empty file should be invalid.");
    }
    
    @Test
    public void testMissingHeader() throws IOException {
        DataPipelineTester tester = new DataPipelineTester();
        String noHeaderFilePath = "src/test/no_header_data.csv";
        assertFalse(tester.validateData(noHeaderFilePath), "A file without a header should be invalid.");
    }
    
    


}
