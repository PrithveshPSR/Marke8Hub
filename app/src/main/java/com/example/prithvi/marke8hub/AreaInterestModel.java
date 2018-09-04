package com.example.prithvi.marke8hub;

import java.io.Serializable;

public class AreaInterestModel implements Serializable {
    private String imageNmae;
    private String imageUrl;

    public AreaInterestModel(String name, String url){
        this.imageNmae = name;
        this.imageUrl = url;
     }

    public String getImageNmae() {
        return imageNmae;
    }

    public void setImageNmae(String imageNmae) {
        this.imageNmae = imageNmae;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
