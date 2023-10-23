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
  
  @Test
  public void testAverageEmpty() {
    double[] input = {};
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input), 0.001);
  }

  @Test
  public void testAverageLength1() {
    double[] input = {1};
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input), 0.001);
  }

  @Test
  public void testAverageWithoutLowest1() {
    double[] input = {1, 2};
    assertEquals(2.0, ArrayExamples.averageWithoutLowest(input), 0.001);
  }

  @Test
  public void testAverageWithoutLowest2() {
    double[] input = {2, 2, 4};
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input), 0.001);
  }
}
