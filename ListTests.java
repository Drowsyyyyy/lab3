import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

 class JustforTest implements StringChecker {
    @Override
    public boolean checkString(String s) {
        return s.contains("a");
    }
}
public class ListTests {
    @Test
    public void filterTest() {
        List<String> input = new ArrayList<>();
        List<String> result = new ArrayList<>();
        StringChecker sc = new JustforTest();
        input.add("apple");
        input.add("cat");
        input.add("choco");
        result.add("apple");
        result.add("cat");
        List<String> actual = ListExamples.filter(input, sc);
        String[] actual2 = new String[actual.size()];
        String[] result2 = new String[result.size()];
        actual.toArray(actual2);
        result.toArray(result2);
        assertArrayEquals(result2, actual2);
    }

    @Test
    public void mergeTest() {
        List<String> input1 = new ArrayList<>();
        List<String> input2 = new ArrayList<>();
        input1.add("acorn");
        input1.add("apple");
        input1.add("asap");
        input2.add("cat");
        input2.add("dad");
        input2.add("elephant");
        List<String> actual = ListExamples.merge(input1, input2);
        String[] 
    }
}