## Testing android gradle jar dependency in java library project ##

The main module (android application) has a dependency on a pure java library, which in fact has 
'jar' dependency on Gson.

The application compiles fine but when being run the application crashes:

```
java.lang.NoClassDefFoundError: com.google.gson.Gson
    at com.example.JavaLibClass.javaMethod(JavaLibClass.java:7)
    at com.denisk.deptest.MainActivity.onCreate(MainActivity.java:15)
    at android.app.Activity.performCreate(Activity.java:5135)
```

If Gson dependency is removed from `javalib` module and put into main `app` module it works as expected.