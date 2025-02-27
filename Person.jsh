person1.name
person1.age
person1 = new Person("Alice", 25)
person2 = new Person("Bob", 30)
person1.sayHello()
person1.haveBirthday();
person1.talkAboutHomeTown();
person2.haveBirthday();
person2.talkAboutHomeTown();
class Person {
    String name;
    int age;
    String homeTown;
    String homeState;
    
    Person(String n, int a, String t, String s) {
        name = n;
        age = a;
        homeTown = t;
        homeState = s;
    }
    
    void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
    
    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    } 
           
    boolean isAdult() {
        return age >= 18;
    }
    
    boolean isOver21() {
        return age >= 21;
    }
        
    void haveBirthday() {
        age = age + 1;
        System.out.println("Happy Birthday! " + name + " is now " + age);
    }
    
    void talkAboutHomeTown() {
        System.out.println("My home town is " + homeTown + ", it's in " + homeState);
    }
    
    void canVote() {
        if (age >= 18) {
            System.out.println("Congrats! You can vote!");
        } else {
            System.out.println("Sorry, you're not old enough to vote yet.");
        }
    }
    
    void canDrink() {
        if (age >= 21) {
            System.out.println("Congrats! You can have alcohol!");
        } else {
            System.out.println("Sorry, you're not old enough to drink yet.");
        }
    }
}
Person person1 = new Person("Alice", 25, "West Haven", "Connecticuit");
Person person2 = new Person("Bob", 30, "Chicago", "Illinois");
person1.printDetails();
person1.isAdult();
person1.canVote();
Person person3 = new Person("John", 17, "Albany", "New York");
person3.canVote();
person2.canDrink();
person3.canDrink();
person3.haveBirthday();
person3.canVote();
person3.canDrink();
person2.printDetails();