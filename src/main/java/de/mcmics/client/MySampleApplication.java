package de.mcmics.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.DOM;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import de.mcmics.common.User;
import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import lombok.Value;

/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class MySampleApplication implements EntryPoint {

  /**
   * This is the entry point method.
   */
  public void onModuleLoad() {
    final Button button = new Button("Click me");
    final Label label = new Label();

    button.addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        if (label.getText().equals("")) {
          MySampleApplicationService.App.getInstance()
              .getUser("Bob", new MyAsyncCallback(label));
        } else {
          label.setText("");
        }
      }
    });

    // Assume that the host HTML has elements defined whose
    // IDs are "slot1", "slot2".  In a real app, you probably would not want
    // to hard-code IDs.  Instead, you could, for example, search for all
    // elements with a particular CSS class and replace them with widgets.
    //
    RootPanel.get("slot1").add(button);
    RootPanel.get("slot2").add(label);
  }

  private static class MyAsyncCallback implements AsyncCallback<User> {

    private Label label;

    MyAsyncCallback(Label label) {
      this.label = label;
    }

    public void onSuccess(User result) {
      UserResult userResult = new UserResult(result.getName(), result.getAge());
      label.getElement().setInnerHTML(userResult.getMessage());
    }

    public void onFailure(Throwable throwable) {
      label.setText("Failed to receive answer from server!");
    }
  }

  @ParametersAreNonnullByDefault
  @Value
  private static class UserResult {
    private String name;
    private int age;

    @Nonnull
    public String getMessage() {
      return getMessage(" : ");
    }

    @Nonnull
    public String getMessage(String separator) {
      return name + separator + age;
    }
  }
}
