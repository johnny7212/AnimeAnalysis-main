public class animeObject {
    // initializes each parameter needed to create an anime object
    public String name= "";
    public String season= "";
    public String genre = "";
    public String genre2= "";
    public int relDate;
    public double rate;



    public void setRate(double rate) {
        this.rate = rate;
    }
    // lines 16 through 30 create the return statements for each parameter
    public double getRate() {
        return rate;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getGenre2() {
        return genre2;
    }

    //public String getSeason() {
    //    return season;
    //}


    /**
     * @param name the name of an anime
     * @param season string number of seasons in an anime
     * @param genre names one of the genres an anime could be
     * @param genre2 names a second genre an anime could be
     * @param relDate int number of the release date of an anime
     * @param rate double number of the rating an anime has
     */
    public animeObject(String name, String season, String genre, String genre2, int relDate, double rate){
        this.name= name;
        this.season= season;
        this.genre= genre;
        this.genre2= genre2;
        this.relDate= relDate;
        this.rate= rate;

    }

    /**
     *
     * @param name the name of each anime
     * @param genre names one of the genres an anime could be
     * @param genre2 names a second genre an anime could be
     * @param relDate int number of the release date of an anime
     * @param rate double number of the rating an anime has
     */
    public animeObject(String name, String genre, String genre2, int relDate, double rate){
        this.name= name;
        this.genre= genre;
        this.genre2= genre2;
        this.relDate= relDate;
        this.rate= rate;

    }

    /**
     * @return a full string of every item in an object
     */
    @Override
    public String toString() {
            if (season.equals("")){
                return name + ", " + genre + ", " + genre2 + ", " + relDate + ", " + rate;
            }
            return name + ", " + season + ", " + genre + ", " + genre2 + ", " + relDate + ", " + rate;
        }

    }


