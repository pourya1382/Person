import java.util.*;

class Person {
    int age;
    String name;
    String family;

    public Person(String name, String family, int age) {
        this.name = name;
        this.age = age;
        this.family = family;
    }

    public String toString() {
        return name + " " + family + " " + age;
    }
}

class sortbyage implements Comparator<Person> {
    public int compare(Person a, Person b) {
        return b.age - a.age;
    }
}


public class Main {
    public static void main(String[] args) {
        ArrayList<Person> personArrayList = new ArrayList<>();
        while (true) {
            System.out.println("names: ");
            Scanner scanner = new Scanner(System.in);
            String nameInput = scanner.nextLine();
            System.out.println("family: ");
            String familyInput = scanner.nextLine();
            System.out.println("age: ");
            int ageInput = scanner.nextInt();
            scanner.nextLine();
            System.out.println("do you want to continue(N/Y): ");
            String A = scanner.nextLine();
            personArrayList.add(new Person(nameInput, familyInput, ageInput));

            if (A.equals("N")) {
                break;
            }
        }
        Collections.sort(personArrayList, new sortbyage());
        for (int i = 0; i < personArrayList.size(); i++) {
            System.out.println(personArrayList.get(i));
        }
    }
}