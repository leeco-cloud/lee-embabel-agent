package com.lee.embabel.agent.starter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    private final OpenAiChatModel chatModel;

    public ChatController(OpenAiChatModel chatModel) {
        this.chatModel = chatModel;
    }

    /**
     * 聊天接口
     */
    @GetMapping("/chat")
    public String generate(@RequestParam(value = "message", defaultValue = "hello") String message) {
        return this.chatModel.call(message);
    }


}
