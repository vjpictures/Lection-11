public class TrainThreads {
    public static void main(String[] args) {

        int[] AI = { -2, 5, 9, -1, 3 };

        ThreadMinMax t1 = new ThreadMinMax(AI);
        ThreadMinMax t2 = new ThreadMinMax(AI);

        try {
            t1.getThread().join();
            t2.getThread().join();
        }
        catch (InterruptedException e) {
            System.out.println("Error");
        }
        System.out.println("Maximum = " + t1.getMax());
        System.out.println("Minimum = " + t1.getMin());
    }
}
