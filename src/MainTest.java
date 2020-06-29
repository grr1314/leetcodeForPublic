import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class MainTest {
    Solution58 solution58;
    String string;
    int mExpectedResult;

    public MainTest(String string, int mExpectedResult) {
        this.string = string;
        this.mExpectedResult = mExpectedResult;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> initData() {
        return Arrays.asList(
                new Object[][]{
                        {"Hello World", 5},
                        {"Hello World!!!", 8},
                        {"Hello Worlds", 6},
                        {"a ",1}
                }
        );
    }

    @Before
    public void init() {
        solution58 = new Solution58();

    }

    @Test
    public void test58() {
        int result = solution58.lengthOfLastWord(string);
        assertThat(result, is(equalTo(mExpectedResult)));
    }
}
