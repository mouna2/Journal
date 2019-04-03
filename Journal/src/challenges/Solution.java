package challenges;


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static class Job implements Comparable<Job> {
        int id;
        int deadline;
        int profit;
        public Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
        
        @Override
        public int compareTo(Job job) {
            return job.profit - this.profit;
        }
    }
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		while (tests-- > 0) {
			int size = sc.nextInt();
			Job[] array = new Job[size];
			for (int index = 0; index < size; index++) {
				array[index] = new Job(sc.nextInt(), sc.nextInt(), sc.nextInt());
			}

			Arrays.sort(array);
			int jobsCount = 0;
			int maxProfit = 0;
			int index = 0;
			boolean[] occupiedSlots = new boolean[size];
			while (index < size) {
				for (int i = Math.min(array[index].deadline, size) - 1; i >= 0; i--) {
					if (!occupiedSlots[i]) {
						// pick this
						jobsCount++;
						maxProfit += array[index].profit;
						occupiedSlots[i] = true;
						break;
					}
				}

				index++;
			}

			System.out.println(jobsCount + " " + maxProfit);
		}
	}
}