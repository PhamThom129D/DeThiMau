package DeThi2;

import java.io.Serializable;

public class Person implements Serializable {
    private String personID;
    private String personName;
    private String dateOfBirth;
    public Person(String personID, String personName, String dateOfBirth) {
        this.personID = personID;
        this.personName = personName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return
                "personID='" + personID + '\'' +
                ", personName='" + personName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'';
    }
}
