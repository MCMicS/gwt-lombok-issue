package de.mcmics.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import de.mcmics.client.MySampleApplicationService;
import de.mcmics.common.User;
import java.util.Random;
import javax.annotation.Nonnull;

public class MySampleApplicationServiceImpl extends RemoteServiceServlet implements
    MySampleApplicationService {

  @Nonnull
  public User getUser(String name) {
    return new User(name, new Random().nextInt(99));
  }
}
