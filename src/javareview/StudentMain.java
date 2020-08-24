package javareview;

public class StudentMain {
    //shortcut : psvm
    public static void main(String[] args) {
        Student Kwan = new Student(1,"Kwan");
        Student Kate = new Student(2,"Kate");

        //System.out.println(Kate.toString()); = System.out.println(Kate); ผลลัพธ์มีค่าเท่ากับ ยุบให้สั้นลงได้เลย
        System.out.println(Kwan);
        System.out.println(Kate);

        Kwan.setMidtermScore(10);
        Kwan.setFinalScore(8);
        System.out.println("Kwan's total =" + Kwan.getTotalScore());
//
//        Student s = Kwan;
//        s.id = 100;
//        System.out.println(Kwan.id +": " + Kwan.name);
//
//        s = Kate;
//        Student ploy;
    }
}
