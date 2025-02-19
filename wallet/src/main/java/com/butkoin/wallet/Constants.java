package com.mfcoin.wallet;

import android.text.format.DateUtils;

import com.mfcoin.core.coins.AuroracoinMain;
import com.mfcoin.core.coins.BatacoinMain;
import com.mfcoin.core.coins.BitcoinMain;
import com.mfcoin.core.coins.BitcoinTest;
import com.mfcoin.core.coins.BlackcoinMain;
import com.mfcoin.core.coins.BurstMain;
import com.mfcoin.core.coins.CanadaeCoinMain;
import com.mfcoin.core.coins.CannacoinMain;
import com.mfcoin.core.coins.ClamsMain;
import com.mfcoin.core.coins.ClubcoinMain;
import com.mfcoin.core.coins.CoinID;
import com.mfcoin.core.coins.CoinType;
import com.mfcoin.core.coins.DashMain;
import com.mfcoin.core.coins.DigibyteMain;
import com.mfcoin.core.coins.DigitalcoinMain;
import com.mfcoin.core.coins.DogecoinMain;
import com.mfcoin.core.coins.DogecoinTest;
import com.mfcoin.core.coins.EguldenMain;
import com.mfcoin.core.coins.FeathercoinMain;
import com.mfcoin.core.coins.GcrMain;
import com.mfcoin.core.coins.GuldenMain;
import com.mfcoin.core.coins.JumbucksMain;
import com.mfcoin.core.coins.LitecoinMain;
import com.mfcoin.core.coins.LitecoinTest;
import com.mfcoin.core.coins.MfcoinMain;
import com.mfcoin.core.coins.MonacoinMain;
import com.mfcoin.core.coins.NamecoinMain;
import com.mfcoin.core.coins.NeoscoinMain;
import com.mfcoin.core.coins.NovacoinMain;
import com.mfcoin.core.coins.NuBitsMain;
import com.mfcoin.core.coins.NuSharesMain;
import com.mfcoin.core.coins.NxtMain;
import com.mfcoin.core.coins.OKCashMain;
import com.mfcoin.core.coins.ParkbyteMain;
import com.mfcoin.core.coins.PeercoinMain;
import com.mfcoin.core.coins.PotcoinMain;
import com.mfcoin.core.coins.ReddcoinMain;
import com.mfcoin.core.coins.RubycoinMain;
import com.mfcoin.core.coins.ShadowCashMain;
import com.mfcoin.core.coins.UroMain;
import com.mfcoin.core.coins.VergeMain;
import com.mfcoin.core.coins.VertcoinMain;
import com.mfcoin.core.coins.VpncoinMain;
import com.mfcoin.core.coins.RichcoinMain;
import com.mfcoin.core.coins.IxcoinMain;
import com.mfcoin.core.network.CoinAddress;
import com.mfcoin.stratumj.ServerAddress;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author John L. Jegutanis
 * @author Andreas Schildbach
 */
public class Constants {

    public static final int SEED_ENTROPY_DEFAULT = 192;
    public static final int SEED_ENTROPY_EXTRA = 256;

    public static final String ARG_SEED = "seed";
    public static final String ARG_PASSWORD = "password";
    public static final String ARG_SEED_PASSWORD = "seed_password";
    public static final String ARG_EMPTY_WALLET = "empty_wallet";
    public static final String ARG_SEND_TO_ADDRESS = "send_to_address";
    public static final String ARG_SEND_TO_COIN_TYPE = "send_to_coin_type";
    public static final String ARG_SEND_TO_ACCOUNT_ID = "send_to_account_id";
    public static final String ARG_SEND_VALUE = "send_value";
    public static final String ARG_TX_MESSAGE = "tx_message";
    public static final String ARG_COIN_ID = "coin_id";
    public static final String ARG_ACCOUNT_ID = "account_id";
    public static final String ARG_MULTIPLE_COIN_IDS = "multiple_coin_ids";
    public static final String ARG_MULTIPLE_CHOICE = "multiple_choice";
    public static final String ARG_SEND_REQUEST = "send_request";
    public static final String ARG_TRANSACTION_ID = "transaction_id";
    public static final String ARG_ERROR = "error";
    public static final String ARG_MESSAGE = "message";
    public static final String ARG_ADDRESS = "address";
    public static final String ARG_ADDRESS_STRING = "address_string";
    public static final String ARG_EXCHANGE_ENTRY = "exchange_entry";
    public static final String ARG_URI = "test_wallet";
    public static final String ARG_PRIVATE_KEY = "private_key";

