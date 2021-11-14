### Understand Tasks and Back Stack

- **What is a Stack?**
**=>** stack is a collection of activities , so each task is a collection of activities, however these will be arranged in the back stack, after finishing the task it will be popped from the stack.

![](https://media.geeksforgeeks.org/wp-content/uploads/20210612202233/article-660x339.png)


### Managing Tasks

- **This is done** by doing all activites started in succession in the same task , following the STACK concept FILO. first things first we should call setContentView() to define the layout for the activity's user interface.

- **When onCreate()** finishes, the next callback is always onStart().
- **onStart()** its the same of onCreate() the activity becomes visible to the user.
- **onResume()** this would be invoked by the system before the activity starts interacting with the user.
- **The onPause()** callback always follows onResume()
- **onPuase()** this may be called if the user pressed back button. so we can say when the activity loses focus.
- **onStop()** when the activity is no longer visible to the user.
- **onRestart()** it be invoked when the activity is stipped and state is about to restart.
- **onDestroy()** it's implemented to ensure that all of an activity’s resources are released when the activity, or the process containing it, is destroyed.

![](https://abhiandroid.com/programming/wp-content/uploads/2015/12/Activity-Lifecycle-Diagram.jpg)

