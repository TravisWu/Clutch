package com.traviswu.clutch;

import android.net.Uri;


/**
 * Created by traviswu on 2014-10-23.
 */
public class Contact {
    private String _Name, _Number, _Email;
    private Uri _imageUri;
    public Contact(String Name, String Number, String Email, Uri imageUri) {
        _Name = Name;
        _Number = Number;
        _Email = Email;
        _imageUri = imageUri;
    }
    public String get_Name() {
        return _Name;
    }
    public String get_Number() {
        return _Number;
    }
    public String get_Email() {
        return _Email;
    }
    public Uri get_imageUri() {return _imageUri;}
}
