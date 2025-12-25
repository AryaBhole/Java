public class Inher{
    public static void main(String args[]){
        Cat cat = new Cat();
        /* extends is useful when there are more classes which need the same changes
        to be made, while having diffrent methods of their own we can have another
        class as a grandparent to the animal class which will extend to it and
        therefore to other classes which extend from it, a sort of a tree with 
        branches if you will // that is INHERITENCE // */
        cat.eat();
    }
}