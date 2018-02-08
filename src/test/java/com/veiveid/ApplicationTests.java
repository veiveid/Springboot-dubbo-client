package com.veiveid;

import com.veiveid.service.ComputeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class ApplicationTests {

	@Autowired
	private ComputeService computeService;

	@Test
	public void testAdd() throws Exception {
		System.out.println("result===="+computeService.add(1, 2));
		//Assert.assertEquals("compute-service:add", new Integer(3), computeService.add(1, 2));
	}

}
