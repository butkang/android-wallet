package com.mfcoin.core.coins;

import com.mfcoin.core.coins.families.BitFamily;
import com.mfcoin.core.coins.families.Families;

/**
 * @author John L. Jegutanis
 */
public class MfcoinMain extends BitFamily {

    private MfcoinMain() {
        id = "mfcoin.main";

        addressHeader = 76;
        p2shHeader = 16;
        acceptableAddressCodes = new int[]{addressHeader, p2shHeader};
        spendableCoinbaseDepth = 100;
        dumpedPrivateKeyHeader = 204;

        name = "Butkoin";
        symbol = "BUTK";
        uriScheme = "butkoin";
        bip44Index = 631;
        unitExponent = 8;
        feeValue = value(10000);
        minNonDust = value(1); // 0.00001 LTC mininput
        softDustLimit = value(1000000); // 0.001 LTC
        //softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
        softDustPolicy = SoftDustPolicy.AT_LEAST_BASE_FEE_IF_SOFT_DUST_TXO_PRESENT;
        signedMessageHeader = toBytes("Butkoin Signed Message:\n");
      //  family = Families.PEERCOIN;
    }

    private static MfcoinMain instance = new MfcoinMain();

    public static synchronized CoinType get() {
        return instance;
    }
}