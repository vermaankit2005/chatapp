package com.example.application.views.myview;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.messages.MessageInput;
import com.vaadin.flow.component.messages.MessageList;
import com.vaadin.flow.component.messages.MessageListItem;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@PageTitle("My View")
@Route(value = "")
@RouteAlias(value = "")
public class MyViewView extends Composite<VerticalLayout> {

    public MyViewView() {
        MessageList messageList = new MessageList();
        MessageInput messageInput = new MessageInput();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        messageList.setWidth("100%");
        setMessageListSampleData(messageList);
        messageInput.setWidth("100%");
        getContent().add(messageList);
        getContent().add(messageInput);
    }

    private void setMessageListSampleData(MessageList messageList) {
        MessageListItem message1 = new MessageListItem("Nature does not hurry, yet everything gets accomplished.",
                LocalDateTime.now().minusDays(1).toInstant(ZoneOffset.UTC), "Matt Mambo");
        message1.setUserColorIndex(1);
        MessageListItem message2 = new MessageListItem(
                "Using your talent, hobby or profession in a way that makes you contribute with something good to this world is truly the way to go.",
                LocalDateTime.now().minusMinutes(55).toInstant(ZoneOffset.UTC), "Linsey Listy");
        message2.setUserColorIndex(2);
        messageList.setItems(message1, message2);
    }
}
