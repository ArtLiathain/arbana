import java.util.*;
import java.time.Duration;
import java.time.LocalDateTime;
import java.io.*;

public class ThreadName0 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("SampleValues.txt"));
        ArrayList<Integer> nums = new ArrayList<Integer>();
        while (s.hasNext()) {
            nums.add(Integer.parseInt(s.next()));
        }
        s.close();
        LocalDateTime startTime = LocalDateTime.now();
        int target = 398;
        int[] answer = new int[2];
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) == target) {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        LocalDateTime endDateTime = LocalDateTime.now();
        Duration duration = Duration.between(startTime, endDateTime);
        double time = duration.toMillis();
        System.out.println("[" + answer[0] + "," + answer[1] + "]" + ':' + time);
    }
}