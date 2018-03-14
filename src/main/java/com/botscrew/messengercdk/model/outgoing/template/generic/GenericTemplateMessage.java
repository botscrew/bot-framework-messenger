package com.botscrew.messengercdk.model.outgoing.template.generic;

import com.botscrew.messengercdk.model.outgoing.Attachment;
import com.botscrew.messengercdk.model.outgoing.QuickReply;
import com.botscrew.messengercdk.model.outgoing.QuickReplyMessage;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class GenericTemplateMessage extends QuickReplyMessage {
    private Attachment attachment;

    public GenericTemplateMessage(Attachment attachment) {
        super(null, null);
        this.attachment = attachment;
    }

    public GenericTemplateMessage(List<QuickReply> quickReplies, Attachment attachment) {
        super(null, quickReplies);
        this.attachment = attachment;
    }
}
