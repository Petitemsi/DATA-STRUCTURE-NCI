/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jpw2lab2person;

import java.util.ArrayList;

/**
 *
 * @author JPower
 */
public class PersonApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Person> pList = new ArrayList<>();
        Person person1, person2, person3;
        
        //Task 1
        System.out.println("Task 1 start");
        person1 = new Person("Julie", 20);
        person2 = new Person("Sarah", 10);
        person3 = new Person("John", 30);

        pList.add(person1);
        pList.add(person2);
        pList.add(person3);
        
        //Task 2
        System.out.println("Task 2 start");
        for(int i=0; i<pList.size(); i++){
            Person currPerson;
            currPerson = pList.get(i);
            System.out.println(currPerson.printPerson());
        }
        
        //Task 3
        System.out.println("Task 3 start");
        Person person4;
        person4 = new Person("Mark", 40);
        pList.add(1, person4);
        
        //Task 4
        System.out.println("Task 4 start");
        for(int i=0; i<pList.size(); i++){
            System.out.println(pList.get(i).printPerson()); //streamlined version
        }

        //Task 5 
        System.out.println("Task 5 start");
        pList.remove(0);
        
        //Task 6
        System.out.println("Task 6 start");
        for(Person p : pList){ // for each loop
            System.out.println(p.printPerson()); 
        }
        
        //Task 7
        System.out.println("Task 7 start");
        String searchPerson = "Sarah";
        for(int i=0; i<pList.size(); i++){
            Person currPerson = pList.get(i); //done in one line here
            if (currPerson.getName().equals(searchPerson)){
                System.out.println(currPerson.printPerson()); //already have person object
                System.out.println("Found " + searchPerson + " at index " + i);
                break;
            }
        }
    }
}    
        