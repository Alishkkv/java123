package lab4;

static class StudentService {
    void printStudent(main.Student s) {
        System.out.println("lab4.StudentService арқылы:");
        s.showInfo();
    }

    void changeMajor(main.Student s, String newMajor) {
        s.setMajor(newMajor);
    }
}