public class Kewl {
    public static void main(String[] args) {
        ShortBoi SChar_1 = new ShortBoi("Сергей");
        SChar_1.Sarrive();

        ShortBoi SChar_2 = new ShortBoi("НеСергей");
        SChar_2.Sarrive();

        Skoop Skoop = new Skoop("Скуперфильд");
        Skoop.SkoopArrive();

        Sankomar KChar_1 = new Sankomar("Саня");
        KChar_1.Karrive();

        Sankomar KChar_2 = new Sankomar("Володя");
        KChar_2.Karrive();

        Worker WChar_1 = new Worker("Абудльхамаш");
        Worker WChar_2 = new Worker("Бибиб");

        Weapon wood = new Weapon("поленья");
        Weapon stone = new Weapon("камни");
        Weapon stick = new Weapon("палками");
        Weapon plunger = new Weapon("скалками");
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