package com.tencent.mm.plugin.sight.encode.ui;

import android.hardware.Camera;
import android.hardware.Camera.PreviewCallback;

final class au
  implements Camera.PreviewCallback
{
  au(as paramas) {}
  
  public final void onPreviewFrame(byte[] paramArrayOfByte, Camera paramCamera)
  {
    as.a(fmJ).onPreviewFrame(paramArrayOfByte, paramCamera);
    paramCamera.addCallbackBuffer(as.b(fmJ));
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0)) {
      as.c(fmJ);
    }
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.plugin.sight.encode.ui.au
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */