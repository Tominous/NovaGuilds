package co.marcin.novaguilds.enums;

import co.marcin.novaguilds.NovaGuilds;
import co.marcin.novaguilds.basic.NovaGuild;
import co.marcin.novaguilds.manager.MessageManager;
import co.marcin.novaguilds.util.StringUtils;
import org.bukkit.command.CommandSender;

import java.util.HashMap;
import java.util.List;

public enum Message {
	CHAT_PREFIX,
	CHAT_NOPERMISSIONS,
	CHAT_UNKNOWNCMD,
	CHAT_INVALIDPARAM,
	CHAT_CMDFROMCONSOLE,
	CHAT_ENTERINTEGER,
	CHAT_DELAYEDTELEPORT,
	CHAT_DELAYEDTPMOVED,
	CHAT_ERROROCCURED,
	CHAT_UPDATE,

	CHAT_BASIC_NEGATIVENUMBER,
	CHAT_BASIC_ON,
	CHAT_BASIC_OFF,

	CHAT_ADMIN_GUILD_TIMEREST_SET,
	CHAT_ADMIN_GUILD_LIST_HEADER,
	CHAT_ADMIN_GUILD_LIST_PAGE_HASNEXT,
	CHAT_ADMIN_GUILD_LIST_PAGE_NONEXT,
	CHAT_ADMIN_GUILD_LIST_ITEM,

	CHAT_ADMIN_GUILD_INACTIVE_UPDATED,
	CHAT_ADMIN_GUILD_INACTIVE_LIST_HEADER,
	CHAT_ADMIN_GUILD_INACTIVE_LIST_ITEM,
	CHAT_ADMIN_GUILD_INACTIVE_LIST_AGO,
	CHAT_ADMIN_GUILD_INACTIVE_LIST_NOW,

	CHAT_ADMIN_GUILD_BANK_PAID,
	CHAT_ADMIN_GUILD_BANK_WITHDREW,

	CHAT_ADMIN_GUILD_ABANDON,
	CHAT_ADMIN_GUILD_KICK_LEADER,
	CHAT_ADMIN_GUILD_INVITED,
	CHAT_ADMIN_GUILD_TELEPORTED_SELF,
	CHAT_ADMIN_GUILD_TELEPORTED_OTHER,

	CHAT_ADMIN_GUILD_SET_TAG,
	CHAT_ADMIN_GUILD_SET_POINTS,
	CHAT_ADMIN_GUILD_SET_LIVES,
	CHAT_ADMIN_GUILD_SET_NAME_ENTERNEWNAME,
	CHAT_ADMIN_GUILD_SET_NAME_SUCCESS,
	CHAT_ADMIN_GUILD_SET_LEADER_NOTINGUILD,
	CHAT_ADMIN_GUILD_SET_LEADER_ALREADYLEADER,
	CHAT_ADMIN_GUILD_SET_LEADER_SUCCESS,

	CHAT_ADMIN_REGION_BYPASS_TOGGLED_SELF,
	CHAT_ADMIN_REGION_BYPASS_TOGGLED_OTHER,
	CHAT_ADMIN_REGION_BYPASS_NOTIFYOTHER,

	CHAT_ADMIN_REGION_DELETE_SUCCESS,

	CHAT_ADMIN_REGION_TELEPORT_SELF,
	CHAT_ADMIN_REGION_TELEPORT_OTHER,
	CHAT_ADMIN_REGION_TELEPORT_NOTIFYOTHER,

	CHAT_ADMIN_SAVE_PLAYERS,
	CHAT_ADMIN_SAVE_GUILDS,
	CHAT_ADMIN_SAVE_REGIONS,
	CHAT_ADMIN_SAVE_ALL,
	CHAT_ADMIN_SAVE_AUTOSAVE,

	CHAT_RELOAD_RELOADING,
	CHAT_RELOAD_CONFIG,
	CHAT_RELOAD_MESSAGES,
	CHAT_RELOAD_MYSQL,
	CHAT_RELOAD_PLAYERS,
	CHAT_RELOAD_GUILDS,
	CHAT_RELOAD_REGIONS,
	CHAT_RELOAD_NEWMSGFILE,
	CHAT_RELOAD_GROUPS,
	CHAT_RELOAD_RELOADED,

	CHAT_PVP_TEAM,
	CHAT_PVP_ALLY,

	CHAT_NOGUILD,

