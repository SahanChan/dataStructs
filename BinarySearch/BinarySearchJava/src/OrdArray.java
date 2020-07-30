
public class OrdArray {

		private long arr[];
		private int nElems;
		
		public OrdArray(int max) {
			arr = new long[max];
			nElems = 0;
			
		}
		public int size() {
			return nElems;
		}
		
		
		//binary Search
		public int find(long searchKey) {
			int lowerbound=0;
			int upperbound = nElems -1;
			int curIn;
			while(true) {
				curIn = (lowerbound + upperbound )/2;
				if(arr[curIn] == searchKey) {
					return curIn;
					
				}
				else if (lowerbound > upperbound) {
					return nElems;
				}
				
				else {
					if(arr[curIn] < searchKey) {
						lowerbound = curIn +1;
						
					}
					else {
						upperbound = curIn -1;
					}
				}
			}
		}
		
		public void insert(long value) {
			int j;
			//linear search and sort
			for(j=0; j<nElems; j++) {
				if(arr[j]>value) {	
					break;
				}	
			}
			for(int k =nElems; k>j; k--) {
				arr[k]= arr[k-1];
			}
			arr[j]= value;
			nElems++;
			
			
		}
		
		public boolean delete(long value) {
			int j = find(value);
			if(j==nElems) {
				return false;
			}
			else {
				for(int k =j; k<nElems; k++) {
					arr[k]= arr[k+1];
				}
				nElems--;
				return true;
			}	
		}
		
		public void display() {
			for(int j =0;j<nElems; j++) {
				System.out.print(arr[j]+ " ");
				
			}
			System.out.println("");
			
		}
		
		
}
