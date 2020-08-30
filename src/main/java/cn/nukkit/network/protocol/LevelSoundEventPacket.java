package cn.nukkit.network.protocol;


import cn.nukkit.math.Vector3f;

public class LevelSoundEventPacket extends DataPacket {
    public static final int NETWORK_ID = ProtocolInfo.LEVEL_SOUND_EVENT_PACKET;

	public static final int SOUND_ITEM_USE_ON = 0;
	public static final int SOUND_HIT = 1;
	public static final int SOUND_STEP = 2;
	public static final int SOUND_FLY = 3;
	public static final int SOUND_JUMP = 4;
	public static final int SOUND_BREAK = 5;
	public static final int SOUND_PLACE = 6;
	public static final int SOUND_HEAVY_STEP = 7;
	public static final int SOUND_GALLOP = 8;
	public static final int SOUND_FALL = 9;
	public static final int SOUND_AMBIENT = 10;
	public static final int SOUND_AMBIENT_BABY = 11;
	public static final int SOUND_AMBIENT_IN_WATER = 12;
	public static final int SOUND_BREATHE = 13;
	public static final int SOUND_DEATH = 14;
	public static final int SOUND_DEATH_IN_WATER = 15;
	public static final int SOUND_DEATH_TO_ZOMBIE = 16;
	public static final int SOUND_HURT = 17;
	public static final int SOUND_HURT_IN_WATER = 18;
	public static final int SOUND_MAD = 19;
	public static final int SOUND_BOOST = 20;
	public static final int SOUND_BOW = 21;
	public static final int SOUND_SQUISH_BIG = 22;
	public static final int SOUND_SQUISH_SMALL = 23;
	public static final int SOUND_FALL_BIG = 24;
	public static final int SOUND_FALL_SMALL = 25;
	public static final int SOUND_SPLASH = 26;
	public static final int SOUND_FIZZ = 27;
	public static final int SOUND_FLAP = 28;
	public static final int SOUND_SWIM = 29;
	public static final int SOUND_DRINK = 30;
	public static final int SOUND_EAT = 31;
	public static final int SOUND_TAKEOFF = 32;
	public static final int SOUND_SHAKE = 33;
	public static final int SOUND_PLOP = 34;
	public static final int SOUND_LAND = 35;
	public static final int SOUND_SADDLE = 36;
	public static final int SOUND_ARMOR = 37;
	public static final int SOUND_ADD_CHEST = 38;
	public static final int SOUND_THROW = 39;
	public static final int SOUND_ATTACK = 40;
	public static final int SOUND_ATTACK_NODAMAGE = 41;
	public static final int SOUND_ATTACK_STRONG = 42;
	public static final int SOUND_WARN = 43;
	public static final int SOUND_SHEAR = 44;
	public static final int SOUND_MILK = 45;
	public static final int SOUND_THUNDER = 46;
	public static final int SOUND_EXPLODE = 47;
	public static final int SOUND_FIRE = 48;
	public static final int SOUND_IGNITE = 49;
	public static final int SOUND_FUSE = 50;
	public static final int SOUND_STARE = 51;
	public static final int SOUND_SPAWN = 52;
	public static final int SOUND_SHOOT = 53;
	public static final int SOUND_BREAK_BLOCK = 54;
	public static final int SOUND_LAUNCH = 55;
	public static final int SOUND_BLAST = 56;
	public static final int SOUND_LARGE_BLAST = 57;
	public static final int SOUND_TWINKLE = 58;
	public static final int SOUND_REMEDY = 59;
	public static final int SOUND_UNFECT = 60;
	public static final int SOUND_LEVELUP = 61;
	public static final int SOUND_BOW_HIT = 62;
	public static final int SOUND_BULLET_HIT = 63;
	public static final int SOUND_EXTINGUISH_FIRE = 64;
	public static final int SOUND_ITEM_FIZZ = 65;
	public static final int SOUND_CHEST_OPEN = 66;
	public static final int SOUND_CHEST_CLOSED = 67;
	public static final int SOUND_SHULKERBOX_OPEN = 68;
	public static final int SOUND_SHULKERBOX_CLOSED = 69;
	public static final int SOUND_POWER_ON = 70;
	public static final int SOUND_POWER_OFF = 71;
	public static final int SOUND_ATTACH = 72;
	public static final int SOUND_DETACH = 73;
	public static final int SOUND_DENY = 74;
	public static final int SOUND_TRIPOD = 75;
	public static final int SOUND_POP = 76;
	public static final int SOUND_DROP_SLOT = 77;
	public static final int SOUND_NOTE = 78;
	public static final int SOUND_THORNS = 79;
	public static final int SOUND_PISTON_IN = 80;
	public static final int SOUND_PISTON_OUT = 81;
	public static final int SOUND_PORTAL = 82;
	public static final int SOUND_WATER = 83;
	public static final int SOUND_LAVA_POP = 84;
	public static final int SOUND_LAVA = 85;
	public static final int SOUND_BURP = 86;
	public static final int SOUND_BUCKET_FILL_WATER = 87;
	public static final int SOUND_BUCKET_FILL_LAVA = 88;
	public static final int SOUND_BUCKET_EMPTY_WATER = 89;
	public static final int SOUND_BUCKET_EMPTY_LAVA = 90;
	public static final int SOUND_RECORD_13 = 91;
	public static final int SOUND_RECORD_CAT = 92;
	public static final int SOUND_RECORD_BLOCKS = 93;
	public static final int SOUND_RECORD_CHIRP = 94;
	public static final int SOUND_RECORD_FAR = 95;
	public static final int SOUND_RECORD_MALL = 96;
	public static final int SOUND_RECORD_MELLOHI = 97;
	public static final int SOUND_RECORD_STAL = 98;
	public static final int SOUND_RECORD_STRAD = 99;
	public static final int SOUND_RECORD_WARD = 100;
	public static final int SOUND_RECORD_11 = 101;
	public static final int SOUND_RECORD_WAIT = 102;
	public static final int SOUND_STOP_RECORD = 103;
	public static final int SOUND_GUARDIAN_FLOP = 104;
	public static final int SOUND_ELDERGUARDIAN_CURSE = 105;
	public static final int SOUND_MOB_WARNING = 106;
	public static final int SOUND_MOB_WARNING_BABY = 107;
	public static final int SOUND_TELEPORT = 108;
	public static final int SOUND_SHULKER_OPEN = 109;
	public static final int SOUND_SHULKER_CLOSE = 110;
	public static final int SOUND_HAGGLE = 111;
	public static final int SOUND_HAGGLE_YES = 112;
	public static final int SOUND_HAGGLE_NO = 113;
	public static final int SOUND_HAGGLE_IDLE = 114;
	public static final int SOUND_CHORUSGROW = 115;
	public static final int SOUND_CHORUSDEATH = 116;
	public static final int SOUND_GLASS = 117;
	public static final int SOUND_CAST_SPELL = 118;
	public static final int SOUND_PREPARE_ATTACK = 119;
	public static final int SOUND_PREPARE_SUMMON = 120;
	public static final int SOUND_PREPARE_WOLOLO = 121;
	public static final int SOUND_FANG = 122;
	public static final int SOUND_CHARGE = 123;
	public static final int SOUND_CAMERA_TAKE_PICTURE = 124;
	public static final int SOUND_LEASHKNOT_PLACE = 125;
	public static final int SOUND_LEASHKNOT_BREAK = 126;
	public static final int SOUND_GROWL = 127;
	public static final int SOUND_WHINE = 128;
	public static final int SOUND_PANT = 129;
	public static final int SOUND_PURR = 130;
	public static final int SOUND_PURREOW = 131;
	public static final int SOUND_DEATH_MIN_VOLUME = 132;
	public static final int SOUND_DEATH_MID_VOLUME = 133;
	public static final int SOUND_IMITATE_BLAZE = 134;
	public static final int SOUND_IMITATE_CAVE_SPIDER = 135;
	public static final int SOUND_IMITATE_CREEPER = 136;
	public static final int SOUND_IMITATE_ELDER_GUARDIAN = 137;
	public static final int SOUND_IMITATE_ENDER_DRAGON = 138;
	public static final int SOUND_IMITATE_ENDERMAN = 139;
	public static final int SOUND_IMITATE_EVOCATION_ILLAGER = 141;
	public static final int SOUND_IMITATE_GHAST = 142;
	public static final int SOUND_IMITATE_HUSK = 143;
	public static final int SOUND_IMITATE_ILLUSION_ILLAGER = 144;
	public static final int SOUND_IMITATE_MAGMA_CUBE = 145;
	public static final int SOUND_IMITATE_POLAR_BEAR = 146;
	public static final int SOUND_IMITATE_SHULKER = 147;
	public static final int SOUND_IMITATE_SILVERFISH = 148;
	public static final int SOUND_IMITATE_SKELETON = 149;
	public static final int SOUND_IMITATE_SLIME = 150;
	public static final int SOUND_IMITATE_SPIDER = 151;
	public static final int SOUND_IMITATE_STRAY = 152;
	public static final int SOUND_IMITATE_VEX = 153;
	public static final int SOUND_IMITATE_VINDICATION_ILLAGER = 154;
	public static final int SOUND_IMITATE_WITCH = 155;
	public static final int SOUND_IMITATE_WITHER = 156;
	public static final int SOUND_IMITATE_WITHER_SKELETON = 157;
	public static final int SOUND_IMITATE_WOLF = 158;
	public static final int SOUND_IMITATE_ZOMBIE = 159;
	public static final int SOUND_IMITATE_ZOMBIE_PIGMAN = 160;
	public static final int SOUND_IMITATE_ZOMBIE_VILLAGER = 161;
	public static final int SOUND_BLOCK_END_PORTAL_FRAME_FILL = 162;
	public static final int SOUND_BLOCK_END_PORTAL_SPAWN = 163;
	public static final int SOUND_RANDOM_ANVIL_USE = 164;
	public static final int SOUND_BOTTLE_DRAGONBREATH = 165;
	public static final int SOUND_DEFAULT = 166;
	public static final int SOUND_UNDEFINED = 167;

