/*
Tommy Suh
 */

import java.util.Random;

public class NonFiction extends Book
{
//instance variable
    int callNumber;

//setter
    public void setCallNumber(int callNumber){
        this.callNumber = callNumber;
    }

//getter
    public int getCallNumber(){
        return callNumber;
    }

//constructor
    public NonFiction(){
        this.callNumber = 005;
    }

    public NonFiction(String title, int pages, String color, int rating, int callNumber) throws BannedBookException{
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
            this.callNumber = callNumber;
        } else{
            throw new BannedBookException(title +  " is a banned book and may not be added to the collection!");
        }

    }

//methods
    public boolean hasSameCallNumber(NonFiction nonfiction){
        if(this.callNumber == nonfiction.callNumber){
            return true;
        } else{
            return false;
        }
    }

    public int randomRating(){
        Random random = new Random();

        if(this.callNumber <= 333){
            return random.nextInt(2) + 1;
        } else if(this.callNumber <= 666){
            return random.nextInt(2) + 3;
        } else if(this.callNumber <= 999){
            return random.nextInt(2) + 2;
        } else{
            return 0;
        }
    }

    public String toString(){
        return ("The title is " + this.title + " and it has " + this.pages + " pages. The color of the book is " + this.color + " and its rating is " + this.rating +". The call number is " + this.callNumber + ".");
    }
}
