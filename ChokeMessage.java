
public class ChokeMessage extends Message {
	private static final long serialVersionUID = 2L;
	private int msg_len;
	private int msg_type;
	private byte[] msg_payload;
	
	
	@Override
	public void setMsgLen() {
		msg_len = msg_payload.length;
	}

	@Override
	public void setMsgType(int type) {	
		msg_type = type;
		
	}

	@Override
	public void setMsgPayLoad() {
		msg_payload = new byte[4];
	}
	

	@Override
	public void setMsgPayLoad(byte[] payload) {
		
		msg_payload = new byte[4];
	}

	@Override
	public int getMsgType() {
		return msg_type;
	}

	@Override
	public int getMsgLen() {
		
		return msg_len;
	}
	
	public byte[] getMsgPayLoad()
	{
		return msg_payload;
	}
	
	public long getUID()
	{
		return serialVersionUID;
	}
	
	public Message getMessage()
	{
		return this;
	}
	
	

}