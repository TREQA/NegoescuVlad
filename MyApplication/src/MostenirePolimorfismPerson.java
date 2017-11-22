public abstract class MostenirePolimorfismPerson {

    public final String SCHOOL_NAME = "ITAcademy";
    public String firstName;
    public String lastName;

    public MostenirePolimorfismPerson (String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void run(){
        // logic goes here
    }

    public abstract String getLastName();
}
