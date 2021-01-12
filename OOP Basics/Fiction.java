/*
Tommy Suh
 */

import java.util.Random;

public class Fiction extends Book
{

//instance variable
    Genre genre;

//setter
    public void setGenre(Genre genre){
        this.genre = genre;
    }

//getter
    public Genre getGenre(){
        return genre;
    }

//constructor
    public Fiction(){
        this.genre = Genre.MYSTERY;
    }

    public Fiction(String title, int pages, String color, int rating, Genre genre) throws BannedBookException{
        int flip = 0;

        for(int i = 0; i < bannedBooks().size()-1; i++){
            if(title == bannedBooks().get(i)){
                flip = 1;
            }
        }

        if(flip == 0){
            this.title = title;
            this.pages = pages;
            this.color = color;
            this.rating = rating;
            this.genre = genre;
        } else{
            throw new BannedBookException(title +  " is a banned book and may not be added to the collection!");
        }
  
    }

//methods
    public boolean isSameGenre(Fiction fiction){
        if(this.genre.equals(fiction.genre)){
            return true;
        } else{
            return false;
        }
    }

    public int randomRating(){
        Random random = new Random();
        
        if(this.genre == Genre.FANTASY){ //2-5
            return random.nextInt(3) + 2;
        }else if(this.genre == Genre.MYSTERY){ //3-5
            return random.nextInt(2) + 3;
        }else if(this.genre == Genre.HUMOR){ //1-5
            return random.nextInt(4) + 1;
        }else{
            return 0;
        }
    }

    public String toString(){
        return ("The title is " + this.title + " and it has " + this.pages + " pages. It is a " + this.genre + " book. The color of the book is " + this.color + " and its rating is " + this.rating +".");
    }
}
