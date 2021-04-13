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
            {"Cell","Battery","Mobile"},
            {"Cereal", "Ear Wax", "Dry Honey"},
            {"Cigarette", "Twig", "Apple"},
            {"Ant Tunnel", "Oreo", "Fish Bowl"},
            {"Light Bulb", "Pen", "Soldering Iron"},
            {"Vents", "Razor", "Hidden Camera"},
            {"Monkey Wrench","Chain", "Lighter"},
            {"Dog", "Bear", "Deer"}

    };

    private String mImages[] = {
            "q1",   //binder
            "q2",   //towel
            "q3",   //whiteboard
            "q4",   //vacuum cleaner
            "q5",   //battery
            "q6",   //cereal
            "q7",   //apple
            "q8",   //Oreo Cookie
            "q9",   //pen
            "q10",  //razor
            "q11",  //lighter
            "q12"   //dog
    };

    private String mQuestionsType[] = {
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
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
            "Battery",
            "Cereal",
            "Apple",
            "Oreo Cookie",
            "Pen",
            "Razor",
            "Lighter",
            "Dog"


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

