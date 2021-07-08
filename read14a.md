## CSS Transforms, Transitions, and Animations:


### Transforms:


![](https://miro.medium.com/max/900/1*_6MfwckxNfQTca9SiG8MdQ.png)


+ The transform property applies a 2D or 3D transformation to an element. Transforms are triggered when an element changes states, such as on mouse-hover or mouse-click. The examples in this post will demonstrate transforms on mouse-hover and in other defention , the transform property comes in two different settings, two-dimensional and three-dimensional. Each of these come with their own individual properties and values.


### Transform Syntax:

+ The actual syntax for the transform property is quite simple, including the transform property followed by the value. The value specifies the transform type followed by a specific amount inside parentheses.

### for example :

+ **matrix:** Defines a 2D transformation, using a matrix of six values.
+ **matrix3d:** Defines a 3D transformation, using a 4x4 matrix of 16 values. 
+ **translate(x,y)** Defines a 2D translation.
+ **translate3d(x,y,z):** Defines a 3D translation.



+ Two-dimensional transforms work on the x and y axes, known as horizontal and vertical axes. Three-dimensional transforms work on both the x and y axes, as well as the z axis. These three-dimensional transforms help define not only the length and width of an element, but also the depth.

+ **2D Rotate:**The transform property accepts a handful of different values. The rotate value provides the ability to rotate an element from 0 to 360 degrees. Using a positive value will rotate an element clockwise, and using a negative value will rotate the element counterclockwise.

### Transitions & Animations :

+ With CSS3 transitions you have the potential to alter the appearance and behavior of an element whenever a state change occurs, such as when it is hovered over, focused on, active, or targeted.
 

### By understanding the transform property, you’ll unlock ways to further build unique and engaging interfaces from scratch. So, in this post, I’ll show you everything you need to know to start using the CSS transform property, including the many ways you can manipulate elements in two and three dimensions, and even how to animate such effects.


### Transitions:

+ There are four transition related properties in total, including transition-property, transition-duration, transition-timing-function, and transition-delay. Not all of these are required to build a transition, with the first three are the most popular.

### Transitional Property :

+ The transition-property property determines exactly what properties will be altered in conjunction with the other transitional properties. By default, all of the properties within an element’s different states will be altered upon change.

+ If multiple properties need to be transitioned they may be comma separated within the transition-property value. Additionally, the keyword value all may be used to transition all properties of an element.

### Transition Duration:

+ The duration in which a transition takes place is set using the transition-duration property. The value of this property can be set using general timing values, including seconds (s) and milliseconds (ms).

+ When transitioning multiple properties you can set multiple durations, one for each property. As with the transition-property property value, multiple durations can be declared using comma separated values. The order of these values when identifying individual properties and durations does matter

## Animations :

![](https://stfalcon.com/uploads/images/5881e0b98e717.png)


### The @keyframes :

+ When you specify CSS styles inside the @keyframes, the animation will change from the current style to the new style at certain times. To get an animation to work, you must bind the animation to an element.

### The animation-direction property can have the following values:

+ normal - The animation is played as normal (forwards). This is default.

+ reverse - The animation is played in reverse direction (backwards).

+ alternate - The animation is played forwards first, then backwards.

+ alternate-reverse - The animation is played backwards first, then forwards.


The animation-fill-mode property specifies a style for the target element when the animation is not playing (before it starts, after it ends, or both).


### The animation-fill-mode property can have the following values:

+ none - Default value. Animation will not apply any styles to the element before or after it is executing .

+ forwards - The element will retain the style values that is set by the last keyframe (depends on animation-direction and animation-iteration-count)

+ backwards - The element will get the style values that is set by the first keyframe (depends on animation-direction), and retain this during the animation-delay period

+ both - The animation will follow the rules for both forwards and backwards, extending the animation properties in both directions.