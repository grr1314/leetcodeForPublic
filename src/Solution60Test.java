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
public class Solution60Test {
    Solution60 solution60;
    int k;
    int n;
    String mExpectedResult;

    public Solution60Test(int n, int k, String mExpectedResult) {
        this.k = k;
        this.n = n;
        this.mExpectedResult = mExpectedResult;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> initData() {
        return Arrays.asList(
                new Object[][]{
//                        {3, 1, "123"},
//                        {3, 2, "123"},
//                        {3, 3, "123"},
                        {1, 1, "123"}
                }
        );
    }

    @Before
    public void init() {
        solution60 = new Solution60();

    }

    @Test
    public void test60() {
        String result = solution60.getPermutation(n, k);
        assertThat(result, is(equalTo(mExpectedResult)));
    }
}
