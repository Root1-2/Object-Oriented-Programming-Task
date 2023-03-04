package task_2;
class SeriesPrinter {
    public int printSeries(int n) {
        System.out.print("printSeries("+n+") -> ");
        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }
        return n;
    }
    public int printSeries(int startindex, int endindex) {
        System.out.print("printSeries("+startindex+","+endindex + ") -> ");
        for (int i = startindex; i < endindex; i++) {
            System.out.print(i + " ");
        }
        return endindex;
    }
    public int printSeries(int startindex, int endindex, int interval) {      
        int i;
        System.out.print("printSeries("+startindex+","+endindex +","+interval+ ") -> ");
        for (i = startindex; i < endindex; i++) 
        {
            System.out.print(i+ " ");
            i = i + (interval-1);
        }
        return endindex;
    }
}
public class Task_2 
{
    public static void main(String[] args) {
        SeriesPrinter sp = new SeriesPrinter();

        System.out.println(sp.printSeries(5));
        System.out.println(sp.printSeries(5,10));
        System.out.println(sp.printSeries(5,15,3));
    }
}
