package array4;

public class FrequancyArray {
	public int[] frequancy(int[] a) {
		
	}
	public int[] generate(int[]a) {
		
	}
	public int[] mysort(int[] a) {
		int[] my = generate(frequancy(a));
		return my;
	}
}
	/*
	public int[] frequancy(int[] array) {
		int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == 0)
				a++;
			else if(array[i] == 1)
				b++;
			else if(array[i] == 2)
				c++;
			else if(array[i] == 3)
				d++;
			else if(array[i] == 4)
				e++;
			else 
				f++;
		}
		int[] arrays = {a,b,c,d,e,f};
		return arrays;
	}
	
	public int[] generate(int[] array) { 
		int count = 0;
		int[] a = new int[array[0] + array[1] +array[2] +array[3] +array[4] + array[5]];
		for(int i = 0; i < array.length; i++) {			 
			if(array[i] == 0)
				continue;
			else if(array[i] == 1) {
				a[count] = i;
				count++;
			}
			else if (array[i] == 2) {
				a[count] = i;
				a[count+1] =i;
				count += 2;
			}
			else if(array[i] == 3) {
				a[count] = i;
				a[count + 1] =i;
				a[count + 2] =i;
				count += 3;
			}
		}
		return a;
	}
	public int[] mysort(int[] array) {
		int[] a = this.frequancy(array);
		int[] b = this.generate(a);
		return b;
		
	}

}*/
//1~5까지 들어왔을때
