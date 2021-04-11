package com.example.pictionary;

public class Questions {

    private String mQuestions[] = {

            "Guess the picture ?",
            "Bet you cannot guess this?",
            "Do you know this one?",
            "Can you remember this one ?",
            "Do you know this one?",
            "Bet you cannot guess this?",
            "Bet you cannot guess this?",
            "Can you remember this one ?",
            "Guess the picture ?",
            "Do you know this one?",
            "Do you know this one?",
            "Guess the picture ?"
    };

    private String mChoice[] [] = {

            {"Book","Folder","Binder"},
            {"Tissue","Towel","Cloth"},
            {"Paper","Whiteboard","Bulletin Board"},
            {"Vacuum Cleaner","Mop","Fancy Broom"},
            {"Cell","Battery","Mobile"}

    };

    private String mImages[] = {
            "q1",   //binder
            "q2",   //towel
            "q3",   //whiteboard
            "q4",   //vaccum cleaner
            "q5",   //battery
    };

    private String mQuestionsType[] = {
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton"
    };

    private String mCorrectAnswers [] = {
            "Binder",
            "Towel",
            "Whiteboard",
            "Vacuum Cleaner",
            "Battery"


    };

    public String getQuestions(int q) {
        String questions = mQuestions[q];
        return questions;
    }

    public String[] getChoice(int q) {
        String[] choice = mChoice[q];
        return choice;
    }

    public String getImages(int q) {
        String img = mImages[q];
        return img;
    }

    public String getType(int q) {
        String type = mQuestionsType[q];
        return type;
    }

    public int getLength(){
        return mQuestions.length;
    }

    public String getCorrectAnswers(int q) {
        String correct = mCorrectAnswers[q];
        return correct;
    }
}

