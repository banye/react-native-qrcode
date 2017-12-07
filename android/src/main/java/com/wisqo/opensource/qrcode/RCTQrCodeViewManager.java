package com.wisqo.opensource.qrcode;

import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.Map;

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

  @Override
  public Map getExportedCustomBubblingEventTypeConstants() {
    return MapBuilder.builder()
        .put(
            "result",
            MapBuilder.of(
                "phasedRegistrationNames",
                MapBuilder.of("bubbled", "onSuccess")))
        .put(
            "error",
            MapBuilder.of(
                "phasedRegistrationNames",
                MapBuilder.of("bubbled", "onError")))
        .build();
  }

  @ReactProp(name = "topOffset", defaultInt = 90)
  public void setTopOffset(QrCodeView view, int topOffset) {
    view.getScanBoxView().setTopOffset(topOffset);
  }

  @ReactProp(name = "cornerSize", defaultInt = 3)
  public void setCornerSize(QrCodeView view, int cornerSize) {
    view.getScanBoxView().setCornerSize(cornerSize);
  }

  @ReactProp(name = "cornerLength", defaultInt = 20)
  public void setCornerLength(QrCodeView view, int cornerLength) {
    view.getScanBoxView().setCornerLength(cornerLength);
  }

  @ReactProp(name = "scanLineSize", defaultInt = 1)
  public void setScanLineSize(QrCodeView view, int scanLineSize) {
    view.getScanBoxView().setScanLineSize(scanLineSize);
  }

  @ReactProp(name = "rectWidth", defaultInt = 200)
  public void setRectWidth(QrCodeView view, int rectWidth) {
    view.getScanBoxView().setRectWidth(rectWidth);
  }

  @ReactProp(name = "maskColor", defaultInt = 0x33FFFFFF)
  public void setMaskColor(QrCodeView view, int maskColor) {
    view.getScanBoxView().setMaskColor(maskColor);
  }

  @ReactProp(name = "cornerColor", defaultInt = Color.WHITE)
  public void setCornerColor(QrCodeView view, int cornerColor) {
    view.getScanBoxView().setCornerColor(cornerColor);
  }

  @ReactProp(name = "scanLineColor", defaultInt = Color.WHITE)
  public void setScanLineColor(QrCodeView view, int scanLineColor) {
    view.getScanBoxView().setScanLineColor(scanLineColor);
  }

  @ReactProp(name = "scanLineMargin", defaultInt = 0)
  public void setScanLineMargin(QrCodeView view, int scanLineMargin) {
    view.getScanBoxView().setScanLineMargin(scanLineMargin);
  }

  // Too difficult to make a compatible layer for custom drawable line
  // TODO: Implement this feature in the future.
  // @ReactProp(name = "isShowDefaultScanLineDrawable")
  // public void setIsShowDefaultScanLineDrawable(QrCodeView view,
  //   int isShowDefaultScanLineDrawable) {
  //   view.getScanBoxView().setIsShowDefaultScanLineDrawable(isShowDefaultScanLineDrawable);
  // }

  // Too difficult to make a compatible layer for custom drawable line
  // TODO: Implement this feature in the future.
  // @ReactProp(name = "isShowDefaultScanLineDrawable")
  // public void setIsShowDefaultScanLineDrawable(QrCodeView view,
  //   int isShowDefaultScanLineDrawable) {
  //   view.getScanBoxView().setIsShowDefaultScanLineDrawable(isShowDefaultScanLineDrawable);
  // }

  @ReactProp(name = "borderSize", defaultInt = 1)
  public void setBorderSize(QrCodeView view, int borderSize) {
    view.getScanBoxView().setBorderSize(borderSize);
  }

  @ReactProp(name = "borderColor", defaultInt = Color.WHITE)
  public void setBorderColor(QrCodeView view, int borderColor) {
    view.getScanBoxView().setBorderColor(borderColor);
  }

  @ReactProp(name = "animTime", defaultInt = 1000)
  public void setAnimTime(QrCodeView view, int animTime) {
    view.getScanBoxView().setAnimTime(animTime);
  }

  @ReactProp(name = "centerVertical", defaultBoolean = true)
  public void setCenterVertical(QrCodeView view, boolean isCenterVertical) {
    view.getScanBoxView().setCenterVertical(isCenterVertical);
  }

  @ReactProp(name = "toolbarHeight", defaultInt = 0)
  public void setToolbarHeight(QrCodeView view, int toolbarHeight) {
    view.getScanBoxView().setToolbarHeight(toolbarHeight);
  }

  @ReactProp(name = "barcodeRectHeight", defaultInt = 140)
  public void setBarcodeRectHeight(QrCodeView view, int barcodeRectHeight) {
    view.getScanBoxView().setToolbarHeight(barcodeRectHeight);
  }

  @ReactProp(name = "isBarCode")
  public void setIsBarcode(QrCodeView view, boolean isBarcode) {
    view.getScanBoxView().setIsBarcode(isBarcode);
  }

  @ReactProp(name = "barCodeTipText")
  public void setBarcodeTipText(QrCodeView view, @Nullable String barcodeTipText) {
    view.getScanBoxView().setBarCodeTipText(barcodeTipText);
  }

  @ReactProp(name = "qrCodeTipText")
  public void setQrCodeTipText(QrCodeView view, @Nullable String qrCodeTipText) {
    view.getScanBoxView().setQRCodeTipText(qrCodeTipText);
  }

  @ReactProp(name = "tipTextSize", defaultInt = 14)
  public void setTipTextSize(QrCodeView view, int tipTextSize) {
    view.getScanBoxView().setTipTextSize(tipTextSize);
  }

  @ReactProp(name = "tipTextColor", defaultInt = Color.WHITE)
  public void setTipTextColor(QrCodeView view, int tipTextColor) {
    view.getScanBoxView().setTipTextColor(tipTextColor);
  }

  @ReactProp(name = "tipTextBelowRect", defaultBoolean = false)
  public void setTipTextBelowRect(QrCodeView view, boolean tipTextBelowRect) {
    view.getScanBoxView().setTipTextBelowRect(tipTextBelowRect);
  }

  @ReactProp(name = "tipTextMargin", defaultInt = 20)
  public void setTipTextMargin(QrCodeView view, int tipTextMargin) {
    view.getScanBoxView().setTipTextMargin(tipTextMargin);
  }

  @ReactProp(name = "showTipBackground", defaultBoolean = false)
  public void setShowTipBackground(QrCodeView view, boolean showTipBackground) {
    view.getScanBoxView().setShowTipBackground(showTipBackground);
  }

  @ReactProp(name = "tipBackgroundColor", defaultInt = 0x22000000)
  public void setTipBackgroundColor(QrCodeView view, int tipBackgroundColor) {
    view.getScanBoxView().setTipBackgroundColor(tipBackgroundColor);
  }

  @ReactProp(name = "scanLineReverse", defaultBoolean = false)
  public void setScanLineReverse(QrCodeView view, boolean scanLineReverse) {
    view.getScanBoxView().setScanLineReverse(scanLineReverse);
  }

//  @ReactProp(name = "showDefaultGridScanLineDrawable", defaultBoolean = false)
//  public void setShowDefaultGridScanLineDrawable(QrCodeView view,
//                                                 boolean showDefaultGridScanLineDrawable) {
//    view.getScanBoxView().setShowDefaultGridScanLineDrawable(showDefaultGridScanLineDrawable);
//  }

  @ReactProp(name = "onlyDecodeScanBoxArea", defaultBoolean = false)
  public void setOnlyDecodeScanBoxArea(QrCodeView view,
                                                 boolean isOnlyDecodeScanBoxArea) {
    view.getScanBoxView().setOnlyDecodeScanBoxArea(isOnlyDecodeScanBoxArea);
  }

  @ReactProp(name = "delay", defaultInt = 1500)
  public void setStartupDelay(QrCodeView view, int startupDelay) {
    view.setStartupDelay(startupDelay);
  }

  void createTypeArray() {

  }
}
