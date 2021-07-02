package principles.solid;

/**
 * Liskovs Substition: the reference to the Base class can be replaced with a Derived class without affecting the functionality of the program module.
 * A parent class must have methods which are in sub class.
 */
public class LiskovsSubstitution {

    class ParentClass {
        void operation() {

        }
    }

    class SubClass extends ParentClass {
        @Override
        void operation() {

        }
    }

}
