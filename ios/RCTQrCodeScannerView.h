
#import <UIKit/UIKit.h>
#import <AVFoundation/AVFoundation.h>

#import <React/RCTBridge.h>

#import "RCTQrCodeScanner.h"
#import "SGQRCodeScanManager.h"
#import "SGQRCodeAlbumManager.h"

//@interface RCTQrCodeScanner : NSObject <RCTBridgeModule>
//
//@end

@interface RCTQrCodeScannerView: UIView

- (id)initWithManager:(RCTQrCodeScanner *)manager
               bridge:(RCTBridge *)bridge;

@property (nonatomic, strong) id<SGQRCodeScanManagerDelegate> delegate;
@property (nonatomic, copy) RCTBubblingEventBlock onSuccess;
@property (nonatomic, copy) RCTBubblingEventBlock onScanError;

@end
