package com.ask.sample;

public class CustomerServiceCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] callsTimes = {{0,20}, {0,40}, {30,35}};
				
		
		howManyAgentsToAdd(1, callsTimes);
	}

	static int howManyAgentsToAdd(int noOfCurrentAgents, int[][] callsTimes) {
		int requiredAgent = 0;
		
		int[] query = new int[2];
		if (callsTimes.length > 0) {
			query[0] = callsTimes[0][0];
			query[1] = callsTimes[0][1];
		}
		for (int outLoop = 0; outLoop < callsTimes.length-1; outLoop++) {
			query[0] = callsTimes[outLoop][0];
			query[1] = callsTimes[outLoop][1];
			int count =0;
			for (int i = outLoop+1; i < callsTimes.length; i++) {
					if (callsTimes[i][0] >= query[0] && (callsTimes[i][0] <= query[1] || callsTimes[i][1] <= query[1])  ) {
						count++;
					}
			}
			requiredAgent = Math.max(count, requiredAgent);
			if (requiredAgent > noOfCurrentAgents) {
				requiredAgent = Math.abs(noOfCurrentAgents-requiredAgent);
			}
		}
		
		
		
		return requiredAgent;

    }
}
