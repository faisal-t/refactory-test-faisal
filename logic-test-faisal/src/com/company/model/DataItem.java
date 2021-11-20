package com.company.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataItem {
    @Override
    public String toString() {
        return "DataItem{" +
                "inventoryId=" + inventoryId +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", tags=" + tags +
                ", purchasedAt=" + purchasedAt +
                ", placement= " + "room_id = " + placement.getRoomId() + " name = " + placement.getName() +
                '}';
    }

    @SerializedName("inventory_id")
    @Expose
    private Integer inventoryId = 0;
    @SerializedName("name")
    @Expose
    private String name = "";
    @SerializedName("type")
    @Expose
    private String type = "";
    @SerializedName("tags")
    @Expose
    private List<String> tags = null;
    @SerializedName("purchased_at")
    @Expose
    private Integer purchasedAt = 0;
    @SerializedName("placement")
    @Expose
    private Placement placement;

    public Integer getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Integer getPurchasedAt() {
        return purchasedAt;
    }

    public void setPurchasedAt(Integer purchasedAt) {
        this.purchasedAt = purchasedAt;
    }

    public Placement getPlacement() {
        return placement;
    }

    public void setPlacement(Placement placement) {
        this.placement = placement;
    }

}