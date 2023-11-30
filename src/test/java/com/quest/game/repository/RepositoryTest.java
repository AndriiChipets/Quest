package com.quest.game.repository;

import com.quest.game.question.Question;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {

    @Test
    void testRepositoryCreation() {
        Repository repository = Repository.getInstance();

        assertNotNull(repository);
        assertNotNull(repository.getFirstQuestion());
        assertNotNull(repository.getQuestions());
    }

    @Test
    void testRepositoryInstance() {
        Repository repository1 = Repository.getInstance();
        Repository repository2 = Repository.getInstance();

        assertNotNull(repository1);
        assertNotNull(repository2);
        assertEquals(repository1, repository2);
    }

    @Test
    void testGetQuestionsAndFirstQuestion() {
        Repository repository = Repository.getInstance();

        Map<Integer, Question> questions = repository.getQuestions();
        Question firstQuestion = repository.getFirstQuestion();

        assertNotNull(questions);
        assertFalse(questions.isEmpty());
        assertNotNull(firstQuestion);
        assertEquals(firstQuestion, questions.get(1));
    }
}