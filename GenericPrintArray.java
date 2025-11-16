public class GenericPrintArray {

    
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println(); 
    }

    public static void main(String[] args) {

       
        String[] languages = { "Java", "Python", "C++" };

    
        Integer[] numbers = { 1, 2, 3, 4 };

        System.out.println("String Array:");
        printArray(languages);

        System.out.println("Integer Array:");
        printArray(numbers);
    }
}
