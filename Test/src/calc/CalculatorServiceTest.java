package calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {
    
    private Calculator calculator;
    private CalculatorService service;
    
    @BeforeEach
    public void setup() {
        //テスト前にCalculatorとcalculatorServiceをセットアップ
        calculator = new Calculator();
        service = new CalculatorService(calculator);
        
    }

    @Test
    void testCalculatorService() {
        //CalculatorのaddメソッドとCalculatorServiceのaddAndReportメソッドが正しく連携するかテスト
        assertEquals("Result:5", service.addAndReport(2, 3));
        
    }
    
    @Test
    public void testSubtractAndReport() {
        //CalculatorのsubtractメソッドとCalculatorServiceのsubtractAndReportメソッドが正しく連携するかテスト
        assertEquals("Result:1",service.subtractAndReport(3, 2));
    }

}
