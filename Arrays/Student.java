
public class Student {

    private int id;
    private String name;

    public Student(int id, String name) {
        //TODO Auto-generated constructor stub
        this.id=id;
        this.name=name;
    }

    public String toString()
    {
         return "Student"+"["+ "id: " +id+"name: "+name+"]";
    }

}
