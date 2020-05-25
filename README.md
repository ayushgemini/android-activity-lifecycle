# android-activity-lifecycle
Android Activity Lifecycle is controlled by 7 methods of android.app.Activity class. The android Activity is the subclass of ContextThemeWrapper class.  An activity is the single screen in android.  By the help of activity, you can place all your UI components or widgets in a single screen. The 7 lifecycle method of Activity describes how activity will behave at different states.

Hello folks, how are you doing? So today we are going to discuss what is Android Activity Lifecycle and how you can implement it in android. You need to take care of these activity life cycle when you will develop any android application.

[![IMAGE ALT TEXT HERE](https://img.youtube.com/vi/zRr3PlJd8tE/0.jpg)](https://youtu.be/zRr3PlJd8tE)

## Usage

```java
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate InVoked");
    }

    @Override
    public void onStart(){
        super.onStart();

        Log.d(TAG, "onStart InVoked");
    }

    @Override
    public void onResume(){
        super.onResume();

        Log.d(TAG, "onResume InVoked");
    }

    @Override
    public void onPause(){
        super.onPause();

        Log.d(TAG, "onPause InVoked");
    }

    @Override
    public void onStop(){
        super.onStop();

        Log.d(TAG, "onStop InVoked");
    }

    @Override
    public void onRestart(){
        super.onRestart();

        Log.d(TAG, "onRestart InVoked");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();

        Log.d(TAG, "onDestroy InVoked");
    }

      
© 2020 GitHub, Inc.
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.
