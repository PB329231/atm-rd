package atm;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;
    private DatabaseDataSource dataSource;

    public Bank(String name) {
        this.name = name;
//        this.customers = new ArrayList<>();
        this.dataSource = new DatabaseDataSource();
        this.customers = dataSource.getCustomerData();
    }

//    สร้าง method ที่ทำการเพิ่ม customer และส่งไปเก็บใน arrayList เรื่อยๆ
    public void addCustomer(Customer c){
        customers.add(c);
    }

//    รับ id เพื่อหา customer ใน list
    public Customer findCustomer(int id){
//        Customer result = null;
//        for (int i =0; i<n; i++); เป้นการเขียน for loop แบบธรรมดาที่เขียนกันมา
        for (Customer element : customers){ //element รายการข้อมูลที่เก็บอยู่ใน Customer
            if (element.getId() == id)
                return element; //กรณีถ้าเจอ id ที่ค้นหาจะคืนค่า element ออกมา
        }
        return null; //กรณีไม่เจอ id ที่ค้นหาจะส่งค่าคืนมาเป็น null

    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }
}
