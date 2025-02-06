package Collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// Queue interface (java.util.Queue)

		System.out.println("\nQueue Methods :) !\n");

//      Queue allows duplicates.
//      interfaces: Queue, Deque
//      implementation classes: ArrayDeque, PriorityQueue
//      PriorityQueue ------> Queue
//      ArrayDeque ------->  Deque

//-------------- PriorityQueue implements Queue interface -----------------------------------------------------------

		Queue<String> stringPriorityQueue1 = new PriorityQueue<String>(); // PriorityQueue sorts elements
		stringPriorityQueue1.add("Tata Consultancy Services");
		stringPriorityQueue1.add("Dassault Systems");
		stringPriorityQueue1.add("Apple");
		stringPriorityQueue1.add("Alphabet");
//   stringPriorityQueue1.add(null);

		System.out.println("StringPriorityQueue1: " + stringPriorityQueue1);

		Queue<String> stringPriorityQueue2 = new PriorityQueue<String>();

		// PriorityQueue sorts elements by alphabetical order
		stringPriorityQueue2.add("Yogesh");
		stringPriorityQueue2.add("Rohit");
		stringPriorityQueue2.add("Ajay");
		stringPriorityQueue2.add("Aniket");
		stringPriorityQueue2.add("Varun");
		stringPriorityQueue2.add("Sumit");
		stringPriorityQueue2.add("Balaji");

		System.out.println("StringPriorityQueue2: " + stringPriorityQueue2);

//------------------------ ArrayDeque interface implements Deque interface -------------------------------------------

//     Array Deque is implementing class of Deque interface.

		Queue<String> stringDeque1 = new ArrayDeque<String>(); // ArrayDeque doesn't sort elements
		stringDeque1.add("Tata Consultancy Services");
		stringDeque1.add("Dassault Systems");
		stringDeque1.add("Apple");
		stringDeque1.add("Alphabet");
//   stringDeque1.add(null);                                      // Queue doesn't allow null values

		System.out.println("StringDeque1: " + stringDeque1);

		Queue<String> stringDeque2 = new ArrayDeque<String>();
		;
		stringDeque2.add("Yogesh");
		stringDeque2.add("Rohit");
		stringDeque2.add("Ajay");
		stringDeque2.add("Aniket");
		stringDeque2.add("Varun");
		stringDeque2.add("Sumit");
		stringDeque2.add("Balaji");

		System.out.println("StringDeque2: " + stringDeque2);

	}

}
