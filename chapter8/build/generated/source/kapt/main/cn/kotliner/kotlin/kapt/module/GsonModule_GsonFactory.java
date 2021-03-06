package cn.kotliner.kotlin.kapt.module;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GsonModule_GsonFactory implements Factory<Gson> {
  private final GsonModule module;

  public GsonModule_GsonFactory(GsonModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Gson get() {
    return Preconditions.checkNotNull(
        module.gson(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Gson> create(GsonModule module) {
    return new GsonModule_GsonFactory(module);
  }
}
