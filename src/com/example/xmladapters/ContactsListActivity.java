package com.example.xmladapters;

import android.app.ListActivity;
import android.os.Bundle;

/**
 * This activity demonstrates how to create a complex UI using a ListView
 * and an adapter defined in XML.
 * 
 * The following activity shows a list of contacts, their starred status
 * and their photos, using the adapter defined in res/xml.
 */
public class ContactsListActivity extends ListActivity {
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.contacts_list);
        
//        setListAdapter()
    }
    
    
}
