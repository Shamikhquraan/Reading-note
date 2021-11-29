## Amazon S3

- **what is S3 ?** storage for the Internet. designed to make web-scale computing easier. we can use it to store any amount of data and retrieve it at anytime on the web.

so basically it aims to increase the benefits of the scale so the delevopers can get benefit from it.

![](https://d1m75rqqgidzqn.cloudfront.net/wp-data/2020/08/26100437/S3-1024x514.png)


### Advantages od using S3
- Creating buckets.
- storing data.
- downloading data
- permissions.
- Standard Interface.

**the concept terminology of amazon S3** is it consist of :

### Buckets
- which is the container of the object.

- The main adv of it to organize Amazon S3.
- identify the responsible account for the storage.

### Objects
- they are the entities of Amazon S3. and they consist of objects and metadata.

### Keys
- it's the unique identifier for the obj withinthe bucket.

### Get started
### S3 with Amplify
* Install Amplify Libraries dependencies {

implementation 'com.amplifyframework:aws-storage-s3:1.17.4' implementation 'com.amplifyframework:aws-auth-cognito:1.17.4' }

* Initialize Amplify Storage To initialize the Amplify Auth and Storage categories you call Amplify.addPlugin().