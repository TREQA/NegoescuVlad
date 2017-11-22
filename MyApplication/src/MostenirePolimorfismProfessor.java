public abstract class MostenirePolimorfismProfessor extends MostenirePolimorfismPerson{

    public String className;
    public MostenirePolimorfismProfessor(String firstName, String lastName, String className){
        super (firstName, lastName);
        this.className = className;
    }


}
