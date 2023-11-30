package com.quest.game.question;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class QuestionTest {

    @Test
    void testGetNextQuestions() {
        Integer[] nextQuestionsArray = {2, 3};
        Question question = new Question(1, "Title", "Text", nextQuestionsArray);

        List<Integer> nextQuestions = question.getNextQuestions();

        assertEquals(Arrays.asList(nextQuestionsArray), nextQuestions);
    }

    @Test
    void testQuestionConstructorInitialization() {

        Integer value = 1;
        String titleEng = "English Title";
        String textEng = "English Text";
        Integer[] nextQuestions = {2, 3};

        Question question = new Question(value, titleEng, textEng, nextQuestions);

        assertEquals(value, question.getValue());
        assertEquals(titleEng, question.getTitle());
        assertEquals(textEng, question.getText());
        assertArrayEquals(nextQuestions, question.getNextQuestions().toArray());
    }

    @Test
    void testStringHandling() {
        Question question = new Question(1, "Title Eng", "Text Eng");

        String titleEng = question.getTitle();
        String textEng = question.getText();

        assertEquals("Title Eng", titleEng);
        assertEquals("Text Eng", textEng);
    }
}
