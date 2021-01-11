package homework7;

import java.time.LocalDate;

/**
 * Created by Gohar Farmanyan
 */

public class Task {
    private final String taskName;
    private final Asignee asignee;
    private final Status status;
    private final Priority priority;

    public Task(String taskName, Asignee asignee, Status status, Priority priority) {
        this.taskName = taskName;
        this.asignee = asignee;
        this.status = status;
        this.priority = priority;
    }

    public String getTaskName() {
        return taskName;
    }

    public Asignee getAsignee() {
        return asignee;
    }

    public Status getStatus() {
        return status;
    }

    public Priority getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return String.format("{ tskName: %s, asignee: %s, status: %s, priority: %s }", taskName, asignee, status, priority);
    }

    private static int createRandomIntBetween(int first, int second) {
        return first + (int) Math.round(Math.random() * (second - first));
    }

    public static LocalDate createEndDate(int startYear, int endYear) {
        int day = createRandomIntBetween(1, 28);
        int month = createRandomIntBetween(1, 12);
        int year = createRandomIntBetween(startYear, endYear);
        return LocalDate.of(year, month, day);
    }
}
