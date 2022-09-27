package d13arrays;
import java.util.Arrays;

public class d13 {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 1, 2, 3, 4 };
        int[] arr2 = new int[] { 1, 2, 3, 4 };
        boolean isEquals = Arrays.equals(arr1, arr2);// 判断两个数组是否相等
        System.out.println(isEquals);
        System.out.println(Arrays.toString(arr1));// 输出数组信息

        Arrays.fill(arr1, 10);
        System.out.println(Arrays.toString(arr1));// 将指定值填充到数组中

    }
}
