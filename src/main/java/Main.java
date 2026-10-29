import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        ArrayList<Student> listStudent = new ArrayList<>();

        listStudent.add(new Student("Ana",18.5));
        listStudent.add(new Student("Luis",16));
        listStudent.add(new Student("Maria",19.2));
        listStudent.add(new Student("Pedro",15.7));
        listStudent.add(new Student("Sofia",18.5));

        for (int i = 0; i < listStudent.size() - 1; i++) {
            for (int j = 0; j < listStudent.size() - 1 - i; j++) {
                if (listStudent.get(j).getGrade() < listStudent.get(j + 1).getGrade()) {
                    Student temp = listStudent.get(j);
                    listStudent.set(j, listStudent.get(j + 1));
                    listStudent.set(j + 1, temp);
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(listStudent.get(i).toString());
        }
    }
}
