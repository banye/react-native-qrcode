
Pod::Spec.new do |s|
  s.name         = "ReactNativeQrCode"
  s.version      = "0.0.1"
  s.summary      = "React Native QrCode Scanner"
  s.description  = <<-DESC
                  RNQrcode
                   DESC
  s.homepage     = ""
  s.license      = "MIT"
  # s.license    = { :type => "MIT", :file => "LICENSE" }
  s.author       = { "author" => "info@wisqo.com" }
  s.platform     = :ios, "7.0"
  s.source       = { :git => "https://github.com/WisQo-Smart/react-native-qrcode.git", :tag => "master" }
  s.source_files = "RCTQrcode/**/*.{h,m}"
  s.requires_arc = true


  s.dependency "React"
  s.dependency "SGQRCode"

end

  
