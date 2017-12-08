
#import "RCTQrCodeScanner.h"
#import "RCTQrCodeScannerView.h"
#import <React/UIView+React.h>

#import "SGQRCodeScanManager.h"
#import "SGQRCodeAlbumManager.h"

@interface RCTQrCodeScannerView()
@end

@implementation RCTQrCodeScanner

//- (dispatch_queue_t)methodQueue
//{
//    return dispatch_get_main_queue();
//}
//RCT_EXPORT_MODULE()

RCT_EXPORT_MODULE()
RCT_EXPORT_VIEW_PROPERTY(onSuccess, RCTBubblingEventBlock)
// RCT_EXPORT_VIEW_PROPERTY(onError, RCTBubblingEventBlock)

- (UIView *)view
{
    // return [[MKMapView alloc] init];
    RCTQrCodeScannerView *scanView = [[RCTQrCodeScannerView alloc] initWithManager:self
                                                                            bridge:self.bridge];
    return (UIView *)scanView;
}

@end
  
