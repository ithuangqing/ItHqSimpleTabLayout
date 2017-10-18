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
	        compile 'com.github.ithuangqing:ItHqSimpleTabLyout:v1.4'
	}

# 使用

### 添加Tab名称

```
mTitle = ItHqAddTile.addTile("tab1","tab2");
```

注：可以自由添加任意个页面名称，此方法返回一个List<String>。

### 添加Fragment

```
 mFragment = ItHqAddFragment.addFragment(new Fragment(),new Fragment2());
```

注：同样可以添加任意个Fragment，要与添加的Tab数量相同，此方法返回List<Fragment>。

### 最后一步，生成tab滑动页面

```
ItHqAddTab.addTab(mTabLayout,mViewPager,mFragment,mTile,getSupportFragmentManager());
```

此处注意最后一个参数，我们使用的是v4下的Fragment。



