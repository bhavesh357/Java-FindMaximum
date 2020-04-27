package com.bl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FindMaximumTest {
    static FindMaximum findMaximum;

    @Before
    public void Initialize() {
        findMaximum = new FindMaximum();
    }

    @Test
    public void whenGivenThreeInteger_ShouldReturnMaximum() {
        Integer max=findMaximum.getMaximum(new Integer[]{2,4,6});
        Assert.assertSame(6,max);
    }

    @Test
    public void whenGivenThreeFloat_ShouldReturnMaximum() {
        Float max = findMaximum.getMaximum(new Float[]{1.2f,2.3f,0.6f});
        Assert.assertEquals(2.3f,max,0.0002);
    }

}
