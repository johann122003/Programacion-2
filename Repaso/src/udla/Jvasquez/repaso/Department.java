package udla.Jvasquez.repaso;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Professor> professors;

    public Department(String name) {
        this.name = name;
        this.professors = new ArrayList<>();
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public String getName() {
        return name;
    }
}