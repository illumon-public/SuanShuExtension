/*
 * Copyright (c) Numerical Method Inc.
 * http://www.numericalmethod.com/
 * 
 * THIS SOFTWARE IS LICENSED, NOT SOLD.
 * 
 * YOU MAY USE THIS SOFTWARE ONLY AS DESCRIBED IN THE LICENSE.
 * IF YOU ARE NOT AWARE OF AND/OR DO NOT AGREE TO THE TERMS OF THE LICENSE,
 * DO NOT USE THIS SOFTWARE.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITH NO WARRANTY WHATSOEVER,
 * EITHER EXPRESS OR IMPLIED, INCLUDING, WITHOUT LIMITATION,
 * ANY WARRANTIES OF ACCURACY, ACCESSIBILITY, COMPLETENESS,
 * FITNESS FOR A PARTICULAR PURPOSE, MERCHANTABILITY, NON-INFRINGEMENT,
 * TITLE AND USEFULNESS.
 * 
 * IN NO EVENT AND UNDER NO LEGAL THEORY,
 * WHETHER IN ACTION, CONTRACT, NEGLIGENCE, TORT, OR OTHERWISE,
 * SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR
 * ANY CLAIMS, DAMAGES OR OTHER LIABILITIES,
 * ARISING AS A RESULT OF USING OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.numericalmethod.suanshu.stats.distribution.univariate;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Haksun Li
 */
public class WeibullDistributionTest {

    /**
     * Test of class WeibullDistribution.
     * Same as Exponential distribution for param (1, 1).
     */
    @Test
    public void test_Weibull_0010() {
        WeibullDistribution dist = new WeibullDistribution(1, 1);

        assertEquals(1d, dist.mean(), 0);
        assertEquals(1d, dist.variance(), 0);
        assertEquals(2, dist.skew(), 1e-14);
        assertEquals(6, dist.kurtosis(), 1e-14);
        assertEquals(1d, dist.entropy(), 0);

        assertEquals(0, dist.cdf(0), 0);//from R
        assertEquals(9.99995000016667e-06, dist.cdf(0.00001), 1e-17);//from R
        assertEquals(9.99950001666625e-05, dist.cdf(0.0001), 1e-16);//from R
        assertEquals(0.0009995001666250082, dist.cdf(0.001), 1e-15);//from R
        assertEquals(0.00995016625083195, dist.cdf(0.01), 1e-15);//from R
        assertEquals(0.0951625819640404, dist.cdf(0.1), 1e-15);//from R
        assertEquals(0.632120558828558, dist.cdf(1), 1e-15);//from R
        assertEquals(0.66712891630192, dist.cdf(1.1), 1e-15);//from R
        assertEquals(0.698805788087798, dist.cdf(1.2), 1e-15);//from R
        assertEquals(0.727468206965987, dist.cdf(1.3), 1e-15);//from R
        assertEquals(0.753403036058394, dist.cdf(1.4), 1e-15);//from R
        assertEquals(0.77686983985157, dist.cdf(1.5), 1e-15);//from R
        assertEquals(0.817316475947265, dist.cdf(1.7), 1e-15);//from R
        assertEquals(0.850431380777365, dist.cdf(1.9), 1e-15);//from R
        assertEquals(0.864664716763387, dist.cdf(2.0), 1e-15);//from R
        assertEquals(0.917915001376101, dist.cdf(2.5), 1e-15);//from R
        assertEquals(0.950212931632136, dist.cdf(3.0), 1e-15);//from R
        assertEquals(0.999954600070238, dist.cdf(10), 1e-15);//from R
        assertEquals(0.999999495652337, dist.cdf(14.5), 1e-15);//from R
        assertEquals(1, dist.cdf(100), 0);//from R
        assertEquals(1, dist.cdf(1000), 0);//from R
        assertEquals(1, dist.cdf(9999), 0);//from R
        assertEquals(1, dist.cdf(99999999), 0);//from R

        assertEquals(0, dist.density(-3), 0);//from R
        assertEquals(0, dist.density(-2.5), 0);//from R
        assertEquals(0, dist.density(-2), 0);//from R
        assertEquals(0, dist.density(-1.5), 0);//from R
        assertEquals(0, dist.density(-1), 0);//from R
        assertEquals(0, dist.density(-0.9), 0);//from R
        assertEquals(0, dist.density(-0.8), 0);//from R
        assertEquals(0, dist.density(-0.5), 0);//from R
        assertEquals(0, dist.density(-0.1), 0);//from R
        assertEquals(0, dist.density(-0.05), 0);//from R
        assertEquals(1, dist.density(0d), 0);//from R
        assertEquals(0.951229424500714, dist.density(0.05), 1e-15);//from R
        assertEquals(0.90483741803596, dist.density(0.1), 1e-15);//from R
        assertEquals(0.818730753077982, dist.density(0.2), 1e-15);//from R
        assertEquals(0.740818220681718, dist.density(0.3), 1e-15);//from R
        assertEquals(0.670320046035639, dist.density(0.4), 1e-15);//from R
        assertEquals(0.606530659712633, dist.density(0.5), 1e-15);//from R
        assertEquals(0.548811636094026, dist.density(0.6), 1e-15);//from R
        assertEquals(0.496585303791410, dist.density(0.7), 1e-15);//from R
        assertEquals(0.449328964117222, dist.density(0.8), 1e-15);//from R
        assertEquals(0.406569659740599, dist.density(0.9), 1e-15);//from R
        assertEquals(0.367879441171442, dist.density(1), 1e-15);//from R
        assertEquals(0.22313016014843, dist.density(1.5), 1e-15);//from R
        assertEquals(0.135335283236613, dist.density(2), 1e-15);//from R
        assertEquals(0.0820849986238988, dist.density(2.5), 1e-15);//from R
        assertEquals(0.049787068367864, dist.density(3), 1e-15);//from R
    }

