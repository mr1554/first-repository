public class GradeBook {
    private String personName;

    public GradeBook (String name) {
        personName = name;
    }


    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void DisplayMsg() {
        System.out.println("fuck U " + getPersonName() + "\n");
    }
}
