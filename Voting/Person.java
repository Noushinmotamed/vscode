 class Person {
    private String firstName,lastName;
    Person (String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void setPerson(String firstName,String lastName){  //setter ?

    }

    String getFirstName(){
        return firstName;
    }
    String getLastName(){
        return lastName;
    }

    String ToString(){
        return firstName + " " + lastName;
    }
}
