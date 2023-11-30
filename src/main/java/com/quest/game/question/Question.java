package com.quest.game.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question {

    private final Integer value;

    private final String title;

    private final String text;

    private final List<Integer> nextQuestions;

    public Question(Integer value, String title, String text, Integer... next) {
        this.value = value;
        this.title = title;
        this.text = text;
        this.nextQuestions = new ArrayList<>(Arrays.asList(next));
    }

    public Integer getValue() {
        return value;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public List<Integer> getNextQuestions() {
        return nextQuestions;
    }
}