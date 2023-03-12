package DP;

import java.util.Arrays;

public class lcs {

	public static void main(String[] args) {
		String s1 = "abcdefghijklmnopqfgshjlk;kjfhgjhkjl;iuyt789gfhjkrstuvwxyz";
		String s2 = "ABCDEFGHIJKLMertyuiopsdfghjklxcvbnm,.dfghjrtyuiNOPQRSTUVWXYZ";
		int[][] strg = new int[s1.length()][s2.length()];
		for(int i=0; i<strg.length; i++) {
			for(int j=0; j<strg[0].length; j++) {
				strg[i][j] = -1;
			}
		}
		
		//System.out.println(lcsRecursive(s1,s2));
		//System.out.println(lcsRecursiveVidx(s1,s2,0,0));
		System.out.println(lcsTopDown(s1,s2,0,0,strg));
		System.out.println(lcsBU(s1,s2));

	}
	
	public static int lcsRecursive(String s1, String s2) {
		
		if(s1.length()==0 || s2.length()==0)
			return 0;
		
		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);
		
		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);
		
		int ans = 0;
		if(ch1==ch2) {
			ans = lcsRecursive(ros1,ros2)+1;
		}
		else {
			int o1 = lcsRecursive(s1,ros2);
			int o2 = lcsRecursive(ros1,s2);
			
			ans = Math.max(o1, o2);
		}
		return ans;
		
	}
	
	public static int lcsRecursiveVidx(String s1, String s2, int vidx1, int vidx2) {
		if(s1.length()==vidx1 || s2.length()==vidx2)
			return 0;
		
		char ch1 = s1.charAt(vidx1);
		char ch2 = s2.charAt(vidx2);
		
		int ans = 0;
		if(ch1==ch2) {
			ans = lcsRecursiveVidx(s1,s2,vidx1+1,vidx2+1)+1;
		}
		else {
			int o1 = lcsRecursiveVidx(s1,s2,vidx1+1,vidx2);
			int o2 = lcsRecursiveVidx(s1,s2,vidx1,vidx2+1);
			
			ans = Math.max(o1, o2);
		}
		return ans;
		
	}
	
	public static int lcsTopDown(String s1, String s2, int vidx1, int vidx2, int[][] strg) {
		if(s1.length()==vidx1 || s2.length()==vidx2)
			return 0;
		
		//if all chars are different then result will be 0, 
		//checking with 0 will result in recalculating the results for already computed values
		if(strg[vidx1][vidx2]!=-1) {
			return strg[vidx1][vidx2];
		}
		char ch1 = s1.charAt(vidx1);
		char ch2 = s2.charAt(vidx2);
		
		int ans = 0;
		if(ch1==ch2) {
			ans = lcsTopDown(s1,s2,vidx1+1,vidx2+1,strg)+1;
		}
		else {
			int o1 = lcsTopDown(s1,s2,vidx1+1,vidx2,strg);
			int o2 = lcsTopDown(s1,s2,vidx1,vidx2+1,strg);
			
			ans = Math.max(o1, o2);
		}
		strg[vidx1][vidx2] = ans; //store
		return ans;
	}
	
	public static int lcsBU(String s1, String s2) {
		int[][] strg = new int[s1.length()+1][s2.length()+1];
		
		for(int row=s1.length()-1; row>=0; row--) {
			
			for(int col=s2.length()-1; col>=0; col--) {
				
				if(s1.charAt(row)==s2.charAt(col)) {
					strg[row][col] = strg[row+1][col+1] + 1;
				}
				else {
					int o1 = strg[row][col+1];
					int o2 = strg[row+1][col];
					strg[row][col] = Math.max(o1, o2);
				}
			}
		}
		return strg[0][0];
	}

}
