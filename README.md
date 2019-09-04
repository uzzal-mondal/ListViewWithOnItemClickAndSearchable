# ListViewWithOnItemClick


List View Adapter

1.	ListView is a view group , that can display list of scrollable items.
2.	Each of them items are click able.
3.	List view er jonno , data source, (string, array, array list , sqlite etc).
4.	Data source theke data gulo list view a set korte jeta projon Adapter.
5.	Adapter data pull korbe then covert to view.
Then view jeta korbe , seta holo akta list view te set korbe.

6.	List view a View group, er moddhe amara view add korte parbo.
7.	Recycler view/ listview / Grid view / spinner all items are use to – Adapter.
8.	Adapter are two types, 
#array adapter – single base er jonno. 
#Base apdater – multiple data er jonno.


ListView Practical :02
# listview-datasource-Adapter-
1.	 List view with id find






2.	 Then String array create for many other’s array show. – Its call Data Source.

3.	Adapter – Data source tekhe file niye ashbe, othat string tekhe file nibe. Then layout file tekhe akta text nibe. Erpor  akta view a convert kore lilst view a set korbe..

4.	 View er jonno akta layout create korbo. Ak , ak ta data uthbe and list view a set hobe.

5.	List_sample_view layout tai valo design korte hobe, ei design tai, amar list view a boshbe.

6.	
ArrayAdapter<String> adapter = new                   ArrayAdapter<String>()

Constructer er moddhe 4 ti jinish pass korte hobe.

 at first j class a asi sei class er name.        MainActivity.this

 Array adapter kon layout ba sample ta follow korbe, seta bolte hobe. 
R.layout.sample view er name.

 sample view er  textView er id name ta boshsbe.

 at last text view j String ta boshbe sei String er name.   eta amar string resource a rakha ase. Java file a niye asar por tar name.

String[] programming_name = getResources().getStringArray(R.array.programming_name);


 codding for list view:- 
MainActivity:--
 

Activity-listview declare.
string - array create – String_programming_name
 List_simple_view – cardview + view.
Mainactivity- ArrayAdapter declare..






List view clickable:- 
listView.onItemClcikListner.

AdapterView<?> parent – eta refer kore list view take jeta amara create korsi.

View – list view er moddhe j text view ta seta refer korse.

Position – position hosse index jeta 0 tomo position theke start hosse. Row-0, row-1;

id – dabase er jonno use hoy. Every row are use to id..

