package Controller;

import Exceptions.AppException;
import Exceptions.ExceptionText;
import core.Person;

import java.io.FileWriter;
import java.io.IOException;

public class PersonWriter  implements AutoCloseable{
    //    public static void writePersonToFile(String lastName, String firstName, String patronymic, String birthDate, int phoneNumber, String gender) {
    private static Person person;

    public PersonWriter(Person inPerson) {
        person = inPerson;
    }

    public void writePersonToFile() throws AppException {
        String fileName = person.getLastName() + ".txt";
        String data = person.getFullData()+"\n";

        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(data);
        } catch (IOException e) {
            throw new AppException(ExceptionText.fileWrite);
        }
    }

    @Override
    public void close() throws Exception {
        System.gc();
    }
}
