import java.util.Random;

public class InsertionSortImplementacao {
    public static void main(String[] args) throws Exception {
        
        int tamanhoArray = 10;
        int[] array = new int[tamanhoArray];
        Random rand = new Random();
        for(int i = 0; i < tamanhoArray; i++) {
            array[i] = rand.nextInt(50);
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");

        insertionSort(array, tamanhoArray);

        for(int i = 0; i < tamanhoArray; i++) {
            System.out.print(array[i] + " ");
        }
         
    }

    public static int[] insertionSort(int[] array, int tamanho) {
        int pivo = 0;
        int j = 0;
        for (int i = 1; i < tamanho; i++) {
            pivo = array[i];
            j = i-1;
            while (j >= 0 && array[j] > pivo) {
                array[j+1] = array[j];
                j = j - 1;
            }
            array[j+1] = pivo;
        }
        return array;
    }
}
