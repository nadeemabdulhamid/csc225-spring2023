public class StudentNameGetter implements IFunc<Student, String> {
    public String apply( Student s ) {
        return s.getName();
    }
}