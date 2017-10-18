Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:


	allprojects {
		repositories {
			...
			maven { url 'https://www.jitpack.io' }
		}
	}


Step 2. Add the dependency


	dependencies {
	        compile 'com.github.ithuangqing:ItHqSimpleTabLyout:v1.1'
	}
