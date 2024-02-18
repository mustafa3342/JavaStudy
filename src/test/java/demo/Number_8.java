package demo;
import java.util.Arrays;

/*
A group of friends are playing a video game together.
During the game, each plaver earns a number of points.
At the end of a round, players who achieve at least a certain rank get to "level up" their characters to gain increased
abilities. Given the scores of the players at the end of a round, how many players will be able to level up?
Note: Players with equal scores will have equal ranks, but the player with the next lower score
will be ranked based on the position within the list of all players scores.
For example, if there are four plavers, and three players tie for first place, their ranks are 1, 1, 1, and 4.
Note: No player with a score of 0 can level up, regardless of rank. Example n= 4 k=3 scores [100, 50, 50, 251]
 */
public class Number_8 {

        public static void main(String[] args) {
            int n = 4;
            int k = 3;
            int[] scores = {100, 50, 50, 251};
            int result = countLevelUpPlayers(n, k, scores);
            System.out.println(result);
        }

        public static int countLevelUpPlayers(int n, int k, int[] scores) {
            Arrays.sort(scores);
            int rank = 1;
            int levelUpCount = 0;

            for (int i = n - 1; i >= 0; i--) {
                if (scores[i] == 0 || rank > k) {
                    break;
                }
                levelUpCount++;
                if (i > 0 && scores[i] != scores[i - 1]) {
                    rank++;
                }
            }

            return levelUpCount;
        }
}

