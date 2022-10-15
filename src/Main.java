public class Main {

    public static void main(String[] args) {

        Author tolstoi = new Author("Lev", "Tolstoi");
        Author pushkin = new Author("Alexander", "Pushkin");
        System.out.println("first.name = " + tolstoi.getFirstName());
        System.out.println("second.name = " + tolstoi.getSecondName());
        System.out.println("first.name = " + pushkin.getFirstName());
        System.out.println("second.name = " + pushkin.getSecondName());

        Book warAndPeace = new Book("War and Peace", tolstoi, 1970);
        Book evgeniyOnegin = new Book("Evgeniy Onegin", pushkin, 1930);
        System.out.println("warAndPeace = " + warAndPeace.getName());
        System.out.println("warAndPeace = " + tolstoi.getFirstName() + " " +
                tolstoi.getSecondName());
        System.out.println("warAndPeace = " + warAndPeace.getYear());
        System.out.println("EvgeniyOnegin = " + evgeniyOnegin.getName());
        System.out.println("EvgeniyOnegin = " + pushkin.getFirstName() + " " +
                pushkin.getSecondName());
        System.out.println("EvgeniyOnegin = " + evgeniyOnegin.getYear());
        warAndPeace.setYear(1960);
        System.out.println("warAndPeace = " + warAndPeace.getYear());


        // ДЗ по методам объектов (1.10)

        System.out.println(tolstoi);
        System.out.println(pushkin);
        System.out.println(warAndPeace);
        System.out.println(evgeniyOnegin);

        Author kuryan = new Author("Lev", "Max");
        System.out.println(tolstoi.equals(kuryan));

        Book mumu = new Book("War and Peace", kuryan, 2010);
        System.out.println(mumu.equals(warAndPeace));
    }
}