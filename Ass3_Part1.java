import java.lang.reflect.Array;
import java.util.Queue;

public class Ass3_Part1 {
	public static Integer minimum(Queue<Integer> q) {
		Integer[] arr = (Integer[]) q.toArray();
		Integer min = Array.getInt(arr, 0);
		for (int i = 0; i < q.size(); i++) {
			if (Array.getInt(arr, i) < min) {
				min = i;
			}
		}
	return min;
	}
}