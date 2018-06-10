package cn.kotliner.kotlin.kapt.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BaseUrlModule_BaseUrlFactory implements Factory<String> {
  private final BaseUrlModule module;

  public BaseUrlModule_BaseUrlFactory(BaseUrlModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public String get() {
    return Preconditions.checkNotNull(
        module.baseUrl(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<String> create(BaseUrlModule module) {
    return new BaseUrlModule_BaseUrlFactory(module);
  }
}