	//已经不是旧版的了，后面直接拿新版的id
	public static final int SOUND_PORTAL_TRAVEL = 177;
	public static final int SOUND_ITEM_TRIDENT_HIT = 178;
	public static final int SOUND_ITEM_TRIDENT_RETURN = 179;
	public static final int SOUND_ITEM_TRIDENT_RIPTIDE_1 = 180;
	public static final int SOUND_ITEM_TRIDENT_RIPTIDE_2 = 181;
	public static final int SOUND_ITEM_TRIDENT_RIPTIDE_3 = 182;
	public static final int SOUND_ITEM_TRIDENT_THROW = 183;
	public static final int SOUND_ITEM_TRIDENT_THUNDER = 184;
	public static final int SOUND_ITEM_TRIDENT_HIT_GROUND = 185;

	public static final int SOUND_ELEMCONSTRUCT_OPEN = 188;
	public static final int SOUND_ICEBOMB_HIT = 189;
	public static final int SOUND_BALLOONPOP = 190;
	public static final int SOUND_LT_REACTION_ICEBOMB = 191;
	public static final int SOUND_LT_REACTION_BLEACH = 192;
	public static final int SOUND_LT_REACTION_EPASTE = 193;
	public static final int SOUND_LT_REACTION_EPASTE2 = 194;

