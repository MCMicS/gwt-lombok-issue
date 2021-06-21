package de.mcmics.common;

import javax.annotation.ParametersAreNonnullByDefault;
import lombok.Value;

@ParametersAreNonnullByDefault
@Value
public class User {

  private String name;
  private int age;

}
