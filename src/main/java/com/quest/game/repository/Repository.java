package com.quest.game.repository;

import com.quest.game.question.Question;

import java.util.HashMap;
import java.util.Map;

public class Repository {

    private static Repository instance;
    private final Map<Integer, Question> questions;
    private final Question firstQuestion;

    private Repository() {
        Question question = new Question(1, "You wake up in a mysterious forest. What will you do?", "", 2, 3);
        questions = new HashMap<>() {
            {
                put(1, question);
                put(2, new Question(2, "You explore the forest and find a hidden house. Will you enter the house?", "Start exploring the forest.", 4, 5));
                put(3, new Question(3, "You scream for help, but there's no response. Instead, you hear a distant growl. What will you do?", "Scream for help", 6, 7));
                put(4, new Question(4, "You decide to enter the hidden house. Inside, you discover a room filled with ancient artifacts and a mysterious portal. What do you choose to do?", "Yes, enter the house", 8, 9));
                put(5, new Question(5, "You choose to bypass the house and continue your exploration. As you walk deeper into the forest, you stumble upon a clearing with a peculiar altar. What will you do?", "No, bypass the predator and continue the research.", 10, 6));
                put(6, new Question(6, "While cautiously moving through the forest, you encounter a friendly woodland creature. What will you do?", "Stay put and remain quiet, hoping the threat passes", 8, 10));
                put(7, new Question(7, "As you run away from the growl, you find yourself facing a mysterious figure in a hooded cloak. What will you do?", "Attempt to run in the opposite direction of the growl.", 8, 10));
                put(8, new Question(8, "The artifacts in the house or the woodland creature reveal that you are in a magical realm governed by ancient forces. What action will you take?", "Examine the artifacts closely", 10, 9));
                put(9, new Question(9, "Stepping through the portal, you find yourself in a different realm filled with challenges. What's your next move?", "Step through the portal, curious about where it might lead", 10, 6));
                put(10, new Question(10, "You decide to listen to the islanders' story about the island's mystery. It turns out to be connected to an ancient legend. You find it intriguing and decide to help solve the puzzle. What will you do?", "Approach them and ask for help", 100, 101));
                put(100, new Question(100, "You Win, my congrats :)", "To solve the puzzle."));
                put(101, new Question(101, "You Lose, try again :(", "Refuse."));
            }
        };
        this.firstQuestion = question;
    }

    public static Repository getInstance() {
        if (instance == null) {
            instance = new Repository();
        }
        return instance;
    }

    public Map<Integer, Question> getQuestions() {
        return questions;
    }

    public Question getFirstQuestion() {
        return firstQuestion;
    }
}
