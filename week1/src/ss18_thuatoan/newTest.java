package ss18_thuatoan;

public class newTest {
    public static void main(String[] args) {
        char[] array1 = {'a', 'b', 'c', 'b', 'a'};
        char[] array2 = {'1', '2', '3', '2', '1'};
        char[] array3 = {'a', 'b', 'c', 'd', 'e'};

        System.out.println("Array 1: " + isCycleArray(array1)); // true
        System.out.println("Array 2: " + isCycleArray(array2)); // true
        System.out.println("Array 3: " + isCycleArray(array3)); // false
    }
    public static boolean isCycleArray(char [] arr){
        boolean increas = true;
        boolean decreas = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                increas = false;
                break;
            }
        }

        // Kiểm tra chuỗi có giảm dần hay không
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]) {
                decreas = false;
                break;
            }
        }
        return decreas || increas;
    }
}
