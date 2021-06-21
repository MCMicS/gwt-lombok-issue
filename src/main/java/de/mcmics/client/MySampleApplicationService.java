package de.mcmics.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import de.mcmics.common.User;
import javax.annotation.Nonnull;

@RemoteServiceRelativePath("MySampleApplicationService")
public interface MySampleApplicationService extends RemoteService {

  @Nonnull
  User getUser(String name);

  /**
   * Utility/Convenience class. Use MySampleApplicationService.App.getInstance() to access static
   * instance of MySampleApplicationServiceAsync
   */
  class App {

    private static MySampleApplicationServiceAsync ourInstance = GWT
        .create(MySampleApplicationService.class);

    public static synchronized MySampleApplicationServiceAsync getInstance() {
      return ourInstance;
    }
  }
}
