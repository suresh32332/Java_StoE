class Demo{
    private String userName;
    private String email;
    private String phoneNo;
    private int age ;
    
    //setter method 
    public void setUserName(String userName){
            this.userName=userName;
    }
    public void setEmail(String email){
        this.email= email;

    }
    public void setPhoneNo(String phoneNo){
        this.phoneNo= phoneNo;
    }
    public void setAge(int age){
        this.age= age;
    }
    // getter method 
    public String getUserName(){
        return userName;
    }
    public String getEmail(){
        return email;
    }
    public String getPhoneNO(){
        return phoneNo;
    }
    public int  getAge(){
        return age;
    }

}

class Encapsulation {
    public static void main(String args []){
      Demo obj =new Demo();

       //set the value or assign the value 
        obj.setUserName("Srikanth");
        obj.setEmail("sri12@gamil.com");
        obj.setPhoneNo("1233");
        obj.setAge(20);

        // get the value and store the temp variable 
        String name =obj.getUserName();
        String email =obj.getEmail();
        String phone =obj.getPhoneNO();
        int age = obj.getAge();

        System.out.println("name : " +name + "\n email : " + email + "\n phoneNo : " + phone + " \n age : " + age );

    }
}