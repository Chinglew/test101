/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lewin
 */

// DO NOT MODIFY ANYTHING BELOW THIS LINE!!
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;

public class People {
    private List<Person> members;
    private SortStrategy sortStrategy;

    public People() {
        members = new LinkedList<>();
        this.setSortStrategy(new NameSortStrategy());
    }

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void addMember(Person p) {
        members.add(p);
    }

    public void print(PrintStream out) {
        sortStrategy.customSort(members);
        out.println("==== Printing Members ====");
        for (Person p : members) {
            out.println(p.getName());
        }
    }
}
