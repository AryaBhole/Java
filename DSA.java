public class DSA{
    public static void main(String[] args) {
        
        /* 
        Stack : LIFO : verticle tower
        Stack<String> stack = new Stack<>();
        .push() to put on top
        .pop() to remove from top
        .empty() topmost item remove and rearange the stack
        .peek() top most item without removing
        .search() this will search for yout object

        Queqe : FIFO : line of people at a store
        It is a Interface hence cannot be directly implemented we will use it through linkedlist
        Queue<String> que = new LinkedList<>();
        .offer() adding or enqueing to tail
        .poll() removing or dequeing from head
        .peek() returns the head
        .isEmpty()
        .size()
        .contains()

        Priority Queue : Queue but in order of asscending
        Queue<Double> que = new PriorityQueue<>();
        In the last () we can put Collections.reverseOrder() to reversethe order of the queue

        LinkedList : data and adress to the next node
        Singly and Doublely
        LinkedList<String> list = new LinkedList<>();
        We can use it as a queue and stsck both so methods disscussed beafore
        .add(index, item) to add at a specific index
        .remove(item) removesthe item
        .indexOf(item) returns index of the specified item
        .peekFirst()
        .peekLast()
        .addFirst()
        .addLast()
        .removeFirst()
        .removeLast()

        Dynamic Array : ArrayList(java)/List(Python) : An array witha resizable capacity
        ArrayList<String> arraylist = new ArrayList<>();
        .add() defalt at end but can pass index to add elsewhere
        .remove()
        .get()
        .set(index, item)
        .clear()
        .size()

        LinkedList vs ArrayList
        .get(index) getting an element faster in arraylist
        .add / .remove is faster in linkedlist near the start but near center arraylist is faster
        near end both are close but arraylist is slightly faster

        Big O Notation :
        O(1) : constant time
        O(log n) : data increase time change minisquel
        O(n) : lineaar time taken
        O(n log n) : quick sort, merg sort, heap sort
        O(n^2) : insertion sort, bubble sort, selection sort
        O(n!) : travelling salesman problem

        Linear Search : O(n)
        No sorting required
        searches in a line
        **private static int linearsearch(int[] array, int value) {
            for (int i = 0; i < array.length; i++){
                if(array[i] == value){
                    return i;
                    }
                }
            return -1;
            }
        
        Binary Search : O(log n)
        We need to sort the array beaforehand
        int index = Arrays.binarySearch(array, target); //this is the inbuilt function
        **private static int binarySearch(int[] array, int target) {
		    int low = 0;
		    int high = array.length - 1;
		    while(low <= high) {
		    	int middle = low + (high - low) / 2;
			    if(value < target) low = middle + 1;
			    else if(value > target) high = middle - 1;
			    else return middle; //target found
		        }
		        return -1;
	        }
        
        Interpolation Search : Average case : O(log(log(n))) : worst case : log(n)
        This works better with well distributed data
        private static int interpolationSearch(int[] array, int value) {
		    int high = array.length - 1;
		    int low = 0;
		    while(value >= array[low] && value <= array[high] && low <= high) {
			    int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);
	    		if(array[probe] == value) {
		    		return probe;
			    }
			    else if(array[probe] < value) {
				    low = probe + 1;
			    }
			    else {
				    high = probe -1;
			    }
		    }
		    return -1;
	    }

        Bubble Sort : O(n^2)
        public static void bubbleSort(int array[]) {
		    for(int i = 0; i < array.length - 1; i++) {
			    for(int j = 0; j < array.length - i - 1; j++) {
				    if(array[j] > array[j+1]) {              //swap the > sign to get desending
					    int temp = array[j];
					    array[j] = array[j+1];
					    array[j+1] = temp;
				    }
			    }
		    }
	    }

        Selection Sort : O(n^2)
        private static void selectionSort(int[] array) {
		    for(int i = 0; i < array.length - 1; i++) {
			    int min = i;
			        for(int j = i + 1; j < array.length; j++) {
				        if(array[min] > array[j]) {         //swap the > sign to get desending
					        min = j;
				            }
			            }
			        int temp = array[i];
			        array[i] = array[min];
			        array[min] = temp;
		            }
	            }
        
        Insertion Sort : O(n^2) 
        Better than both discussed beafore
        Checks with values on the left
        private static void insertionSort(int[] array) {
		    for(int i = 1; i < array.length; i++) {
			    int temp = array[i];
    			int j = i - 1;
			    while(j >= 0 && array[j] > temp) {
				    array[j + 1] = array[j];
				    j--;
			    }
    			array[j + 1] = temp;
		    }
    	}

        
        */
    }
}