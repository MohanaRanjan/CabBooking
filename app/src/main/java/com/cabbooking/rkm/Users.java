package com.cabbooking.rkm;

import android.database.Cursor;

import java.security.SecureRandom;

/**
 * Created by Ramakrishna math Chennai on 09-09-2016.
 */
public class Users
{
    String _GlobalUserId;
    String _Name;
    String _Email;
    String _Password;
    String _MobileNumber;
    String _UserRoleId;
    Boolean _IsAvailable;

   public Users()
    {

    }

    //Constructor for insert
    public Users(String Id,String Name,String Email,String Password,String MobileNumber,String  UserRoleId, Boolean IsAvailable)
    {
        this._GlobalUserId  = Id;
        this._Name =  Name;
        this._Email = Email;
        this._Password =  Password;
        this._MobileNumber =  MobileNumber;
        this._UserRoleId = UserRoleId;
        this._IsAvailable = IsAvailable;
    }

    //Constructor for insert
    public Users(String Name,String Email,String Password,String MobileNumber,String  UserRoleId, Boolean IsAvailable)
    {
        this._Name =  Name;
        this._Email = Email;
        this._Password =  Password;
        this._MobileNumber =  MobileNumber;
        this._UserRoleId = UserRoleId;
        this._IsAvailable = IsAvailable;
    }

    // Properties
    public String getId()
    {
        return this._GlobalUserId;
    }

    public void setId(String Id)
    {
        this._GlobalUserId = Id;
    }

    public String getName()
    {
        return this._Name;
    }

    public void setName(String Name)
    {
        this._Name = Name;
    }

    public String getEmail()
    {
        return this._Email;
    }

    public void setEmail(String Email)
    {
        this._Email = Email;
    }

    public String getMobileNumber()
    {
        return this._MobileNumber;
    }

    public void setMobileNumber(String MobileNumber)
    {
        this._MobileNumber = MobileNumber;
    }

    public String getPassword()
    {
        return this._Password;
    }

    public void setPassword(String Password)
    {
        this._Password = Password;
    }

    public String getUserRoleId()
    {
        return this._UserRoleId;
    }

    public void setUserRoleId(String UserRoleId)
    {
        this._UserRoleId = UserRoleId;
    }

    public Boolean getIsAvailable()
    {
        return this._IsAvailable;
    }

    public void setIsAvailable(Boolean IsAvailable)
    {
        this._IsAvailable = IsAvailable;
    }
}
