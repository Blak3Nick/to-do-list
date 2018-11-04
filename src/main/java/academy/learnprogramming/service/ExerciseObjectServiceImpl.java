package academy.learnprogramming.service;

import academy.learnprogramming.model.ExerciseData;
import academy.learnprogramming.model.ExerciseObject;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
public class ExerciseObjectServiceImpl implements ExerciseObjectService {

    @Getter
    private final ExerciseData exerciseData = new ExerciseData();

    @Override
    public void addExerciseObject(ExerciseObject exerciseObject) {
        exerciseData.addExerciseObject(exerciseObject);
    }

    @Override
    public void removeExerciseObject(int id) {
        exerciseData.removeExerciseObject(id);
    }

    @Override
    public ExerciseObject getExerciseObject(int id) {
        return null;
    }

    @Override
    public void updateExerciseObject(ExerciseObject item) {

    }

    @Override
    public ExerciseData getData() {
        return null;
    }
}