    public static final int PERMISSIONS_REQUEST_CAMERA = 0;

    public static final String WALLET_FILENAME_PROTOBUF = "wallet";
    public static final long WALLET_WRITE_DELAY = 5;
    public static final TimeUnit WALLET_WRITE_DELAY_UNIT = TimeUnit.SECONDS;

    public static final long STOP_SERVICE_AFTER_IDLE_SECS = 30 * 60; // 30 mins

    public static final String HTTP_CACHE_NAME = "http_cache";
    public static final int HTTP_CACHE_SIZE = 256 * 1024; // 256 KiB
    public static final int NETWORK_TIMEOUT_MS = 15 * (int) DateUtils.SECOND_IN_MILLIS;

    public static final String TX_CACHE_NAME = "tx_cache";
    public static final int TX_CACHE_SIZE = 25 * 1024 * 1024; // 25 MiB, TODO currently not enforced

    public static final long RATE_UPDATE_FREQ_MS = 30 * DateUtils.SECOND_IN_MILLIS;

    /**
     * Default currency to use if all default mechanisms fail.
     */
    public static final String DEFAULT_EXCHANGE_CURRENCY = "USD";

    public static final Charset UTF_8 = Charset.forName("UTF-8");
    public static final Charset US_ASCII = Charset.forName("US-ASCII");

    public static final char CHAR_HAIR_SPACE = '\u200a';
    public static final char CHAR_THIN_SPACE = '\u2009';
    public static final char CHAR_ALMOST_EQUAL_TO = '\u2248';
    public static final char CHAR_CHECKMARK = '\u2713';
    public static final char CURRENCY_PLUS_SIGN = '+';
    public static final char CURRENCY_MINUS_SIGN = '-';

    public static final String MARKET_APP_URL = "market://details?id=%s";
    public static final String BINARY_URL = "https://github.com/Butkoin/android-wallet/releases";
    public static final String FORK_URL = "https://butcoin.tech/hardfork";

    public static final String VERSION_URL = "https://api.github.com/repos/Butkoin/android-wallet/releases/latest";
    public static final String SUPPORT_EMAIL = "support@butcoin.tech";

