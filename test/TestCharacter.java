import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestCharacter {

    @Test
    public void testNull() {
        Character expected = null;
        Character actual = CountCharacter.findFirstMostFrequentCharIn(null);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEmpty() {
        Character expected = null;
        Character actual = CountCharacter.findFirstMostFrequentCharIn("");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testNotEmpty() {
        List<String> inputs = new ArrayList<>();
        List<Character> expectedOutputs = new ArrayList<>();

        inputs.add("aaabbbccc");
        expectedOutputs.add('a');

        inputs.add("aaaaabbccccc");
        expectedOutputs.add('a');

        inputs.add("aaaabbc");
        expectedOutputs.add('a');

        inputs.add("abbbb");
        expectedOutputs.add('b');

        inputs.add("abbbc");
        expectedOutputs.add('b');

        inputs.add("123aaa");
        expectedOutputs.add('a');

        inputs.add("abc");
        expectedOutputs.add('a');

        inputs.add("aaaaa");
        expectedOutputs.add('a');

        inputs.add("aaAAAaaa");
        expectedOutputs.add('a');

        for (int i = 0; i < inputs.size(); i++) {
            Character expected = expectedOutputs.get(i);
            Character actual = CountCharacter.findFirstMostFrequentCharIn(inputs.get(i));
            Assert.assertEquals(expected, actual);
        }

    }
}
