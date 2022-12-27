public class Calculation implements Runnable{
    public double jarijari;
    public double pinggir;
    public double area;
    public double phi = 3.14;

    @Override
    public void run() {
        System.out.println("===== Program Will Start in =====");
        for (int i = 3;i>0;i--){
            try {
                System.out.println("Starting with thread " + i);
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

    }
    public void setSquare(double pinggir) throws IllegalArgumentException{
        this.pinggir = pinggir;
        if (pinggir < 1){
            throw new IllegalArgumentException();
        }else {
            this.area = pinggir * pinggir;
        }
    }
    public double getSquare(){
        return area;
    }

    public void setCircle(double jarijari){
        this.jarijari = jarijari;
        if(jarijari < 1){
            throw new IllegalArgumentException("Nilai Jari Jari tidak boleh kurang dari 1!!");
        }else{
            this.area = phi * jarijari * jarijari;
        }
    }
    public double getCircle(){
        return area;
    }

    public void setTrapezoid(double a, double b, double t){
        if(a < 1 || b < 1 || t < 1){
            throw new IllegalArgumentException("Nilai Sisi tidak boleh kurang dari 1!!");
        }else {
            this.area = 0.5 * t * (a + b);
        }
    }
    public double getTrapezoid(){
        return area;
    }
}