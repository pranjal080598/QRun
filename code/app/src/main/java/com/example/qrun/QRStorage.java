package com.example.qrun;

import androidx.annotation.NonNull;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;


public class QRStorage extends Storage{
    public QRStorage(FirebaseFirestore db) {
        super(db,"QR");
    }
    public void add(HashMap<?, ?> value, @NonNull StoreOnComplete comp) {
        String id = this.getCol().document().getId();
        this.add(id, value, comp);
    }

}
