package ee.carlrobert.llm.client.you.completion;

import ee.carlrobert.llm.completion.CompletionRequest;
import java.util.List;
import java.util.UUID;

public class YouCompletionRequest implements CompletionRequest {

  private final String prompt;
  private final List<YouCompletionRequestMessage> messages;
  private final UUID chatId;
  private final UUID queryTraceId;

  public YouCompletionRequest(Builder builder) {
    this.prompt = builder.prompt;
    this.messages = builder.messages;
    this.chatId = builder.chatId;
    this.queryTraceId = builder.queryTraceId;
  }

  public String getPrompt() {
    return prompt;
  }

  public List<YouCompletionRequestMessage> getMessages() {
    return messages;
  }

  public UUID getChatId() {
    return chatId;
  }

  public UUID getQueryTraceId() {
    return queryTraceId;
  }

  public static class Builder {

    private final String prompt;
    private List<YouCompletionRequestMessage> messages;
    private UUID chatId;
    private UUID queryTraceId;

    public Builder(String prompt) {
      this.prompt = prompt;
    }

    public Builder setChatHistory(List<YouCompletionRequestMessage> messages) {
      this.messages = messages;
      return this;
    }

    public Builder setChatId(UUID chatId) {
      this.chatId = chatId;
      return this;
    }

    public Builder setQueryTraceId(UUID queryTraceId) {
      this.queryTraceId = queryTraceId;
      return this;
    }

    public YouCompletionRequest build() {
      return new YouCompletionRequest(this);
    }
  }
}