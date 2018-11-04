package academy.learnprogramming.model;

import lombok.Data;
import lombok.Getter;

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

    public List<Integer> getSets() {
        return sets;
    }

    public List<Integer> getReps() {
        return reps;
    }

    public List<Double> getWeightUsed() {
        return weightUsed;
    }
}
