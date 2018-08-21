package com.example.rojo.treasurecoasttour;

public class Tour {

    private String mTourHeadline;
    public String mLinkURL;
    private int mImageResourceID;

    public Tour(String tourHeadline, String linkUrl,  int imageResourceId){
        mTourHeadline= tourHeadline;
        mLinkURL=linkUrl;
        mImageResourceID=imageResourceId;
        }

        public String getTourHeadline(){return mTourHeadline;}

        public String getLinkURL(){return mLinkURL;}

        public int getImageResourceId(){return mImageResourceID;}

}
