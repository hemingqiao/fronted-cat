package blogandquestion.algorithms.array.ismonotonic896;

/**
 * @author Heming
 * created by IntelliJ IDEA
 * founded at 2021/02/28 08:23:47
 * description:
 * 如果数组是单调递增或单调递减的，那么它是单调的。
 *
 * 如果对于所有 i <= j，A[i] <= A[j]，那么数组 A 是单调递增的。 如果对于所有 i <= j，A[i]> = A[j]，那么数组 A 是单调递减的。
 *
 * 当给定的数组 A 是单调数组时返回 true，否则返回 false。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：[1,2,2,3]
 * 输出：true
 * 示例 2：
 *
 * 输入：[6,5,4,4]
 * 输出：true
 * 示例 3：
 *
 * 输入：[1,3,2]
 * 输出：false
 * 示例 4：
 *
 * 输入：[1,2,4,5]
 * 输出：true
 * 示例 5：
 *
 * 输入：[1,1,1]
 * 输出：true
 *  
 *
 * 提示：
 *
 * 1 <= A.length <= 50000
 * -100000 <= A[i] <= 100000
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/monotonic-array
 *
 */
public class Solution {
    // 这种解法也是一次遍历
    public boolean isMonotonic(int[] A) {
        int n = A.length;
        int first = A[0], second = A[n - 1];
        if (first <= second) {
            for (int i = 0; i < n - 1; i++) {
                if (A[i] > A[i + 1]) return false;
            }
        } else {
            for (int i = 0; i < n - 1; i++) {
                if (A[i] < A[i + 1]) return false;
            }
        }
        return true;
    }


    public boolean isMonotonic1(int[] A) {
        int n = A.length;
        boolean asc = true, desc = true;
        for (int i = 0; i < n - 1; i++) {
            if (A[i] < A[i + 1]) {
                desc = false;
            }
            if (A[i] > A[i + 1]) {
                asc = false;
            }
        }
        return asc || desc;
    }
}
