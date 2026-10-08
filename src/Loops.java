public class Loops
{
    void main()


   /* Task 1 */
    {
        for(int x = 0; x <= 30; x++)
            System.out.println(x);
        System.out.println();

   /* Task 2 */
        for(int y = 30; y >= 0; y--)
            System.out.println(y);
        System.out.println();
   /* Task 3 */
      for(int z = 0; z <= 18; z += 3)
        System.out.println(z);
      System.out.println();
   /* Task 4 */
      for(int a = 10; a >= 0; a -= 2)
          System.out.println(a);
      System.out.println();

   /* Task 5 */
        int c = 0;
        int v = 1;
      for(int oC = 0; oC < 5; oC++){
          do{
                  System.out.print("*");
          }while(c < v);
          System.out.println();
          v++;

      }
      System.out.println();

   /* Task 6 */

   /* Task 7 */
       for(int outerCount = 0; outerCount < 5; outerCount++) {
           for (int count = 0; count < 5; count++) {
               System.out.print("*");
           }
           System.out.println();
       }
    }
}
