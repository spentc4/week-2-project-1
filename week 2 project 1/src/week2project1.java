import java.util.*;
import java.util.Arrays;

public interface week2project1 {

	public class Bag<t>{
		// TODO Auto-generated method stub
		public final int original_capacity = 10;
		public int capacity;
		public t[] data;
		public int count;
		

		
		public Bag() {
			setCapacity(original_capacity);
			data = (t[])new Object[capacity];
			int t[] = new int[] {1,2,3,4,5,6,7,8,9,10};
			System.out.println(t);
			count = 0;
		}
		
		public void setCapacity(int newCapacity) {
			capacity = newCapacity;
		}
		
		public void add(t element) {
			if (count >= capacity) {
				resize();
			}
			else {
				data[count] = element;
				count++;
						
			}
		}
		private void resize() {
			capacity *= 1.5;
			data = Arrays.copyOf(data,capacity); 
		}
		
		public t remove(){
			t target = null;
			target = data[count - 1];
			data[count - 1] = null;
			count--;
			return target;
		}
		
		
	}

	}


