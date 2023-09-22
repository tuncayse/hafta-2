public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight= maxWeight;
    }
    public void start(){
        if(isCheck()){
            while(this.f1.health > 0 && this.f2.health > 0){
                System.out.println("=====YENI ROUND=====");
                if(isStart()){
                    this.f1.health = this.f2.hit(f1);
                    if(isWin()){
                        break;
                    }
                }else{
                    this.f2.health = this.f1.hit(f2);
                    if(isWin()){
                        break;
                    }
                    System.out.println(this.f1.name + " Saglik : " + this.f1.health);
                    System.out.println(this.f2.name + " Saglik : " + this.f2.health);
                }
            }
        } else{
            System.out.println("Sporcularin Sikletleri uymuyor.");
        }
    }
    boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }
    boolean isStart(){
        double number = Math.random() * 100;
        return 50 <= number;
    }
    boolean isWin(){
        if(this.f1.health == 0){
            System.out.println(this.f2.name + " kazandi !");
            return true;
        }
        if(this.f2.health == 0){
            System.out.println(this.f1.name + " kazandi !");
            return true;
        }
        return false;
    }
}