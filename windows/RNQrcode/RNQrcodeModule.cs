using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Qrcode.RNQrcode
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNQrcodeModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNQrcodeModule"/>.
        /// </summary>
        internal RNQrcodeModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNQrcode";
            }
        }
    }
}
