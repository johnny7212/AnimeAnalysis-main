import java.util.Scanner;

public class ratingYe{
    public static Scanner scanner = new Scanner(System.in);
    private static int work = 0;

    static void rateIt(){
        int i = 0;
        //The while loop below prints out every item in the anime list
        while(i< library.anime.size()){
            System.out.println(library.anime.get(i).toString());
            i++;
        }
        i= 0;
        System.out.println("\nWhich anime would you like to rate?");
        String name= scanner.nextLine();
        /*
        The while loop below takes the users input for the anime they chose and goes through the list until it
        finds it. Then it asks the user if they would like to rate it up or down. Inputting up takes the rating of
        their anime and increases it by .25. Likewise, inputting down decreases the rate by .25. Then it thanks the
        user and breaks the while loop.
         */

        while(i< library.anime.size()){
            String nameCheck = library.anime.get(i).getName();

            if (nameCheck.equals(name)) {
                System.out.println("Would you like to rate " + name + " up or down?");
                String answer = scanner.nextLine();
                answer = answer.toLowerCase();
                if (answer.equals("up")) {
                    library.anime.get(i).setRate(library.anime.get(i).getRate() + 0.25);
                    System.out.println(library.anime.get(i).toString() + "\n~~~~Thank you for visiting Anime Analysis~~~~\n~~~Cya Later!!~~~");
                    work++;
                    break;
                } else if (answer.equals("down")) {
                    library.anime.get(i).setRate(library.anime.get(i).getRate() - 0.25);
                    System.out.println(library.anime.get(i).toString() + "\n~~~~Thank you for visiting Anime Analysis~~~~\n~~~Cya Later!!~~~");
                    work++;
                    break;
                }
            }
            i++;
        }

        /*
        The following if statement is run when it finds that the users anime isn't in the list of anime
         */
        if (work== 0){
            System.out.println("Sorry we don't have that anime in our library. Would you like to pick another? (yes or no) ");
            String answer= scanner.nextLine();
            answer= answer.toLowerCase();
            if (answer.equals("yes")){
                rateIt();
            }else{
                System.out.println("\n~~~~Thank you for visiting Anime Analysis~~~~\n~~~Cya Later!!~~~");
            }

        }



    }
    static void rateIt(String name){
        int i = 0;


        while(i< library.anime.size()){
            System.out.println(library.anime.get(i).toString());
            i++;
        }
        i= 0;

        while(i< library.anime.size()){
            String nameCheck = library.anime.get(i).getName();

            if (nameCheck.equals(name)) {
                System.out.println("\nWould you like to rate " + name + " up or down?");
                String answer2 = testClass.scanner2.nextLine();
                answer2 = answer2.toLowerCase();
                if (answer2.equals("up")) {
                    library.anime.get(i).setRate(library.anime.get(i).getRate() + 0.25);
                    System.out.println(library.anime.get(i).toString() + "\n~~~~Thank you for visiting Anime Analysis~~~~\n~~~Cya Later!!~~~");
                    break;
                } else if (answer2.equals("down")) {
                    library.anime.get(i).setRate(library.anime.get(i).getRate() - 0.25);
                    System.out.println(library.anime.get(i).toString() + "\n~~~~Thank you for visiting Anime Analysis~~~~\n~~~~Cya Later!!~~~~");
                    break;
                }
            }
            i++;

        }

        }




    public static void main(String[] args) {
        library.commitLib();
        System.out.println(library.anime.size());
        System.out.println(library.anime.get(1).getName().equals("Chainsaw Man"));
        rateIt();
    }
}

