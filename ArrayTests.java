import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input2 = {1, 2, 3};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{3, 2, 1}, input2);
	}


  @Test
  public void testReversed() {
    int[] input2 = {1, 2, 3};
    assertArrayEquals(new int[]{3, 2,1}, ArrayExamples.reversed(input2));
  }
  
}
