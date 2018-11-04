package academy.learnprogramming.model;

import lombok.NonNull;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ExerciseData {

    //fields
    private static int idValue =1;
    private final List<ExerciseObject> exercises = new ArrayList<>();

    //constructors
    public ExerciseData() {
        //add dummy data

        ArrayList<Integer> sets = new ArrayList<Integer>();
        sets.add(1);
        sets.add(2);
        ArrayList<Integer> reps = new ArrayList<Integer>();
        reps.add(5);
        reps.add(5);
        ArrayList<Double> weights = new ArrayList<Double>();
        weights.add(150.0);
        weights.add(150.0);
        SetRepModel setRepModel1 = new SetRepModel(sets,reps,weights);
        ExerciseObject exerciseObject = new ExerciseObject(idValue,setRepModel1,LocalDateTime.now());

        addExerciseObject(exerciseObject);

    }
    // public methods
    public List<ExerciseObject> getExercises() {
        return Collections.unmodifiableList(exercises);
    }

    public void addExerciseObject(@NonNull ExerciseObject toAdd) {
        exercises.add(toAdd);
        idValue ++;
    }
    public void removeExerciseObject(int id) {
        ListIterator<ExerciseObject> exerciseObjectListIteratorIterator = exercises.listIterator();

        while (exerciseObjectListIteratorIterator.hasNext()) {
            ExerciseObject exercise = exerciseObjectListIteratorIterator.next();
            if(exercise.getId() == id) {
                exerciseObjectListIteratorIterator.remove();
                break;
            }
        }
    }

    public ExerciseObject getExerciseObject(int id) {
        for (ExerciseObject exerciseObject: exercises) {
            if(exerciseObject.getId() == id) {
                return exerciseObject;
            }
        }
        return null;
    }

    public void updateExerciseObject(@NonNull ExerciseObject toUpdate, int id) {
        ListIterator<ExerciseObject> exerciseObjectListIterator = exercises.listIterator();
        while (exerciseObjectListIterator.hasNext()) {

            ExerciseObject exerciseObject = exerciseObjectListIterator.next();

            if(exerciseObject.getId() == toUpdate.getId()) {
                exerciseObject.updateExerciseObject(toUpdate.getSetRepModel(), toUpdate.getDateTime());
                break;
            }

        }
    }

}
