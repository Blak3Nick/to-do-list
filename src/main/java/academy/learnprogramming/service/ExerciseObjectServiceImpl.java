package academy.learnprogramming.service;

import academy.learnprogramming.model.ExerciseData;
import academy.learnprogramming.model.ExerciseObject;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.List;

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
        return exerciseData.getExerciseObject(id);
    }

    @Override
    public void updateExerciseObject(ExerciseObject item) {
        exerciseData.updateExerciseObject(item, item.getId());

    }

    @Override
    public List<ExerciseObject> getExerciseData() {
        return exerciseData.getExercises();
    }
}
