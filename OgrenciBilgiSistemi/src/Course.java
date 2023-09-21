public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
    }
    void addTeacher(Teacher teacher){
        this.teacher = teacher;
        if (teacher.branch.equals(this.prefix)){
            System.out.println("Islem Basarili");
        }
        else{
            System.out.println("Ogretmen ve ders uyusmuyor.");
        }
    }
    void printTeacherInfo(){

        if (teacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + teacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }



}