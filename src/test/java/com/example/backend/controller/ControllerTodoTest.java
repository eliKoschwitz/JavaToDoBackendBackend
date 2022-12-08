package com.example.backend.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class ControllerTodoTest {
    @Autowired
    private MockMvc mvc;

    @Test
    void getTodosExpectedEmptyJSON() throws Exception {
        //GIVEN
        String expectedJSON = """
            [
            ]
            """;
        //WHEN & THEN
        mvc.perform(MockMvcRequestBuilders.get("/api/todo")) //aufruf des restendpunktes
                .andExpect(status().isOk())                             //geht davon aus das der serverstatus 200 ist
                .andExpect(content().json(expectedJSON));
    }

    @Test
    void postATodoExpectedOneTodo() throws Exception {
        //GIVEN
        String requestBody = """
                    {
                        "id":"1234",
                        "description":"Hello",
                        "status": "Open"
                    }
                """;

        String expectedJSON = "true";


        //WHEN & THEN
        mvc.perform(MockMvcRequestBuilders.post("/api/todo")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(requestBody))
                .andExpect(status().isOk())
                .andExpect(content().string(expectedJSON));
    }

    @Test
    void getTodoById() throws Exception {
        //GIVEN
        String expectedJSON = """
          {
            "id":"1",
            "description":"Boxen",
            "status": "Open"
            }
        """;

        String requestBody = """
                {
                    "description":"Sport",
                    "status": "Close"
                }
                """;

        mvc.perform(MockMvcRequestBuilders.post("/api/todo")
                .contentType(MediaType.APPLICATION_JSON)
                .content(requestBody));

        //WHEN & THEN
        mvc.perform(MockMvcRequestBuilders.get("/api/todo/1")) //aufruf des restendpunktes
                .andExpect(status().isOk())                             //geht davon aus das der serverstatus 200 ist
                .andExpect(content().json(expectedJSON));
    }

    @Test
    void updateTodo() throws Exception {
        //GIVEN
        String expectedJSON = """
          {
            "id":"1",
            "description":"Aufstehen",
            "status": "In Progress"
            }
        """;

        String requestBodyPost= """
          {
            "description":"Zähne",
            "status": "Done"
            }
        """;

        String requestBodyPut = """
                {
                    "id":"1",
                    "description":"Aufstehen",
                    "status": "In Progress"
                }
                """;

        mvc.perform(MockMvcRequestBuilders.post("/api/todo")
                .contentType(MediaType.APPLICATION_JSON)
                .content(requestBodyPost));

        mvc.perform(MockMvcRequestBuilders.put("/api/todo/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content(requestBodyPut));

        //WHEN & THEN
        mvc.perform(MockMvcRequestBuilders.get("/api/todo/1")) //aufruf des restendpunktes
                .andExpect(status().isOk())                             //geht davon aus das der serverstatus 200 ist
                .andExpect(content().json(expectedJSON));
    }

    @Test
    void deleteTodo() throws Exception {
        // GIVEN
        String expectedJSON = """
            [
            ]
        """;

        String requestBodyPost = """
                {
                    "description":"Aufstehen",
                    "status": "In Progress"
                }
                """;

        mvc.perform(MockMvcRequestBuilders.post("/api/todo")
                .contentType(MediaType.APPLICATION_JSON)
                .content(requestBodyPost));

        // WHEN
        mvc.perform(MockMvcRequestBuilders.delete("/api/todo/1"));
        // THEN
        mvc.perform(MockMvcRequestBuilders.get("/api/todo"))
                .andExpect(status().isOk())
                .andExpect(content().json(expectedJSON));
    }
}