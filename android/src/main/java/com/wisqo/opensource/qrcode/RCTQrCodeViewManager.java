package com.wisqo.opensource.qrcode;

import android.annotation.TargetApi;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;

import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;

public class RCTQrCodeViewManager extends ViewGroupManager<QrCodeView> {
  public static final String REACT_CLASS = "RCTQrCodeScanner";

  private AttributeSet attrs;

  @Override
  public String getName() {
    return REACT_CLASS;
  }

  @Override
  public QrCodeView createViewInstance(ThemedReactContext context) {
    return new ZBarView(context, attrs);
  }

  void createTypeArray() {

  }
}
