public class Kewl {
    public static void main(String[] args) {
        ShortBoi SChar_1 = new ShortBoi("������");
        SChar_1.Sarrive();

        ShortBoi SChar_2 = new ShortBoi("��������");
        SChar_2.Sarrive();

        Skoop Skoop = new Skoop("�����������");
        Skoop.SkoopArrive();

        Sankomar KChar_1 = new Sankomar("����");
        KChar_1.Karrive();

        Sankomar KChar_2 = new Sankomar("������");
        KChar_2.Karrive();

        Worker WChar_1 = new Worker("�����������");
        Worker WChar_2 = new Worker("�����");

        Weapon wood = new Weapon("�������");
        Weapon stone = new Weapon("�����");
        Weapon stick = new Weapon("�������");
        Weapon plunger = new Weapon("��������");
        Weapons wth = new Weapons();
        wth.add(wood);
        wth.add(stone);
        WChar_1.ThrowWeapon(wth);

        KChar_1.Kafraid();
        KChar_2.Kafraid();

        Weapons wb = new Weapons();
        wb.add(stick);
        wb.add(plunger);
        new Fight(wb, WChar_1, WChar_2);

        Character.WholeAfraid();
    }

}