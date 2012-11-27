import java.util.ArrayList;


public class MergeSort {
	
	int[] list;
	int[] result;
	public MergeSort(int[] l){
		this.list =  l;
		System.out.printf("Before sort: ");
		for(int i=0;i<list.length;i++){
			System.out.printf("%d ",list[i]);
		}
		System.out.printf("\n");
		
		result=sort(list);
		
		System.out.printf("After sort: ");
		for(int i=0;i<result.length;i++){
			System.out.printf("%d ",result[i]);
		}
		System.out.printf("\n");
		
	}
	
	public int[] sort(int[] list){
		if(list.length==1)
			return list;
		int length = list.length;
		int mid = length/2;
		int[] left = new int[mid];
		int[] right = new int[length-mid];
		
		for(int i=0;i<mid;i++){
			left[i]=list[i];
		}
		System.out.printf("Left: ");
		for(int i=0;i<left.length;i++){
			System.out.printf("%d ",left[i]);
		}
		System.out.printf("\n");
		
		for(int i=mid;i<length;i++){
			
				right[i-mid]=list[i];
			
		}
		System.out.printf("Right: ");
		for(int i=0;i<right.length;i++){
			System.out.printf("%d ",right[i]);
		}
		System.out.printf("\n");
		
		left = sort(left);
		right = sort(right);
		
		return merge(left,right);
		
		
		
		
	}

	private int[] merge(int[] left, int[] right) {
		// TODO Auto-generated method stub
		int length = left.length +  right.length;
		int[] result = new int[length];
		ArrayList<Integer> l = new ArrayList<Integer>();
		ArrayList<Integer> r = new ArrayList<Integer>();
		ArrayList<Integer> re = new ArrayList<Integer>();
		for(int i=0;i<left.length;i++){
			l.add(left[i]);
		}
		for(int i=0;i<right.length;i++){
			r.add(right[i]);
		}
		
		while(l.size()>0||r.size()>0){
			if(l.size()==0&&r.size()>0){
				for(int i=0;i<r.size();i++){
					re.add(r.get(i));
					r.remove(i);
				}
			}else if(r.size()==0&&l.size()>0){
				for(int i=0;i<l.size();i++){
					re.add(l.get(i));
					l.remove(i);
				}
			}else if(l.size()>0&&r.size()>0){
				if(l.get(0)<r.get(0)){
					re.add(l.get(0));
					l.remove(0);
				}else{
					re.add(r.get(0));
					r.remove(0);
				}
			}
		}
		
		for(int i=0;i<re.size();i++){
			result[i]=re.get(i);
		}
		
		return result;
		
		
	}

	

}
