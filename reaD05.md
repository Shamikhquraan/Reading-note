# HTML Images; CSS Color & Text:

## Images

![](https://mssionline.com/wp-content/uploads/2020/10/css-illustration.png)


### syntax of adding < img >



### Image Resolution
Images created for the web should be saved at a resolution of 72 ppi. The higher the resolution of the image, the larger the size of the file.

+ images can be easily inserted at any section in HTML page . to insert in an HTML page , we use the img tag.

### Adding Images
+ To add an image into the page you need to use an img element. This is an empty element (which means there is no closing tag).

**src** this tells the browser where it can find the image file

**alt** Tis prvide a text This description of the image that describes the image if you can not see it.

### Height & Width of Images:

**height**
+ This specifies the height of the image in pixels or with precantage and there are some another ways to measure .

**width**
+ This specifies the width of the image in pixeles or with percantage and there are some another ways to measure .



### Img Formating
+ JPEG
+ GIF

![](https://dt2sdf0db8zob.cloudfront.net/wp-content/uploads/2019/05/GIF-vs-JPG-vs-PNG.jpg)

### JPEG vs PNG vs GIF
Several statistics reports indicate that these 3 formats together comprise of more than 95% of all images loaded on websites

### JPEG
is a lossy compression specification that takes advantage of human perception. It can achieve compression ratios of 1:10 without any perceivable difference in quality.

### PNG
is a lossless image format using DEFLATE compression. No data is lost during compression and no compression artefacts are introduced in the image.

### GIF
is also a lossless image format that uses LZW compression algorithm.

### Aligning Images Horizontally

+ left:

This aligns the image to the left (allowing text to flow around its right-hand side)

+ right:

This aligns the image to the right (allowing text to flow around its left-hand side).

+ top:

This aligns the first line of the surrounding text with the top of the image .

+ bottom:

This aligns the first line of the sueeonding text with the bottom of the image .

### Fi gure and Figure Caption
+ < figure> Images often come withcaptions. HTML5 has introduced a new < figure> element tocontain images and their caption so that the two are associated.You can have more than one image inside the < figure> element as long as they all share the same caption.
+  < figcaption> The < figcaption> element has been added to HTML5 in order to allow web page authors to add a caption to an image. Before these elements were created there was no way to associate an < img> element with its caption.


### Color

![](https://www.printpeppermint.com/wp-content/uploads/2019/11/cmyk-vs-rgb-hex-pms-panton-colors.jpg)
### Foreground Color

+ rgb values
These express collors in terms of how much red, green and blue are used to make it up. For example: rgb(100,100,90)

+ hex codes
These are six-digit codes that represent the amount of red, green and blue in a color, preceded by a pound or hash # sign. For example: #ee3e80

+ color names
There are 147 predefined color names that are recognized by browsers. For example: DarkCyan

+ background-color
CSS treats each HTML element as if it appears in a box, and the background-color property sets the color of the background for that box.

+ Hue
hue is often represented as a color circle where the angle represents the color.
![(https://lh3.googleusercontent.com/proxy/npMg3Dssbn1AVyMZFdTTZSV7lOKIOApQ8WRfC2e2dTF9KQxw8IkmY3BSu_zLEVrm3Y1y6oTXP31J5mE-_9T0lpeIMWfov71qSdxcdTFeZQ) ]
+ Saturation
is the amount of gray in a color. Saturation is represented as a percentage. 100% is full saturation and 0% is a shade of gray.

+ lightness
Lightness is the amount of white (lightness) or black (darkness) in a color. 


### Text
+ The properties that allow you to control the appearance of text can be split into two groups: Those that directly affec

+ the font and its appearance (including the typeface, whether it is regular, bold or italic,and the size of the text)
Those that would have the same effect on text no matter what font you were using (including the color of text and the spacing between
### Choosing a Typeface for your Website
+ Serif
+ Sans-Serif
+ Monospace
+ Cursive
+ Fantasy

### Type Scales
+ You may have noticed that programs such as Word, Photoshop and InDesign offer the same sizes of text.

### Unit of size types
![](https://www.programmersought.com/images/478/0018daee69d7ac5ee71ff3ce2fc8ab9e.png)
### Underline & Strike (text-decoration)
+ none This removes any decoration already applied to the text.
+ underline This adds a line underneath the text.
+ overline This adds a line over the top of the text.
+ line-through This adds a line through words.
+ blink This animates the text to make it flash on and off (however this is generally frowned upon, as it isconsidered rather annoying).

### Drop Shadow
text-shadow :The text-shadow property has become commonly used despite lacking support in all browsers. It is used to create a drop shadow, which is a dark version of the word just behind it and slightly offset.
