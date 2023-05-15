public class Classroom{
    public static void main(String[] args) {
        Wilder wilder1 = new Wilder("Ian", true);
        Wilder wilder2 = new Wilder("Max", false);
        Wilder wilder3 = new Wilder("Mehdi", true);
        Wilder wilder4 = new Wilder("Wilfrid", false);
        Wilder wilder5 = new Wilder("Maëlys", true);
        Wilder wilder6 = new Wilder("Julie", false);
        Wilder wilder7 = new Wilder("Théo", true);
        Wilder wilder8 = new Wilder("PJ", false);
        Wilder wilder9 = new Wilder("Wiliam", true);
        Wilder wilder10 = new Wilder("Lorraine", false);
        Wilder wilder11 = new Wilder("Nicolas", true);
        Wilder wilder12 = new Wilder("Johan", false);
        Wilder wilder13 = new Wilder("Julien", true);
        Wilder wilder14 = new Wilder("Théo", false);
        Wilder wilder15 = new Wilder("Pilou", true);

        Wilder[] wilders = {wilder1,wilder2,wilder3,wilder4,wilder5,wilder6,wilder7,wilder8,wilder9,wilder10,wilder11,wilder12,wilder13,wilder14,wilder15};

        for(int i=0; i < wilders.length; i++){
            System.out.println(wilders[i].whoAmI());
        }

        // System.out.println(wilder1.whoAmI()); 
        // System.out.println(wilder2.whoAmI()); 
        // System.out.println(wilder3.whoAmI());
        // System.out.println(wilder4.whoAmI());
        // System.out.println(wilder5.whoAmI());
        // System.out.println(wilder6.whoAmI());
        // System.out.println(wilder7.whoAmI());
        // System.out.println(wilder8.whoAmI());
        // System.out.println(wilder9.whoAmI());
        // System.out.println(wilder10.whoAmI());
        // System.out.println(wilder11.whoAmI());
        // System.out.println(wilder12.whoAmI());
        // System.out.println(wilder13.whoAmI());
        // System.out.println(wilder14.whoAmI());
        // System.out.println(wilder15.whoAmI());
    }
}