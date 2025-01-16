package inheritance.simple;

public class Person {
    //properties
    private String firstName;
    private String lastName;

    //setting data
    public void setPersonInfo(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    //display
    public void  displayPersonInfo(){
        System.out.println("Name: "+firstName+ " "+lastName);
    }
}
