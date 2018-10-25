import java.util.ArrayList;
enum Status {
    CONFUSED, FEARED, DEFAULT
}
class Weapon{
    String kind = "что попало";
    Weapon (String kind) {
        this.kind = kind;
    }
    String getKind() {
        return kind;
    }

      /*void ThrowWeapon(Weapons w) {
        System.out.println("В ответ на это в них полетели: ");
        for (int i=0; i<w.Weapons.size();i++){
            if(i!=0) System.out.print(",");
            System.out.print(w.Weapons.get(i).getKind());
        }

    } */
}
class Weapons{
    ArrayList<Weapon> Weapons = new ArrayList<Weapon>();
    void add(Weapon w){
        Weapons.add(w);
    }
}
public class Character {
    String name;
    Status status;
    String decoration;

    Character (String name){
        this.name = name;
    }
    void setStatus(Status status) {
        this.status = status;
    }
    void getStatus(String msg) {
        msg = "";
        switch(this.status) {
            case DEFAULT:
                msg = "опъянения";
                break;
            case FEARED:
                msg = "испуга";
                break;
            case CONFUSED:
                msg = "расстерянности";
                break;
        }
        System.out.print(" " + msg);
    }
    String getDecoration(){
        return decoration;
    }

    static void WholeAfraid(){
        System.out.println("Все приехавшие в ужасе разбежались...");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

class ShortBoi extends Character {
    ShortBoi (String name) { super(name); }
    { setStatus(Status.DEFAULT); }

    void Sarrive() {
        String msg = "";
        setStatus(Status.CONFUSED);
        decoration = "фургон";
        System.out.print("Коротышка со смешным именем " + this.name + " вылез из объекта " + getDecoration() + " и стоял в состоянии");
        getStatus(msg);
        System.out.println();
    }

}
class Sankomar extends Character {
    Sankomar (String name) { super(name); }
    {   setStatus(Status.DEFAULT); }
    void Karrive() {
        decoration = "ворота";
        System.out.println("Сан-комаринец со страшным именем " + this.name + " бросился к объекту "+ getDecoration() + " вслед за Скуперфильдом");
    }
    void Kafraid() {
        String msg = "";
        setStatus(Status.FEARED);
        System.out.print("Сан-комаринец " + this.name + " подался назад в состоянии");
        getStatus(msg);
        System.out.println();
    }
}
class Worker extends Character {
    Worker (String name) { super(name); }
    { setStatus(Status.DEFAULT); }
    void ThrowWeapon(Weapons w) {
        System.out.print("В ответ на это работяга " + this.name + " бросает в неприятелей: ");
        for (int i = 0; i < w.Weapons.size(); i++) {
            if (i != 0) System.out.print(", ");
            System.out.print(w.Weapons.get(i).getKind());
        }
        System.out.println();
    }




}
class Skoop extends Character {
   Skoop(String name) { super(name); }
    { setStatus(Status.DEFAULT); }

    void SkoopArrive() {
        decoration = "фургон";
        System.out.println(this.name + " выскочил из кабины объекта " + getDecoration());
    }
}

class Fight {
        Fight(Weapons w, Worker p, Worker pp) {
            String decoration = "ворот";
            System.out.print("Засевшие на фабрике работяги " + p.name + " и " + pp.name + " выскочили из " + decoration +
                    " и принялись колотить приехавших чем попало: ");
            for (int i = 0; i < w.Weapons.size(); i++) {
                if (i != 0) System.out.print(", ");
                System.out.print(w.Weapons.get(i).getKind());
            }
            System.out.println();
        }
    }

