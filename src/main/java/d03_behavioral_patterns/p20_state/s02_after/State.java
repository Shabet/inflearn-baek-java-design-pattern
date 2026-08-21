package d03_behavioral_patterns.p20_state.s02_after;

public interface State {

    void addReview(String review, Student student);

    void addStudent(Student student);
}
