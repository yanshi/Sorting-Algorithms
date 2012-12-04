
public class HeapSort {
	/*
	 * three steps:
	 * 1, build max heap
	 * 2, heapify: ensure that a parent node is greater than its children.
	 * 3, take the first node and put into the end of the result list.
	 * For example: integer list [3,1,4,2,5]
	 * heap:             5
	 *                 4   3
	 *                1 2
	 */
	private int[] list;
	private int[] result;
	
	public HeapSort(int[] l){
		this.list = l;
		//sort(list);
	}

	public int[] sort() {
		// TODO Auto-generated method stub
		printlist(list,"Before sort: ");
		int heapSize = list.length;
		result = new int[heapSize];
		BuildHeap(list);
		printlist(list,"After build heap: ");
		
		for(int i=list.length-1,count=1;i>=0;i--,count++){
			result[i] = list[0];
//			if(i==0){
//				result[heapSize-1]=list[i];
//			}
			swap(list,0,i);
			heapSize--;
			heapify(list,0,heapSize);
			printlist(list,"After "+count+" heapify:");
			
		}
		printlist(result,"After sort: ");
		return result;
	}

	private void printlist(int[] list,String s) {
		// TODO Auto-generated method stub
		System.out.printf(s);
		for(int i=0;i<list.length;i++){
			System.out.printf("%d ",list[i]);
		}
		System.out.printf("\n");
		
	}

	private void BuildHeap(int[] list) {
		/*
		 * build heap from the bottom
		 */
		// TODO Auto-generated method stub
		int length = list.length;
		for(int i=length/2;i>=0;i--){
			heapify(list,i,length);
		}
		
	}

	private void heapify(int[] list,int index,int heapSize) {
		/*
		 * to ensure every node is greater than its children. if not greater, swap.
		 */
		// TODO Auto-generated method stub
		int left = index * 2;
		int right = index * 2 + 1;
		int max = index;
		if(left<heapSize&&list[left]>list[index]){
			max = left;
		}
		if(right<heapSize&&list[right]>list[max]){
			max = right;
		}
		if(index!=max){
			swap(list,index,max);
			heapify(list,max,heapSize);
		}
	}

	private void swap(int[] list, int index, int max) {
		// TODO Auto-generated method stub
		int temp;
		temp = list[index];
		list[index]=list[max];
		list[max]=temp;
	}
}
