package inventory;

public class Item {

    private final int _id;
    private final String _item;

    public Item(int id, String item) {
        _id = id;
        _item = item;
    }

    public int getId() {
        return _id;
    }

    public String getItem()
	{
		return _item;
	}
}
