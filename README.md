# android_mvvm_base 입니다 

## 사용기술
본 프로젝트는 Kotlin을 사용합니다.

본 프로젝트는 MVVM패턴 사용을 지양 합니다. 

해당 디자인 패턴에서 ViewModel의 경우 Android Jetpack의 ViewModel을 사용합니다.

화면 전환(Fragment)의 경우 Android jetpack의 navigation을 이용해 화면 전환을 하는 것을 지양합니다.

UI와 ViewModel의 데이터의 상태관리의 경우 LiveData를 사용해 관리합니다. 또한 Xml에서는 DataBing을 사용합니다.

BaseActiviy, BaseFragment, BaseViewModel 들을 사용해 이후 자주 사용하게 될 것 같은 기능을 해당 클래스들에서 관리 할 예정입니다.

