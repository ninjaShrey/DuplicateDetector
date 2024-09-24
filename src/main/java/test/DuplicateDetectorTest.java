package test;
import static org.junit.Assert.assertEquals;
import java.util.*;
import org.junit.Test;
public class DuplicateDetectorTest {
	
	
	@Test
	public void testFindDuplicates() {
		DuplicateDetector<String> detector=new DuplicateDetector<>();
		
		List<String> input = Arrays.asList("b", "a", "c", "c", "e", "a", "c", "d", "c", "d");
        List<String> expected = Arrays.asList("a", "c", "d");
        assertEquals(expected, detector.getDuplicates(input));
        
        List<String> input2 = Arrays.asList("a", "b", "c", "d");
        List<String> expected2 = new ArrayList<>();
        assertEquals(expected2, detector.getDuplicates(input2));
        
        List<String> input3 = Arrays.asList("a", "a", "a", "a");
        List<String> expected3 = Arrays.asList("a");
        assertEquals(expected3, detector.getDuplicates(input3));
        
        List<String> input4 = new ArrayList<>();
        List<String> expected4 = new ArrayList<>();
        assertEquals(expected4, detector.getDuplicates(input4));
	}


}
