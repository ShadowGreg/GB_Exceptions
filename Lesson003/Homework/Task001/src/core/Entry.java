package core;

public class Entry {

    protected String name;
    protected String patronymic;
    protected String lastNme;
    protected String birthDate;
    protected int phoneNumber;

    public Entry() {
        new Entry(
                "",
                "",
                "",
                "",
                0);
    }

    public Entry(String name, String patronymic, String lastNme, String birthDate, int phoneNumber) {
        this.name = name;
        this.patronymic = patronymic;
        this.lastNme = lastNme;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    protected enum Gender {
        male,
        female
    }

    ;

}
