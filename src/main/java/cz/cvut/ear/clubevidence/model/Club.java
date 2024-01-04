package cz.cvut.ear.clubevidence.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Club extends AbstractEntity{
    private List<User> members;
    private List <Trening> trenings;

    private List<Competition> competitions;

    @OneToMany
    public List<User> getMembers() {
        return members;
    }

    public void setMembers(List<User> members) {
        this.members = members;
    }

    @OneToMany
    public List<Trening> getTrenings() {
        return trenings;
    }

    public void setTrenings(List<Trening> trenings) {
        this.trenings = trenings;
    }

    @OneToMany
    public List<Competition> getCompetitions() {
        return competitions;
    }

    public void setCompetitions(List<Competition> competitions) {
        this.competitions = competitions;
    }
}
