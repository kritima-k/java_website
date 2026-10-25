package interfaces;

// Sortable2 says any class implementing it must sort an array in descending order
interface Sortable2 {
void sort(int[] array);
}

// QuickSort implements Sortable2, simplified here for clarity
class QuickSort implements Sortable2 {
public void sort(int[] array) {
quickSort(array, 0, array.length - 1);
System.out.println("QuickSort descending result:");
printArray(array);
}

// standard quicksort logic, but comparing in reverse for descending order
void quickSort(int[] array, int low, int high) {
if (low < high) {
int pivot = array[high];
int i = low - 1;
for (int j = low; j < high; j++) {
if (array[j] > pivot) { // greater than pivot goes first for descending
i++;
int temp = array[i];
array[i] = array[j];
array[j] = temp;
}
}
int temp = array[i + 1];
array[i + 1] = array[high];
array[high] = temp;

int partitionIndex = i + 1;
quickSort(array, low, partitionIndex - 1);
quickSort(array, partitionIndex + 1, high);
}
}

void printArray(int[] array) {
for (int num : array) {
System.out.print(num + " ");
}
System.out.println();
}
}

// MergeSort implements Sortable2, simplified here for clarity
class MergeSort implements Sortable2 {
public void sort(int[] array) {
mergeSort(array, 0, array.length - 1);
System.out.println("MergeSort descending result:");
printArray(array);
}

void mergeSort(int[] array, int left, int right) {
if (left < right) {
int mid = (left + right) / 2;
mergeSort(array, left, mid);
mergeSort(array, mid + 1, right);
merge(array, left, mid, right);
}
}

// merges two sorted halves together, keeping descending order
void merge(int[] array, int left, int mid, int right) {
int[] temp = new int[right - left + 1];
int i = left, j = mid + 1, k = 0;

while (i <= mid && j <= right) {
if (array[i] >= array[j]) { // larger goes first for descending
temp[k++] = array[i++];
} else {
temp[k++] = array[j++];
}
}
while (i <= mid) {
temp[k++] = array[i++];
}
while (j <= right) {
temp[k++] = array[j++];
}
for (int m = 0; m < temp.length; m++) {
array[left + m] = temp[m];
}
}

void printArray(int[] array) {
for (int num : array) {
System.out.print(num + " ");
}
System.out.println();
}
}

class Sortable2Interface {
public static void main(String[] args) {
int[] arr1 = {5, 2, 9, 1, 5};
int[] arr2 = {8, 3, 7, 4, 2};

Sortable2 quick = new QuickSort();
Sortable2 merge = new MergeSort();

quick.sort(arr1);
merge.sort(arr2);
}
}