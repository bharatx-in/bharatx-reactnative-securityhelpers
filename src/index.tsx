import { NativeModules } from 'react-native';

type BharatxReactnativeSecurityhelpersType = {
  storePartnerId(partnerId: string): void;
  storePartnerApiKey(partnerApiKey: string): void;
  storeThemeColorPreferenceInHex(colorHex: string): void;
  storeThemeColorPreferenceInRGBA(colorRGBA: string): void;
};

const { BharatxReactnativeSecurityhelpers } = NativeModules;

export default BharatxReactnativeSecurityhelpers as BharatxReactnativeSecurityhelpersType;
