package generics;

import java.util.ArrayList;

public class NoisyProgram {

    public static void allMakeNoise(ArrayList<? extends Animal> animals) {
        for (Animal ani : animals) {
            // Even though at compile time we do not know which
            // implementations of makeNoise() will be used (the
            // class Animal itself does not even /have/ such an
            // implementation) -- e.g. Dogs and Cats make noises
            // differently -- we do know that any concrete instance of
            // Animal /will/ have an implementation for the method
            // makeNoise(). This is enough to convince the Java compiler
            // that it is safe to call the makeNoise() method on p.
            //
            // The question which /implementation/ to use is resolved
            // at runtime, via "ad-hoc" polymorphism (if it's a Dog,
            // use the code for class Dog's makeNoise(), if it's a Cat,
            // use the code for class Cat's makeNoise(), ...).
            ani.makeNoise();
        }
    }

    public static void allDogsMakeNoise(ArrayList<? extends Animal> animals) {
        for (Animal ani : animals) {
            // Here we only want Dogs to make noise.
            if (ani instanceof Dog) {
                // No need to cast, any Animal can make noise;
                // polymorphism makes sure that this is done the Dogs' way.
                ani.makeNoise();
            }
        }
    }

    public static void allDogsBark(ArrayList<? extends Animal> animals) {
        for (Animal ani : animals) {
            if (ani instanceof Dog) {
                // We want them to /bark/. Only Dogs are /able/ to bark.
                // At this point we (the programmer) know that the object
                // behind the reference ani actually is a Dog. But the
                // reference ani itself still is of type Animal, and
                // not all Animals can necessarily bark.
                // So we must /cast/ from the reference ani (of type Animal)
                // to a reference d (to a Dog). Since we have checked with
                // 'ani instanceof Dog' that p is actually referencing a
                // Dog, this is safe and will not lead to a ClassCastException.
                Dog d = (Dog) ani;
                d.bark();
            }
        }
    }

    public static void allBark(ArrayList<? extends Dog> dogs) {
        for (Dog d : dogs) {
            // Here d already is a reference of type Dog
            // (because the elements of a 'List<? extends Dog>'
            // are Dogs). So we can just make them bark without
            // any 'instanceof' checks or casts.
            d.bark();
        }
    }
    
    public static void main(String[] args) {
        Dog fido = new Dog("Fido");
        Cat tiger = new Cat("Tiger");
        Dog wolfie = new Dog("Wolfie");

        ArrayList<Animal> zoo = new ArrayList<>();
        ArrayList<Dog> dogs = new ArrayList<>();

        zoo.add(fido);
        zoo.add(tiger);
        zoo.add(wolfie);

        dogs.add(fido);
        dogs.add(wolfie);

        allMakeNoise(zoo);
        // The call in the next line would not be possibly if allMakeNoise(...)
        // had the parameter type 'List<Animal>' instead of 'List<? extends Animal>'.
        allMakeNoise(dogs);

        allDogsMakeNoise(zoo);
        allDogsMakeNoise(dogs);

        allDogsBark(zoo);
        allDogsBark(dogs);

        allBark(dogs);
    }
}
