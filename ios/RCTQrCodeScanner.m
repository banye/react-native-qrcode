
#import "RCTQrCodeScanner.h"
#import "RCTQrCodeScannerView.h"
#import <React/UIView+React.h>

@implementation RCTQrCodeScanner

//- (dispatch_queue_t)methodQueue
//{
//    return dispatch_get_main_queue();
//}
//RCT_EXPORT_MODULE()

RCT_EXPORT_MODULE()

- (UIView *)view
{
    // return [[MKMapView alloc] init];
    RCTQrCodeScannerView *scanView = [[RCTQrCodeScannerView alloc] initWithManager:self
                                                                            bridge:self.bridge];
    return (UIView *)scanView;
}

@end
  
