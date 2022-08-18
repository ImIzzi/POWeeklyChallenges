package weeklychallenge;

import java.util.ArrayList;

public class WeekChallenge1 {

    private ArrayList<Integer> answers;

    public WeekChallenge1() {
        answers = new ArrayList<Integer>();
        answers.add(0);
        answers.add(2);
    }

    public int solution(int n) {
        try { return answers.get(n); }
        catch(IndexOutOfBoundsException ignore) {
            for(int i = answers.size(); i <= n; i++) {
                answers.add(2*i + answers.get(i-2) + 1);
            }

            return answers.get(n);
        }
    }

}
