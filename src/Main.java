import java.util.Arrays;

public class Main {
    // Определяем класс Solution вне метода main
    static class Solution {
        public int removeElement(int[] nums, int val) {
            int k = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) { // Если элемент не равен val
                    nums[k] = nums[i]; // Ставим его на место k
                    k++; // Увеличиваем k
                }
            }

            // После выполнения цикла элементы, оставшиеся в массиве после k, будут игнорироваться.
            // Печать массива с актуальными значениями до k
            return k;
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};  // Пример входного массива
        int val = 3;  // Значение для удаления
        Solution sol = new Solution();  // Создаем экземпляр класса Solution

        int k = sol.removeElement(nums, val);  // Вызываем метод removeElement

        // Печатаем результат
        System.out.println("k = " + k);
        System.out.println("nums после удаления: " + Arrays.toString(Arrays.copyOf(nums, k)));  // Массив с актуальными элементами
    }
}
