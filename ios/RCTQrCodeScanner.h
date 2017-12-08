
#if __has_include("RCTBridgeModule.h")
#import "RCTBridgeModule.h"
#import "RCTViewManager.h"
#else
#import <React/RCTBridgeModule.h>
#import <React/RCTViewManager.h>
#endif

//@interface RCTQrCodeScanner : NSObject <RCTBridgeModule>
//
//@end

@interface RCTQrCodeScanner : RCTViewManager
@end
