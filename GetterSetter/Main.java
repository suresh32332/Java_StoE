class Emp {
    // that is private variable can't be access the outside of class
    private int id;
    private String name;

    // getter method
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // setter method
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class Main {
    public static void main(String[] args) {
        Emp obj = new Emp();
        obj.setId(12); // setter method is set the values 
        obj.setName("mano");
        System.out.println("emp name: " + obj.getName() + "\nemp id: " + obj.getId()); // getter method get the values 
    }

}
