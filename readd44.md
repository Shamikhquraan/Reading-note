# Kinesis & Analytics

* With Amazon Kinesis, you can ingest real-time data such as video, audio, application logs, website clickstreams, and IoT telemetry data for machine learning, analytics, and other applications. Amazon Kinesis enables you to process and analyze data as it arrives and respond instantly instead of having to wait until all your data is collected before the processing can begin.

**Set up Analytics backend**

Run the following command in your project's root folder:

     amplify add analytics

     ? Select an Analytics provider (Use arrow keys)
     `Amazon Pinpoint`
     ? Provide your pinpoint resource name: 
     `yourPinpointResourceName`
     ? Apps need authorization to send analytics events. Do you want to allow guests and unauthenticated users to send analytics events? (we recommend you allow this when getting started) 
     `Yes`

**Install Amplify Libraries**
Add Analytics by adding these libraries into the dependencies block:
       dependencies {
      // Add these lines in `dependencies`
      implementation 'com.amplifyframework:aws-analytics-pinpoint:1.24.0'
     implementation 'com.amplifyframework:aws-auth-cognito:1.24.0'
     }

**Initialize Amplify Analytics**    

Add the following code to your onCreate() method in your application class:

          public class MyAmplifyApp extends Application {
         @Override
         public void onCreate() {
         super.onCreate();

         try {
            // Add these lines to add the AWSCognitoAuthPlugin and AWSPinpointAnalyticsPlugin plugins
            Amplify.addPlugin(new AWSCognitoAuthPlugin());
            Amplify.addPlugin(new AWSPinpointAnalyticsPlugin(this));
            Amplify.configure(getApplicationContext());

            Log.i("MyAmplifyApp", "Initialized Amplify");
          } catch (AmplifyException error) {
            Log.e("MyAmplifyApp", "Could not initialize Amplify", error);
           }
          }
         }