package ch.juventus.se.problemstofix.person;

public class PersonMapper {

    public Student mapPersonToStudent(Person person) {
        Student student = new Student();

        student.setFirstName(person.getFirstName());
        student.setLastName(person.getLastName());
        student.setAddress(person.getAddress());
        student.setBirthday(person.getBirthday());

        return student;
    }

    public Person mapStudentToPerson(Student student) {
        Person person = new Person(student.getFirstName(), student.getLastName(), student.getBirthday(),
                student.getAddress(), null, null, false );


        return person;
    }
}
