
#import <UIKit/UIKit.h>
#import <AVFoundation/AVFoundation.h>

#import <React/RCTBridge.h>

#import "RCTQrCodeScanner.h"

//@interface RCTQrCodeScanner : NSObject <RCTBridgeModule>
//
//@end

@interface RCTQrCodeScannerView: UIView

- (id)initWithManager:(RCTQrCodeScanner *)manager bridge:(RCTBridge *)bridge;

@end
