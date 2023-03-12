package qps;

public class bookAllocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int minPages(int[] pages, int students) {
		int low = 0;
		int high = 0;
		for(int val : pages) {
			high += val;
		}
		int ans = 0;
		for(int i=0; i<pages.length; i++) {
			int mid = (low+high)/2;
			if(isPossible(pages,students,mid)) {
				ans = mid;
				high = mid-1;
			}
			else {
				low = mid+1;
			}
		}
		
		return ans;
	}
	
	public static boolean isPossible(int[] pages, int totalStudents, int maxPage) {
		int pagesRead = 0;
		int student = 1;
		int bookNumber = 0;
		
		while(bookNumber<pages.length) {
			if(pagesRead+pages[bookNumber] <= maxPage) {
				bookNumber++;
			}
			else {
				student++;
				pagesRead = 0;
				if(student>totalStudents)
					return false;
			}
		}
		
		return true;
	}

}
