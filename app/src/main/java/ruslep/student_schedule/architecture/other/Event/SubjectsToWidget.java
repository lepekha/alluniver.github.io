package ruslep.student_schedule.architecture.other.Event;

import java.util.List;

import ruslep.student_schedule.architecture.model.entity.Subject;

/**
 * Created by Lepekha.R.O on 25.08.2016.
 */

public class SubjectsToWidget {
    public final List<Subject> message;

    public SubjectsToWidget(List<Subject> message) {
        this.message = message;
    }
}
