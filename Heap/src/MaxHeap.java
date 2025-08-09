public class MaxHeap {

    // Function to delete an element from max heap
    public static int[] deleteFromHeap(int[] heap, int n, int element) {
        // Find the index of the element to be deleted
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (heap[i] == element) {
                index = i;
                break;
            }
        }

        // If element not found, return original heap
        if (index == -1) {
            System.out.println("Element not found in the heap.");
            return heap;
        }

        // Replace the element with the last element in the heap
        heap[index] = heap[n-1];
        n--; // Reduce the size of the heap

        // Perform heapify down operation
        heapifyDown(heap, n, index);

        return heap;
    }

    // Function to heapify down
    private static void heapifyDown(int[] heap, int n, int index) {
        int largest = index;
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;

        // Compare with left child
        if (leftChild < n && heap[leftChild] > heap[largest]) {
            largest = leftChild;
        }

        // Compare with right child
        if (rightChild < n && heap[rightChild] > heap[largest]) {
            largest = rightChild;
        }

        // If the largest element is not the current index, swap and heapify down
        if (largest != index) {
            int temp = heap[index];
            heap[index] = heap[largest];
            heap[largest] = temp;
            heapifyDown(heap, n, largest);
        }
    }

    // Example usage
    public static void main(String[] args) {
        int[] heap = {10, 20, 15, 25, 30};
        heap = deleteFromHeap(heap, heap.length, 15);
        for (int i = 0; i < heap.length - 1; i++) {
            System.out.print(heap[i] + " ");
        }
    }
}
