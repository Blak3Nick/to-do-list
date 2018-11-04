package academy.learnprogramming.controller;

import academy.learnprogramming.model.ExerciseData;
import academy.learnprogramming.util.Mappings;
import academy.learnprogramming.util.ViewNames;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ExerciseLoggerController {
    //model attribute
    @ModelAttribute
    public ExerciseData exerciseData() {
        return new ExerciseData();
    }

    @GetMapping(Mappings.EXERCISES)
    public String items() {
        return ViewNames.EXERCISE_LOG;
    }
}
