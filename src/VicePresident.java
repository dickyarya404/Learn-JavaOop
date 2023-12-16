class ViecPresident extends Manager{

    ViecPresident(String name){
        super(name);
    }
    // Method overriding
    void sayHello(String name) {
        System.out.println("Hi " + name + ", My Name is VP " + this.name);
    }
}

