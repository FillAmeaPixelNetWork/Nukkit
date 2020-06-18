package cn.nukkit.network.protocol;

/**
 * author: MagicDroidX & iNevet
 * Nukkit Project
 */
public interface ProtocolInfo {

    /**
     * Actual Minecraft: PE protocol version
     */
    int CURRENT_PROTOCOL = Integer.valueOf("141"); //plugins can change it

    String MINECRAFT_VERSION = "v1.4.60";
    String MINECRAFT_VERSION_NETWORK = "1.4.60";

    int LOGIN_PACKET = 0x01;
    int PLAY_STATUS_PACKET = 0x02;
    int SERVER_TO_CLIENT_HANDSHAKE_PACKET = 0x03;
    int CLIENT_TO_SERVER_HANDSHAKE_PACKET = 0x04;
    int DISCONNECT_PACKET = 0x05;
    int RESOURCE_PACKS_INFO_PACKET = 0x06;
    int RESOURCE_PACK_STACK_PACKET = 0x07;
    int RESOURCE_PACK_CLIENT_RESPONSE_PACKET = 0x08;
    int TEXT_PACKET = 0x09;
    int SET_TIME_PACKET = 0x0a;
    int START_GAME_PACKET = 0x0b;
    int ADD_PLAYER_PACKET = 0x0c;
    int ADD_ENTITY_PACKET = 0x0d;
    int REMOVE_ENTITY_PACKET = 0x0e;
    int ADD_ITEM_ENTITY_PACKET = 0x0f;
    int ADD_HANGING_ENTITY_PACKET = 0x10;
    int TAKE_ITEM_ENTITY_PACKET = 0x11;
    int MOVE_ENTITY_PACKET = 0x12;
    int MOVE_PLAYER_PACKET = 0x13;
    int RIDER_JUMP_PACKET = 0x14;
    int UPDATE_BLOCK_PACKET = 0x15;
    int ADD_PAINTING_PACKET = 0x16;
    int EXPLODE_PACKET = 0x17;
    int TICK_SYNC_PACKET = 0x17;
    int LEVEL_SOUND_EVENT_PACKET = 0x18;
    int LEVEL_EVENT_PACKET = 0x19;
    int BLOCK_EVENT_PACKET = 0x1a;
    int ENTITY_EVENT_PACKET = 0x1b;
    int MOB_EFFECT_PACKET = 0x1c;
    int UPDATE_ATTRIBUTES_PACKET = 0x1d;
    int INVENTORY_TRANSACTION_PACKET = 0x1e;
    int MOB_EQUIPMENT_PACKET = 0x1f;
    int MOB_ARMOR_EQUIPMENT_PACKET = 0x20;
    int INTERACT_PACKET = 0x21;
    int BLOCK_PICK_REQUEST_PACKET = 0x22;
    int ENTITY_PICK_REQUEST_PACKET = 0x23;
    int PLAYER_ACTION_PACKET = 0x24;
    int ENTITY_FALL_PACKET = 0x25;
    int HURT_ARMOR_PACKET = 0x26;
    int SET_ENTITY_DATA_PACKET = 0x27;
    int SET_ENTITY_MOTION_PACKET = 0x28;
    int SET_ENTITY_LINK_PACKET = 0x29;
    int SET_HEALTH_PACKET = 0x2a;
    int SET_SPAWN_POSITION_PACKET = 0x2b;
    int ANIMATE_PACKET = 0x2c;
    int RESPAWN_PACKET = 0x2d;
    int CONTAINER_OPEN_PACKET = 0x2e;
    int CONTAINER_CLOSE_PACKET = 0x2f;
    int PLAYER_HOTBAR_PACKET = 0x30;
    int INVENTORY_CONTENT_PACKET = 0x31;
    int INVENTORY_SLOT_PACKET = 0x32;
    int CONTAINER_SET_DATA_PACKET = 0x33;
    int CRAFTING_DATA_PACKET = 0x34;
    int CRAFTING_EVENT_PACKET = 0x35;
    int GUI_DATA_PICK_ITEM_PACKET = 0x36;
    int ADVENTURE_SETTINGS_PACKET = 0x37;
    int BLOCK_ENTITY_DATA_PACKET = 0x38;
    int PLAYER_INPUT_PACKET = 0x39;
    int FULL_CHUNK_DATA_PACKET = 0x3a;
    int SET_COMMANDS_ENABLED_PACKET = 0x3b;
    int SET_DIFFICULTY_PACKET = 0x3c;
    int CHANGE_DIMENSION_PACKET = 0x3d;
    int SET_PLAYER_GAME_TYPE_PACKET = 0x3e;
    int PLAYER_LIST_PACKET = 0x3f;
    int SIMPLE_EVENT_PACKET = 0x40;
    int TELEMETRY_EVENT_PACKET = 0x41;
    int SPAWN_EXPERIENCE_ORB_PACKET = 0x42;
    int CLIENTBOUND_MAP_ITEM_DATA_PACKET = 0x43;
    int MAP_INFO_REQUEST_PACKET = 0x44;
    int REQUEST_CHUNK_RADIUS_PACKET = 0x45;
    int CHUNK_RADIUS_UPDATED_PACKET = 0x46;
    int ITEM_FRAME_DROP_ITEM_PACKET = 0x47;
    int GAME_RULES_CHANGED_PACKET = 0x48;
    int CAMERA_PACKET = 0x49;
    int BOSS_EVENT_PACKET = 0x4a;
    int SHOW_CREDITS_PACKET = 0x4b;
    int AVAILABLE_COMMANDS_PACKET = 0x4c;
    int COMMAND_REQUEST_PACKET = 0x4d;
    int COMMAND_BLOCK_UPDATE_PACKET = 0x4e;
    int COMMAND_OUTPUT_PACKET = 0x4f;
    int UPDATE_TRADE_PACKET = 0x50;
    int UPDATE_EQUIPMENT_PACKET = 0x51;
    int RESOURCE_PACK_DATA_INFO_PACKET = 0x52;
    int RESOURCE_PACK_CHUNK_DATA_PACKET = 0x53;
    int RESOURCE_PACK_CHUNK_REQUEST_PACKET = 0x54;
    int TRANSFER_PACKET = 0x55;
    int PLAY_SOUND_PACKET = 0x56;
    int STOP_SOUND_PACKET = 0x57;
    int SET_TITLE_PACKET = 0x58;
    int ADD_BEHAVIOR_TREE_PACKET = 0x59;
    int STRUCTURE_BLOCK_UPDATE_PACKET = 0x5a;
    int SHOW_STORE_OFFER_PACKET = 0x5b;
    int PURCHASE_RECEIPT_PACKET = 0x5c;
    int PLAYER_SKIN_PACKET = 0x5d;
    int SUB_CLIENT_LOGIN_PACKET = 0x5e;
    int INITIATE_WEB_SOCKET_CONNECTION_PACKET = 0x5f;
    int SET_LAST_HURT_BY_PACKET = 0x60;
    int BOOK_EDIT_PACKET = 0x61;
    int NPC_REQUEST_PACKET = 0x62;
    int PHOTO_TRANSFER_PACKET = 0x63;
    int MODAL_FORM_REQUEST_PACKET = 0x64;
    int MODAL_FORM_RESPONSE_PACKET = 0x65;
    int SERVER_SETTINGS_REQUEST_PACKET = 0x66;
    int SERVER_SETTINGS_RESPONSE_PACKET = 0x67;
    int SHOW_PROFILE_PACKET = 0x68;
    int SET_DEFAULT_GAME_TYPE_PACKET = 0x69;
    int REMOVE_OBJECTIVE_PACKET = 0x6a;
    int SET_DISPLAY_OBJECTIVE_PACKET = 0x6b;
    int SET_SCORE_PACKET = 0x6c;
    int LAB_TABLE_PACKET = 0x6d;
    int UPDATE_BLOCK_SYNCED = 0x6e;
    int MOVE_ENTITY_DELTA_PACKET = 0x6f;
    int SET_SCOREBOARD_IDENTITY_PACKET = 0x70;
    int SET_LOCAL_PLAYER_AS_INITIALIZED_PACKET = 0x71;
    int UPDATE_SOFT_ENUM_PACKET = 0x72;
    int NETWORK_STACK_LATENCY_PACKET = 0x73;
    int SCRIPT_CUSTOM_EVENT_PACKET = 0x75;
    int SPAWN_PARTICLE_EFFECT_PACKET = 0x76;
    int AVAILABLE_ENTITY_IDENTIFIERS_PACKET = 0x77;
    int LEVEL_SOUND_EVENT_PACKET_V2 = 0x78;
    int NETWORK_CHUNK_PUBLISHER_UPDATE_PACKET = 0x79;
    int BIOME_DEFINITION_LIST_PACKET = 0x7a;
    int LEVEL_SOUND_EVENT_PACKET_V3 = 0x7b;
    int LEVEL_EVENT_GENERIC_PACKET = 0x7c;
    int LECTERN_UPDATE_PACKET = 0x7d;
    int VIDEO_STREAM_CONNECT_PACKET = 0x7e;
    //byte ADD_ENTITY_PACKET = 0x7f;
    //byte REMOVE_ENTITY_PACKET = 0x80;
    int CLIENT_CACHE_STATUS_PACKET = 0x81;
    int ON_SCREEN_TEXTURE_ANIMATION_PACKET = 0x82;
    int MAP_CREATE_LOCKED_COPY_PACKET = 0x83;
    int STRUCTURE_TEMPLATE_DATA_EXPORT_REQUEST = 0x84;
    int STRUCTURE_TEMPLATE_DATA_EXPORT_RESPONSE = 0x85;
    int UPDATE_BLOCK_PROPERTIES = 0x86;
    int CLIENT_CACHE_BLOB_STATUS_PACKET = 0x87;
    int CLIENT_CACHE_MISS_RESPONSE_PACKET = 0x88;
    int EDUCATION_SETTINGS_PACKET = 0x89;
    int EMOTE_PACKET = 0x8a;
    int MULTIPLAYER_SETTINGS_PACKET = 0x8b;
    int SETTINGS_COMMAND_PACKET = 0x8c;
    int ANVIL_DAMAGE_PACKET = 0x8d;
    int COMPLETED_USING_ITEM_PACKET = 0x8e;
    int NETWORK_SETTINGS_PACKET = 0x8f;
    int PLAYER_AUTH_INPUT_PACKET = 0x90;

    //NetEase Common Mod
    int PACKET_CHANGE_MODEL = 0xc9;
    int PACKET_STORE_BUY_SUCC = 0xca;
    int PACKET_NETEASE_JSON = 0xcb;
    int PACKET_CHANGE_MODEL_TEXTURE = 0xcc;

    int CONFIRM_SKIN_PACKET = 0xe4;

    int BATCH_PACKET = 0xfe;
}
