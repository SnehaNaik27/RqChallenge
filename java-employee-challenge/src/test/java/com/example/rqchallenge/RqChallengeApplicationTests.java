package com.example.rqchallenge;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class RqChallengeApplicationTests {
	
	@Autowired
	private MockMvc mockMvc;

    @Test
    void contextLoads() {
    }
    
    //@Test
	public void topTenHighestEarningEmployeeNames() throws Exception {
		this.mockMvc.perform(get("/topTenHighestEarningEmployeeNames")).andDo(print()).andExpect(status().isOk());
	}

    //@Test
   	public void getEmployeesByNameSearch() throws Exception {
   		this.mockMvc.perform(get("/employee/search/gaines")).andDo(print()).andExpect(status().isOk());
   	}
   	
    @Test
   	public void getEmployeesById() throws Exception {
   		this.mockMvc.perform(get("/employee/2222")).andDo(print()).andExpect(status().isNotFound());
   	}
}
