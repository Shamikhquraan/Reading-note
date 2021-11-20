## Espresso
- espresso is used to wrote a tests of android app.


![](https://themodestack.com/wp-content/uploads/2018/11/Espresso-test-steps.png)


### ***********************************************************
ex: @Test public void greeterSaysHello() {

onView(withId(R.id.name_field)).perform(typeText("Steve"));
onView(withId(R.id.greet_button)).perform(click());
onView(withText("Hello Steve!")).check(matches(isDisplayed()));
}

### ************************************************************


### What is espresso ?
-The Espresso framework is part of the androidx library. This framework gives an Android developer the ability to automate UI tests.

- You just tell it the activity you want to open, which views you want to click on, which views you want to modify, and it does all that for you.

- All we have to do to sit it up in our application, is to add and sync the dependencies.

- The framework has three basic steps to writing UI tests.

1- Find a view - Tell the framework what view to find. We use the ViewMatcher class to find a view.

2- Perform an action - Tell the framework what to do on the view. We use the ViewAction class to perform an action on a view.

3- Assert the results - Check whether the result reflects the expected one. We use the ViewAssertion class for assertions.

- **Espresso Test Recorder** tool helps us to perform UI tests without the need to write test, just by recording interactions with device and add assertions to UI elements. Then Espresso Test Recorder takes saved recording and creates a test enables us to test our app.
