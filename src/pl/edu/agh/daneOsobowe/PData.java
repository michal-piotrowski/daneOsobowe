package pl.edu.agh.daneOsobowe;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.NoneScoped;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

/**
 * Created by Michał Piotrowski on 2017-04-06.
 */

enum sex {male, female};
enum voivod {podkarpackie, malopolskie, mazowieckie, pomorskie, podlaskie};

@ManagedBean
@SessionScoped
public class PData {
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public short getAge() {
        return age;
    }
    public void setAge(short age) {
        this.age = age;
    }
    public pl.edu.agh.daneOsobowe.sex getSex() {
        return sex;
    }
    public void setSex(pl.edu.agh.daneOsobowe.sex sex) {
        this.sex = sex;
    }
    public voivod getVoivodeship() {
        return voivodeship;
    }
    public void setVoivodeship(voivod voivodeship) {
        this.voivodeship = voivodeship;
    }

    private String name;
    private String surname;
    private short age;
    private sex sex;
    private voivod voivodeship;



}
