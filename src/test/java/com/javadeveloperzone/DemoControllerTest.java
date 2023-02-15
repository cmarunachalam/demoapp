package com.javadeveloperzone;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class DemoControllerTest extends AbstractTest {

    @Override
    @Before
    public void setUp() {
        super.setUp();
    }

    @Test
    public void welcome() throws Exception {
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get("/")).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        assertEquals("Welcome", content);
    }

    @Test
    public void home() throws Exception {
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get("/home")).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        assertEquals("Home", content);
    }

    @Test
    public void services() throws Exception {
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get("/services")).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        assertEquals("Services", content);
    }

    @Test
    public void aboutUs() throws Exception {
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get("/aboutUs")).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        assertEquals("About Us", content);
    }

    @Test
    public void logout() throws Exception {
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get("/logout")).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        assertEquals("Logout", content);
    }
}