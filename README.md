[![Android Arsenal Floating-Navigation-View](https://img.shields.io/badge/Android%20Arsenal-Floating--Navigation--View-green.svg?style=true)](https://android-arsenal.com/details/1/4134)
[![License Apache 2.0](https://img.shields.io/badge/License-Apache%202.0-blue.svg?style=true)](http://www.apache.org/licenses/LICENSE-2.0)
![minSdkVersion 21](https://img.shields.io/badge/minSdkVersion-21-red.svg?style=true)
![compileSdkVersion 24](https://img.shields.io/badge/compileSdkVersion-24-yellow.svg?style=true)
![maven-central](https://img.shields.io/maven-central/v/com.github.andremion/floatingnavigationview.svg)
# Floating Navigation View

A simple Floating Action Button that shows an anchored Navigation View and was inspired by [Menu Material Fixed](http://www.uplabs.com/posts/menu-material-fixed) created by [Tommaso Poletti](http://www.uplabs.com/tomma5o)

![Sample](https://raw.githubusercontent.com/andremion/Floating-Navigation-View/master/art/sample.gif)

## Installation

Include the library in your `build.gradle`

```groovy
dependencies{
    compile 'com.github.andremion:floatingnavigationview:1.0.0'
}
```

or in your `pom.xml` if you are using Maven

```xml
<dependency>
  <groupId>com.github.andremion</groupId>
  <artifactId>floatingnavigationview</artifactId>
  <version>1.0.0</version>
  <type>aar</type>
</dependency>
```

## Usage

```xml
<?xml version="1.0" encoding="utf-8"?>
<android.support.design.widget.CoordinatorLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:fitsSystemWindows="true">

    ...

    <com.andremion.floatingnavigationview.FloatingNavigationView
        android:id="@+id/floating_navigation_view"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_margin="@dimen/fab_margin"
        app:layout_anchor="@id/toolbar"
        app:layout_anchorGravity="bottom|end"
        app:drawMenuBelowFab="true"
        app:headerLayout="@layout/navigation_view_header"
        app:menu="@menu/menu_navigation_view" />

</android.support.design.widget.CoordinatorLayout>
```

###Custom attributes

1. The menu resource to inflate and populate items from
`<attr name="menu" format="reference" />`
    
2. Layout resource to inflate as the header
`<attr name="headerLayout" format="reference" />`
    
3. If menu must be drawn below the FAB
`<attr name="drawMenuBelowFab" format="boolean" />`

## Libraries and tools used in the project

* [Design Support Library](http://developer.android.com/intl/pt-br/tools/support-library/features.html#design)
The Design package provides APIs to support adding material design components and patterns to your apps.
* [VectAlign](https://github.com/bonnyfone/vectalign)
VectAlign is a developer's tool which aligns two VectorDrawable "pathData" strings (or SVG images) in order to allow morphing animations between them using an AnimatedVectorDrawable.

### License

    Copyright 2016 André Mion

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
