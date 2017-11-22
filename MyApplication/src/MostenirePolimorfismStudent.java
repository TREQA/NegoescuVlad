public abstract class MostenirePolimorfismStudent extends MostenirePolimorfismPerson {

    public String indexNumber;

    public MostenirePolimorfismStudent (String firstName, String lastName, String indexNumber){
        super (firstName, lastName);
        this.indexNumber = indexNumber;
    }

    @Override
    public String getLastName() {
        return lastName;
    }
}
