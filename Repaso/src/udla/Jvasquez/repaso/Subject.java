package udla.Jvasquez.repaso;

public class Subject {
    private String name;
    private String subjectId;

    public Subject(String name, String subjectId) {
        this.name = name;
        this.subjectId = subjectId;
    }

    public String getName() {
        return name;
    }

    public String getSubjectId() {
        return subjectId;
    }
}