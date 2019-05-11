package ch.juventus.se.problemstofix.person;

/**
 * @author: Linda Krüger
 * @since: 21.09.17
 */
public class PersonMapper {

    public Student mapPersonToStudent(Person person) {
        Student student = new Student();

        student.setFirstName(person.getFirstName());
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
