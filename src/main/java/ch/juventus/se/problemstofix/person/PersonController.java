package ch.juventus.se.problemstofix.person;

import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PersonController {

    public List<Person> removeAllLindas (List<Person> people) {
        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if(person.getFirstName().equals("Lina")) {
                iterator.remove();
            }
        }
        return people;
    }

    public List<Person> removeAllUnderage (List<Person> people) {

        Calendar cal = Calendar.getInstance();
        Date today = cal.getTime();
        cal.add(Calendar.YEAR, -18);
        Date referenceDate = cal.getTime();

        people.removeIf(p -> p.getBirthday().after(referenceDate));
        return people;
    }

    public List<Person> removeAllWitLetterAInName(List<Person> people) {

        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            if(iterator.next().getLastName().toLowerCase().startsWith("a")) {
                iterator.remove();
            }
        }

        return people;
    }
}
