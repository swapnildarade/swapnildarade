package Datastructure;

import java.util.Queue;

public class Queuedemo {

	
		
		public static void main(String[] args) {
			Queue<String> noQueue = new java.util.LinkedList<>();
			
			noQueue.add("one");
			noQueue.add("two");
			noQueue.add("three");
			noQueue.add("four");
			noQueue.add("five");
			System.out.println("Queue is : " + noQueue);
			System.out.println("Head of Queue : " + noQueue.peek());
			noQueue.remove();
			
			System.out.println("After removing Head of Queue : " + noQueue);
			noQueue.add("eight");
			System.out.println("After adding Head of Queue : " + noQueue);
			System.out.println("Size of Queue : " + noQueue.size());
		}
	}
