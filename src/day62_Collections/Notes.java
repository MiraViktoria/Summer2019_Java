package day62_Collections;

public class Notes {
	
	/*
	 12/10/2019
Topic: Data Structures
            Collection framework Intro
Package Name: day62_Collections
Agenda: 
    Morning: Java
    Afternoon: Selenium
Data Structures: In order to manage data efficiently and in an orginized manner, we need data structures
            -- Array
            -- Collections FrameWork
            -- Maps
Array: Collection of Data (same data type)
        size is fixed
        index numbers
        can be multi-dimensional
        supports primitives & objects
        can have duplicates
Collections framework: consists of multiple interfaces, each interfaces has multiple implementations
        Interfaces in Collections frame work:
                1. Iterable
                2. Collection
                3. List
                4. Set
                5. SortedSet
                6. Queue
                7. Deque
            all those interfaces are presented in java.util package
            ONLY supports Objects
Iterable (I): root interface, super type of all the interfaces in collections framework
Collection (I): extended by three interfacses: List(I), Set(I), Queue(I)
        List(I):  implemented By ArrayList(C), LinkedList(C), Vector(C)
                has index numbers, dynamic sized, accepts duplicates
                    List<Integer> list1 = new ArrayList<>();
                    List<String> list2 = new LinkedList<>();
                    List<Double> list3 = new Vector<>();
                    List<Integer> list4 = new Stack<>();
                ArrayList: array based class, internally uses the array
                LinkedList:  each objects are doublly linked in the LinkedList
                        doublly linked:  adding & removing  (add(), remove()) data are faster 
                                retriving data (get() ) is slower
                            Is not array based class
                Vector: is synchronized, only prefered in  multi-threads
                        advantage: thread safe in multi-thread environment
                        dis-advantage: slower
                        has a child class: Stack
                    Stack: synchronized
                            pop(): LIFO ==> Last in First Out
                                    removes the last object from the stack
        Set(I): does not take duplicates, deos not have index numbers
                    implemented by HashSet(C), LinkedHashSet(C)
                    extended by SortedSet(I)
                    SortedSet is implemented by TreeSet(C)
                    Set<Integer> st1 = new HashSet<>();
                    Set<Integer> st2 = new LinkedHashSet<>();
                    Set<Integer> st3 = new TreeSet<>();
                    ONLY Accepts unique Objects
                HashSet: does not keep the order of the objects as it is
                LinkedHashSet: does keep the order of the object as it is
                                doubly linked
                SortedSet(I): sorts the objects in Ascending order, does not accept duplicates
                                implemented by TreeSet(C)
synchrnozed keyword:  used to achive ==> Thread safe in  multi-thread environment
multi-thread: multiple threads try to get access to same resources
 
	 */

}
