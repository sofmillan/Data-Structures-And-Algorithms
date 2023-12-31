package sortalgorithms;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {20, 35, -1, 7, 55, 1, -22};

        for(int firstUnsortedIndex = 1; firstUnsortedIndex<array.length;firstUnsortedIndex++){
            //growing the sorted partition by one
            int newElement = array[firstUnsortedIndex];

            int i;

            for(i=firstUnsortedIndex;i>0 && array[i-1]>newElement;i--){
                //looking for the correct position to insert each element
                 array[i] = array[i-1];
            }

            array[i] =newElement;
        }
    }
}
