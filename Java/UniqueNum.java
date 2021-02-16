import java.util.Random;

public class UniqueNum {
	int arr[];
	int arr2[];
	int N;
	int c = 0;
	UniqueNum(int[] a) {
		this.arr = a;
		this.N = a.length;
		this.arr2 = new int[N];
	}

	boolean findFilled(int c, int v) {
		for (int i = 0; i < v; i++) {
			if (arr2[i] == c) {
				return true;
			}
		}
		return false;
	}

	void unique() {
		for (int i = 0; i < arr.length; i++) {
			if (!findFilled(arr[i], i)) {
				arr2[c++] = arr[i];
			}
		}
	}

	void print() {
		for (int i = 0; i < c; i++) {
			System.out.println(arr2[i]);
		}
	}

	public static void main(String[] args) {
		Random r = new Random();
		int arr[] = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = r.nextInt(10);
		}
		UniqueNum d = new UniqueNum(arr);
		
		d.unique();
		d.print();
	}

}
