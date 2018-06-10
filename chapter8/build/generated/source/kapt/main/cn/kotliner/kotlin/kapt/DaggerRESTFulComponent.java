package cn.kotliner.kotlin.kapt;

import cn.kotliner.kotlin.kapt.module.BaseUrlModule;
import cn.kotliner.kotlin.kapt.module.BaseUrlModule_BaseUrlFactory;
import cn.kotliner.kotlin.kapt.module.CacheModule;
import cn.kotliner.kotlin.kapt.module.CacheModule_CacheFactory;
import cn.kotliner.kotlin.kapt.module.GsonConverterModule;
import cn.kotliner.kotlin.kapt.module.GsonConverterModule_ConverterFactory;
import cn.kotliner.kotlin.kapt.module.GsonModule;
import cn.kotliner.kotlin.kapt.module.GsonModule_GsonFactory;
import cn.kotliner.kotlin.kapt.module.OkHttpClientModule;
import cn.kotliner.kotlin.kapt.module.OkHttpClientModule_OkHttpClientFactory;
import cn.kotliner.kotlin.kapt.module.RetrofitModule;
import cn.kotliner.kotlin.kapt.module.RetrofitModule_RetrofitFactory;
import cn.kotliner.kotlin.kapt.module.RxAdapterModule;
import cn.kotliner.kotlin.kapt.module.RxAdapterModule_AdapterFactory;
import com.google.gson.Gson;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerRESTFulComponent implements RESTFulComponent {
  private Provider<String> baseUrlProvider;

  private Provider<Cache> cacheProvider;

  private Provider<OkHttpClient> okHttpClientProvider;

  private Provider<CallAdapter.Factory> adapterProvider;

  private Provider<Gson> gsonProvider;

  private Provider<Converter.Factory> converterProvider;

  private Provider<Retrofit> retrofitProvider;

  private DaggerRESTFulComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static RESTFulComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.baseUrlProvider =
        DoubleCheck.provider(BaseUrlModule_BaseUrlFactory.create(builder.baseUrlModule));

    this.cacheProvider = DoubleCheck.provider(CacheModule_CacheFactory.create(builder.cacheModule));

    this.okHttpClientProvider =
        DoubleCheck.provider(
            OkHttpClientModule_OkHttpClientFactory.create(
                builder.okHttpClientModule, cacheProvider));

    this.adapterProvider =
        DoubleCheck.provider(RxAdapterModule_AdapterFactory.create(builder.rxAdapterModule));

    this.gsonProvider = DoubleCheck.provider(GsonModule_GsonFactory.create(builder.gsonModule));

    this.converterProvider =
        DoubleCheck.provider(
            GsonConverterModule_ConverterFactory.create(builder.gsonConverterModule, gsonProvider));

    this.retrofitProvider =
        DoubleCheck.provider(
            RetrofitModule_RetrofitFactory.create(
                builder.retrofitModule,
                baseUrlProvider,
                okHttpClientProvider,
                adapterProvider,
                converterProvider));
  }

  @Override
  public Retrofit retrofit() {
    return retrofitProvider.get();
  }

  public static final class Builder {
    private BaseUrlModule baseUrlModule;

    private CacheModule cacheModule;

    private OkHttpClientModule okHttpClientModule;

    private RxAdapterModule rxAdapterModule;

    private GsonModule gsonModule;

    private GsonConverterModule gsonConverterModule;

    private RetrofitModule retrofitModule;

    private Builder() {}

    public RESTFulComponent build() {
      if (baseUrlModule == null) {
        this.baseUrlModule = new BaseUrlModule();
      }
      if (cacheModule == null) {
        this.cacheModule = new CacheModule();
      }
      if (okHttpClientModule == null) {
        this.okHttpClientModule = new OkHttpClientModule();
      }
      if (rxAdapterModule == null) {
        this.rxAdapterModule = new RxAdapterModule();
      }
      if (gsonModule == null) {
        this.gsonModule = new GsonModule();
      }
      if (gsonConverterModule == null) {
        this.gsonConverterModule = new GsonConverterModule();
      }
      if (retrofitModule == null) {
        this.retrofitModule = new RetrofitModule();
      }
      return new DaggerRESTFulComponent(this);
    }

    public Builder retrofitModule(RetrofitModule retrofitModule) {
      this.retrofitModule = Preconditions.checkNotNull(retrofitModule);
      return this;
    }

    public Builder gsonConverterModule(GsonConverterModule gsonConverterModule) {
      this.gsonConverterModule = Preconditions.checkNotNull(gsonConverterModule);
      return this;
    }

    public Builder gsonModule(GsonModule gsonModule) {
      this.gsonModule = Preconditions.checkNotNull(gsonModule);
      return this;
    }

    public Builder okHttpClientModule(OkHttpClientModule okHttpClientModule) {
      this.okHttpClientModule = Preconditions.checkNotNull(okHttpClientModule);
      return this;
    }

    public Builder cacheModule(CacheModule cacheModule) {
      this.cacheModule = Preconditions.checkNotNull(cacheModule);
      return this;
    }

    public Builder rxAdapterModule(RxAdapterModule rxAdapterModule) {
      this.rxAdapterModule = Preconditions.checkNotNull(rxAdapterModule);
      return this;
    }

    public Builder baseUrlModule(BaseUrlModule baseUrlModule) {
      this.baseUrlModule = Preconditions.checkNotNull(baseUrlModule);
      return this;
    }
  }
}
