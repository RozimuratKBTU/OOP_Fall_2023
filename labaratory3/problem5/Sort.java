package labaratory3.problem5;

public class Sort {
    static <E> void swap(E[] array, int i, int j){
        E temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    static <E extends Comparable<E>> void bubbleSort(E[] array){
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(array[j].compareTo(array[j+1]) > 0){  // if(j > j+1) swap
                    swap(array, j,j+1);
                }
            }
        }
    }

    static <E extends Comparable<E> > void quickSort(E[] array, int left, int right){
        if(array.length == 0) return;
        if(left >= right) return;

        int middle = (left + right) /2;
        int i = left, j = right;
        E pivot = array[middle];
        while(i < j){
            while (array[i].compareTo(pivot) > 0){
                i++;
            }
            while (array[j].compareTo(pivot) > 0){
                j--;
            }
            if(i <= j){
                swap(array,i,j);
                i++;
                j--;
            }
        }

        if (left < j){
            quickSort(array, left,j);
        }
        if(right > i){
            quickSort(array, i, right);
        }
    }
}
