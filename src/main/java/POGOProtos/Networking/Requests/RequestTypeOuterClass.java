// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/RequestType.proto

package POGOProtos.Networking.Requests;

public final class RequestTypeOuterClass {
  private RequestTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0POGOProtos/Networking/Requests/Request" +
      "Type.proto\022\036POGOProtos.Networking.Reques" +
      "ts*\274(\n\013RequestType\022\020\n\014METHOD_UNSET\020\000\022\016\n\n" +
      "GET_PLAYER\020\002\022\026\n\022GET_HOLO_INVENTORY\020\004\022\025\n\021" +
      "DOWNLOAD_SETTINGS\020\005\022\033\n\027DOWNLOAD_ITEM_TEM" +
      "PLATES\020\006\022\"\n\036DOWNLOAD_REMOTE_CONFIG_VERSI" +
      "ON\020\007\022\036\n\032REGISTER_BACKGROUND_DEVICE\020\010\022\022\n\016" +
      "GET_PLAYER_DAY\020\t\022\032\n\026ACKNOWLEDGE_PUNISHME" +
      "NT\020\n\022\023\n\017GET_SERVER_TIME\020\013\022\022\n\016GET_LOCAL_T" +
      "IME\020\014\022\017\n\013FORT_SEARCH\020e\022\r\n\tENCOUNTER\020f\022\021\n" +
      "\rCATCH_POKEMON\020g\022\020\n\014FORT_DETAILS\020h\022\023\n\017GE" +
      "T_MAP_OBJECTS\020j\022\027\n\023FORT_DEPLOY_POKEMON\020n" +
      "\022\027\n\023FORT_RECALL_POKEMON\020o\022\023\n\017RELEASE_POK" +
      "EMON\020p\022\023\n\017USE_ITEM_POTION\020q\022\024\n\020USE_ITEM_" +
      "CAPTURE\020r\022\021\n\rUSE_ITEM_FLEE\020s\022\023\n\017USE_ITEM" +
      "_REVIVE\020t\022\026\n\022GET_PLAYER_PROFILE\020y\022\022\n\016EVO" +
      "LVE_POKEMON\020}\022\024\n\020GET_HATCHED_EGGS\020~\022\037\n\033E" +
      "NCOUNTER_TUTORIAL_COMPLETE\020\177\022\025\n\020LEVEL_UP" +
      "_REWARDS\020\200\001\022\031\n\024CHECK_AWARDED_BADGES\020\201\001\022\021" +
      "\n\014USE_ITEM_GYM\020\205\001\022\024\n\017GET_GYM_DETAILS\020\206\001\022" +
      "\025\n\020START_GYM_BATTLE\020\207\001\022\017\n\nATTACK_GYM\020\210\001\022" +
      "\033\n\026RECYCLE_INVENTORY_ITEM\020\211\001\022\030\n\023COLLECT_" +
      "DAILY_BONUS\020\212\001\022\026\n\021USE_ITEM_XP_BOOST\020\213\001\022\033" +
      "\n\026USE_ITEM_EGG_INCUBATOR\020\214\001\022\020\n\013USE_INCEN" +
      "SE\020\215\001\022\030\n\023GET_INCENSE_POKEMON\020\216\001\022\026\n\021INCEN" +
      "SE_ENCOUNTER\020\217\001\022\026\n\021ADD_FORT_MODIFIER\020\220\001\022" +
      "\023\n\016DISK_ENCOUNTER\020\221\001\022!\n\034COLLECT_DAILY_DE" +
      "FENDER_BONUS\020\222\001\022\024\n\017UPGRADE_POKEMON\020\223\001\022\031\n" +
      "\024SET_FAVORITE_POKEMON\020\224\001\022\025\n\020NICKNAME_POK" +
      "EMON\020\225\001\022\020\n\013EQUIP_BADGE\020\226\001\022\031\n\024SET_CONTACT" +
      "_SETTINGS\020\227\001\022\026\n\021SET_BUDDY_POKEMON\020\230\001\022\025\n\020" +
      "GET_BUDDY_WALKED\020\231\001\022\027\n\022USE_ITEM_ENCOUNTE" +
      "R\020\232\001\022\017\n\nGYM_DEPLOY\020\233\001\022\021\n\014GYM_GET_INFO\020\234\001" +
      "\022\026\n\021GYM_START_SESSION\020\235\001\022\026\n\021GYM_BATTLE_A" +
      "TTACK\020\236\001\022\017\n\nJOIN_LOBBY\020\237\001\022\020\n\013LEAVE_LOBBY" +
      "\020\240\001\022\031\n\024SET_LOBBY_VISIBILITY\020\241\001\022\026\n\021SET_LO" +
      "BBY_POKEMON\020\242\001\022\025\n\020GET_RAID_DETAILS\020\243\001\022\025\n" +
      "\020GYM_FEED_POKEMON\020\244\001\022\026\n\021START_RAID_BATTL" +
      "E\020\245\001\022\020\n\013ATTACK_RAID\020\246\001\022\023\n\016AWARD_POKECOIN" +
      "\020\247\001\022\034\n\027USE_ITEM_STARDUST_BOOST\020\250\001\022\024\n\017REA" +
      "SSIGN_PLAYER\020\251\001\022\030\n\023REDEEM_POI_PASSCODE\020\252" +
      "\001\022\036\n\031CONVERT_CANDY_TO_XL_CANDY\020\253\001\022\025\n\020IS_" +
      "SKU_AVAILABLE\020\254\001\022\025\n\020GET_ASSET_DIGEST\020\254\002\022" +
      "\026\n\021GET_DOWNLOAD_URLS\020\255\002\022\026\n\021GET_ASSET_VER" +
      "SION\020\256\002\022\023\n\016CLAIM_CODENAME\020\223\003\022\017\n\nSET_AVAT" +
      "AR\020\224\003\022\024\n\017SET_PLAYER_TEAM\020\225\003\022\033\n\026MARK_TUTO" +
      "RIAL_COMPLETE\020\226\003\022\037\n\032UPDATE_PERFORMANCE_M" +
      "ETRICS\020\227\003\022\024\n\017CHECK_CHALLENGE\020\330\004\022\025\n\020VERIF" +
      "Y_CHALLENGE\020\331\004\022\t\n\004ECHO\020\232\005\022\027\n\022SFIDA_REGIS" +
      "TRATION\020\240\006\022\025\n\020SFIDA_ACTION_LOG\020\241\006\022\030\n\023SFI" +
      "DA_CERTIFICATION\020\242\006\022\021\n\014SFIDA_UPDATE\020\243\006\022\021" +
      "\n\014SFIDA_ACTION\020\244\006\022\021\n\014SFIDA_DOWSER\020\245\006\022\022\n\r" +
      "SFIDA_CAPTURE\020\246\006\022\037\n\032LIST_AVATAR_CUSTOMIZ" +
      "ATIONS\020\247\006\022\036\n\031SET_AVATAR_ITEM_AS_VIEWED\020\250" +
      "\006\022\016\n\tGET_INBOX\020\251\006\022\024\n\017LIST_GYM_BADGES\020\253\006\022" +
      "\032\n\025GET_GYM_BADGE_DETAILS\020\254\006\022\031\n\024USE_ITEM_" +
      "MOVE_REROLL\020\255\006\022\030\n\023USE_ITEM_RARE_CANDY\020\256\006" +
      "\022\033\n\026AWARD_FREE_RAID_TICKET\020\257\006\022\023\n\016FETCH_A" +
      "LL_NEWS\020\260\006\022\033\n\026MARK_READ_NEWS_ARTICLE\020\261\006\022" +
      "\034\n\027GET_PLAYER_DISPLAY_INFO\020\262\006\022\035\n\030BELUGA_" +
      "TRANSACTION_START\020\263\006\022 \n\033BELUGA_TRANSACTI" +
      "ON_COMPLETE\020\264\006\022\023\n\016GET_NEW_QUESTS\020\204\007\022\026\n\021G" +
      "ET_QUEST_DETAILS\020\205\007\022\023\n\016COMPLETE_QUEST\020\206\007" +
      "\022\021\n\014REMOVE_QUEST\020\207\007\022\024\n\017QUEST_ENCOUNTER\020\210" +
      "\007\022\036\n\031COMPLETE_QUEST_STAMP_CARD\020\211\007\022\023\n\016PRO" +
      "GRESS_QUEST\020\212\007\022\016\n\tSEND_GIFT\020\266\007\022\016\n\tOPEN_G" +
      "IFT\020\267\007\022\021\n\014GIFT_DETAILS\020\270\007\022\020\n\013DELETE_GIFT" +
      "\020\271\007\022\031\n\024SAVE_PLAYER_SNAPSHOT\020\272\007\022%\n GET_FR" +
      "IENDSHIP_MILESTONE_REWARDS\020\273\007\022\024\n\017CHECK_S" +
      "END_GIFT\020\274\007\022\030\n\023SET_FRIEND_NICKNAME\020\275\007\022\037\n" +
      "\032DELETE_GIFT_FROM_INVENTORY\020\276\007\022 \n\033SAVE_S" +
      "OCIAL_PLAYER_SETTINGS\020\277\007\022\027\n\022SHARE_EX_RAI" +
      "D_PASS\020\300\007\022\035\n\030CHECK_SHARE_EX_RAID_PASS\020\301\007" +
      "\022 \n\033DECLINE_SHARED_EX_RAID_PASS\020\302\007\022\021\n\014OP" +
      "EN_TRADING\020\312\007\022\023\n\016UPDATE_TRADING\020\313\007\022\024\n\017CO" +
      "NFIRM_TRADING\020\314\007\022\023\n\016CANCEL_TRADING\020\315\007\022\020\n" +
      "\013GET_TRADING\020\316\007\022\030\n\023GET_FITNESS_REWARDS\020\324" +
      "\007\022\036\n\031GET_COMBAT_PLAYER_PROFILE\020\336\007\022!\n\034GEN" +
      "ERATE_COMBAT_CHALLENGE_ID\020\337\007\022\034\n\027CREATE_C" +
      "OMBAT_CHALLENGE\020\340\007\022\032\n\025OPEN_COMBAT_CHALLE" +
      "NGE\020\341\007\022\031\n\024GET_COMBAT_CHALLENGE\020\342\007\022\034\n\027ACC" +
      "EPT_COMBAT_CHALLENGE\020\343\007\022\035\n\030DECLINE_COMBA" +
      "T_CHALLENGE\020\344\007\022\034\n\027CANCEL_COMBAT_CHALLENG" +
      "E\020\345\007\022%\n SUBMIT_COMBAT_CHALLENGE_POKEMONS" +
      "\020\346\007\022#\n\036SAVE_COMBAT_PLAYER_PREFERENCES\020\347\007" +
      "\022\030\n\023OPEN_COMBAT_SESSION\020\350\007\022\022\n\rUPDATE_COM" +
      "BAT\020\351\007\022\020\n\013QUIT_COMBAT\020\352\007\022\027\n\022GET_COMBAT_R" +
      "ESULTS\020\353\007\022\030\n\023UNLOCK_SPECIAL_MOVE\020\354\007\022\033\n\026G" +
      "ET_NPC_COMBAT_REWARDS\020\355\007\022\032\n\025COMBAT_FRIEN" +
      "D_REQUEST\020\356\007\022\034\n\027OPEN_NPC_COMBAT_SESSION\020" +
      "\357\007\022\032\n\025START_TUTORIAL_ACTION\020\360\007\022\034\n\027GET_TU" +
      "TORIAL_EGG_ACTION\020\361\007\022\017\n\nSEND_PROBE\020\374\007\022\017\n" +
      "\nPROBE_DATA\020\375\007\022\020\n\013COMBAT_DATA\020\376\007\022\032\n\025COMB" +
      "AT_CHALLENGE_DATA\020\377\007\022\024\n\017CHECK_PHOTOBOMB\020" +
      "\315\010\022\026\n\021CONFIRM_PHOTOBOMB\020\316\010\022\022\n\rGET_PHOTOB" +
      "OMB\020\317\010\022\030\n\023ENCOUNTER_PHOTOBOMB\020\320\010\022#\n\036GET_" +
      "SIGNED_GMAP_URL_DEPRECATED\020\321\010\022\020\n\013CHANGE_" +
      "TEAM\020\322\010\022\022\n\rGET_WEB_TOKEN\020\323\010\022\036\n\031COMPLETE_" +
      "SNAPSHOT_SESSION\020\326\010\022\023\n\016START_INCIDENT\020\260\t" +
      "\022\037\n\032INVASION_COMPLETE_DIALOGUE\020\261\t\022!\n\034INV" +
      "ASION_OPEN_COMBAT_SESSION\020\262\t\022\033\n\026INVASION" +
      "_BATTLE_UPDATE\020\263\t\022\027\n\022INVASION_ENCOUNTER\020" +
      "\264\t\022\023\n\016PURIFY_POKEMON\020\265\t\022\027\n\022GET_ROCKET_BA" +
      "LLOON\020\266\t\022\"\n\035START_ROCKET_BALLOON_INCIDEN" +
      "T\020\267\t\022 \n\033VS_SEEKER_START_MATCHMAKING\020\224\n\022\027" +
      "\n\022CANCEL_MATCHMAKING\020\225\n\022\033\n\026GET_MATCHMAKI" +
      "NG_STATUS\020\226\n\022,\n\'COMPLETE_VS_SEEKER_AND_R" +
      "ESTART_CHARGING\020\227\n\022\031\n\024GET_VS_SEEKER_STAT" +
      "US\020\230\n\022.\n)COMPLETE_COMBAT_COMPETITIVE_SEA" +
      "SON_ACTION\020\231\n\022\034\n\027CLAIM_VS_SEEKER_REWARDS" +
      "\020\232\n\022\037\n\032VS_SEEKER_REWARD_ENCOUNTER\020\233\n\022\027\n\022" +
      "ACTIVATE_VS_SEEKER\020\234\n\022\022\n\rGET_BUDDY_MAP\020\306" +
      "\n\022\024\n\017GET_BUDDY_STATS\020\307\n\022\017\n\nFEED_BUDDY\020\310\n" +
      "\022\024\n\017OPEN_BUDDY_GIFT\020\311\n\022\016\n\tPET_BUDDY\020\312\n\022\026" +
      "\n\021GET_BUDDY_HISTORY\020\313\n\022%\n CREATE_BUDDY_M" +
      "UTLIPLAYER_SESSION\020\260\013\022#\n\036JOIN_BUDDY_MULT" +
      "IPLAYER_SESSION\020\261\013\022$\n\037LEAVE_BUDDY_MULTIP" +
      "LAYER_SESSION\020\262\013\022\023\n\016GET_TODAY_VIEW\020\335\013\022\030\n" +
      "\023MEGA_EVOLVE_POKEMON\020\336\013\022\025\n\020REMOTE_GIFT_P" +
      "ING\020\337\013\022\031\n\024SEND_RAID_INVITATION\020\340\013\022\030\n\023GET" +
      "_DAILY_ENCOUNTER\020\301\014\022\024\n\017DAILY_ENCOUNTER\020\302" +
      "\014\022\030\n\023OPEN_SPONSORED_GIFT\020\362\014\022&\n!SPONSORED" +
      "_GIFT_REPORT_INTERACTION\020\363\014\022\034\n\027SAVE_PLAY" +
      "ER_PREFERENCES\020\364\014\022\024\n\017PROFANITY_CHECK\020\365\014\022" +
      "\036\n\031GET_TIMED_GROUP_CHALLENGE\020\244\r\022\031\n\024GET_N" +
      "INTENDO_ACCOUNT\020\256\r\022\034\n\027UNLINK_NINTENDO_AC" +
      "COUNT\020\257\r\022\034\n\027GET_NINTENDO_OAUTH2_URL\020\260\r\022\035" +
      "\n\030TRANSFER_TO_POKEMON_HOME\020\261\r\022\027\n\022REPORT_" +
      "AD_FEEDBACK\020\264\r\022\027\n\022CREATE_POKEMON_TAG\020\265\r\022" +
      "\027\n\022DELETE_POKEMON_TAG\020\266\r\022\025\n\020EDIT_POKEMON" +
      "_TAG\020\267\r\022!\n\034SET_POKEMON_TAGS_FOR_POKEMON\020" +
      "\270\r\022\025\n\020GET_POKEMON_TAGS\020\271\rB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
