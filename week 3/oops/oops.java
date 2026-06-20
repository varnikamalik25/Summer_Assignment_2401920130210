abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    public String notice() {
        return "First Class: Comfortable seats and AC facilities.";
    }
}

class Ladies extends Compartment {
    public String notice() {
        return "Ladies Compartment: Reserved for women passengers.";
    }
}

class General extends Compartment {
    public String notice() {
        return "General Compartment: Open for all passengers.";
    }
}

class Luggage extends Compartment {
    public String notice() {
        return "Luggage Compartment: Only luggage is allowed.";
    }
}

public class TestCompartment {
    public static void main(String[] args) {

        Compartment[] c = new Compartment[10];

        for (int i = 0; i < c.length; i++) {
            int n = (int)(Math.random() * 4) + 1; // Random number between 1 and 4

            switch (n) {
                case 1:
                    c[i] = new FirstClass();
                    break;

                case 2:
                    c[i] = new Ladies();
                    break;

                case 3:
                    c[i] = new General();
                    break;

                case 4:
                    c[i] = new Luggage();
                    break;
            }
        }
      
        for (int i = 0; i < c.length; i++) {
            System.out.println("Compartment " + (i + 1) + ": " + c[i].notice());
        }
    }
}
