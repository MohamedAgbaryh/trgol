package ex1_qa_2024_3.ex1_qa_2024_3;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	Question4 Tester=new Question4();

    /**
     * Rigorous Test :-)
     */
    @Test
 
    public void Test_1() {
    	String Expected_Result="A";
    	int a=28,b=14;
    	String mod="regular";
    	String actual_result=Tester.Compare(a,b,mod);
    	assertEquals(Expected_Result, actual_result);
    	
    }
    @Test
    public void Test_2() {
    	String Expected_Result="A";
    	int a=28,b=-10;
    	String mod="regular";
    	String actual_result=Tester.Compare(a,b,mod);
    	assertEquals(Expected_Result, actual_result);
    	
    }
    /*
    public void Test_3() {
    	String Expected_Result="error";
    	int a=28, b=@ ;
    	String mod="regular";
    	String actual_result=Tester.Compare(a,b,mod);
    	assertEquals(Expected_Result, actual_result);
    	
    }
    **/
    @Test
    public void Test_4() {
    	String Expected_Result="B";
    	int a=18, b=10 ;
    	String mod="negative";
    	String actual_result=Tester.Compare(a,b,mod);
    	assertEquals(Expected_Result, actual_result);
    	
    }
    
    @Test
    public void Test_5() {
    	String Expected_Result="B";
    	int a=50, b=-25 ;
    	String mod="negative";
    	String actual_result=Tester.Compare(a,b,mod);
    	assertEquals(Expected_Result, actual_result);
    	
    }
   /* public void Test_6() {
    	String Expected_Result="error";
    	int a=28, b=# ;
    	String mod="negative";
    	String actual_result=Tester.Compare(a,b,mod);
    	assertEquals(Expected_Result, actual_result);
    
    }
     **/
    @Test
    public void Test_7() {
    	String Expected_Result="A";
    	int a=11, b=12 ;
    	String mod="reciprocals";
    	String actual_result=Tester.Compare(a,b,mod);
    	assertEquals(Expected_Result, actual_result);
    	
    }
    @Test
    public void Test_8() {
    	String Expected_Result="A";
    	int a=7, b=-5 ;
    	String mod="reciprocals";
    	String actual_result=Tester.Compare(a,b,mod);
    	assertEquals(Expected_Result, actual_result);
    	
    }
    /*
    public void Test_9() {
    	String Expected_Result="error";
    	int a=55, b=@ ;
    	String mod="reciprocals";
    	String actual_result=Tester.Compare(a,b,mod);
    	assertEquals(Expected_Result, actual_result);
    	

    }
    **/
}
