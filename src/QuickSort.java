import java.util.ArrayList;


public class QuickSort {
	private int[] list;
	private ArrayList<Integer> List = new ArrayList<Integer>();
	private int count = 0;
	
	public QuickSort(int[] list){
		this.list = list;
		for(int i=0;i<list.length;i++){
			List.add(list[i]);
		}
	}
	
	public int[] sort(){
		printlist(list,"Before sort: ");
		ArrayList<Integer>result = quicksort(List);
		for(int i=0;i<result.size();i++){
			list[i] = result.get(i);
		}
		printlist(list,"After sort: ");
		return list;
		
	}

	private ArrayList<Integer> quicksort(ArrayList<Integer> l) {
		
		// TODO Auto-generated method stub
		
		if(l.size()==1){
			return l;
		}
		int length = l.size();
		int Pindex = (length-1)/2;
		int pivot = l.get(Pindex);
		
		ArrayList<Integer> less = new ArrayList<Integer>();
		ArrayList<Integer> equal = new ArrayList<Integer>();
		ArrayList<Integer> greater = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int i=0;i<length;i++){
			if(l.get(i) < pivot){
				less.add(l.get(i));
			}else if(l.get(i) == pivot){
				equal.add(l.get(i));
			}else{
				greater.add(l.get(i));
			}
			
		}
		
		if(less.size()>0){
			less = quicksort(less);
		}
		if(greater.size()>0){
			greater = quicksort(greater);
		}
		
		//return l;
		//return catenate(quicksort(less),equal,quicksort(greater));
		result.addAll(less);
		result.addAll(equal);
		result.addAll(greater);
		return result;
	}

	private ArrayList<Integer> catenate(ArrayList<Integer> less,
			ArrayList<Integer> equal, ArrayList<Integer> greater) {
				
		// TODO Auto-generated method stub
		
			ArrayList<Integer> result = new ArrayList<Integer>();
			result.addAll(less);
			result.addAll(equal);
			result.addAll(greater);
//			for(int i=0;i<less.size();i++){
//				result.add(less.get(i));
//			}
//			for(int i=0;i<equal.size();i++){
//				result.add(equal.get(i));
//			}
//			for(int i=0;i<greater.size();i++){
//				result.add(greater.get(i));
//			}
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

}
