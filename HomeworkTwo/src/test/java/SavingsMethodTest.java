import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SavingsMethodTest {
    static MyMoney cashValues;
    static MyMoney interestValues;
    static MyMoney cashAndInterestValues;
    @BeforeAll
    static void setup() {
        cashValues = new MyMoney("values.txt", 8, 1);
        interestValues = new MyMoney("values2.txt", 8, 1);
        cashAndInterestValues = new MyMoney("values.txt", "values2.txt", 8, 8);
    }
	@Test
    void futureValueLumpSumTestOne() {
        assertEquals(42160,Math.round(SavingsFormulas.futureValueLumpSum(3333, 1.33, 3)), "return value for futureValueLumpSumTestOne is not correct, line 19");
    }
    @Test
    void futureValueLumpSumTestTwo() {
        assertEquals(489180,Math.round(SavingsFormulas.futureValueLumpSum(39999, .65, 5)), "return value for futureValueLumpSumTestTwo is not correct, line 23");
    }
    @Test
    void futureValueLS_VariableInterestTestOne() {
      assertEquals(9631, Math.round(SavingsFormulas.futureValueLS_VariableInterest(5999, cashAndInterestValues.getInterestValues())), "return value for futureValueLS_VariableInterestTestOne is not correct, line 28");
    }

    @Test
    void futureValueLS_VariableInterestTestTwo() {
      assertEquals(11237, Math.round(SavingsFormulas.futureValueLS_VariableInterest(6999, cashAndInterestValues.getInterestValues())), "return value for futureValueLS_VariableInterestTestTwo is not correct, line 33");
    }
    @Test
    void compoundSavingsConstantTestOne() {
        assertEquals(17198, Math.round(SavingsFormulas.compoundSavingsConstant(7999,0.15, 2)), "return value for compoundSavingsConstantTestOne is not correct, line 38");
    }

    @Test
    void compoundSavingsConstantTestTwo() {
        assertEquals(126264, Math.round(SavingsFormulas.compoundSavingsConstant(8745,0.35, 6)), "return value for compoundSavingsConstantTestTwo is not correct, line 43");
    }
    @Test
    void compoundSavingsVariableTestOne() {
      assertEquals(203319, Math.round(SavingsFormulas.compoundSavingsVariable(cashValues.getCashValues(), 0.23)), "return value for compoundSavingsVariableTestOne is not correct, line 48");
    }

    @Test
    void compoundSavingsVariableTestTwo() {
        assertEquals(148398, Math.round(SavingsFormulas.compoundSavingsVariable(cashAndInterestValues.getCashValues(), 0.13)), "return value for compoundSavingsVariableTestTwo is not correct, line 53");
    }
    
    
    
}
