package CoreJava;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Voter voter)) return false;
        return voterId == voter.voterId && Objects.equals(personName, voter.personName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(voterId, personName);
    }
}
