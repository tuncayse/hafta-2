public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca" , "TRH" , "555");
        Teacher t2 = new Teacher("Graham Hoca" , "FZK" , "0000");
        Teacher t3 = new Teacher("Kılyutmaz" ,"BIO" , "1111");

        Course tarih = new Course("Tarih" , "101" ,"TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik" , "101" , "FZK");
        fizik.addTeacher(t2);
        Course biyo = new Course("Biyoloji" , "102" , "BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("Ayse tunc" , "47" ,"4" ,tarih,fizik,biyo);
        s1.addBulkExamNote(60,70,85);
        s1.isPass();

        Student s2 = new Student("Sumi Bal" , "09" ,"4" ,tarih,fizik,biyo);
        s2.addBulkExamNote(50,70,70);
        s2.isPass();

        Student s3 = new Student("Damla Senoner" , "34" ,"4" ,tarih,fizik,biyo);
        s3.addBulkExamNote(50,20,40);
        s3.isPass();
    }
}