package academy.learnprogramming.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class ExerciseObject {
    private int id;
    private SetRepModel setRepModel;
    private LocalDateTime dateTime;

    public ExerciseObject(int id, SetRepModel setRepModel, LocalDateTime dateTime) {
        this.id = id;
        this.setRepModel = setRepModel;
        this.dateTime = dateTime;
    }

    public int getId() {
        return id;
    }

    public SetRepModel getSetRepModel() {
        return setRepModel;
    }

    public void setSetRepModel(SetRepModel setRepModel) {
        this.setRepModel = setRepModel;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
