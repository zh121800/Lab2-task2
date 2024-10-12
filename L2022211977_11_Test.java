import org.junit.Test;
import org.junit.Before;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class L2022211977_11_Test {  // 123456为学号，15为所分配题号 (三数之和)

    private Solution solution;

    /**
     * change by 2022211914：
     * 测试用例设计原则：
     * 1. 等价类划分：
     *    - 数组长度不足 3 的情况：没有有效的三元组。
     *    - 包含重复元素的情况：需要去重，避免重复的三元组。
     *    - 全为零的情况：唯一有效的三元组是 [0, 0, 0]。
     *    - 包含负数、正数、零的混合数组。
     * 2. 边界值分析：
     *    - 全正数或全负数的情况，不存在符合条件的三元组。
     *    - 有最小和最大的整数值情况。
     */

    @Before
    public void setUp() {
        solution = new Solution();
    }

    /**
     * 测试目的：验证基本功能，包含负数和正数，结果包含多个三元组
     * 测试用例：nums = {-1, 0, 1, 2, -1, -4}
     */
    @Test
    public void testThreeSum_case1() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = List.of(
            List.of(-1, -1, 2),
            List.of(-1, 0, 1)
        );
        assertEquals(expected, solution.threeSum(nums));
    }

    /**
     * 测试目的：验证输入数组中全为正数的情况，应该返回空结果
     * 测试用例：nums = {0, 1, 1}
     */
    @Test
    public void testThreeSum_case2() {
        int[] nums = {0, 1, 1};
        List<List<Integer>> expected = List.of();  // 结果应该为空
        assertEquals(expected, solution.threeSum(nums));
    }

    /**
     * 测试目的：验证输入数组中全为零的情况
     * 测试用例：nums = {0, 0, 0}
     */
    @Test
    public void testThreeSum_case3() {
        int[] nums = {0, 0, 0};
        List<List<Integer>> expected = List.of(
            List.of(0, 0, 0)
        );
        assertEquals(expected, solution.threeSum(nums));
    }

    /**
     * 测试目的：验证空数组的情况
     * 测试用例：nums = {}
     */
    @Test
    public void testThreeSum_case4() {
        int[] nums = {};
        List<List<Integer>> expected = List.of();  // 结果应该为空
        assertEquals(expected, solution.threeSum(nums));
    }

    /**
     * 测试目的：验证只有负数的情况，应该返回空结果
     * 测试用例：nums = {-3, -2, -1}
     */
    @Test
    public void testThreeSum_case5() {
        int[] nums = {-3, -2, -1};
        List<List<Integer>> expected = List.of();  // 结果应该为空
        assertEquals(expected, solution.threeSum(nums));
    }

    /**
     * 测试目的：验证存在最小和最大整数值的情况
     * 测试用例：nums = {Integer.MIN_VALUE, 0, Integer.MAX_VALUE}
     */
    @Test
    public void testThreeSum_case6() {
        int[] nums = {Integer.MIN_VALUE, 0, Integer.MAX_VALUE};
        List<List<Integer>> expected = List.of(
            List.of(Integer.MIN_VALUE, 0, Integer.MAX_VALUE)
        );
        assertEquals(expected, solution.threeSum(nums));
    }
}
