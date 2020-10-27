import * as React from 'react';
import { StyleSheet, View, Text, Platform } from 'react-native';
import BharatxReactnativeSecurityhelpers from '@bharatx/bharatx-reactnative-securityhelpers';

export default function App() {
  const [result, setResult] = React.useState<number | undefined>();

  React.useEffect(() => {
    if (Platform.OS === 'android') {
      BharatxReactnativeSecurityhelpers.storePartnerId('Test_Partner');
      BharatxReactnativeSecurityhelpers.storePartnerApiKey('TestAPIKEY');
      BharatxReactnativeSecurityhelpers.storeThemeColorPreferenceInHex(
        '#0FFFFFFF'
      );
      setResult(1);
    }
  }, []);

  return (
    <View style={styles.container}>
      <Text>Result: {result}</Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
});
