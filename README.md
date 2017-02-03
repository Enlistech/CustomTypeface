# Custom Typeface

[![](https://jitpack.io/v/TheBrownArrow/CustomTypeface.svg)](https://jitpack.io/#TheBrownArrow/CustomTypeface)

<img src="https://github.com/thebrownarrow/CustomTypeface/blob/master/screenshot.png" alt text="Screenshot" width="240" height="427" />


## Set Custom Font in Android

Custom-Typeface is a library to add custom fonts in android. By using this library you can easily set custom font on `TextView`, `EditText`, `Button`, `CheckBox`, `RadioButton` and `AutoCompleteTextView` and other wedget in android.
You can set custom typeface easily in `XML`


# Installation

### To get a Git project into your build:

**Step 1.** Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:
```java
    allprojects {
        repositories {
        ...
        maven { url 'https://jitpack.io' }
        }
    }
```
**Step 2.** Add the dependency
```java
    dependencies {
        compile 'com.github.TheBrownArrow:CustomTypeface:1.0'
    }
```


# Usage

First of all add you custom font in your assets folder under main directory. or assets->fonts under main directory.

**Add custom font inside `XML`**
```xml
// If your custom font is inside assets->fonts then use this one
<string name="font_open_sans_light" translatable="false">fonts/OpenSans-Light.ttf</string>
// If your custom font is inside assets then use this one
<string name="font_open_sans_light" translatable="false">OpenSans-Light.ttf</string>

<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    ...
    >
    ...
    <com.thebrownarrow.customfont.CustomFontTextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:padding="6dp"
        android:text="@string/app_name"
        android:textSize="30sp"
        app:custom_font="@string/font_open_sans_light" />
        ...
    <com.thebrownarrow.customfont.CustomFontTextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:padding="6dp"
        android:text="@string/app_name"
        android:textSize="30sp"
        app:custom_font="OpenSans-Light.ttf" />
        ...
        </LinerLayout>
  ```


# License

```
Copyright © 2017 by The Brown Arrow

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