	CHAT_RAID_RESTING,
	CHAT_RAID_PROTECTION,

	CHAT_GUILD_COMPASSTARGET_ON,
	CHAT_GUILD_COMPASSTARGET_OFF,
	CHAT_GUILD_NOGUILDS,
	CHAT_GUILD_FPVPTOGGLED,
	CHAT_GUILD_EFFECT_SUCCESS,

	CHAT_GUILD_ALLY_WAR,
	CHAT_GUILD_ALLY_SAMENAME,
	CHAT_GUILD_ALLY_ALREADYALLY,
	CHAT_GUILD_ALLY_ALREADYINVITED,
	CHAT_GUILD_ALLY_INVITED,
	CHAT_GUILD_ALLY_ACCEPTED,
	CHAT_GUILD_ALLY_NEWINVITE,
	CHAT_GUILD_ALLY_NOTIFYGUILD,
	CHAT_GUILD_ALLY_NOTIFYGUILDCANCELED,
	CHAT_GUILD_ALLY_CANCELED,

	CHAT_GUILD_COULDNOTFIND,
	CHAT_GUILD_HASNOREGION,
	CHAT_GUILD_ENTERNAME,
	CHAT_GUILD_ENTERTAG,
	CHAT_GUILD_NOTINGUILD,
	CHAT_GUILD_ABANDONED,
	CHAT_GUILD_NOTLEADER,
	CHAT_GUILD_SETHOME_SUCCESS,
	CHAT_GUILD_SETHOME_OUTSIDEREGION,
	CHAT_GUILD_SETHOME_OVERLAPS,
	CHAT_GUILD_HOME,
	CHAT_GUILD_HASREGIONALREADY,
	CHAT_GUILD_JOINED,
	CHAT_GUILD_EXPLOSIONATREGION,
	CHAT_GUILD_KICKYOURSELF,
	CHAT_GUILD_TOOCLOSE,
	CHAT_GUILD_NAMENOTEXIST,
	CHAT_GUILD_NOTENOUGHMONEY,
	CHAT_GUILD_GUILDATLOCSP,

	CHAT_GUILD_LEADER_SUCCESS,
	CHAT_GUILD_LEADER_SAMENICK,
	CHAT_GUILD_LEADER_NOTSAMEGUILD,
	CHAT_GUILD_LEADER_NOTIFYNEWLEADER,

	CHAT_GUILD_LEAVE_ISLEADER,
	CHAT_GUILD_LEAVE_LEFT,

	CHAT_GUILD_BANK_ENTERAMOUNT,
	CHAT_GUILD_BANK_PAY_PAID,
	CHAT_GUILD_BANK_PAY_NOTENOUGH,
	CHAT_GUILD_BANK_WITHDRAW_NOTLEADER,
	CHAT_GUILD_BANK_WITHDRAW_SUCCESS,
	CHAT_GUILD_BANK_WITHDRAW_NOTENOUGH,

	CHAT_GUILD_WAR_ALLY,
	CHAT_GUILD_WAR_YOURGUILDWAR,
	CHAT_GUILD_WAR_NOWARINV_SUCCESS,
	CHAT_GUILD_WAR_NOWARINV_NOTIFY,
	CHAT_GUILD_WAR_LIST_NOWARS,
	CHAT_GUILD_WAR_LIST_WARSHEADER,
	CHAT_GUILD_WAR_LIST_NOWARINVHEADER,
	CHAT_GUILD_WAR_LIST_ITEM,
	CHAT_GUILD_WAR_LIST_SEPARATOR,

	CHAT_PLAYER_ENTERNAME,
	CHAT_PLAYER_NOTEXISTS,
	CHAT_PLAYER_NOTONLINE,
	CHAT_PLAYER_HASGUILD,
	CHAT_PLAYER_HASNOGUILD,
	CHAT_PLAYER_ALREADYINVITED,
	CHAT_PLAYER_NOTINYOURGUILD,
	CHAT_PLAYER_INVITE_INVITED,
	CHAT_PLAYER_INVITE_LIST_HEADER,
	CHAT_PLAYER_INVITE_LIST_ITEM,
	CHAT_PLAYER_INVITE_LIST_SEPARATOR,
	CHAT_PLAYER_INVITE_LIST_NOTHING,
	CHAT_PLAYER_INVITE_NOTINVITED,
	CHAT_PLAYER_INVITE_NOTIFY,
	CHAT_PLAYER_INVITE_CANCEL_SUCCESS,
	CHAT_PLAYER_INVITE_CANCEL_NOTIFY,
	CHAT_PLAYER_INFO_HEADER,
	CHAT_PLAYER_INFO_ITEMS,

