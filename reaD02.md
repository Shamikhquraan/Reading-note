
## summarizes the topics
### one by one :

![](https://www.fastweb.com/uploads/article_photo/photo/2036363/crop635w_memorize-this.jpg)

### Bold & Italic
+ b
By enclosing words in the tags -b- and -b- we can make
characters appear bold.

+ i
By enclosing words in the tags -i- and -i- we can make
characters appear italic.

### Superscript &Subscrip
+ -sup-
The -sup- element is used to contain characters thatshould be superscript such
 as the suffixes of dates or
mathematical concepts like raising a number to a power suchas 22.


+ -sub- with b not p
The -sub- element is used to contain characters that should
be subscript. It is commonly used with foot notes or chemical
formulas such as H20 .

### Line Breaks & Horizontal Rules:
+ -br-
As you have already seen, the browser will automatically show
each new paragraph or heading on a new line. But if you wanted
to add a line break inside the middle of a paragraph you can
use the line break tag -br- .

+ -hr-
To create a break between themes — such as a change of
topic in a book or a new scene in a play — you can add a
horizontal rule between sections using the -hr- tag .


### Strong & Emphasis
+ -strong-
The use of the -strong- element indicates that its
content has strong importance. For example, the words
contained in this element might be said with strong emphasis.

+ -em-
The -em- element indicates emphasis that subtly changes
the meaning of a sentence.

### Quotations:
+ -blockquote-
The -blockquote- element is used for longer quotes that take
up an entire paragraph. Note how the -p- element is still
used inside the -blockquote- element. 

+ -q-
The -q- element is used for shorter quotes that sit within
a paragraph. Browsers are supposed to put quotes around
the -q- element, howeverInternet Explorer does not —therefore 
many people avoid using the -q- element.

### Abbreviations & Acronyms :
+ -abbr-
 chapter-02/abbreviations.html HTMLIf you use an abbreviation or
an acronym, then the -abbr- element can be used. A title
attribute on the opening tag is used to specify the full term.

+ -cite-
When you are referencing a piece of work such as a book,
film or research paper, the -cite- element can be used
to indicate where the citation is from.

+ -dfn-
The first time you explain some new terminology (perhaps an
academic concept or some jargon) in a document, it is
known as the defining instance of it.

### Author Details :
+ -address- 
chapter-02/address.html HTML The -address- element has
quite a specific use: to contain contact details for the author of
the page.

+ -ins-
+ -del-
The -ins- element can be used to show content that has been
inserted into a document, while the -del- element can show text
that has been deleted from it. The content of a -ins- element
is usually underlined, while the content of a -del- element
usually has a line through it.

+ -s-
The -s- element indicates something that is no longer
accurate or relevant (but that should not be deleted).
Visually the content of an -s-.

### Summary:
TEXT
+ X HTML elements are used to describe the structure ofthe page (e.g. headings, subheadings, paragraphs).
+ X They also provide semantic information (e.g. whereemphasis should be placed, the definition of any
acronyms used, when given text is a quotation).

![](https://spaces-wp.imgix.net/2016/06/coding-in-the-classroom.png?auto=compress,format&q=50)

### Definition Lists: 
+ -dl-
The definition list is created with the -dl- element and usually
consists of a series of terms and their definitions.
Inside the -dl- element you will usually see pairs of -dt- and
-dd- elements.

+ -dt-
This is used to contain the term being defined (the definition
term).

+ -dd-
This is used to contain the definition. Sometimes you might see a list
where there are two terms used for the same definition or two
different definitions for the same

### Summary:
+ X There are three types of HTML lists: ordered, unordered, and definition.
+ X Ordered lists use numbers.
+ X Unordered lists use bullets.
+ X Definition lists are used to define terminology.
+ X Lists can be nested inside one another.

![](https://techgenix.com/tgwordpress/wp-content/uploads/2018/08/learn-coading-free-1024x711.jpg)

### Form Structure
+ -form-
Form controls live inside a -form- element. This element should always carry the action 
attribute and will usually have amethod and id attribute too.
action
Every -form- element requires an action attribute. Its value is the URL for the page on 
the server that will receive the information in the form when it is submitted.

### TEXT INPUT :
+ -input-
The -input- element is used to create several different form
controls. The value of the type attribute determines what kind
of input they will be creating.
type="text"
When the type attribute has a value of text, it creates a single type.

### Password Input :
 +-input-
type="password" When the type attribute has
a value of password it creates a text box that acts just like a
single-line text input, except the characters are blocked out.
They are hidden in this way so that if someone is looking over
the user's shoulder, they cannot see sensitive data such as
passwords.

### Text Are:
+ -textarea-
The -textarea- element is used to create a mutli-line
text input. Unlike other input elements this is not an empty
element. It should therefore have an opening and a closing tag.
Any text that appears between the opening -textarea- and
closing -textarea- tags will appear in the text box when the
page loads.


### Radio Button :
+ -input-
type="radio"
Radio buttons allow users to pick just one of a number of options.
The name attribute is sent tothe server with the value of the
option the user selects. When a question provides users with
options for answers in the form of radio buttons, the value of
the name attribute should be the same for all of the radio buttons
used to answer that question.

### Checkbox :
+ type=checkbox
Checkboxes allow users to select (and unselect) one or more
options in answer to a question The name attribute is sent to
the server with the value of the option(s) the user selects. When
a question provides users with options for answers in the form
of checkboxes, the value of the name attribute should be the
same for all of the buttons that answer that question.

![](https://www.goodcore.co.uk/blog/wp-content/uploads/2019/08/what-is-coding.png)


### Drop Down List Box :
-select-
A drop down list box (also known as a select box) allows
users to select one option from a drop down list.
The -select- element is used to create a drop down list box. It
contains two or more -option- elements. 

### Multiple Select Box :
+ -select-
size
You can turn a drop down select box into a box that shows more
than one option by adding the size attribute. Its value should
be the number of options you want to show at once. In the
example you can see that three of the four options are shown.

### File Input Box :
+ -input-
If you want to allow users to upload a file (for example an
image, video, mp3, or a PDF), you will need to use a file input
box. type="file".

## Submit Button :
+ -input-
type="submit" The submit button is used tosend a form to the
 server.name It can use a name attribute but it does not need 
 to have one.

 ### Image Button :
 + -input-
type=-image-
If you want to use an image for the submit button, you can givethe
type attribute a value ofimage. The src, width, height,
and alt attributes work just like they do when used with the
-img- element (which we sawon pages 99-100) .

### Button & hidden Controls :
-button-
The -button- element was introduced to allow users more
control over how their buttons appear, and to allow other
elements to appear inside the button.
This means that you can combine text and imagesbetween the 
opening -button- tag and closing -button- tag.

### Labelling Form Controls:
+ -label-
When introducing form controls, the code was kept simple by
indicating the purpose of each one in text next to it. However,
each form control should have its own -label- element as this 
makes the form accessible to vision-impaired users.

### Grouping Form Elements :
+ -fieldset-
You can group related form controls together inside the
-fieldset- element. This is particularly helpful for longer
forms.
Most browsers will show the fieldset with a line around
the edge to show how they are related. The appearance of these
lines can be adjusted using CSS.

+ -legend-
The -legend- element can come directly after the opening
-fieldset- tag and contains acaption which helps identify the
purpose of that group of formcontrols.


### HTML5: Form Validation:
You have probably seen forms on the web that give users
messages if the form control has not been filled in correctly; this is
known as form validation. Traditionally, form validation
has been performed using JavaScript (which is beyond the
scope of this book). But HTML5 is introducing validation and
leaving the work to the browser.

-**input**-
Many forms need to gather information such as dates, email addresses, and URLs.
 This has traditionally been done usingtext inputs.
HTML5 introduces new form controls to standardize the way that some information is
gathered.
 Older browsers that do not recognize these inputs will just treat them as a single
line text box.
type=-date-
If you are asking the user for a date, you can use an -input- element and give the
 type attribute a value of date.
This will create a date input inbrowsers that support the new HMTL5 input types.


### HTML5: Email & URL Input :
+ -input-
type="email"If you ask a user for an emailaddress, you can use the email
input.

type="url" A URL input can be used whenyou are asking a user for a web
page address

### HTML5: Search Input :
+ -input-
If you want to create a singleline text box for search queries,
HTML5 provides a special type of input for that purpose.
type="search" If you want to create a singleline text box for search
queries,HTML5 provides a special search input.

![](https://mlvh6ni7aque.i.optimole.com/wRx3UN4-cihKZiDK/w:387/h:211/q:90/rt:fill/g:ce/https://i0.wp.com/utssah.com/wp-content/uploads/2020/06/Top-5-Programming-languages-in-2020.png)

Summary
FORMS
+ X Whenever you want to collect information from visitors you will need a form, which lives inside a
     -form- element.
+ X Information from a form is sent in name/value pairs.
+ X Each form control is given a name, and the text the user types in or the values of the options they
 select are sent to the server.
+ X HTML5 introduces new form elements which make it easier for visitors to fill in forms.


## And,

+ ### HTML5: Adding HTML5 Audio to Your Pages.
+ ### HTML5: Multiple Audio Sources .

### finaly introducing to css ..

**end**

