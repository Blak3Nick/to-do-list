package academy.learnprogramming.service;

import academy.learnprogramming.model.ExerciseData;
import academy.learnprogramming.model.ExerciseObject;

public interface ExerciseObjectService {

    void addExerciseObject(ExerciseObject exerciseObject);
    void removeExerciseObject(int id);
    ExerciseObject getExerciseObject(int id);
    void updateExerciseObject(ExerciseObject item);
    ExerciseData getData();
}
