package collections;

import java.util.*;

public class  ArrayDeque1 {
	public static void main(String[] args) {
		Deque<String> ad = new ArrayDeque<>();
		ad.add("Bannana");
		ad.add("apple");
		ad.addFirst("cherrey");
        ad.addLast("pineapple");
        ad.offer("kiwi");
        ad.offerLast("mango");
        ad.offerFirst("grapes");
        System.out.println(ad);
        System.out.println(ad.peek());
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());
        System.out.println(ad.poll());
        System.out.println(ad);
        System.out.println(ad.pollFirst());
        System.out.println(ad);
        System.out.println(ad.pollLast());
        System.out.println(ad);
        System.out.println(ad.size());
        
	}

}
