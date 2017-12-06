
package com.wisqo.opensource.qrcode;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

public class RCTQrCodeModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RCTQrCodeModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RCTQrCode";
  }
}