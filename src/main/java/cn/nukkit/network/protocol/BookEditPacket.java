package cn.nukkit.network.protocol;

public class BookEditPacket extends DataPacket {

    @Override
    public int pid() {
        return ProtocolInfo.BOOK_EDIT_PACKET;
    }

    @Override
    public void decode() {

    }

    @Override
    public void encode() {
        //TODO
    }
}
