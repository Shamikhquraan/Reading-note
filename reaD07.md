## Layout :

![](https://miro.medium.com/max/840/1*kuzeYL058uQGHPt8_wuoqg.png)

**CSS** treats each HTML element as if it is in its own box. This box will either be a block-level box or an inline box.

### Containing Elements
**If** one block-level element sits inside another block-level element then the outer box is known as the containing or parent element

### Floating Elements
+ **float:**

The float property allows you to take an element in normal flow and place it as far to the left or right of the containing element as possible. The **blockquote** element is floated to the right, and the paragraphs that follow the quote flow around the floated element.
he float property is used for positioning and formatting content e.g. let an image float left to the text in a container.

### The float property can have one of the following values:
![](https://static.javatpoint.com/csspages/images/css-float-web.png)
![](https://www.1keydata.com/css-tutorial/example-float-right-float-left.jpg)
+ left - The element floats to the left of its container
+ right - The element floats to the right of its container
+ none - The element does not float (will be displayed just where it +  occurs in the text). This is default
+ inherit - The element inherits the float value of its parent In its simplest use, the float property can be used to wrap text around images.
### clear:
* left * Right * both * none

### Screen Sizes:

Different visitors to your site will have different sized screens that show different amounts of information, so your design needs to be able to work on a range of different sized screens.

### Screen Resolution:

Resolution refers to the number of dots a screen shows per inch. Some devices have a higher resolution than desktop computers and most operating systems allow users to adjust the resolution of their screens.

### Page Sizes
Because screen sizes and display resolutions vary so much, web designers often try to create pages of around 960-1000 pixels wide (since most users will be able to see designs this wide on their screens)

### Fixed and Liquid width Layout:
![](https://elementor.com/cdn-cgi/image/f=auto,w=1024,h=606/marketing/wp-content/uploads/sites/9/2020/09/modular-grid-examples-1.png)
A "fixed-width" layout is one in which the layout of the page is contained within a wrapper that doesn't adjust its size when the width of the browser changes. To create a fixed width layout, the width of the main boxes on a page will usually be specified in pixels (and sometimes their height, too).

Liquid layouts define layout regions that both resize with text, and reflow as needed to accommodate on-screen display. The liquid layout uses percentages to specify the width of each box so that the design will stretch to fit the size of the screen.

### Layout Grids:
Composition in any visual art (such as design, painting, or photography) is the placement or arrangement of visual elements — how they are organized on a page. Many designers use a grid structure to help them position items on a page, and the same is true for web designers.