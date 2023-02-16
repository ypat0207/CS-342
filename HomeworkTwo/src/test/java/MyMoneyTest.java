import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MyMoneyTest {
    static MyMoney cashValues;
    static MyMoney interestValues;
    static MyMoney cashAndInterest;
    static MyMoney thisandThat;
    @BeforeAll
    static void setup() {
        cashValues = new MyMoney("values.txt", 8, 1);
        interestValues = new MyMoney("values2.txt", 8, 1);
        cashAndInterest = new MyMoney("values.txt","values2.txt",8, 8);
    }
    @Test
    void myMoneyFirstConstructorTestOne() {
        double[] cashArray = {4000, 5500, 15000, 18000, 24000, 9000, 11000, 12000};
        assertArrayEquals(cashArray, cashValues.getCashValues(), "cash arrays are not equal in constructor one");
        assertEquals(cashArray.length, cashValues.getCashValues().length, "cash arrays length is not equal in constructor one");
        assertNotNull(cashValues.getCashValues(), "array length from getInterestValues constructor should be null");
    }
	@Test
	void myMoneyFirstConstructorTestTwo() {
        double[] interestArray = {0.055, 0.075, 0.045, 0.09, 0.1, 0.065, 0.035, 0.025};
        assertArrayEquals(interestArray, interestValues.getInterestValues(), "interest arrays are not equal in constructor one");
        assertEquals(interestArray.length, interestValues.getInterestValues().length, "interest arrays length is not equal in constructor one");
        assertNotNull(cashValues.getInterestValues()," array length from getcashValues constructor should be null");
    }
	@Test
    void myMoneySecondConstructorTestOne() {
    	double[] cashArray = {4000, 5500, 15000, 18000, 24000, 9000, 11000, 12000};
    	 assertArrayEquals(cashArray, cashAndInterest.getCashValues(), "cashArray from bothValues constructor is not equal");
         assertEquals(cashArray.length, cashAndInterest.getCashValues().length,"cashArray length from bothValues constructor is not equal");
         assertNotNull(cashAndInterest.getCashValues(), "cash values in the array are empty, line 49");
    }
    @Test
    void myMoneySecondConstructorTestTwo() {
        double[] interestArray = {.055, .075, .045, .09, .10, .065, .035, .025};
        assertNotNull(cashAndInterest.getInterestValues(), "interest values in the array are empty, line 50");
        assertArrayEquals(interestArray, cashAndInterest.getInterestValues(), "interestArray from bothValues constructor is not equal");
        assertEquals(interestArray.length, cashAndInterest.getInterestValues().length,"interestArray length from bothValues constructor is not equal");   
    }
    @Test
    void lumpSum_ConstantRateTestOne() {
        assertEquals(251858, Math.round(cashAndInterest.lumpSum_ConstantRate(4567, 1.23, 5)),"return value for function lumpSum_ConstantRateTestOne is not correct, line 58");
    }
    @Test
    void lumpSum_ConstantRateTestTwo() {
        assertEquals(224579, Math.round(cashAndInterest.lumpSum_ConstantRate(6745,0.65,7)),"return value for function lumpSum_ConstantRateTestTwo is not correct, line 62");
    }
    @Test
    void lumpSum_VariableRateTestOne() {
        assertEquals(8919, Math.round(cashAndInterest.lumpSum_VariableRate(5555)),"return value for function lumpSum_VariableRateTestOne is not correct, line 66");
    }
    @Test
    void lumpSum_VariableRateTestTwo() {
        assertEquals(19866, Math.round(cashAndInterest.lumpSum_VariableRate(12374)), "return value for function lumpSum_VariableRateTestTwo is not correct, line 70");
    }
    @Test
    void compoundSavings_sameContributionTestOne() {
        assertEquals(43882, Math.round(cashAndInterest.compoundSavings_sameContribution(8788, 0.15, 4)), "return value for function compoundSavings_sameContributionTestOne is not correct, line 74");
    }
    @Test
    void compoundSavings_sameContributionTestTwo() {
        assertEquals(14240, Math.round(cashAndInterest.compoundSavings_sameContribution(6846,0.08,2)), "return value for functuon compoundSavings_sameContributionTestTwo is not correct, line 78");
    }
    @Test
    void compoundSavings_variableContributionTestOne() {
        assertEquals(6422898, Math.round(cashAndInterest.compoundSavings_variableContribution(1.5)), "return value for function compoundSavings_variabelContributionTestOne is not correct, line 82");
    }
    @Test
    void compoundSavings_variableContributionTestTwo() {
        assertEquals(1268159, Math.round(cashAndInterest.compoundSavings_variableContribution(0.85)), "return value for function compoundSavings_variableContributionTestTwo is not correct, line 86");
    }
     static int iterCash = 0;
    @ParameterizedTest
    @ValueSource(doubles = {4000, 5500, 15000, 18000, 24000, 9000, 11000, 12000})
    void getCashValuesTestOne(double tempValue) {
        double[] cashValuesTestOne = cashValues.getCashValues();
        assertEquals(tempValue, cashValuesTestOne[iterCash]);
        iterCash++;
    }
 
    static int iterInterest = 0;
    @ParameterizedTest
    @ValueSource(doubles = {.055, .075, .045, .09, .10, .065, .035, .025})
    void getCashValuesTestTwo(double tempValues2) { 
        double[] interestValuesTestOne = cashAndInterest.getInterestValues();
        assertEquals(tempValues2, interestValuesTestOne[iterInterest]);
        iterInterest++;
    }
    @Test
    void getInterestValuesTestOne() {
        double[] interestArray = {.055, .075, .045, .09, .10, .065, .035, .025};
        assertArrayEquals(interestArray, cashAndInterest.getInterestValues(), "values in the array interestArray aren't matching with the interest values in text file, line 112");
    }
    @Test
    void getInterestValuesTestTwo() {
        double[] interestArray = {.055, .075, .045, .09, .10, .065, .035, .025};
        assertEquals(interestArray.length, cashAndInterest.getInterestValues().length, "values in the array interestArray aren't matching with the interest values in text file, line 117");
    }
}
