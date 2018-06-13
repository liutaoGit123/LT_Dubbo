package cn.lt.ltdubbo.provider.service.impl;

import org.springframework.stereotype.Service;

import cn.lt.ltdubbo.api.service.IMessageService;
import cn.lt.ltdubbo.api.vo.Message;

@Service
public class MessageServiceImpl implements IMessageService {

	@Override
	public Message echo(Message msg) {
		Message echoMsg = new Message() ;
		echoMsg.setTitle("【ECHO】" + msg.getTitle());
		echoMsg.setContent("【ECHO】" + msg.getContent());
		echoMsg.setSender("MessageProvider");
		return echoMsg ;
	}

}
