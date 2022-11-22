public class recClass {
    public static animeObject answer;
    public static animeObject userInput;
    public static String name;

    /**
     *
     * @return a
     */
    static String recommend(){
        /*
        lines 15 through 26 asks for the users input for an anime they've watched before
         */
        library.commitLib();
        System.out.println("What is the name of the anime you watched?");
        name= ratingYe.scanner.nextLine();
        System.out.println("What season did you watch?");
        String season= ratingYe.scanner.nextLine();
        System.out.println("What genre was this anime?");
        String genre = ratingYe.scanner.nextLine();
        System.out.println("What other genre could it be considered?");
        String genre2= ratingYe.scanner.nextLine();
        System.out.println("When was the anime released?");
        int relDate= ratingYe.scanner.nextInt();
        System.out.println("What would you rate this anime out of 10?");
        double rating = ratingYe.scanner.nextDouble();

        // line 28 turns the users inputs into an object
        userInput= new animeObject(name,season,genre, genre2,relDate,rating);


        int loop = 0;
        /*
            lines 32 through 39 creates a while loop that goes through every item in
            the anime list and looks only at the genres. if the user inputs a genre equal
            to a genre in an anime from the list, it then stores than anime in answer.
         */
        while (loop< library.anime.size()){
            if (library.anime.get(loop).getGenre().equals(genre)){
                answer= library.anime.get(loop);
            } else if (library.anime.get(loop).getGenre2().equals(genre2)) {
                answer= library.anime.get(loop);
            }
            loop++;
        }
        // line 43 adds the users imputed anime to the list to be accessed later
        library.anime.add(userInput);
        // line 44 returns a recommendation of an anime given from the while loop above
        return "You should watch this next >:D --->" + answer.toString() + "\n";
    }

    //Lines below tests if recommend() works
    public static void main(String[] args) {
        String recommendation="";
        recommendation= recommend();
        System.out.println(recommendation);
        for (animeObject animeObject : library.anime) {
            System.out.println(animeObject.toString());
        }

    }

}
