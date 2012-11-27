
public class SortingAlgorithms {

	/**
	 * @param args
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] beforesort = {3,7,4,9,5,2,6,1,8};
		//InsertionSort(beforesort);
		//SelectionSort(beforesort);
		//MergeSort ms = new MergeSort(beforesort);
		BubbleSort(beforesort);
		
	}

	
	
	

	private static void BubbleSort(int[] beforesort) {
		// TODO Auto-generated method stub
		System.out.printf("Before sort: ");
		for(int i=0;i<beforesort.length;i++){
			System.out.printf("%d ",beforesort[i]);
		}
		System.out.printf("\n");
		boolean swapped = false;
		do{
			swapped = false;
			for(int i=0;i<beforesort.length-1;i++){
				if(beforesort[i]>beforesort[i+1]){
					System.out.println("************************");
					System.out.println(beforesort[i]);
					System.out.println(beforesort[i+1]);
					
					int temp;
					temp = beforesort[i];
					beforesort[i] = beforesort[i+1];
					beforesort[i+1] = temp;
					
					System.out.println(beforesort[i]);
					System.out.println(beforesort[i+1]);
					System.out.println("************************");
					swapped = true;
				}
			}
		}while(swapped);
		
		System.out.printf("After sort: ");
		for(int i=0;i<beforesort.length;i++){
			System.out.printf("%d ",beforesort[i]);
		}
		System.out.printf("\n");
	}





	private static void SelectionSort(int[] beforesort) {
		// TODO Auto-generated method stub
		System.out.printf("Before sort: ");
		for(int i=0;i<beforesort.length;i++){
			System.out.printf("%d ",beforesort[i]);
		}
		System.out.printf("\n");
		for(int i=0;i<beforesort.length;i++){
			int smallest=i;
			for(int j=smallest+1;j<beforesort.length;j++){
				if(beforesort[smallest]>beforesort[j]){
					int temp;
					temp=beforesort[smallest];
					beforesort[smallest]=beforesort[j];
					beforesort[j]=temp;
				}
			}
		}
		System.out.printf("After sort: ");
		for(int i=0;i<beforesort.length;i++){
			System.out.printf("%d ",beforesort[i]);
		}
		System.out.printf("\n");
	}

	private static void InsertionSort(int[] beforesort) {
		// TODO Auto-generated method stub
		System.out.printf("Before sort: ");
		for(int i=0;i<beforesort.length;i++){
			System.out.printf("%d ",beforesort[i]);
		}
		System.out.printf("\n");
		//int[] sorted = new int[beforesort.length];
		for(int i=0;i<beforesort.length;i++){
			if(i==0){
				System.out.printf("Step"+(i+1)+": ");
				for(int k=0;k<beforesort.length;k++){
					System.out.printf("%d ",beforesort[k]);
				}
				System.out.printf("\n");
				continue;
			} else{
				int j=i;
				
				int temp;
				while(j>0&&beforesort[j]<beforesort[j-1]){
					temp=beforesort[j];
					beforesort[j]=beforesort[j-1];
					beforesort[j-1]=temp;
					j=j-1;
					System.out.printf("Step"+(i+1)+": ");
					for(int k=0;k<beforesort.length;k++){
						System.out.printf("%d ",beforesort[k]);
					}
					System.out.printf("\n");
				}
			}			
		}
		System.out.printf("After sort: ");
		for(int i=0;i<beforesort.length;i++){
			System.out.printf("%d ",beforesort[i]);
		}
		System.out.printf("\n");
	}
	
	public static void swap(int a, int b){
		System.out.println(a);
		System.out.println(b);
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);
	}
	
	
}
