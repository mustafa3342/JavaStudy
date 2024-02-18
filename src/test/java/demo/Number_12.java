package demo;

import java.util.Arrays;

/*
A start-up owner is looking to meet new investors to get some funds for his company.
Each investor has a tight schedule that the owner has to respect.
Given the schedules of the days investors are available, determine how many meetings the owner can schedule.
Note that the owner can only have one meeting per day.

The schedules consists of two integer arrays, firstDay and lastDay.
Each element in the array firstDay represents the first day an investor is available, and each element in lastDay
represents the last day an investor is available, both inclusive.

Example:

firstDay = [1,2,3,3,3]

lastDay= [2,2,3,4,4]


There are 5 investors [I-0, I-1, I-2, I-3, I-4]
The investor I-0 is available from day 1 to day 2 inclusive [1, 2]
The investor I-1 is available in day 2 only [2, 2]. The investor I-2 is available in day 3 only [3, 3]
The investors I-3 and I-4 are available from day 3 to day 4 only [3, 4]
The owner can only meet 4 investors out of 5 : I-0 in day 1, I-1 in day 2, I-2 in day 3 and I-3 in day 4.
The graphic below shows the scheduled meetings in green and blocked days are in gray.

Bar chart showing investors' availability. Green bars represent scheduled meetings, gray bars indicate blocked days.


Function Description

Complete the function countMeetings in the editor below.



countMeetings has the following parameters:

    int firstDay[n]:  an array of integers where the value of each element firstDay[i] is the first day the i-th investor is available to meet.

    int lastDay[n]:  an array of integers where the value of each element lastDay[i] is the last day the ith investor is available to meet.

Returns:

    int: an integer that represents the maximum number of meetings possible.



Constraints

1 ≤ n ≤ 105
1 ≤ firstDay[i], lastDay[i] ≤ 105 (where 0 ≤ i < n)
firstDay[i]  ≤ lastDay[i] (where 0 ≤ i < n)


Input Format For Custom Testing
The first line contains an integer, n, that denotes the number of elements in firstDay.

Each line i of the n subsequent lines (where 0 ≤ i < n) contains an integer that describes firstDay[i].

The next line contains the integer, n, that denotes the number of elements in lastDay.

Each line i of the n subsequent lines (where 0 ≤ i < n) contains an integer that describes lastDay[i]i.

Sample Case 0
Sample Input For Custom Testing

STDIN     Function
-----     --------
3    →    firstDay[] size n = 3
1    →    firstDay= [1, 1, 2]
1
2
3    →    lastDay[] size n = 3
1    →    lastDay = [1, 2, 2]
2
2
Sample Output

2
Explanation

There are 3 investors [I-0, I-1, I-2]
The investor I-0 is available in day 1 inclusive : [1, 1]
The investor I-1 is available from day 1 to day 2  : [1, 2]
The investors I-2 is available in day 2 :  [2, 2]
The owner can only meet 2 investors out of 3 : I-0 in day 1, I-2 in day 2. The graphic below shows the scheduled meetings in green and blocked days are in gray.
Bar chart showing investors' availability. Green bars represent scheduled meetings, gray bars indicate blocked days.

 */
public class Number_12 {

    public static void main(String[] args) {
        int[] firstDay = {1, 1, 2};
        int[] lastDay = {1, 2, 2};

        int result = countMeetings(firstDay, lastDay);
        System.out.println(result); // Output: 2
    }

    public static int countMeetings(int[] firstDay, int[] lastDay) {
        int n = firstDay.length;
        Meeting[] meetings = new Meeting[n];

        // Create an array of Meeting objects
        for (int i = 0; i < n; i++) {
            meetings[i] = new Meeting(firstDay[i], lastDay[i]);
        }

        // Sort the meetings by their last day
        Arrays.sort(meetings, (a, b) -> Integer.compare(a.lastDay, b.lastDay));

        boolean[] visited = new boolean[100001]; // To mark visited days
        int count = 0;

        for (Meeting meeting : meetings) {
            for (int day = meeting.firstDay; day <= meeting.lastDay; day++) {
                if (!visited[day]) {
                    visited[day] = true;
                    count++;
                    break; // Move to the next meeting
                }
            }
        }

        return count;
    }

    static class Meeting {
        int firstDay;
        int lastDay;

        Meeting(int firstDay, int lastDay) {
            this.firstDay = firstDay;
            this.lastDay = lastDay;
        }
    }

}
