package cn.lt.ltdubbo.consumer.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.lt.ltdubbo.api.service.IMessageService;
import cn.lt.ltdubbo.api.vo.Message;

@ContextConfiguration(locations= {"classpath:spring/spring-*.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestMessageService {
	@Autowired
	private IMessageService messageService ;
	@Test
	public void testEcho() {
		Message msg = new Message() ;
		msg.setTitle("TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT") ;
		msg.setContent("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
		msg.setSender("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
		System.out.println(this.messageService.echo(msg));
	}
}