	CHAT_REGION_RESIZE_START,
	CHAT_REGION_RESIZE_SUCCESS,
	CHAT_REGION_DENY_INTERACT,
	CHAT_REGION_DENY_RIDEMOB,
	CHAT_REGION_DENY_ATTACKMOB,
	CHAT_REGION_NOREGIONHERE,
	CHAT_REGION_REGIONHERE,
	CHAT_REGION_VALIDATION_TOOSMALL,
	CHAT_REGION_VALIDATION_TOOBIG,
	CHAT_REGION_VALIDATION_TOOCLOSE,
	CHAT_REGION_VALIDATION_OVERLAPS,
	CHAT_REGION_VALIDATION_NOTSELECTED,
	CHAT_REGION_VALIDATION_NOTVALID,
	CHAT_REGION_VALIDATION_VALID,
	CHAT_REGION_SIZE,
	CHAT_REGION_PRICE,
	CHAT_REGION_CNOTAFFORD,
	CHAT_REGION_CREATED,
	CHAT_REGION_MUSTVEGUILD,
	CHAT_REGION_ENTERED(true),
	CHAT_REGION_EXITED(true),
	CHAT_REGION_NOTIFYGUILD_ENTERED,
	CHAT_REGION_BELONGSTO,
	CHAT_REGION_LIST_HEADER,
	CHAT_REGION_LIST_ITEM,
	CHAT_REGION_TOOL_TOGGLEDMODE,
	CHAT_REGION_TOOL_MODES_CHECK,
	CHAT_REGION_TOOL_MODES_SELECT,

	CHAT_GUILD_VAULT_OUTSIDEREGION(true),
	CHAT_GUILD_VAULT_PLACE_SUCCESS(true),
	CHAT_GUILD_VAULT_PLACE_NOTLEADER(true),
	CHAT_GUILD_VAULT_DROP(true),
	CHAT_GUILD_VAULT_PLACE_EXISTS(true),
	CHAT_GUILD_VAULT_PLACE_DOUBLECHEST(true),
	CHAT_GUILD_VAULT_BREAK_NOTEMPTY(true),
	CHAT_GUILD_VAULT_BREAK_SUCCESS(true),
	CHAT_GUILD_VAULT_BREAK_NOTLEADER(true),

	CHAT_USAGE_NGA_GUILD_SETPOINTS,
	CHAT_USAGE_NGA_GUILD_ABANDON,
	CHAT_USAGE_NGA_GUILD_LIVES,
	CHAT_USAGE_NGA_GUILD_BANK_PAY,
	CHAT_USAGE_NGA_GUILD_BANK_WITHDRAW,
	CHAT_USAGE_NGA_GUILD_TP,
	CHAT_USAGE_NG_BROADCAST,
	CHAT_USAGE_GUILD_CREATE,
	CHAT_USAGE_GUILD_INVITE,

	CHAT_COMMANDS_ADMIN_MAIN_HEADER,
	CHAT_COMMANDS_ADMIN_MAIN_ITEMS,
	CHAT_COMMANDS_ADMIN_REGION_HEADER,
	CHAT_COMMANDS_ADMIN_REGION_ITEMS,
	CHAT_COMMANDS_ADMIN_GUILD_HEADER,
	CHAT_COMMANDS_ADMIN_GUILD_ITEMS,
	CHAT_COMMANDS_GUILD_HASGUILD,
	CHAT_COMMANDS_GUILD_NOGUILD,
	CHAT_COMMANDS_GUILD_LEADER,

	CHAT_CREATEGUILD_NOTENOUGHMONEY,
	CHAT_CREATEGUILD_ITEMLIST,
	CHAT_CREATEGUILD_ITEMLISTSEP,
	CHAT_CREATEGUILD_NOITEMS,
	CHAT_CREATEGUILD_TAGEXISTS,
	CHAT_CREATEGUILD_NAMEEXISTS,
	CHAT_CREATEGUILD_HASGUILD,
	CHAT_CREATEGUILD_SUCCESS,
	CHAT_CREATEGUILD_REGIONHERE,
	CHAT_CREATEGUILD_TOOCLOSESPAWN,
	CHAT_CREATEGUILD_NOTALLOWEDSTRING,
	CHAT_CREATEGUILD_TAG_TOOSHORT,
	CHAT_CREATEGUILD_TAG_TOOLONG,
	CHAT_CREATEGUILD_NAME_TOOSHORT,
	CHAT_CREATEGUILD_NAME_TOOLONG,

