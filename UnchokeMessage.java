
public class UnchokeMessage implements Message{
	private int msg_len;
	private int msg_type;
	private int index;
	private byte[] msg_payload;
	private static final long serialVersionUID = 7L;	


	public void setMsgLen() {
		msg_len = 0;
	}

	public void setMsgPayLoad(byte[] payload) {
		
		msg_payload = payload;
	}

	public void setMsgPayLoad(int index, byte[] payload){}

	public int getMsgType() {
		return msg_type;
	}

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

	public void setMsgPayLoad(){}
	
	public void setMsgPayLoad(int index){}

	public void setMsgType(byte type) {
		// TODO Auto-generated method stub
		msg_type = type;
	}
	
	public void setPieceIndex(int index)
	{
		this.index = index;
	}
	
	public int getPieceIndex()
	{
		return index;
	}
}