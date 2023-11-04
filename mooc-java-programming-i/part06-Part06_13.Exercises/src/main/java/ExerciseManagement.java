
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciseManagement {

    private final ArrayList<Exercise> exercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }

    public ArrayList<String> exerciseList() {
        List<String> list = exercises.stream()
                .map(Exercise::getName)
                .collect(Collectors.toList());
        return new ArrayList<>(list);
    }

    public void add(String exercise) {
        exercises.add(new Exercise(exercise));
    }

    public void markAsCompleted(String exerciseName) {
        exercises.stream()
                .filter(exercise -> exercise.getName().equals(exerciseName))
                .forEach(exercise -> exercise.setCompleted());
    }

    public boolean isCompleted(String exerciseName) {
        return exercises.stream()
                .filter(exercise -> exercise.getName().equals(exerciseName))
                .map(Exercise::isCompleted)
                .findFirst()
                .orElse(false);
    }
}
