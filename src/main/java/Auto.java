/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kinna
 */
public class Auto {
    private String mBrand;
    private String mModel;
    private String mGear;
    private String mFuel;
    private int mAge;
    private String mLicense;
    private int mToken;
    
    public Auto(String aBrand, String aModel, String aGear, String aFuel, int aAge, String aLicense, int aToken) {
        mBrand = aBrand;
        mModel = aModel;
        mGear = aGear;
        mFuel = aFuel;
        mAge = aAge;
        mLicense = aLicense;
        mToken = aToken;
    }

    public String getmBrand() {
        return mBrand;
    }

    public void setmBrand(String mBrand) {
        this.mBrand = mBrand;
    }

    public String getmModel() {
        return mModel;
    }

    public void setmModel(String mModel) {
        this.mModel = mModel;
    }

    public String getmGear() {
        return mGear;
    }

    public void setmGear(String mGear) {
        this.mGear = mGear;
    }

    public String getmFuel() {
        return mFuel;
    }

    public void setmFuel(String mFuel) {
        this.mFuel = mFuel;
    }

    public int getmAge() {
        return mAge;
    }

    public void setmAge(int mAge) {
        this.mAge = mAge;
    }

    public void setToken(int aToken) {
        mToken = aToken;
    }
    
    public int getToken() {
        return mToken;
    }

    public String getmLicense() {
        return mLicense;
    }

    public void setmLicense(String mLicense) {
        this.mLicense = mLicense;
    }
    
    
    
    public void printInfo() {
        System.out.println("");
        System.out.println("Brand: " + mBrand);
        System.out.println("Model: " + mModel);
        System.out.println("Transmission: " + mGear);
        System.out.println("Fuel: " + mFuel);
        System.out.println("Manufacturing year: " + mAge);
        System.out.println("License plate number: " + mLicense);
        System.out.println("Token: " + mToken);
        System.out.println("");
    }
    
}
