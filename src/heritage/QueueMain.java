package heritage;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

	public static void main(String[] args) {
		Queue<Cat> catsQueue = new LinkedList<Cat>();
		catsQueue.offer(new Cat());

		catsQueue.offer(new Cat());
		catsQueue.offer(new Cat());
		

		Cat c1 = catsQueue.poll();
		System.out.println(c1);
		Cat c2 = catsQueue.poll();
		System.out.println(c2);
		Cat c3 = catsQueue.poll();
		System.out.println(c3);
		
		catsQueue.offer(c1);
		catsQueue.offer(c2);
		catsQueue.offer(c3);
		
		System.out.println(catsQueue.peek());// lit sans retirer de la queue
		System.out.println(catsQueue.poll());// lit et retire de la queue
		System.out.println(catsQueue.size());
		System.out.println(catsQueue.poll());
		System.out.println(catsQueue.size());
		System.out.println(catsQueue.poll());
		System.out.println(catsQueue.size());

	}

}