	CHAT_GUILDINFO_PLAYERSEPARATOR,
	CHAT_GUILDINFO_LEADERPREFIX,
	CHAT_GUILDINFO_PLAYERCOLOR_ONLINE,
	CHAT_GUILDINFO_PLAYERCOLOR_OFFLINE,
	CHAT_GUILDINFO_ALLY,
	CHAT_GUILDINFO_WAR,
	CHAT_GUILDINFO_FULLINFO,
	CHAT_GUILDINFO_INFO,

	BROADCAST_ADMIN_AUTOSAVE,
	BROADCAST_ADMIN_GUILD_ABANDON,

	BROADCAST_GUILD_WAR,
	BROADCAST_GUILD_NOWAR,
	BROADCAST_GUILD_JOINED,
	BROADCAST_GUILD_LEFT,
	BROADCAST_GUILD_CREATED,
	BROADCAST_GUILD_ABANDONED,
	BROADCAST_GUILD_SETLEADER,
	BROADCAST_GUILD_ALLIED,
	BROADCAST_GUILD_ENDALLY,
	BROADCAST_GUILD_KICKED,
	BROADCAST_GUILD_NEWLEADER,
	BROADCAST_GUILD_DESTROYED,

	BROADCAST_GUILD_RAID_FINISHED_ATTACKERWON,
	BROADCAST_GUILD_RAID_FINISHED_DEFENDERWON,

	BROADCAST_PVP_KILLED,

	HOLOGRAPHICDISPLAYS_TOPGUILDS_TOPROWS,
	HOLOGRAPHICDISPLAYS_TOPGUILDS_HEADER,
	HOLOGRAPHICDISPLAYS_TOPGUILDS_ROW,

	ITEMS_TOOL_NAME,
	ITEMS_TOOL_LORE,

	BARAPI_WARPROGRESS,

	BOOK_HELP_TITLE,
	BOOK_HELP_PAGES,

	INVENTORY_REQUIREDITEMS_NAME,
	INVENTORY_GGUI_NAME

	;

	private static final MessageManager messageManager = NovaGuilds.getInst().getMessageManager();
	private boolean title = false;
	private String path = null;
	private HashMap<String,String> vars = new HashMap<>();
	private boolean prefix = true;
	private boolean list = false;

	Message(boolean title) {
		this.title = title;
	}

	Message() {

	}

	public boolean getTitle() {
		return title;
	}

	public String getPath() {
		if(path == null) {
			path = name().replace("_",".").toLowerCase();
		}

		return path;
	}

	public void send(CommandSender sender) {
		if(list) {
			messageManager.sendMessagesList(sender, getPath(), vars, prefix);
		}
		else {
			messageManager.sendMessagesMsg(sender, this, vars);
		}
	}

	public Message vars(HashMap<String,String> vars) {
		this.vars = vars;
		return this;
	}

	public Message list() {
		list = true;
		return this;
	}

	public Message title(boolean title) {
		this.title = title;
		return this;
	}

	public Message prefix(boolean prefix) {
		this.prefix = prefix;
		return this;
	}

	public void broadcast(NovaGuild guild) {
		messageManager.broadcastGuild(guild, this, vars, prefix);
	}

	public void broadcast() {
		messageManager.broadcastMessage(this, vars);
	}

	public void broadcast(String permission) {
		messageManager.broadcastMessageForPermitted(getPath(), permission);
	}

	public String get() {
		return messageManager.getMessagesString(getPath()); //TODO replace with Message
	}

	public List<String> getList() {
		return messageManager.getMessages().getStringList(getPath());
	}

	public static String getOnOff(boolean b) {
		return b ? Message.CHAT_BASIC_ON.get() : Message.CHAT_BASIC_OFF.get();
	}

	public static Message fromPath(String path) {
		path = StringUtils.replace(path, ".", "_").toUpperCase();
		for(Message message : values()) {
			if(message.name().equalsIgnoreCase(path)) {
				return message;
			}
		}

		return null;
	}
}
