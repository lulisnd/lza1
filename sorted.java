package exten;

public class sorted {
    void sort(int array[]){
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (array[j] > array[j+1]){
            int a =array[j];
            array[j] = array[j+1];
            array[j+1] = a ;
                }
            }
        }
    }
    void print (int array[]){
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        sorted b = new sorted();
        int array[] = {19,101,17,87,10};
        b.sort(array);
        System.out.println("Sorted array");
        b.print(array);
    }
}
