package com.dkss;

public class VipPerson {

    private String name;
    private double creditlimit;
    private String email;



    public VipPerson()
    {
        this("dks", 60000, "dks@gmail.com");
    }
    public VipPerson(String name, double creditlimit) {
        this(name, creditlimit, "unknown@gmail.com");
    }

    public VipPerson(String name, double creditlimit, String email) {
        this.name = name;
        this.creditlimit = creditlimit;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public double getCreditlimit() {
        return creditlimit;
    }

    public String getEmail() {
        return email;
    }
}
