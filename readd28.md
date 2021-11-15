## Create dynamic lists with 

![](https://criticalgnome.com/wp-content/uploads/2018/08/1_VG98RxaEW7f8jZOwF5uGgg.png)

### waht is recyclerView ?
- It provides a fixed size window so that we can load a large data.

### Key Classes
- It's a multiple classes that are used to build a dynamic list.

- **RecyclerView** is the ViewGroup that contains the views.notice that it's a view itself so we can add it to the layout.

- **View holder object :** each element in the list. once it's created will be binded to the RecyclerView (RecyclerView.ViewHolder.) using RecyclerView.Adapter

- Layout manager to arrange the individual elements in the list.

### Implementing the RecyclerView
- We should add the RecyclerView AndroidX library to gradle.build

- create a model class to be as a data source.

- add RecyclerView to activity to display items.

- create a layout XML to view the item.