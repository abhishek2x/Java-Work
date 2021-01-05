// •Assign value of hare to random number

// •Assign value of tortoise to random number

// •If hare is greater than tortoise by more than 20, only it wins. But tortoise wins if it is more than hare even by 1. 

// •Else random number generator is called again. 

// •Print  which is the winner

// case 1 :
// when value of tortoise > hare
// ex : hare =10, tortoise = 15
// in this case, tortoise is winner

// case 2:
// when value of tortoise < hare-20
// ex : hare = 40 , tortoise = 10
// In this case, hare is the winner

// case 3:
// when tortoise<hare and tortoise>hare-20
// In this case the random values are calculated again
// until either case 1 or 2 is satisfied.
// ex : if hare =10 , tortoise = 9
// Therefore hare = r.nextInt(1000)
// and tortoise = r.nextInt(1000)

// 0-----------------------------------------0

// •Assign value of hare to random number

// •Assign value of tortoise to random number

// •If hare is greater than tortoise by more than 20, only it wins. But tortoise wins if it is more than hare even by 1. 

// •Else random number generator is called again. 

// •But now the random number must have a lower range of the current value of tortoise. 

// •Print  which is the winner

// *
// * * 
// * * *
// * * * *
// * * * * *

// case 1 :
// when value of tortoise > hare
// ex : hare =10, tortoise = 15
// in this case, tortoise is winner

// case 2:
// when value of tortoise < hare-20
// ex : hare = 40 , tortoise = 10
// In this case, hare is the winner

// case 3:
// while
// ex : if hare =10 , tortoise = 9
// Then, hare = r.nextInt(1000)
// and tortoise = r.nextInt(1000)
    // check case 1 and case 2
    // if satisfied break;
    // else
// go to while again


import java.util.*;

public class Winner {
    public static void main(String args[]){
        Random rand = new Random();

        while (true) {

            int hare = rand.nextInt(1000);
            int tortoise = rand.nextInt(1000);

            if (hare > tortoise - 20) {
                System.out.println("Hare Won");
                break;
            } if (tortoise < tortoise - 1) {
                System.out.println("Tortoise Won");
                break;
            }
        }
    }
}
