package academy.learnprogramming.model;

import lombok.NonNull;

import java.time.LocalDate;
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
        addExerciseObject(new ExerciseObject("first", "first details", LocalDate.now()));
        addExerciseObject(new ExerciseObject("second", "second details", LocalDate.now()));
        addExerciseObject(new ExerciseObject("third", "third details", LocalDate.now()));
    }
    // public methods
    public List<ExerciseObject> getItems() {
        return Collections.unmodifiableList(exercises);
    }

    public void addExerciseObject(@NonNull ExerciseObject toAdd) {
        toAdd.;
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

    public ExerciseObject getItem(int id) {
        for (ExerciseObject exerciseObject: exercises) {
            if(exerciseObject.getId() == id) {
                return exerciseObject;
            }
        }
        return null;
    }

    public void updateItem(@NonNull ExerciseObject toUpdate) {
        ListIterator<ExerciseObject> itemIterator = items.listIterator();
        while (itemIterator.hasNext()) {

            ExerciseObject item = itemIterator.next();

            if(item.equals(toUpdate)) {
                itemIterator.set(toUpdate);
                break;
            }

        }
    }

}
