# Floating Navigation View

A simple Floating Action Button that shows an anchored Navigation View

![Sample](https://raw.githubusercontent.com/andremion/Floating-Navigation-Views/master/art/sample.gif)

## Inspiration

This library was inspired by [Menu Material Fixed](http://www.uplabs.com/posts/menu-material-fixed) created by [Tommaso Poletti](http://www.uplabs.com/tomma5o)

## Installation

Include the library in your `build.gradle`

    dependencies{
        compile 'com.github.andremion:floatingnavigationview:1.0.0'
    }

or in your `pom.xml` if you are using Maven

    <dependency>
      <groupId>com.github.andremion</groupId>
      <artifactId>floatingnavigationview</artifactId>
      <version>1.0.0</version>
    </dependency>

## Usage

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

###Custom attributes

1. The menu resource to inflate and populate items from
`<attr name="menu" format="reference" />`
    
2. Layout resource to inflate as the header
`<attr name="headerLayout" format="reference" />`
    
3. If menu must be drawn below the FAB
`<attr name="drawMenuBelowFab" format="boolean" />`

You can explore more in [the sample](https://github.com/andremion/Floating-Navigation-View/tree/master/sample/src/main/java/com/andremion/floatingnavigationview/sample) 

## Libraries used in the project

* [Design Support Library](http://developer.android.com/intl/pt-br/tools/support-library/features.html#design)
The Design package provides APIs to support adding material design components and patterns to your apps.

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
