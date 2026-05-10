import java.util.*;

class Solution {

    public int[] deckRevealedIncreasing(int[] deck) {

        int n = deck.length;

        Arrays.sort(deck);

        int[] result = new int[n];

        Queue<Integer> queue = new LinkedList<>();

        // store indexes
        for(int i = 0; i < n; i++) {
            queue.offer(i);
        }

        for(int card : deck) {

            // place smallest card
            int index = queue.poll();

            result[index] = card;

            // move next index to back
            if(!queue.isEmpty()) {
                queue.offer(queue.poll());
            }
        }

        return result;
    }
}
   