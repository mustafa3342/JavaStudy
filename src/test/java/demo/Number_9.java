package demo;
/*
Erica and Bob participate in a friendly Hackathon that allows each to solve one question a day out of the three offered.

There will be one easy, one medium and one hard question, with points awarded based on difficulty. The participant can also choose to skip a question.
The winner is the one with the highest score at the end of the competition based on the following scale.

In case of a tie, the person who solves the most hard problems wins.

If it's the same, the one with more medium problems wins; otherwise, the one with more easy problems wins. If they both have the same score and the same number of problems at the same difficulty level, then it's a tie Scoring Table Difficulty Skip (S) Easy (E) Medium (M) Hard (H) Points You will be given two strings with each character of the strings indicating the difficulty of the problem solved on dayli] of the Hackathon by a coder.

You are to calculate the scores for Erica and Bob and then return the name of the winner: Erica, Bob or if they tie: Tie Function Description Complete the function winner in the editor below.
The function must return the name of the winner: Erica or Bob, or Tie if their scores are equal and they've done the same number of problems at each difficulty level winner has the following parameter(s): erica: a string where ericalil denotes the difficulty of the problem she solved on day i bob: an string where boblil denotes the difficulty of the problem he solved on day

 */
public class Number_9 {

    public static void main(String[] args) {
        String erica = "EHM";
        String bob = "MMS";
        String winner = winner(erica, bob);
        System.out.println(winner);
    }

    public static String winner(String erica, String bob) {
        int ericaScore = calculateScore(erica);
        int bobScore = calculateScore(bob);

        if (ericaScore > bobScore) {
            return "Erica";
        } else if (bobScore > ericaScore) {
            return "Bob";
        } else {
            return "Tie";
        }
    }

    public static int calculateScore(String s) {
        int score = 0;
        int easyCount = 0, mediumCount = 0, hardCount = 0;

        for (char c : s.toCharArray()) {
            switch (c) {
                case 'S':
                    break;
                case 'E':
                    score += 1;
                    easyCount++;
                    break;
                case 'M':
                    score += 3;
                    mediumCount++;
                    break;
                case 'H':
                    score += 5;
                    hardCount++;
                    break;
            }
        }

        // Bonus points based on number of hard, medium, and easy problems solved
        if (hardCount > 0) {
            score += 2 * (hardCount - 1);
        }
        if (mediumCount > 0) {
            score += 2 * (mediumCount - 1);
        }
        if (easyCount > 0) {
            score += 2 * (easyCount - 1);
        }

        return score;
    }

}
