package nagarro;

import java.util.LinkedList;
import java.util.Queue;

public class MiniumHeightOfTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in = { 4, 8, 10, 12, 14, 20, 22 };
		int[] level = { 20, 8, 22, 4, 12, 10, 14 };
		System.out.println(minHeight(in, level, 0, 0, 7));

	}

	public static int minHeight(int[] inorder, int[] levelOrder, int i, int j, int n) {
		Queue<Integer> q1 = new LinkedList<>();
		Queue<Integer> q2 = new LinkedList<>();

		q1.add(levelOrder[0]);
		int k = 1, height = 0;
		while (!q1.isEmpty() || !q2.isEmpty()) {
			if (!q1.isEmpty())
				height++;
			while (!q1.isEmpty()) {
				int val = q1.element();
				for (i = 0; i < n; i++) {
					if (inorder[i] == val)
						break;
				}
				if (i > 0 && inorder[i - 1] != -1 && k < n)
					q2.add(levelOrder[k++]);
				if (i < n - 1 && inorder[i + 1] != -1 && k < n)
					q2.add(levelOrder[k++]);
				inorder[i] = -1;
				q1.remove();
			}
			if (!q2.isEmpty())
				height++;
			while (!q2.isEmpty()) {
				int val = q2.element();
				for (i = 0; i < n; ++i) {
					if (inorder[i] == val)
						break;
				}
				if (i > 0 && inorder[i - 1] != -1 && k < n)
					q1.add(levelOrder[k++]);
				if (i < n - 1 && inorder[i + 1] != -1 && k < n)
					q1.add(levelOrder[k++]);
				inorder[i] = -1;
				q2.remove();
			}
		}
		return height;
	}

}
