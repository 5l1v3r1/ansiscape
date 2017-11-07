package net.andreinc.asciiscape;

import net.andreinc.asciiscape.parser.ParserUtils;
import org.junit.Assert;
import org.junit.Test;

public class ParserUtilsTest {

    @Test
    public void getUntilSpaceOrEndTest1() {
        String test = ParserUtils.getUntilSpaceOrEnd("Ana are mere", 0);
        Assert.assertTrue(test.equals("Ana"));
    }
}
