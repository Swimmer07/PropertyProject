public class MainProgram {

    public static void main(String[] args) {
        Property p1 = new Property("Erzbergerstraße 1",10, 20.27);
        System.out.println(p1.getAddress() + " - " + p1.getSize() + "m²");

        Property p2 = new Property("Erzbergerstraße 2",10,10);
        System.out.println(p2.getAddress() + " - " + p2.getSize() + "m²");

        Property p3 = new Property("Erzbergerstraße 3",13,10);
        System.out.println(p3.getAddress() + " - " + p3.getSize() + "m²");

        Property p4 = new Property("Erzbergerstraße 4",10,23.46);
        System.out.println(p4.getAddress() + " - " + p4.getSize() + "m²");

        Property p5 = new Property("Erzbergerstraße 5",5,15);
        System.out.println(p5.getAddress() + " - " + p5.getSize() + "m²");

        Cars q1 = new Cars("Erzbergerstraße 1 - Porsche",100.000);
        System.out.println(q1.getCars() + " - " + q1.getCoast());

        Cars q2 = new Cars("Erzbergerstraße 3 - Lambo",230.000);
        System.out.println(q2.getCars() + " - " + q2.getCoast());

        Cars q3 = new Cars("Erzbergerstraße 5 - VW Up",1);
        System.out.println(q3.getCars() + " - " + q3.getCoast());

    }

}
