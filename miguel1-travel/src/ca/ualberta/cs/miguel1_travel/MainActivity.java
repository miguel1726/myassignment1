/*
 TRAVEL EXPENSE MANAGER: Manages the expenses and claims of the user and all expenses
  belong to a claim per trip abroad.

Copyright (C) 2015 Miguel Ramirez miguel1@ualberta.ca
This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.
This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details.
You should have received a copy of the GNU General Public License
along with this program. If not, see <http://www.gnu.org/licenses/>.
*/	
package ca.ualberta.cs.miguel1_travel;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
//import android.widget.ArrayAdapter;
//import android.widget.Spinner;
public class MainActivity extends Activity {

	//spinner code taken from youtube video: Android spinner example, by raghav shetty, link watch?v=o7Om-iUoiio on jan 16 2015
	//Spinner cat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.configure_claim);
        
      //  cat=(Spinner) findViewById(R.id.select_edit_claim);
      //  ArrayAdapter<CharSequence> ar= ArrayAdapter.createFromResource(this,R.array.Category, android.R.layout.simple_list_item_1);
      //  ar.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
      //  cat.setAdapter(ar);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
