import org.junit.jupiter.api.Test;
import utility.ArrayUtility;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayUtilityTest {

    // kiểm tra kết quả thực hiện chỉnh xác (Normal)
    @Test
    void sumArrayNormalTest(){
        assertEquals(500500,ArrayUtility.sumArray());
    }

    // kiểm tra giá trị biên
    @Test
    void sumArrayBoundaryUpperTest(){
        long expected = 1000 * (1000+1)/2;
        assertEquals(500500,ArrayUtility.sumArray());
    }

    //kiểm tra tính đúng đắn của phương thức
    @Test
    void sumArrayMatchesFormulaTest(){
        int n = 1000;
        long expected = (long) n * (n + 1) / 2 ;
        assertEquals(expected,ArrayUtility.sumArray());
    }

    // kiểm tra tính ổn định của hàm
    @Test
    void sumArrayConsistentTest(){
        long result1 = ArrayUtility.sumArray();
        long result2 = ArrayUtility.sumArray();
        assertEquals(result1,result2);
    }

    // kiểm tra tổng không bị tràn
    @Test
    void sumArrayDonesNôtverflowTest(){
        long result =  ArrayUtility.sumArray();
        assertTrue(result < Long.MAX_VALUE, "Tông rvutojw quá phạm vi của kiểu long");
    }

}
