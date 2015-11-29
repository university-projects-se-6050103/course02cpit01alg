package ua.vladgolubev;

public class Quicksort {
    private int[] numbers;
    private int number;

    public void sort(int[] values) {
        if (values ==null || values.length==0){
            return;
        }
        this.numbers = values;
        number = values.length;
        quicksort(0, number - 1);
    }

    private void quicksort(int low, int high) {
        int i = low, j = high;
        // Отримати опорний елемент із середини масиву
        int pivot = numbers[low + (high-low)/2];

        // Ділимо масив на дві частини
        while (i <= j) {
            // Якщо поточний елемент з лівого масиву менший за опорний елемент
            // тоді беремо наступний елемент з лівого масиву
            while (numbers[i] < pivot) {
                i++;
            }
            // Якщо поточний елемент з правого масиву більший за опорний елемент
            // тоді беремо наступний елемент з правого масиву
            while (numbers[j] > pivot) {
                j--;
            }

            // Якщо ми знайшли значення в лівому масиві які більші за опорний елемент
            // і якщо ми знайшли значення в правому масиву які менші за опорний елемент
            // тоді ми обмінюємо ці значення
            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }
        // Рекурсія
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }

    private void exchange(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
