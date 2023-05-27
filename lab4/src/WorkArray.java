public class WorkArray<T extends Number>  {
    T[] arrNums;
    public WorkArray(T[] numP){
        arrNums = numP;
    }
    public double sum(){
        double doubleWork = 0d;
        for (T i:
             arrNums) {
            doubleWork+= i.doubleValue();
        }
        return doubleWork;
    }
}
