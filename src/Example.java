class PrintInfo<T>{
    T parlimentMember;

    public PrintInfo(T parlimentMember) {
        this.parlimentMember = parlimentMember;
    }

    void print(){
        System.out.println(parlimentMember);
    }
}

class IdiotPerson{
    private int id;
    private String name;

    public IdiotPerson() {
    }

    IdiotPerson(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "IdiotPerson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class KnowladgablePerson{
    private int id;
    private String name;

    KnowladgablePerson() {
    }

    public KnowladgablePerson(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "KnowladgablePerson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Example {
    public static void main(String[] args) {
        KnowladgablePerson knowladgablePerson = new KnowladgablePerson(001,"Nimal");
        IdiotPerson idiotPerson = new IdiotPerson(01,"Sanath");
        PrintInfo<KnowladgablePerson> printInfo = new PrintInfo<>(knowladgablePerson);

        printInfo.print();
    }
}
