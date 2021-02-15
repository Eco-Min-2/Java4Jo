package Feb15;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Feb15_2 {
    static class Student {
        private final String name;
        private final int grade;
        private final boolean graduated;
        private final int age;
        private final LocalDate entranceDate;

        public Student(String name, int grade, boolean graduated, int age, LocalDate entranceDate) {
            this.name = name;
            this.grade = grade;
            this.graduated = graduated;
            this.age = age;
            this.entranceDate = entranceDate;
        }

        public String getName() {
            return name;
        }

        public int getGrade() {
            return grade;
        }

        public boolean isGraduated() {
            return graduated;
        }

        public int getAge() {
            return age;
        }

        public LocalDate getEntranceDate() {
            return entranceDate;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", grade=" + grade +
                    ", graduated=" + graduated +
                    ", age=" + age +
                    ", entranceDate=" + entranceDate +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("a", 4, true, 28, LocalDate.of(2013, 1, 12)),
                new Student("a-1", 4, true, 29, LocalDate.of(2012, 2, 10)),
                new Student("a-2", 4, true, 30, LocalDate.of(2011, 3, 12)),
                new Student("a-3", 4, true, 27, LocalDate.of(2014, 4, 7)),
                new Student("a-4", 4, true, 27, LocalDate.of(2014, 5, 30)),
                new Student("b", 1, false, 20, LocalDate.of(2021, 1, 1)),
                new Student("c", 2, false, 21, LocalDate.of(2020, 7, 23)),
                new Student("d", 3, false, 22, LocalDate.of(2019, 8, 28)),
                new Student("e", 4, false, 25, LocalDate.of(2017, 9, 26)),
                new Student("f", 2, false, 23, LocalDate.of(2020, 10, 13))
        );
        //학생 전체 리스트
        System.out.println("학생 전체 리스트");
        for (Student student : studentList) {
            System.out.println(student.toString());
        }
        System.out.println("=================================");
        //졸업자 학생만 조회
        System.out.println("졸업자 학생들");
        for (Student student : studentList) {
            if (student.isGraduated()) {
                System.out.println(student.toString());
            }
        }
        System.out.println("=================================");
        //신입생만 조회
        System.out.println("신입생만 조회");
        for (Student student : studentList) {
            if (student.getGrade() == 1) {
                System.out.println(student.toString());
            }
        }
        System.out.println("=================================");
        //재학생 평균 나이
        System.out.println("재학생 평균 나이");
        int avgAge = 0;
        int count = 0;
        for (Student student : studentList) {
            if (!student.isGraduated()) {
                avgAge += student.getAge();
                count++;
            }
        }
        System.out.println("재학생 전체 나이 평균은 = " + (avgAge / count));

        System.out.println("=================================");
        //가장 오래된 학생
        System.out.println("졸업자 중 가장 오래된 학생은");
        LocalDate localDate = LocalDate.of(30000, 1, 1);
        for (Student student : studentList) {
            if (localDate.isAfter(student.getEntranceDate())) {
                localDate = student.getEntranceDate();
            }
        }
        for (Student student : studentList) {
            if (student.getEntranceDate().equals(localDate)) {
                System.out.println(student.toString());
            }
        }
    }
}
