package interfaces;

// Sortable says any class implementing it must be able to sort an array
interface Sortable {
void sort(int[] array);
}

// BubbleSort implements Sortable using the bubble sort technique
class BubbleSort implements Sortable {
public void sort(int[] array) {
// bubble sort keeps comparing neighbors and swapping if they're in wrong order
for (int i = 0; i < array.length - 1; i++) {
for (int j = 0; j < array.length - 1 - i; j++) {
if (array[j] > array[j + 1]) {
int temp = array[j];
array[j] = array[j + 1];
array[j + 1] = temp;
}
}
}
System.out.println("Bubble sorted array:");
printArray(array);
}

void printArray(int[] array) {
for (int num : array) {
System.out.print(num + " ");
}
System.out.println();
}
}

// SelectionSort implements Sortable using the selection sort technique
class SelectionSort implements Sortable {
public void sort(int[] array) {
// selection sort finds the smallest remaining number and puts it in place
for (int i = 0; i < array.length - 1; i++) {
int minIndex = i;
for (int j = i + 1; j < array.length; j++) {
if (array[j] < array[minIndex]) {
minIndex = j;
}
}
int temp = array[minIndex];
array[minIndex] = array[i];
array[i] = temp;
}
System.out.println("Selection sorted array:");
printArray(array);
}

void printArray(int[] array) {
for (int num : array) {
System.out.print(num + " ");
}
System.out.println();
}
}

class SortableInterface {
public static void main(String[] args) {
int[] arr1 = {5, 2, 9, 1, 5};
int[] arr2 = {8, 3, 7, 4, 2};

Sortable bubble = new BubbleSort();
Sortable selection = new SelectionSort();

bubble.sort(arr1);
selection.sort(arr2);
}
}