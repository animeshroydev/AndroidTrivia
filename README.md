AndroidTrivia
============================

Finished code for Android Kotlin Fundamentals codelab(Navigation)

Introduction
------------

The AndroidTrivia app asks the user trivia questions about Android development.
It makes use of the navigation component within Jetpack to move the user between
screens. Each screen is implemented as a fragment.

The app navigates using buttons, the app bar, and a navigation drawer. Because
students haven't yet learned about saving data or the Android lifecycle, the app
tries to eliminate bugs caused by configuration changes.

Prerequisites
-------------

Things that I learned from this App:
- Data Binding.
- Added a fragment inside activity_main.
- Added navigation component, create navHostFragment , create nav graph
- Add fragment to nav graph, connect two fragment with action
- Conditional navigation
- Modified "pop behaviour" of system back button
- Add up back button using NavigationUI in action bar
- Add an option menu in action bar (three dot)
- Add navigation drawer using NavigationUI
- Pass data/values between fragment using Safe Args(Key-value) (alternative of bundle)
- Use of implicit intent (share score with friends)


License
-------

Copyright 2019 Google, Inc.

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements.  See the NOTICE file distributed with this work for
additional information regarding copyright ownership.  The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License.  You may obtain a copy of
the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
License for the specific language governing permissions and limitations under
the License.