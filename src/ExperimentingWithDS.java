import java.util.*;

public class ExperimentingWithDS {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
        friends.addAll(Arrays.asList("Harman","Jesse","Chisato","Jillian","Scott","Dhruv","Yuliya"));
        System.out.println(friends);
        System.out.printf("The ArrayList has %d elements%n", friends.size());
        System.out.printf("\"Scott\" is in the friends list : %b%n", friends.contains("Scott"));
        friends.add("Harman");
        Collections.sort(friends);
        System.out.printf("Sorted: %s%n", friends);

        //Sets are used to prevent duplicates and have fast lookup
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(friends);
        System.out.println("HashSet: "+hashSet);

        //TreeSet automatically sorts the elements AND prevents duplicates
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.addAll(friends);
        System.out.println("TreeSet :" +treeSet);

        //Build some Student objects and add them to the different Data Structures
        Student st1 = new Student("Fred","Flintstone",1234567);
        Student st2 = new Student("Wilma","Flintstone",1234569);
        Student st3 = new Student("Barney","Rubble",1234570);
        Student st4 = new Student("Bam Bam","Rubble",1234571);
        Student st5 = new Student("Betty","Rubble",1233572);
        Student st6 = new Student("Betty","Slate",1233573);

        ArrayList<Student> studentsAL = new ArrayList<>();
        studentsAL.addAll(Arrays.asList(st1, st2,st3,st4,st5,st5,st5,st6));
        System.out.printf("Students ArrayList size: %d, elements: %s%n",studentsAL.size(), studentsAL);

        //how many students will be in the HashSet
        HashSet<Student> studentsHS = new HashSet<>();
        studentsHS.addAll(studentsAL);
        System.out.printf("Students HashSet size: %d, elements: %s%n",studentsHS.size(), studentsHS);

        TreeSet<Student> studentsTS = new TreeSet<>();
        studentsTS.addAll(studentsAL);
        System.out.printf("Students TreeSet size: %d, elements: %s%n",studentsTS.size(), studentsTS);

        //Map - these create a key-value pair.  A Dictionary is a classic example of what a Map object is...you look up a word (the key)
        //and it gives you a definition (the value)
        HashMap<Student, Integer> gradesHM = new HashMap<>();
        gradesHM.put(st1, 97);
        gradesHM.put(st2, 87);
        gradesHM.put(st3, 90);
        gradesHM.put(st4, 91);
        gradesHM.put(st4, 50);
        gradesHM.put(st5, 92);
        gradesHM.put(st6, 93);


        System.out.printf("gradesHM: %s%n",gradesHM);
        System.out.printf("Grade for %s is: %d%n", st2, gradesHM.get(st2));

        //to get all the students in our HashMap
        System.out.printf("The students are: %s%n",gradesHM.keySet());

        //to get just the grades
        System.out.printf("The student grades are: %s%n",gradesHM.values());

        TreeMap<Student, Integer> gradesTM = new TreeMap<>();
        gradesTM.put(st1, 97);
        gradesTM.put(st2, 87);
        gradesTM.put(st3, 90);
        gradesTM.put(st4, 91);
        gradesTM.put(st4, 50);
        gradesTM.put(st5, 92);
        gradesTM.put(st6, 93);

        //to get all the students in our HashMap
        System.out.printf("The students are: %s%n",gradesTM.keySet());


    }
}
