interface Playable {
    void play();
}

class Veena implements Playable {
    public void play() {
        System.out.println("Veena is playing");
    }
}

class Saxophone implements Playable {
    public void play() {
        System.out.println("Saxophone is playing");
    }
}

public class Test {
    public static void main(String[] args) {

        Veena veena = new Veena();
        veena.play();

        Saxophone saxophone = new Saxophone();
        saxophone.play();

        Playable p;

        p = new Veena();
        p.play();

        p = new Saxophone();
        p.play();
    }
}
