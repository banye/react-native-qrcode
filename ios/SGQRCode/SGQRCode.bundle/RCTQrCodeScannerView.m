
#import "RCTQrCodeScanner.h"
#import <MapKit/MapKit.h>

#import "SGQRCodeScanningView.h"

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
    SGQRCodeScanningView *scanView = [[SGQRCodeScanningView alloc] init];
    return (UIView *)scanView;
}

@end
  
