package com.dkss;

public class Main {

    public static void main(String[] args) {



        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());


        VipPerson person2 = new VipPerson("dk",88.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("dhw",1111.7,"dk@kk.com");
        System.out.println(person3.getEmail());

    }
}
