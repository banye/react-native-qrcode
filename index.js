
import { requireNativeComponent, View } from 'react-native';

const iface = {
  name: 'QrCodeScanner',
  propTypes: {
    ...View.propTypes,
  },
};

module.exports = requireNativeComponent('RCTQrCodeScanner', iface);
