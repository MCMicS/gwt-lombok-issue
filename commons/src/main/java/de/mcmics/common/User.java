package de.mcmics.common;

import java.io.Serializable;
import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@ParametersAreNonnullByDefault
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Setter(AccessLevel.NONE)
@Data
public class User implements Serializable {

  private static final long serialVersionUID = -9211075524573758241L;

  @Nonnull
  private String name;
  private int age;

}
