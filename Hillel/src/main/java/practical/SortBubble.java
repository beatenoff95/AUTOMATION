public class SortBubble {
    public static void main(String[] args) {
        int[] arrayOfNumber = {45,65,45,69,58,81,42,59};
        bubbleSort(arrayOfNumber); // Изменено для передачи массива в метод
        // Для вывода отсортированного массива
        for (int number : arrayOfNumber) {
            System.out.print(number + " ");
        }
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        int temp = 0;
        for(int i=0; i < n; i++){ // Внешний цикл каждый раз сокращает фрагмент массива, потому что внутренний цикл помещает большие элементы в конец
            for(int j=1; j < (n-i); j++){
                if(array[j-1] > array[j]){ // Сравниваем элементы попарно и меняем их, если они идут в неправильном порядке
                    // Меняем элементы
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
