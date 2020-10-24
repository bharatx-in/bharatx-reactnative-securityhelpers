package com.bharatxreactnativesecurityhelpers

import android.graphics.Color
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import tech.bharatx.securityhelpers.SecurityStorageManager
import kotlin.math.roundToInt

class BharatxReactnativeSecurityhelpersModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {

  override fun getName(): String {
    return "BharatxReactnativeSecurityhelpers"
  }

  @ReactMethod
  fun storePartnerId(partnerId: String) {
    SecurityStorageManager.storePartnerId(currentActivity!!, partnerId)
  }

  @ReactMethod
  fun storePartnerApiKey(partnerApiKey: String) {
    SecurityStorageManager.storePartnerApiKey(currentActivity!!, partnerApiKey)
  }

  @ReactMethod
  fun storeThemeColorPreferenceInHex(colorHex: String) {
    SecurityStorageManager.storeThemeColorPreference(currentActivity!!, Color.parseColor(colorHex))
  }

  @ReactMethod
  fun storeThemeColorPreferenceInRGBA(colorRGBA: String) {
    val rgbaArray = ArrayList(colorRGBA.replace(Regex("[^\\d,]"), "").split(',').map { it.toFloat() })
    if (rgbaArray.size == 3) {
      rgbaArray.add(1f)
    }
    rgbaArray[3] = 255 * rgbaArray[3]
    val rgbaArrayInt = rgbaArray.map { it.roundToInt() }
    SecurityStorageManager.storeThemeColorPreference(currentActivity!!,
      Color.argb(rgbaArrayInt[3], rgbaArrayInt[0], rgbaArrayInt[1], rgbaArrayInt[2]))
  }

}
