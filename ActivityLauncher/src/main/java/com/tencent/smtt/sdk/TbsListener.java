package com.tencent.smtt.sdk;

public interface TbsListener {
   String tag_load_error = "loaderror";

   void onDownloadFinish(int var1);

   void onInstallFinish(int var1);

   void onDownloadProgress(int var1);

   public interface ErrorCode {
      int ERROR_CODE_DOWNLOAD_BASE = 100;
      int ERROR_CODE_INSTALL_BASE = 200;
      int ERROR_CODE_LOAD_BASE = 300;
      int INFO_CODE_BASE = 400;
      int INFO_CODE_MINIQB = 500;
      int DOWNLOAD_SUCCESS = 100;
      int NETWORK_UNAVAILABLE = 101;
      int SERVER_ERROR = 102;
      int READ_RESPONSE_ERROR = 103;
      int WRITE_DISK_ERROR = 104;
      int DISK_FULL = 105;
      int FILE_DELETED = 106;
      int UNKNOWN_ERROR = 107;
      int VERIFY_ERROR = 108;
      int FILE_RENAME_ERROR = 109;
      int NONEEDTODOWN_ERROR = 110;
      int NETWORK_NOT_WIFI_ERROR = 111;
      int DOWNLOAD_OVER_FLOW = 112;
      int DOWNLOAD_FILE_CONTENTLENGTH_NOT_MATCH = 113;
      int DOWNLOAD_HAS_LOCAL_TBS_ERROR = 120;
      int THREAD_INIT_ERROR = 121;
      int DOWNLOAD_HAS_COPY_TBS_ERROR = 122;
      int DOWNLOAD_RETRYTIMES302_EXCEED = 123;
      int DOWNLOAD_REDIRECT_EMPTY = 124;
      int DOWNLOAD_THROWABLE = 125;
      int PV_UPLOAD_ERROR = 126;
      int DOWNLOAD_INTERRUPT = 128;
      int NEEDDOWNLOAD_1 = 140;
      int NEEDDOWNLOAD_2 = 141;
      int NEEDDOWNLOAD_3 = 142;
      int NEEDDOWNLOAD_4 = 143;
      int NEEDDOWNLOAD_5 = 144;
      int NEEDDOWNLOAD_6 = 145;
      int NEEDDOWNLOAD_7 = 146;
      int NEEDDOWNLOAD_8 = 147;
      int NEEDDOWNLOAD_9 = 148;
      int NEEDDOWNLOAD_10 = 149;
      int STARTDOWNLOAD_1 = 160;
      int STARTDOWNLOAD_2 = 161;
      int STARTDOWNLOAD_3 = 162;
      int STARTDOWNLOAD_4 = 163;
      int STARTDOWNLOAD_5 = 164;
      int STARTDOWNLOAD_6 = 165;
      int STARTDOWNLOAD_7 = 166;
      int STARTDOWNLOAD_8 = 167;
      int STARTDOWNLOAD_9 = 168;
      int STARTDOWNLOAD_10 = 169;
      int NEEDDOWNLOAD_TRUE = 170;
      int NEEDDOWNLOAD_FALSE_1 = 171;
      int NEEDDOWNLOAD_FALSE_2 = 172;
      int NEEDDOWNLOAD_FALSE_3 = 173;
      int NEEDDOWNLOAD_FALSE_4 = 174;
      int NEEDDOWNLOAD_FALSE_5 = 175;
      int NEEDDOWNLOAD_FALSE_6 = 176;
      int NONEEDDOWNLOAD_OTHER_PROCESS_DOWNLOADING = 177;
      int DOWNLOAD_INSTALL_SUCCESS = 200;
      int EXCEED_UNZIP_RETRY_NUM = 201;
      int APK_PATH_ERROR = 202;
      int APK_VERSION_ERROR = 203;
      int APK_INVALID = 204;
      int UNZIP_DIR_ERROR = 205;
      int UNZIP_IO_ERROR = 206;
      int UNZIP_OTHER_ERROR = 207;
      int EXCEED_DEXOPT_RETRY_NUM = 208;
      int DEXOPT_EXCEPTION = 209;
      int ROM_NOT_ENOUGH = 210;
      int EXCEED_COPY_RETRY_NUM = 211;
      int COPY_FAIL = 212;
      int COPY_SRCDIR_ERROR = 213;
      int COPY_TMPDIR_ERROR = 214;
      int COPY_EXCEPTION = 215;
      int INCR_UPDATE_ERROR = 216;
      int INCR_UPDATE_FAIL = 217;
      int INCR_UPDATE_EXCEPTION = 218;
      int RENAME_EXCEPTION = 219;
      int COPY_INSTALL_SUCCESS = 220;
      int INCRUPDATE_INSTALL_SUCCESS = 221;
      int UNLZMA_FAIURE = 222;
      int EXCEED_LZMA_RETRY_NUM = 223;
      int EXCEED_INCR_UPDATE = 224;
      int CREATE_TEMP_CONF_ERROR = 225;
      int DEXOAT_EXCEPTION = 226;
      int HOST_CONTEXT_IS_NULL = 227;
      int INCR_ERROR_DETAIL = 228;
      int INSTALL_FROM_UNZIP = 229;
      int RENAME_SUCCESS = 230;
      int RENAME_FAIL = 231;
      int INSTALL_SUCCESS_AND_RELEASE_LOCK = 232;
      int DECOUPLE_INSTLL_SUCCESS = 233;
      int DECOUPLE_INCURUPDATE_SUCCESS = 234;
      int DECOUPLE_INCURUPDATE_FAIL = 235;
      int TPATCH_INSTALL_SUCCESS = 236;
      int DECOUPLE_TPATCH_INSTALL_SUCCESS = 237;
      int TPATCH_FAIL = 238;
      int DECOUPLE_TPATCH_FAIL = 239;
      int TPATCH_VERSION_FAILED = 240;
      int TPATCH_BACKUP_NOT_VALID = 241;
      int TPATCH_ENABLE_EXCEPTION = 242;
      int ERROR_UNMATCH_TBSCORE_VER_THIRDPARTY = 302;
      int ERROR_UNMATCH_TBSCORE_VER = 303;
      int ERROR_HOST_UNAVAILABLE = 304;
      int THROWABLE_QBSDK_INIT = 306;
      int ERROR_CANLOADX5_RETURN_FALSE = 307;
      int ERROR_CANLOADX5_RETURN_NULL = 308;
      int ERROR_TBSCORE_SHARE_DIR = 312;
      int ERROR_CANLOADVIDEO_RETURN_FALSE = 313;
      int ERROR_CANLOADVIDEO_RETURN_NULL = 314;
      int ERROR_QBSDK_INIT_ISSUPPORT = 318;
      int ERROR_QBSDK_INIT_CANLOADX5 = 319;
      int ERROR_TBSINSTALLER_ISTBSCORELEGAL_01 = 321;
      int ERROR_TBSINSTALLER_ISTBSCORELEGAL_02 = 322;
      int ERROR_TBSINSTALLER_ISTBSCORELEGAL_03 = 323;
      int THROWABLE_INITX5CORE = 325;
      int TEST_THROWABLE_IS_NULL = 326;
      int TEST_THROWABLE_ISNOT_NULL = 327;
      int THROWABLE_INITTESRUNTIMEENVIRONMENT = 328;
      int ERROR_GETSTRINGARRAY_JARFILE = 329;
      int ERROR_QBSDK_INIT_ERROR_RET_TYPE_NOT_BUNDLE = 330;
      int ERROR_QBSDK_INIT_ERROR_EMPTY_BUNDLE = 331;
      int INFO_FORCE_SYSTEM_WEBVIEW_INNER = 401;
      int INFO_FORCE_SYSTEM_WEBVIEW_OUTER = 402;
      int INFO_MISS_SDKEXTENSION_JAR = 403;
      int INFO_DISABLE_X5 = 404;
      int INFO_CAN_NOT_LOAD_TBS = 405;
      int INFO_MISS_SDKEXTENSION_JAR_OLD = 406;
      int INFO_CAN_NOT_LOAD_X5 = 407;
      int INFO_CAN_NOT_DISABLED_BY_CRASH = 408;
      int INFO_CAN_NOT_USE_X5_TBS_AVAILABLE = 409;
      int INFO_CAN_NOT_USE_X5_TBS_NOTAVAILABLE = 410;
      int INFO_CAN_NOT_USE_X5_FINAL_REASON = 411;
      int INFO_MISS_SDKEXTENSION_JAR_WITHOUT_FUSION_DEX = 412;
      int INFO_MISS_SDKEXTENSION_JAR_WITH_FUSION_DEX = 413;
      int INFO_SDKINIT_IS_SYS_FORCED = 414;
      int INFO_INFO_MISS_SDKEXTENSION_JAR_WITHOUT_FUSION_DEX_WITH_CORE = 4121;
      int INFO_INFO_MISS_SDKEXTENSION_JAR_WITHOUT_FUSION_DEX_WITHOUT_CORE = 4122;
      int INFO_MISS_SDKEXTENSION_JAR_WITH_FUSION_DEX_WITH_CORE = 4131;
      int INFO_MISS_SDKEXTENSION_JAR_WITH_FUSION_DEX_WITHOUT_CORE = 4132;
      int INFO_INITX5_FALSE_DEFAULT = 415;
      int INFO_USE_BACKUP_FILE_INSTALL_BY_SERVER = 416;
      int INFO_TEMP_CORE_EXIST_CONF_ERROR = 417;
      int INFO_CORE_EXIST_NOT_LOAD = 418;
      int INFO_CORE_CHECK_VALIDITY_FALSE = 419;
      int INFO_CODE_MINIQB_STARTMINIQBTOLOADURL_COUNTS = 501;
      int INFO_CODE_MINIQB_STARTMINIQBTOLOADURL_ISNOTX5CORE = 502;
      int INFO_CODE_MINIQB_STARTMINIQBTOLOADURL_SUCCESS = 503;
      int INFO_CODE_MINIQB_STARTMINIQBTOLOADURL_FAILED = 504;
      int INFO_CODE_FILEREADER_OPENFILEREADER_COUNTS = 505;
      int INFO_CODE_FILEREADER_OPENFILEREADER_APKFILE = 506;
      int INFO_CODE_FILEREADER_OPENFILEREADER_NOTSUPPORT = 507;
      int INFO_CODE_FILEREADER_OPENFILEREADER_OPENINQB = 508;
      int INFO_CODE_FILEREADER_OPENFILEREADER_FILEPATHISNULL = 509;
      int INFO_CODE_FILEREADER_OPENFILEREADER_MINIQBSUCCESS = 510;
      int INFO_CODE_FILEREADER_OPENFILEREADER_MINIQBFAILED = 511;
      int INFO_COOKIE_SWITCH_REPORT_BASE = 700;
      int INFO_COOKIE_SWITCH_NO_KEYS = 701;
      int INFO_COOKIE_SWITCH_VERSION_ERROR = 702;
      int INFO_COOKIE_SWITCH_NONEED = 703;
      int INFO_COOKIE_SWITCH_TRANSFER = 704;
      int INFO_GET_PROCESS_LOCK_FAILED = 801;
      int INFO_GET_PROCESS_LOCK_REPAIR_SUCCESS = 802;
      int INFO_GET_PROCESS_LOCK_NEED_REPAIR = 803;
   }
}
