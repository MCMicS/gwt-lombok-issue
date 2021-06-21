package de.mcmics.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface MySampleApplicationServiceAsync {

  void getMessage(String msg, AsyncCallback<String> async);
}
