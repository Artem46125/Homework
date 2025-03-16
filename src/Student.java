import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Student {
    private String name;
    private String group;
    private int course;
    private double[] grades;

    public Student(String name, String group, int course, double[] grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public double getAverageGrade() {
        if (grades.length == 0) {
            return 0;
        }
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    public void promote() {
        if (course < 5) {
            this.course++;
        } else {
            System.out.println(name + " Выпускник");
        }
    }
    @Override
    public String toString() {
        return "Студент: " + name + ", Группа: " + group + ", Курс: " + course + ", Средний балл: " + getAverageGrade();
    }
}


class StudentManager {
    private Set<Student> students;

    public StudentManager() {
        students = new HashSet<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudents() {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3.0) {
                iterator.remove();
            }
        }
    }

    public void promoteStudents() {
        for (Student student : students) {
            if (student.getAverageGrade() >= 3.0) {
                student.promote();
            }
        }
    }

    public void printStudents(int course) {
        System.out.println("Студенты курса " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}

class Mainn {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        manager.addStudent(new Student("Иван Иванов", "Группа A", 1, new double[]{4, 5, 3}));
        manager.addStudent(new Student("Петр Петров", "Группа B", 1, new double[]{2, 2, 2}));

        manager.removeStudents();
        System.out.println("После удаления студентов с низкими оценками:");
        manager.printStudents(1);

        manager.promoteStudents();
        System.out.println("После повышения студентов:");
        manager.printStudents(1);
    }
}