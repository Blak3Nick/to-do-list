package academy.learnprogramming.model;

import java.util.List;

public class SetRepModel {
    private List<Integer> sets;
    private List<Integer> reps;
    private List<Double> weightUsed;

    public SetRepModel(List<Integer> sets, List<Integer> reps, List<Double> weightUsed) {
        this.sets = sets;
        this.reps = reps;
        this.weightUsed = weightUsed;
    }
}