    /**
     * Test of class WeibullDistribution.
     * Same as Rayleigth distribution by scaling x with sqrt(2).
     */
    @Test
    public void test_Weibull_0020() {
        WeibullDistribution dist = new WeibullDistribution(2, 2);

        assertEquals(1.772453850905515, dist.mean(), 1e-15);
        assertEquals(0.8584073464102104, dist.variance(), 1e-15);
        assertEquals(0.6311106578189307, dist.skew(), 1e-12);
        assertEquals(0.24508930068759494, dist.kurtosis(), 1e-12);
        assertEquals(1.288607832450766, dist.entropy(), 1e-15);

        assertEquals(0, dist.cdf(0), 0);//from R
        assertEquals(2.49999999996875e-11, dist.cdf(0.00001), 1e-11);//from R
        assertEquals(2.499999996875e-09, dist.cdf(0.0001), 1e-16);//from R
        assertEquals(2.499999687500026e-07, dist.cdf(0.001), 1e-13);//from R
        assertEquals(2.499968750260415e-05, dist.cdf(0.01), 1e-13);//from R
        assertEquals(0.002496877602539876, dist.cdf(0.1), 1e-15);//from R
        assertEquals(0.221199216928595, dist.cdf(1), 1e-15);//from R
        assertEquals(0.2610315117410558, dist.cdf(1.1), 1e-16);//from R
        assertEquals(0.302323673928969, dist.cdf(1.2), 1e-16);//from R
        assertEquals(0.3445937456731595, dist.cdf(1.3), 1e-17);//from R
        assertEquals(0.387373605815584, dist.cdf(1.4), 1e-14);//from R
        assertEquals(0.430217175269077, dist.cdf(1.5), 1e-14);//from R
        assertEquals(0.5144631048459205, dist.cdf(1.7), 1e-15);//from R
        assertEquals(0.5944454949366794, dist.cdf(1.9), 1e-15);//from R
        assertEquals(0.632120558828558, dist.cdf(2.0), 1e-13);//from R
        assertEquals(0.790388612848902, dist.cdf(2.5), 1e-13);//from R
        assertEquals(0.894600775438136, dist.cdf(3.0), 1e-13);//from R
        assertEquals(0.999999999986112, dist.cdf(10), 1e-13);//from R
        assertEquals(1, dist.cdf(14.5), 0);//from R
        assertEquals(1, dist.cdf(100), 0);//from R
        assertEquals(1, dist.cdf(1000), 0);//from R
        assertEquals(1, dist.cdf(9999), 0);//from R
        assertEquals(1, dist.cdf(99999999), 0);//from R

        assertEquals(0, dist.density(-3), 0);//from R
        assertEquals(0, dist.density(-2.5), 0);//from R
        assertEquals(0, dist.density(-2), 0);//from R
        assertEquals(0, dist.density(-1.5), 0);//from R
        assertEquals(0, dist.density(-1), 0);//from R
        assertEquals(0, dist.density(-0.9), 0);//from R
        assertEquals(0, dist.density(-0.8), 0);//from R
        assertEquals(0, dist.density(-0.5), 0);//from R
        assertEquals(0, dist.density(-0.1), 0);//from R
        assertEquals(0, dist.density(-0.05), 0);//from R
        assertEquals(0, dist.density(0d), 0);//from R
        assertEquals(0.0249843798817954, dist.density(0.05), 1e-15);//from R
        assertEquals(0.049875156119873, dist.density(0.1), 1e-14);//from R
        assertEquals(0.09900498337491681, dist.density(0.2), 1e-16);//from R
        assertEquals(0.1466626855790004, dist.density(0.3), 1e-15);//from R
        assertEquals(0.1921578878304646, dist.density(0.4), 1e-15);//from R
        assertEquals(0.234853265703369, dist.density(0.5), 1e-15);//from R
        assertEquals(0.2741793555813685, dist.density(0.6), 1e-16);//from R
        assertEquals(0.3096470667302192, dist.density(0.7), 1e-16);//from R
        assertEquals(0.3408575155864845, dist.density(0.8), 1e-16);//from R
        assertEquals(0.36750891716915, dist.density(0.9), 1e-14);//from R
        assertEquals(0.3894003915357024, dist.density(1), 1e-16);//from R
        assertEquals(0.427337118548192, dist.density(1.5), 1e-15);//from R
        assertEquals(0.3678794411714423, dist.density(2), 1e-16);//from R
        assertEquals(0.2620142339388723, dist.density(2.5), 1e-16);//from R
        assertEquals(0.1580988368427965, dist.density(3), 1e-16);//from R
    }

    /**
     * Test of class WeibullDistribution.
     */
//    @Test
    public void testWeibull_0020() {
        WeibullDistribution dist = new WeibullDistribution(3.5, 2.5);

        double x, y;
        for (double u = 0.000001; u < 1d; u += 0.000001) {
            x = dist.quantile(u);
            y = dist.cdf(x);
            assertEquals(u, y, 1e-15);
        }
    }

    /**
     * Test of class WeibullDistribution.
     */
    @Test
    public void test_Weibull_0030() {
        WeibullDistribution dist = new WeibullDistribution(1, 0.5);

        assertEquals(2, dist.mean(), 1e-16);
        assertEquals(20, dist.variance(), 1e-14);
        assertEquals(6.618761213399377, dist.skew(), 1e-14);
        assertEquals(84.72, dist.kurtosis(), 1e-13);
        assertEquals(1.1159315156584124, dist.entropy(), 1e-14);
    }
}
