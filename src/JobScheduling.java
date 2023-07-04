import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JobScheduling {
    int profit;
    char jobName;
    int deadline;

//    public JobScheduling() {}

    public JobScheduling(char jobName, int deadline, int profit) {
        this.jobName = jobName;
        this.deadline = deadline;
        this.profit = profit;
    }
    public static void main(String[] args) {
        List<JobScheduling> al = new ArrayList<>();
        al.add(new JobScheduling('1', 5, 55));
        al.add(new JobScheduling('2', 2, 65));
        al.add(new JobScheduling('3', 7, 75));
        al.add(new JobScheduling('4', 3, 60));
        al.add(new JobScheduling('5', 2, 70));
        al.add(new JobScheduling('6', 1, 50));
        al.add(new JobScheduling('7', 4, 85));
        al.add(new JobScheduling('8', 5, 68));
        al.add(new JobScheduling('9', 3, 45));
        int maxDeadline = 7;
        jobSchedule(al, maxDeadline );

    }

    private static void jobSchedule(List<JobScheduling> al, int maxDeadline) {
//        1. Sort the array by profit
        Collections.sort(al, (a,b) -> b.profit - a.profit);

        boolean[] result = new boolean[maxDeadline];
        char[] jobs = new char[maxDeadline];

        for (int i =0; i< al.size(); i++) {
            for (int j = Math.min(al.get(i).deadline -1, maxDeadline -1); j>=0; j--) {
                if(!result[j]) {
                    result[j] = true;
                    jobs[j] = al.get(i).jobName;
                    break;
                }
            }
        }

        for (char ele:
             jobs) {
            System.out.print(ele+ " ");

        }
    }
}
