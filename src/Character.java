import java.util.ArrayList;
enum Status {
    CONFUSED, FEARED, DEFAULT
}
class Weapon{
    String kind = "��� ������";
    Weapon (String kind) {
        this.kind = kind;
    }
    String getKind() {
        return kind;
    }

      /*void ThrowWeapon(Weapons w) {
        System.out.println("� ����� �� ��� � ��� ��������: ");
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
                msg = "���������";
                break;
            case FEARED:
                msg = "������";
                break;
            case CONFUSED:
                msg = "��������������";
                break;
        }
        System.out.print(" " + msg);
    }
    String getDecoration(){
        return decoration;
    }

    static void WholeAfraid(){
        System.out.println("��� ���������� � ����� �����������...");
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
        decoration = "������";
        System.out.print("��������� �� ������� ������ " + this.name + " ����� �� ������� " + getDecoration() + " � ����� � ���������");
        getStatus(msg);
        System.out.println();
    }

}
class Sankomar extends Character {
    Sankomar (String name) { super(name); }
    {   setStatus(Status.DEFAULT); }
    void Karrive() {
        decoration = "������";
        System.out.println("���-��������� �� �������� ������ " + this.name + " �������� � ������� "+ getDecoration() + " ����� �� �������������");
    }
    void Kafraid() {
        String msg = "";
        setStatus(Status.FEARED);
        System.out.print("���-��������� " + this.name + " ������� ����� � ���������");
        getStatus(msg);
        System.out.println();
    }
}
class Worker extends Character {
    Worker (String name) { super(name); }
    { setStatus(Status.DEFAULT); }
    void ThrowWeapon(Weapons w) {
        System.out.print("� ����� �� ��� �������� " + this.name + " ������� � �����������: ");
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
        decoration = "������";
        System.out.println(this.name + " �������� �� ������ ������� " + getDecoration());
    }
}

class Fight {
        Fight(Weapons w, Worker p, Worker pp) {
            String decoration = "�����";
            System.out.print("�������� �� ������� �������� " + p.name + " � " + pp.name + " ��������� �� " + decoration +
                    " � ��������� �������� ���������� ��� ������: ");
            for (int i = 0; i < w.Weapons.size(); i++) {
                if (i != 0) System.out.print(", ");
                System.out.print(w.Weapons.get(i).getKind());
            }
            System.out.println();
        }
    }

