public class InsertionSortExample {
public static void insertionSort(int a[]) {
int n = a.length;
for (int i = 1; i < n; i++) {
int key = a[i];
int j = i-1;
while ( (j > -1) && ( a[j] > key ) ) {
a[j+1] = a[i];
j--;
}
a[j+1] = key;
}
}
public static void main(String a[]){
int[] arr1 = {9,14,3,2,43,11,58,22};
System.out.println("Before Insertion Sort");
for(int i:arr1){
System.out.print(i+" ");
}
System.out.println();
insertionSort(arr1);//sorting array using insertion sort
System.out.println("After Insertion Sort");
for(int i:arr1){
System.out.print(i+" ");
}
}
}