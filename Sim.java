public class Sim {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();

        mobile.setSim(new AirtelSim());
        mobile.use();
        System.out.println();
        mobile.setSim(new JioSim());
        mobile.use();
    }
}

class Mobile {
    Sim1 sim;
    public void setSim(Sim1 sim) {
        this.sim = sim;
    }
    public void use() {
        this.sim.Call();
        this.sim.message();
    }
}

interface Sim1 {
    void Call();
    void message();
}

class AirtelSim implements Sim1 {
    public void Call() {
        System.out.println("Calling from Airtel Sim");
    }

    public void message() {
        System.out.println("Messaging from Airtel Sim");
    }
}

class JioSim implements Sim1 {
    public void Call() {
        System.out.println("Calling from Jio Sim");
    }
    public void message() {
        System.out.println("Messaging from Jio Sim");
    }
}