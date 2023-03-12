package GenericTree;

public class client {

	//10 3 20 2 50 0 60 0 30 0 40 1 70 0
	public static void main(String[] args) {
		Tree gt = new Tree();
		gt.display();
//		System.out.println(gt.size());
//		System.out.println(gt.max());
		//gt.mirror();
		System.out.println();
		//gt.display();
		gt.printAtLevel(1);

	}

}