    // TODO move to resource files
    public static final List<CoinAddress> DEFAULT_COINS_SERVERS = ImmutableList.of(
            new CoinAddress(MfcoinMain.get(),
                    new ServerAddress("electrumx.butcoin.tech", 50001)),
                    new ServerAddress("electrumx.butcoin.tech", 50002)),
            new CoinAddress(BitcoinMain.get(),
                    new ServerAddress("btc-1.indexer.coinomi.net", 5001),
                    new ServerAddress("btc-2.indexer.coinomi.net", 5001)),
            new CoinAddress(LitecoinMain.get(),
                    new ServerAddress("ltc-1.indexer.coinomi.net", 5002),
                    new ServerAddress("ltc-2.indexer.coinomi.net", 5002)),
            new CoinAddress(DogecoinMain.get(),
                    new ServerAddress("doge-1.indexer.coinomi.net", 5003),
                    new ServerAddress("doge-2.indexer.coinomi.net", 5003)),
            new CoinAddress(PeercoinMain.get(),
                    new ServerAddress("ppc-1.indexer.coinomi.net", 5004),
                    new ServerAddress("ppc-2.indexer.coinomi.net", 5004)),
            new CoinAddress(DashMain.get(),
                    new ServerAddress("dash-1.indexer.coinomi.net", 5013),
                    new ServerAddress("dash-2.indexer.coinomi.net", 5013)),
            new CoinAddress(NamecoinMain.get(),
                    new ServerAddress("nmc-1.indexer.coinomi.net", 5016),
                    new ServerAddress("nmc-2.indexer.coinomi.net", 5016))
/*
            new CoinAddress(BitcoinTest.get(),      new ServerAddress("btc-testnet-cce-1.coinomi.net", 15001),
                                                    new ServerAddress("btc-testnet-cce-2.coinomi.net", 15001)),
            new CoinAddress(DogecoinTest.get(),     new ServerAddress("doge-testnet-cce-1.coinomi.net", 15003),
                                                    new ServerAddress("doge-testnet-cce-2.coinomi.net", 15003)),
            new CoinAddress(LitecoinTest.get(),     new ServerAddress("ltc-testnet-cce-1.coinomi.net", 15002),
                                                    new ServerAddress("ltc-testnet-cce-2.coinomi.net", 15002)),
            new CoinAddress(NuSharesMain.get(),     new ServerAddress("nsr-cce-1.coinomi.net", 5011),
                                                    new ServerAddress("nsr-cce-2.coinomi.net", 5011)),
            new CoinAddress(NuBitsMain.get(),       new ServerAddress("nbt-cce-1.coinomi.net", 5012),
                                                    new ServerAddress("nbt-cce-2.coinomi.net", 5012)),
            new CoinAddress(ReddcoinMain.get(),     new ServerAddress("rdd-cce-1.coinomi.net", 5014),
                                                    new ServerAddress("rdd-cce-2.coinomi.net", 5014)),
            new CoinAddress(BlackcoinMain.get(),    new ServerAddress("blk-cce-1.coinomi.net", 5015),
                                                    new ServerAddress("blk-cce-2.coinomi.net", 5015)),
            new CoinAddress(FeathercoinMain.get(),  new ServerAddress("ftc-cce-1.coinomi.net", 5017),
                                                    new ServerAddress("ftc-cce-2.coinomi.net", 5017)),
            new CoinAddress(RubycoinMain.get(),     new ServerAddress("rby-cce-1.coinomi.net", 5018),
                                                    new ServerAddress("rby-cce-2.coinomi.net", 5018)),
            new CoinAddress(UroMain.get(),          new ServerAddress("uro-cce-1.coinomi.net", 5019),
                                                    new ServerAddress("uro-cce-2.coinomi.net", 5019)),
            new CoinAddress(DigitalcoinMain.get(),  new ServerAddress("dgc-cce-1.coinomi.net", 5020),
                                                    new ServerAddress("dgc-cce-2.coinomi.net", 5020)),
            new CoinAddress(CannacoinMain.get(),    new ServerAddress("ccn-cce-1.coinomi.net", 5021),
                                                    new ServerAddress("ccn-cce-2.coinomi.net", 5021)),
            new CoinAddress(MonacoinMain.get(),     new ServerAddress("mona-cce-1.coinomi.net", 5022),
                                                    new ServerAddress("mona-cce-2.coinomi.net", 5022)),
            new CoinAddress(DigibyteMain.get(),     new ServerAddress("dgb-cce-1.coinomi.net", 5023),
                                                    new ServerAddress("dgb-cce-2.coinomi.net", 5023)),
            // 5024 primecoin
            new CoinAddress(ClamsMain.get(),        new ServerAddress("clam-cce-1.coinomi.net", 5025),
                                                    new ServerAddress("clam-cce-2.coinomi.net", 5025)),
            new CoinAddress(ShadowCashMain.get(),   new ServerAddress("sdc-cce-1.coinomi.net", 5026),
                                                    new ServerAddress("sdc-cce-2.coinomi.net", 5026)),
            new CoinAddress(NeoscoinMain.get(),     new ServerAddress("neos-cce-1.coinomi.net", 5027),
                                                    new ServerAddress("neos-cce-2.coinomi.net", 5027)),
            new CoinAddress(VertcoinMain.get(),     new ServerAddress("vtc-cce-1.coinomi.net", 5028),
                                                    new ServerAddress("vtc-cce-2.coinomi.net", 5028)),
            new CoinAddress(JumbucksMain.get(),     new ServerAddress("jbs-cce-1.coinomi.net", 5029),
                                                    new ServerAddress("jbs-cce-2.coinomi.net", 5029)),
            new CoinAddress(VpncoinMain.get(),      new ServerAddress("vpn-cce-1.coinomi.net", 5032),
                                                    new ServerAddress("vpn-cce-2.coinomi.net", 5032)),
            new CoinAddress(CanadaeCoinMain.get(),  new ServerAddress("cdn-cce-1.coinomi.net", 5033),
                                                    new ServerAddress("cdn-cce-2.coinomi.net", 5033)),
            new CoinAddress(NovacoinMain.get(),     new ServerAddress("nvc-cce-1.coinomi.net", 5034),
                                                    new ServerAddress("nvc-cce-2.coinomi.net", 5034)),
            new CoinAddress(ParkbyteMain.get(),     new ServerAddress("pkb-cce-1.coinomi.net", 5035),
                                                    new ServerAddress("pkb-cce-2.coinomi.net", 5035)),
            new CoinAddress(NxtMain.get(),          new ServerAddress("176.9.65.41", 7876),
                    new ServerAddress("176.9.65.41", 7876)),
            new CoinAddress(BurstMain.get(),        new ServerAddress("burst-cce-1.coinomi.net", 5051),
                                                    new ServerAddress("burst-cce-2.coinomi.net", 5051)),
            new CoinAddress(VergeMain.get(),        new ServerAddress("xvg-cce-1.coinomi.net", 5036),
                                                    new ServerAddress("xvg-cce-2.coinomi.net", 5036)),
            new CoinAddress(EguldenMain.get(),      new ServerAddress("efl-cce-1.coinomi.net", 5037),
                                                    new ServerAddress("efl-cce-2.coinomi.net", 5037)),
            new CoinAddress(GcrMain.get(),          new ServerAddress("gcr-cce-1.coinomi.net", 5038),
                                                    new ServerAddress("gcr-cce-2.coinomi.net", 5038)),
            new CoinAddress(PotcoinMain.get(),      new ServerAddress("pot-cce-1.coinomi.net", 5039),
                                                    new ServerAddress("pot-cce-2.coinomi.net", 5039)),
            new CoinAddress(GuldenMain.get(),       new ServerAddress("gulden-cce-1.coinomi.net", 5040),
                                                    new ServerAddress("gulden-cce-2.coinomi.net", 5040)),
            new CoinAddress(AuroracoinMain.get(),   new ServerAddress("aur-cce-1.coinomi.net", 5041),
                                                    new ServerAddress("aur-cce-2.coinomi.net", 5041)),
            new CoinAddress(BatacoinMain.get(),     new ServerAddress("bata-cce-1.coinomi.net", 5042),
                                                    new ServerAddress("bata-cce-1.coinomi.net", 5042)),
            new CoinAddress(OKCashMain.get(),       new ServerAddress("ok-cce-1.coinomi.net", 5043),
                                                    new ServerAddress("ok-cce-2.coinomi.net", 5043)),
            new CoinAddress(ClubcoinMain.get(),     new ServerAddress("club-cce-1.coinomi.net", 5045),
                                                    new ServerAddress("club-cce-2.coinomi.net", 5045)),
            new CoinAddress(RichcoinMain.get(),     new ServerAddress("richx-cce-1.coinomi.net", 5046),
                                                    new ServerAddress("richx-cce-2.coinomi.net", 5046)),
            new CoinAddress(IxcoinMain.get(),       new ServerAddress("ixc-cce-1.coinomi.net", 5047),
                                                    new ServerAddress("ixc-cce-2.coinomi.net", 5047))
*/
    );

    public static final HashMap<CoinType, Integer> COINS_ICONS;
    public static final HashMap<CoinType, String> COINS_BLOCK_EXPLORERS;

    static {
        COINS_ICONS = new HashMap<>();
        COINS_ICONS.put(CoinID.MFCOIN_MAIN.getCoinType(), R.mipmap.mfcoin);
        COINS_ICONS.put(CoinID.BITCOIN_MAIN.getCoinType(), R.mipmap.bitcoin);
        COINS_ICONS.put(CoinID.LITECOIN_MAIN.getCoinType(), R.mipmap.litecoin);
        COINS_ICONS.put(CoinID.DOGECOIN_MAIN.getCoinType(), R.mipmap.dogecoin);
        COINS_ICONS.put(CoinID.DASH_MAIN.getCoinType(), R.mipmap.dash);
        COINS_ICONS.put(CoinID.NAMECOIN_MAIN.getCoinType(), R.mipmap.namecoin);
        COINS_ICONS.put(CoinID.PEERCOIN_MAIN.getCoinType(), R.mipmap.peercoin);
/*
        COINS_ICONS.put(CoinID.BITCOIN_TEST.getCoinType(), R.mipmap.bitcoin_test);
        COINS_ICONS.put(CoinID.DOGECOIN_TEST.getCoinType(), R.mipmap.dogecoin_test);
        COINS_ICONS.put(CoinID.LITECOIN_TEST.getCoinType(), R.mipmap.litecoin_test);
        COINS_ICONS.put(CoinID.PEERCOIN_MAIN.getCoinType(), R.mipmap.peercoin);
        COINS_ICONS.put(CoinID.REDDCOIN_MAIN.getCoinType(), R.mipmap.reddcoin);
        COINS_ICONS.put(CoinID.NUSHARES_MAIN.getCoinType(), R.mipmap.nushares);
        COINS_ICONS.put(CoinID.NUBITS_MAIN.getCoinType(), R.mipmap.nubits);
        COINS_ICONS.put(CoinID.BLACKCOIN_MAIN.getCoinType(), R.mipmap.blackcoin);
        COINS_ICONS.put(CoinID.MONACOIN_MAIN.getCoinType(), R.mipmap.monacoin);
        COINS_ICONS.put(CoinID.RUBYCOIN_MAIN.getCoinType(), R.mipmap.rubycoin);
        COINS_ICONS.put(CoinID.FEATHERCOIN_MAIN.getCoinType(), R.mipmap.feathercoin);
        COINS_ICONS.put(CoinID.URO_MAIN.getCoinType(), R.mipmap.uro);
        COINS_ICONS.put(CoinID.DIGITALCOIN_MAIN.getCoinType(), R.mipmap.digitalcoin);
        COINS_ICONS.put(CoinID.CANNACOIN_MAIN.getCoinType(), R.mipmap.cannacoin);
        COINS_ICONS.put(CoinID.DIGIBYTE_MAIN.getCoinType(), R.mipmap.digibyte);
        COINS_ICONS.put(CoinID.NEOSCOIN_MAIN.getCoinType(), R.mipmap.neoscoin);
        COINS_ICONS.put(CoinID.OKCASH_MAIN.getCoinType(), R.mipmap.okcash);
        COINS_ICONS.put(CoinID.VERTCOIN_MAIN.getCoinType(), R.mipmap.vertcoin);
        COINS_ICONS.put(CoinID.NXT_MAIN.getCoinType(), R.mipmap.nxt);
        COINS_ICONS.put(CoinID.BURST_MAIN.getCoinType(), R.mipmap.burst);
        COINS_ICONS.put(CoinID.JUMBUCKS_MAIN.getCoinType(), R.mipmap.jumbucks);
        COINS_ICONS.put(CoinID.VPNCOIN_MAIN.getCoinType(), R.mipmap.vpncoin);
        COINS_ICONS.put(CoinID.NOVACOIN_MAIN.getCoinType(), R.mipmap.novacoin);
        COINS_ICONS.put(CoinID.CANADAECOIN_MAIN.getCoinType(), R.mipmap.canadaecoin);
        COINS_ICONS.put(CoinID.SHADOWCASH_MAIN.getCoinType(), R.mipmap.shadowcash);
        COINS_ICONS.put(CoinID.PARKBYTE_MAIN.getCoinType(), R.mipmap.parkbyte);
        COINS_ICONS.put(CoinID.VERGE_MAIN.getCoinType(), R.mipmap.verge);
        COINS_ICONS.put(CoinID.CLAMS_MAIN.getCoinType(), R.mipmap.clams);
        COINS_ICONS.put(CoinID.GCR_MAIN.getCoinType(), R.mipmap.gcr);
        COINS_ICONS.put(CoinID.POTCOIN_MAIN.getCoinType(), R.mipmap.potcoin);
        COINS_ICONS.put(CoinID.GULDEN_MAIN.getCoinType(), R.mipmap.gulden);
        COINS_ICONS.put(CoinID.AURORACOIN_MAIN.getCoinType(), R.mipmap.auroracoin);
        COINS_ICONS.put(CoinID.BATACOIN_MAIN.getCoinType(), R.mipmap.batacoin);
        COINS_ICONS.put(CoinID.EGULDEN_MAIN.getCoinType(), R.mipmap.egulden);
        COINS_ICONS.put(CoinID.CLUBCOIN_MAIN.getCoinType(), R.mipmap.clubcoin);
        COINS_ICONS.put(CoinID.RICHCOIN_MAIN.getCoinType(), R.mipmap.richcoin);
        COINS_ICONS.put(CoinID.IXCOIN_MAIN.getCoinType(), R.mipmap.ixcoin);
*/

        COINS_BLOCK_EXPLORERS = new HashMap<>();
        COINS_BLOCK_EXPLORERS.put(CoinID.MFCOIN_MAIN.getCoinType(), "https://explorer2.butcoin.tech/tx/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.BITCOIN_MAIN.getCoinType(), "https://blockchain.info/tx/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.LITECOIN_MAIN.getCoinType(), "http://explorer.litecoin.net/tx/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.DOGECOIN_MAIN.getCoinType(), "https://chain.so/tx/DOGE/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.DASH_MAIN.getCoinType(), "https://live.blockcypher.com/dash/tx/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.NAMECOIN_MAIN.getCoinType(), "https://namecha.in/tx/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.PEERCOIN_MAIN.getCoinType(), "https://blockbook.peercoin.net/tx/%s");
/*
        COINS_BLOCK_EXPLORERS.put(CoinID.BITCOIN_TEST.getCoinType(), "https://chain.so/tx/BTCTEST/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.DOGECOIN_TEST.getCoinType(), "https://chain.so/tx/DOGETEST/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.LITECOIN_TEST.getCoinType(), "https://chain.so/tx/LTCTEST/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.NUSHARES_MAIN.getCoinType(), "http://blockexplorer.nu/transactions/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.NUBITS_MAIN.getCoinType(), "http://blockexplorer.nu/transactions/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.REDDCOIN_MAIN.getCoinType(), "http://live.reddcoin.com/tx/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.BLACKCOIN_MAIN.getCoinType(), "https://chainz.cryptoid.info/blk/tx.dws?%s.htm");
        COINS_BLOCK_EXPLORERS.put(CoinID.MONACOIN_MAIN.getCoinType(), "https://bchain.info/MONA/tx/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.RUBYCOIN_MAIN.getCoinType(), "https://chainz.cryptoid.info/rby/tx.dws?%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.FEATHERCOIN_MAIN.getCoinType(), "http://explorer.feathercoin.com/tx/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.URO_MAIN.getCoinType(), "https://chainz.cryptoid.info/uro/tx.dws?%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.DIGITALCOIN_MAIN.getCoinType(), "https://chainz.cryptoid.info/dgc/tx.dws?%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.CANNACOIN_MAIN.getCoinType(), "https://chainz.cryptoid.info/ccn/tx.dws?%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.DIGIBYTE_MAIN.getCoinType(), "https://digiexplorer.info/tx/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.NEOSCOIN_MAIN.getCoinType(), "http://explorer.infernopool.com/tx/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.OKCASH_MAIN.getCoinType(), "https://chainz.cryptoid.info/ok/tx.dws?%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.VERTCOIN_MAIN.getCoinType(), "https://bitinfocharts.com/vertcoin/tx/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.JUMBUCKS_MAIN.getCoinType(), "http://explorer.getjumbucks.com/tx/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.VPNCOIN_MAIN.getCoinType(), "https://blockexperts.com/vpn/tx/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.NOVACOIN_MAIN.getCoinType(), "http://explorer.novaco.in/tx/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.CANADAECOIN_MAIN.getCoinType(), "http://explorer.canadaecoin.ca/tx/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.SHADOWCASH_MAIN.getCoinType(), "http://shadowchain.info/tx/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.PARKBYTE_MAIN.getCoinType(), "https://chainz.cryptoid.info/pkb/tx.dws?%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.VERGE_MAIN.getCoinType(), "http://blockexperts.com/xvg/tx/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.CLAMS_MAIN.getCoinType(), "http://khashier.com/tx/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.GCR_MAIN.getCoinType(), "https://chainz.cryptoid.info/gcr/tx.dws?%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.POTCOIN_MAIN.getCoinType(), "https://chainz.cryptoid.info/pot/tx.dws?%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.GULDEN_MAIN.getCoinType(), "https://explorer.gulden.com/#/transaction/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.AURORACOIN_MAIN.getCoinType(), "http://insight.auroracoin.io/tx/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.BATACOIN_MAIN.getCoinType(), "https://chainz.cryptoid.info/bta/tx.dws?%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.EGULDEN_MAIN.getCoinType(), "https://chainz.cryptoid.info/efl/tx.dws?%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.RICHCOIN_MAIN.getCoinType(), "https://explorer.richcoin.us/transaction?transaction=%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.IXCOIN_MAIN.getCoinType(), "https://chainz.cryptoid.info/ixc/tx.dws?%s");
*/
    }

    public static final CoinType DEFAULT_COIN = MfcoinMain.get();
    public static final List<CoinType> DEFAULT_COINS = ImmutableList.of((CoinType) MfcoinMain.get());
    public static final ArrayList<String> DEFAULT_TEST_COIN_IDS = Lists.newArrayList(
            BitcoinTest.get().getId(),
            LitecoinTest.get().getId(),
            DogecoinTest.get().getId()
    );

    public static final List<CoinType> SUPPORTED_COINS = ImmutableList.of(
            MfcoinMain.get(),
            BitcoinMain.get(),
            LitecoinMain.get(),
            DogecoinMain.get(),
            DashMain.get(),
            //NamecoinMain.get(),
            PeercoinMain.get()
/*
            AuroracoinMain.get(),
            BatacoinMain.get(),
            BlackcoinMain.get(),
            BurstMain.get(),
            CanadaeCoinMain.get(),
            CannacoinMain.get(),
            ClamsMain.get(),
            ClubcoinMain.get(),
            DigibyteMain.get(),
            DigitalcoinMain.get(),
            EguldenMain.get(),
            FeathercoinMain.get(),
            GcrMain.get(),
            GuldenMain.get(),
            IxcoinMain.get(),
            JumbucksMain.get(),
            LitecoinMain.get(),
            MonacoinMain.get(),
            NeoscoinMain.get(),
            NovacoinMain.get(),
            NuBitsMain.get(),
            NuSharesMain.get(),
            NxtMain.get(),
            OKCashMain.get(),
            ParkbyteMain.get(),
            PotcoinMain.get(),
            ReddcoinMain.get(),
            RichcoinMain.get(),
            RubycoinMain.get(),
            ShadowCashMain.get(),
            VergeMain.get(),
            VertcoinMain.get(),
            VpncoinMain.get(),
            BitcoinTest.get(),
            LitecoinTest.get(),
            DogecoinTest.get()
*/
    );
}
