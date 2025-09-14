
//  fruits is parent class 
class Fruits {
    public void showFruits() {
        System.out.println("apple " + "\nbanana" + "\nmango" + "\npineapple");
    }
}

// apple class inherit from parent class
class Apple extends Fruits {
    void appleBenifits() {
        super.showFruits(); // refer parent object
        System.out.println("apple : vitamin c ");
    }
}

// banna inherit apple
class Banana extends Apple {
    void bananaBenifits() {
         super.appleBenifits(); // refer parent object
        System.out.println("Banana :  maitains blood pressure");
    }
}

// mango inherit banana
class Mango extends Banana {
    void mangoBenifits() {
        super.bananaBenifits();
        System.out.println("Mango :  vitmin A and C - good for eyes"); // super key is refer the parent class object
    }
}

// pineapple inherit mango
class Pineapple extends Mango {
    void pineappleBenifits() {
        super.mangoBenifits(); // super key is refer the parent class object
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // create the object only child class
        Pineapple obj = new Pineapple();
        obj.pineappleBenifits();
    }

}
