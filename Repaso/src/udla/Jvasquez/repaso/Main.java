package udla.Jvasquez.repaso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear el colegio
        System.out.println("Ingrese el nombre del colegio:");
        String collegeName = scanner.nextLine();
        System.out.println("Ingrese la dirección del colegio:");
        String collegeAddress = scanner.nextLine();
        System.out.println("Ingrese el teléfono del colegio:");
        String collegePhone = scanner.nextLine();
        College college = new College(collegeName, collegeAddress, collegePhone);

        // Agregar estudiantes
        System.out.println("¿Cuántos estudiantes desea agregar?");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ":");
            String studentName = scanner.nextLine();
            System.out.println("Ingrese el ID del estudiante " + (i + 1) + ":");
            String studentId = scanner.nextLine();
            college.addStudent(new Student(studentName, studentId));
        }

        // Agregar departamentos
        System.out.println("¿Cuántos departamentos desea agregar?");
        int numDepartments = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        for (int i = 0; i < numDepartments; i++) {
            System.out.println("Ingrese el nombre del departamento " + (i + 1) + ":");
            String departmentName = scanner.nextLine();
            Department department = new Department(departmentName);

            // Agregar profesores al departamento
            System.out.println("¿Cuántos profesores tiene el departamento " + departmentName + "?");
            int numProfessors = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            for (int j = 0; j < numProfessors; j++) {
                System.out.println("Ingrese el nombre del profesor " + (j + 1) + ":");
                String professorName = scanner.nextLine();
                department.addProfessor(new Professor(professorName));
            }

            college.addDepartment(department);
        }

        // Mostrar la información del colegio
        System.out.println("\nInformación del colegio:");
        System.out.println("Nombre: " + college.getName());
        System.out.println("Dirección: " + college.getAddress());
        System.out.println("Teléfono: " + college.getPhone());

        // Mostrar los estudiantes
        System.out.println("\nEstudiantes:");
        for (Student student : college.getStudents()) {
            System.out.println(" - " + student.getName() + " (ID: " + student.getStudentId() + ")");
        }

        // Mostrar los departamentos y sus profesores
        System.out.println("\nDepartamentos:");
        for (Department department : college.getDepartments()) {
            System.out.println(" - " + department.getName());
            System.out.println("   Profesores:");
            for (Professor professor : department.getProfessors()) {
                System.out.println("     * " + professor.getName());
            }
        }

        scanner.close();
    }
}