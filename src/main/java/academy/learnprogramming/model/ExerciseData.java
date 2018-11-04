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
    private final List<ExerciseObject> items = new ArrayList<>();

    //constructors
    public ExerciseData() {
        //add dummy data
        addItem(new ExerciseObject("first", "first details", LocalDate.now()));
        addItem(new ExerciseObject("second", "second details", LocalDate.now()));
        addItem(new ExerciseObject("third", "third details", LocalDate.now()));
    }
    // public methods
    public List<ExerciseObject> getItems() {
        return Collections.unmodifiableList(items);
    }

    public void addItem(@NonNull ExerciseObject toAdd) {
        toAdd.setId(idValue);
        items.add(toAdd);
        idValue ++;
    }
    public void removeItem(int id) {
        ListIterator<ExerciseObject> itemIterator = items.listIterator();

        while (itemIterator.hasNext()) {
            ExerciseObject item = itemIterator.next();
            if(item.getId() == id) {
                itemIterator.remove();
                break;
            }
        }
    }

    public ExerciseObject getItem(int id) {
        for (ExerciseObject item: items) {
            if(item.getId() == id) {
                return item;
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
