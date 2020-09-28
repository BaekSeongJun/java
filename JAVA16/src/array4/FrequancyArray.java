package array4;

public class FrequancyArray {
	public int[] frequancy(int[] a) {
		int[] array ;
		int count;
		int max = 0;
		for(int i = 0; i <a.length; i++) {
			if(a[i] > max)
				max = a[i];
		}
		array = new int[max+1];
		for(int j = 0; j <= max; j++) {
			count = 0;
			for(int x = 0; x < a.length; x++) {
				if(a[x] == j) {
					count += 1;
				array[j] = count;
			}
				}
		}
		return array;
	}
	
	public int[] generate(int[]a) {
		int[] array;
		int count = 0;
		int max = 0;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		array = new int[sum];
		for(int j = 0; j < a.length; j++) {
			if(a[j] != 0) {
				max = a[j];
				for(int x = 0; x < max; x++) {
					array[count + x] = j;
				}
				count += a[j];			
			}
		}	
		return array;
		
	}
	public int[] mysort(int[] a) {
		int[] my = generate(a);
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
