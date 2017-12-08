
#import "RCTQrCodeScannerView.h"
#import "SGQRCodeScanningView.h"
#import "SGQRCodeScanManager.h"
#import "SGQRCodeAlbumManager.h"


@interface RCTQrCodeScannerView () <SGQRCodeScanManagerDelegate, SGQRCodeAlbumManagerDelegate>
@property (nonatomic, strong) SGQRCodeScanManager *manager;
@property (nonatomic, strong) SGQRCodeScanningView *scanningView;
@property (nonatomic, strong) UIButton *flashlightBtn;
@property (nonatomic, strong) UILabel *promptLabel;
@property (nonatomic, assign) BOOL isSelectedFlashlightBtn;
@property (nonatomic, strong) UIView *bottomView;
@property (nonatomic, strong) RCTBridge *bridge;
@property (nonatomic, strong) RCTQrCodeScanner *viewManager;

@end

@implementation RCTQrCodeScannerView

- (id)initWithManager:(RCTQrCodeScanner *)manager bridge:(RCTBridge *)bridge
{
    if ((self = [super init])) {
        self.viewManager = manager;
        self.bridge = bridge;
        self.scanningView = [self scanningView];
        [self addSubview:self.scanningView];
        [self setupQRCodeScanning];
    }
    return self;
}

- (SGQRCodeScanningView *)scanningView {
    if (!_scanningView) {
        NSLog(@"Width: %d, %d", 100, 100);
        _scanningView = [[SGQRCodeScanningView alloc]
                         initWithFrame:CGRectMake(0, 0, 300, 0.9 * 300)];
        _scanningView.borderColor = [UIColor whiteColor];
        _scanningView.scanningImageName = @"SGQRCode.bundle/QRCodeScanningLineGrid";
        _scanningView.scanningAnimationStyle = ScanningAnimationStyleGrid;
        _scanningView.cornerColor = [UIColor orangeColor];
    }
    return _scanningView;
}

- (void)removeScanningView {
    [self.scanningView removeTimer];
    [self.scanningView removeFromSuperview];
    self.scanningView = nil;
}

- (void)setupQRCodeScanning {
    self.manager = [SGQRCodeScanManager sharedManager];
    NSArray *arr = @[AVMetadataObjectTypeQRCode, AVMetadataObjectTypeEAN13Code, AVMetadataObjectTypeEAN8Code, AVMetadataObjectTypeCode128Code];
    // AVCaptureSessionPreset1920x1080 推荐使用，对于小型的二维码读取率较高
    [_manager setupSessionPreset:AVCaptureSessionPreset1920x1080 metadataObjectTypes:arr targetView:self];
    [_manager cancelSampleBufferDelegate];
    _manager.delegate = self;
}

#pragma mark - - - SGQRCodeAlbumManagerDelegate
- (void)QRCodeAlbumManagerDidCancelWithImagePickerController:(SGQRCodeAlbumManager *)albumManager {
     [self addSubview:self.scanningView];
}
- (void)QRCodeAlbumManager:(SGQRCodeAlbumManager *)albumManager didFinishPickingMediaWithResult:(NSString *)result {
    NSLog(@"Jump to result: %@", result);
}

#pragma mark - - - SGQRCodeScanManagerDelegate
- (void)QRCodeScanManager:(SGQRCodeScanManager *)scanManager didOutputMetadataObjects:(NSArray *)metadataObjects {
    NSLog(@"metadataObjects - - %@", metadataObjects);
    if (metadataObjects != nil && metadataObjects.count > 0) {
        [scanManager palySoundName:@"SGQRCode.bundle/sound.caf"];
        [scanManager stopRunning];
        [scanManager videoPreviewLayerRemoveFromSuperlayer];
    } else {
        NSLog(@"暂未识别出扫描的二维码");
    }
}
@end
  
