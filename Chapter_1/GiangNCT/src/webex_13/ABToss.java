package webex_13;

// 19. Alice tosses a fair coin until she sees two consecutive heads. 
// Bob tosses another fair coin until he sees a head followed by a tail.
// Write a program to estimate the probability that Alice will make fewer tosses than Bob?
public class ABToss {

	public static void main(String[] args) {
		int TRIALS = 1000000;
		int lessThanBob = 0;
		for (int i = 0; i < TRIALS; i++) {
			// Alice
			int aliceCount = 0;
			boolean prevHead = false, nextHead = false;
			prevHead = Math.random() < 0.5;
			while(true) {
				nextHead = Math.random() < 0.5;
				if(prevHead && nextHead) {
					aliceCount++;
					break;
				} else {
					aliceCount++;
					prevHead = nextHead;
				}
			}
			
			// Bob
			int bobCount = 0;
			boolean firstHead = false, secondTail = false;
			firstHead = Math.random() < 0.5;
			while(true) {
				secondTail = Math.random() > 0.5;
				if(firstHead && secondTail) {
					bobCount++;
					break;
				} else {
					bobCount++;
					firstHead = !secondTail;
				}
			}
			
			// Compare
			lessThanBob += aliceCount < bobCount ? 1 : 0;
		}
		System.out.println("Probability: " + lessThanBob / (double) TRIALS);
	}
}
