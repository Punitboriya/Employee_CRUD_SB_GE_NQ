package CoreJava;

public class Voter {

    private int voterId;
    private String personName;

    public Voter(int voterId, String personName) {
        this.voterId = voterId;
        this.personName = personName;
    }

    @Override
    public String toString() {
        return "Voter{" +
                "voterId=" + voterId +
                ", personName='" + personName + '\'' +
                '}';
    }
}
