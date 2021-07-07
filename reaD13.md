## LOCAL STORAGE:

![](https://blog.teamtreehouse.com/wp-content/uploads/2013/01/localstorage-feature.png)


### html storage

+ The html storage is a specification named web storage and it’s a way for web pages to store named key/value pairs locally, within the client web browser. Like cookies, this data persists even after you navigate away from the web site, close your browser tab, exit your browser, or what have you.
4
**persistent local storage** is one of the areas where native client applications have held an advantage over web applications. For native applications, the operating system typically provides an abstraction layer for storing and retrieving application-specific data like preferences or runtime state. These values may be stored in the registry, INI files, XML files, or some other place according to platform convention. If your native client application needs local storage beyond key/value pairs, you can embed your own database, invent your own file format, or any number of other solutions.

**You store** data based on a named key, then you can retrieve that data with the same key. however the data is actually stored as a string. if you are storing and retrieving anything than string we need to use functions like parseInt or parseFloat, There are also methods for removing the value for a given named key, and clearing the entire storage area like interface storage then delete void removeItem.


### USING HTML5 STORAGE:

![](https://www.exeideas.com/wp-content/uploads/2016/02/Use-HTML5-Local-Storage.jpg)

+ HTML5 Storage is based on named key/value pairs. You store data based on a named key, then you can retrieve that data with the same key. The named key is a string. The data can be any type supported by JavaScript, including strings, Booleans, integers, or floats. However, the data is actually stored as a string. If you are storing and retrieving anything other than strings, you will need to use functions like parseInt() or parseFloat() to coerce your retrieved data into the expected JavaScript datatype.

### TRACKING CHANGES TO THE HTML5 STORAGE AREA:

+ we can trapthe storage event. the storage event is fired on the window object whenever setItem(), removeItem(), or clear() is called.

### BEYOND NAMED KEY-VALUE PAIRS: COMPETING VISIONS:

**The present condition of HTML5** Storage is surprisingly rosy. A new API has been standardized and implemented across all major browsers, platforms, and devices. This specification has reached an impasse: all interested implementors have used the same SQL backend (Sqlite), but we need multiple independent implementations to proceed along a standardisation path.

What we really want is:

+ a lot of storage space.

+ on the client.

+ that persists beyond a page refresh.

+ and isn’t transmitted to the server.