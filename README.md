# android_mvvm_base 입니다 

<img src = "https://miro.medium.com/v2/resize:fit:1400/format:webp/1*FB931aBGoALv3OLY5LSRGg.png" width="80%" height = "50%">

해당 프로젝트는 Kotlin을 사용합니다.

해당 프로젝트는 MVVM패턴 사용을 합니다. 

해당 디자인 패턴에서 ViewModel의 경우 Android Jetpack의 ViewModel을 사용합니다.

화면 전환(Fragment)의 경우 Android Jetpack의 Navigation을 이용해 화면 전환을 합니다.

Jetpack Library의 LiveData의 경우 EventWrapper를 만들어서 LiveData와 함께 사용을 합니다. XML에서는 Databinding을 사용합니다.

또한 LiveData를 사용해 이벤트를 처리할 때 이벤트가 한번만 들어오는게 아닌 관찰이 될 때마다 직전의 값이 들어오는 중복이 문제를 해결하기 위해 EventWrapper를 만들어서 LiveData와 함께 쓰는 개념을 적용했습니다. 출처(https://medium.com/androiddevelopers/livedata-with-snackbar-navigation-and-other-events-the-singleliveevent-case-ac2622673150)

BaseActivity, BaseFragment에 viewLifecycleOwner를 넣지 않고 간편하게 쓸 수 있도록 커스텀 했습니다.

LiveData에 확장함수를 사용하여 실제로는 observe와 observeEvent라는 함수가 존재하지 않지만 LiveData 클래스를 확장하여 마치 클래스 안에 메서드를 구현해서 사용하는 것처럼 커스텀했습니다.

BaseActiviy, BaseFragment, BaseViewModel들을 사용해 이후 자주 사용하게 될 것 같은 기능을 해당 클래스들에서 관리 할 예정입니다.