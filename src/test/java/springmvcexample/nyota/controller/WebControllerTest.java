package springmvcexample.nyota.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class WebControllerTest {
	private MockMvc mockMvc;

	@Before
	public void setup() {

		this.mockMvc = MockMvcBuilders.standaloneSetup(new WebController()).build();
	}

	@Test
	public void basicTest() throws Exception {
		/*
		 * this.mockMvc.perform(get("/").accept(MediaType.parseMediaType(
		 * "application/html;charset=UTF-8")))
		 * .andExpect(status().isOk()).andExpect(content().contentType(
		 * "application/html;charset=UTF-8"))
		 * .andExpect(content().string("Welcome to Spring MVC"));
		 */

		this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string("Welcome to Spring MVC"));
	}

}
