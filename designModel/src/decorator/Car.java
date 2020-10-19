package decorator;

public class Car implements ICar{
    @Override
    public void move(){
        System.out.println("run....");
    }
}

class SupperCar implements ICar{
    protected ICar car;

    public SupperCar(ICar car){
        this.car = car;
    }


    /*用了存放this.car 原有的方法， 通过下面的super调用*/
    @Override
    public void move(){
        car.move();
    }
}


class FlyCar extends SupperCar{
    FlyCar(ICar car){
        super(car);
    }

    private void fly(){
        System.out.println("i can fly");
    }

    @Override
    public void move(){
        fly();
        super.move();
    }
}

class WaterCar extends SupperCar{
    WaterCar(ICar car){
        super(car);
    }

    private void water(){
        System.out.println("i can water");
    }

    @Override
    public void move(){
        water();
        super.move();
    }
}


