package items;

/**
 * Created by jivan on 4.2.17.
 */
public class Item {

    private ItemType itemType;

    private double incomeCost;

    private double weight;

    private double volume;

    public Item(ItemType itemType, double incomeCost, double weight, double volume)
    {
        this.incomeCost = incomeCost;
        this.itemType = itemType;
        this.weight = weight;
        this.volume = volume;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public double getIncomeCost() {
        return incomeCost;
    }

    public double getWeight() {
        return weight;
    }

    public double getVolume() {
        return volume;
    }
}
