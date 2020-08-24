package javareview;

public class Student {

    //--------access specifier /access modifier
    //--------ตัวระบุการเข้าถึงตัวแปรและเมทอธ มี 4 ระดับ
    //  private , public , package(default) ,protected

    //--------1. field ,attribute , instance variable ------
    private int id;
    private String name;
    private double midtermScore;
    private double finalScore;

    //--------2. Constructor
    //ถูกเรียกตอนสร้าง object ช่วยกำหนดค่าเริ่มต้นให้ field
    //การตั้งชื่อ ต้องตั้งแบบเดียวกับ class
    //Constructor จะรับค่าเข้ามาแล้วกำหนดค่าให้กับ instance variable ของ object นั้น
    public Student(int id ,String name){
        this.id = id;
        this.name = name;
    }

    //--------3. method (คล้าย function ในภาษา C) ------
    double getTotalScore() {
        double total = midtermScore + finalScore;
        return total;
    }

    //-------getter เป็น method ประเภทหนึ่งที่คืนค่า field
    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }

    //-------setter เป็น method ประเภทหนึ่งที่ใช่กำหนดค่า
    public void setName(String name){
        this.name = name;
    }
    public void setMidtermScore(double midtermScore){
        this.midtermScore = midtermScore;
    }
    public void setFinalScore(double finalScore){
        this.finalScore = finalScore;
    }

    // toString method
    public String toString(){
        return id+"-- "+name;
    }
}
