public class Lab2PreLab {
    

    public static void main(String[] args) {
        
        int MIN = 0;
        int MAX = 20;

        String sp = "     ";

        int in = 0;

        System.out.println("Roll" + sp + "xcoord" + sp + "Roll" + sp + "ycoord" + sp + "Below/Above");

        for(int i=1;i<=1000;i++){

            double rollx = MIN + (int)(Math.random() * MAX);

            double rolly = MIN + (int)(Math.random() * MAX);

            double xcoord = rollx/20;

            double ycoord = rolly/20;

            boolean inOut = false;


            if (ycoord < (xcoord*xcoord)){

                inOut = true;

                in++;

            }

            System.out.println(rollx + sp + xcoord + sp + rolly + sp + ycoord + sp + inOut);

        }

        System.out.println(in);
    }

}
