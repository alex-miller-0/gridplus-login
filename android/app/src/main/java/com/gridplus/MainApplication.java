package com.gridplus;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.react.rnspinkit.RNSpinkitPackage;
import com.horcrux.svg.SvgPackage;
import com.rnfs.RNFSPackage;
import com.oblador.vectoricons.VectorIconsPackage;
import com.peel.react.TcpSocketsModule;
import com.bitgo.randombytes.RandomBytesPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
            new RNSpinkitPackage(),
            new SvgPackage(),
            new RNFSPackage(),
            new VectorIconsPackage(),
            new TcpSocketsModule(),
            new RandomBytesPackage()
      );
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }
}
