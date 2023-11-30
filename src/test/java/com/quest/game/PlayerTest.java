package com.quest.game;

import com.quest.game.question.Question;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void testPlayerCreation() {
        Player player = new Player();

        assertNotNull(player);
        assertNotNull(player.getCurrentQuestion());
    }

    @Test
    void testNextQuestion() {
        Player player = new Player();
        String validAnswer = "2";
        String invalidAnswer = "999";

        player.nextQuestion(validAnswer);
        Question validNextQuestion = player.getCurrentQuestion();

        player.nextQuestion(invalidAnswer);
        Question invalidNextQuestion = player.getCurrentQuestion();

        assertNotNull(validNextQuestion);
        assertNotNull(invalidNextQuestion);
        assertNotEquals(validNextQuestion, invalidNextQuestion);
    }


    @Test
    void testGetNextQuestions() {
        Player player = new Player();

        List<Question> nextQuestions = player.getNextQuestions();

        assertNotNull(nextQuestions);
        assertFalse(nextQuestions.isEmpty());
    }

}
