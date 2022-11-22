import java.util.ArrayList;

public class library {
    public static ArrayList<animeObject> anime = new ArrayList<animeObject>();
    // lines 5 through represent the anime objects that will be added to the anime list
    static animeObject spyXFamily = new animeObject("Spy x Family", "S2","Action", "Shounen", 2022, 8.67);
    static animeObject chainsawMan = new animeObject("Chainsaw Man", "S1", "Action","Supernatural", 2022, 8.88);
    static animeObject cowboyBebop = new animeObject("Cowboy Bebop", "S1", "Action", "Sci-Fi", 1999, 8.75);
    static animeObject onePiece = new animeObject("One Piece", "Shounen", "Adventure", 1999, 8.67);
    static animeObject jojosBizAdv = new animeObject("Jojos Bizarre Adventures", "S4", "Supernatural", "Adventure", 2012, 8.50);
    static animeObject yourLieInApril = new animeObject("Your Lie In April", "S1", "romance", "music", 2014, 8.66);
    public static void commitLib(){
        anime.clear();
        anime.add(spyXFamily);
        anime.add(chainsawMan);
        anime.add(cowboyBebop);
        anime.add(onePiece);
        anime.add(jojosBizAdv);
        anime.add(yourLieInApril);
    }
    public static void main(String[] args) {

        anime.add(spyXFamily);
        anime.add(chainsawMan);
        anime.add(cowboyBebop);
        anime.add(onePiece);
        for (animeObject animeObject : anime) {
            System.out.println(animeObject.toString());
        }

    }
}