	public static final int SOUND_LT_REACTION_FERTILIZER = 199;
	public static final int SOUND_LT_REACTION_FIREBALL = 200;
	public static final int SOUND_LT_REACTION_MGSALT = 201;
	public static final int SOUND_LT_REACTION_MISCFIRE = 202;
	public static final int SOUND_LT_REACTION_FIRE = 203;
	public static final int SOUND_LT_REACTION_MISCEXPLOSION = 204;
	public static final int SOUND_LT_REACTION_MISCMYSTICAL = 205;
	public static final int SOUND_LT_REACTION_MISCMYSTICAL2 = 206;
	public static final int SOUND_LT_REACTION_PRODUCT = 207;
	public static final int SOUND_SPARKLER_USE = 208;
	public static final int SOUND_GLOWSTICK_USE = 209;
	public static final int SOUND_SPARKLER_ACTIVE = 210;
	public static final int SOUND_CONVERT_TO_DROWNED = 211;
	public static final int SOUND_BUCKET_FILL_FISH = 212;
	public static final int SOUND_BUCKET_EMPTY_FISH = 213;
	public static final int SOUND_BUBBLE_UP = 214;
	public static final int SOUND_BUBBLE_DOWN = 215;
	public static final int SOUND_BUBBLE_POP = 216;
	public static final int SOUND_BUBBLE_UPINSIDE = 217;
	public static final int SOUND_BUBBLE_DOWNINSIDE = 218;
	public static final int SOUND_HURT_BABY = 219;
	public static final int SOUND_DEATH_BABY = 220;
	public static final int SOUND_STEP_BABY = 221;
	public static final int SOUND_BORN = 223;
	public static final int SOUND_BLOCK_TURTLE_EGG_BREAK = 224;
	public static final int SOUND_BLOCK_TURTLE_EGG_CRACK = 225;
	public static final int SOUND_BLOCK_TURTLE_EGG_HATCH = 226;
	public static final int SOUND_BLOCK_TURTLE_EGG_ATTACK = 228;
	public static final int SOUND_BEACON_ACTIVATE = 229;
	public static final int SOUND_BEACON_AMBIENT = 230;
	public static final int SOUND_BEACON_DEACTIVATE = 231;
	public static final int SOUND_BEACON_POWER = 232;
	public static final int SOUND_CONDUIT_ACTIVATE = 233;
	public static final int SOUND_CONDUIT_AMBIENT = 234;
	public static final int SOUND_CONDUIT_ATTACK = 235;
	public static final int SOUND_CONDUIT_DEACTIVATE = 236;
	public static final int SOUND_CONDUIT_SHORT = 237;
	public static final int SOUND_SWOOP = 238;
	public static final int SOUND_BLOCK_BAMBOO_SAPLING_PLACE = 239;
	public static final int SOUND_PRESNEEZE = 240;
	public static final int SOUND_SNEEZE = 241;
	public static final int SOUND_AMBIENT_TAME = 242;
	public static final int SOUND_SCARED = 243;
	public static final int SOUND_BLOCK_SCAFFOLDING_CLIMB = 244;
	public static final int SOUND_CROSSBOW_LOADING_START = 245;
	public static final int SOUND_CROSSBOW_LOADING_MIDDLE = 246;
	public static final int SOUND_CROSSBOW_LOADING_END = 247;
	public static final int SOUND_CROSSBOW_SHOOT = 248;
	public static final int SOUND_CROSSBOW_QUICK_CHARGE_START = 249;
	public static final int SOUND_CROSSBOW_QUICK_CHARGE_MIDDLE = 250;
	public static final int SOUND_CROSSBOW_QUICK_CHARGE_END = 251;
	public static final int SOUND_AMBIENT_AGGRESSIVE = 252;
	public static final int SOUND_AMBIENT_WORRIED = 253;
	public static final int SOUND_CANT_BREED = 254;
	public static final int SOUND_UNDEFINED_NEW = 255;


	public int sound;
    public float x;
    public float y;
    public float z;
    public int extraData = -1; //TODO: Check name
    public int pitch = 1; //TODO: Check name
	public String entityIdentifier = ":";
    public boolean isBabyMob;
    public boolean isGlobal;

    public LevelSoundEventPacket() {

	}

    @Override
    public void decode() {
        this.sound = this.getByte();
        Vector3f v = this.getVector3f();
        this.x = v.x;
        this.y = v.y;
        this.z = v.z;
        this.extraData = this.getVarInt();
        this.pitch = this.getVarInt();
        this.isBabyMob = this.getBoolean();
        this.isGlobal = this.getBoolean();
    }

    @Override
    public void encode() {
        this.reset();
        this.putByte((byte) this.sound);
        this.putVector3f(this.x, this.y, this.z);
        this.putVarInt(this.extraData);
        this.putVarInt(this.pitch);
        this.putBoolean(this.isBabyMob);
        this.putBoolean(this.isGlobal);
    }

    @Override
    public int pid() {
        return NETWORK_ID;
    }
}
