public class Exam2 {
    public static void main(String[] args) {

        // 높이 : 3

        // 출력
        makeTree(3);
        /*

           *
          ***
         *****

         */

        // 높이 : 5

        // 출력
        makeTree(5);
        /*

             *
            ***
           *****
          *******
         *********

         */

        // 높이 : 7

        // 출력
        makeTree(7);
        /*

                *
               ***
              *****
             *******
            *********
           ***********
          *************

         */

    }
    private static void makeTree(int height){
        for(int i=0; i< height; i++){
            for(int j=height;j>0;j--){
                if(j<=i)
                    System.out.print("★");
                else
                    System.out.print(" ");
            }

            for(int j=0;j<height;j++){
                if(j<=i)
                    System.out.print("★");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
