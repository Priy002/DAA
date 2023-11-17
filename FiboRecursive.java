public class FiboRecursive {
    static int n1 = 0, n2 = 1,n3;

	static void fiboRec(int count){

		if(count > 0){

			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;

			System.out.print(" " + n3);
			fiboRec(count - 1);
		}


	}

	public static void main(String[] args){

		int count = 10;
		if(count > 0){

			System.out.print(n1+ " " + n2);
			fiboRec(count -2);
		}
		else{
			System.out.println(count);
		}

	}
}
