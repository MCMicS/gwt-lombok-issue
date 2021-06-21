package de.mcmics.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import de.mcmics.common.User;

public interface MySampleApplicationServiceAsync {

  void getUser(String name, AsyncCallback<User> async);
}
