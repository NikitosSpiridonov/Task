package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    @Test
    public void shouldTestSimpleTaskWhenMatch() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Позвонить");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldTestSimpleTaskWhenNotMatch() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Записать");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldTestEpicWhenMatch() {
    Epic epic = new Epic(55, new String[]{"Молоко"});
        boolean actual = epic.matches("Молоко");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
}
    @Test
    public void shouldTestEpicWhenNotMatch() {
        Epic epic = new Epic(55, new String[]{ "Молоко", "Яйца", "Хлеб" });
        boolean actual = epic.matches("Сыр");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldTestMeetingWhenTopicMatch() {
        Meeting meeting = new Meeting(555,"Выкатка 3й версии приложения","Приложение НетоБанка","Во вторник после обеда");
        boolean actual = meeting.matches("Выкатка 3й версии приложения");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldTestMeetingWhenProjectMatch() {
        Meeting meeting = new Meeting(555,"Выкатка 3й версии приложения","Приложение НетоБанка","Во вторник после обеда");
        boolean actual = meeting.matches("Приложение НетоБанка");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldTestMeetingWhenNotMatch() {
        Meeting meeting = new Meeting(555,"Выкатка 3й версии приложения","Приложение НетоБанка","Во вторник после обеда");
        boolean actual = meeting.matches("Приложение Нетологии");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }
}



