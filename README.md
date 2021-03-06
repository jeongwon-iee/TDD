# Test-Driven Development : By Example

> ***작동하는 깔끔한 코드 (clean code that works)*** 가 테스트 주도 개발의 궁극적인 목표다.

&nbsp;

### 🔖 아름다운 코드와 즐거운 개발을 위한 테스트 주도 개발

테스트 주도 개발은 테스트가 개발을 주도하는 방법이다.  

테스트가 개발을 주도한다는 것은 테스트가 코딩의 방향을 이끌어 간다는 말이다.

테스트를 실패하는 코드가 없으면 코딩을 하지 않고,  
코드 상에 중복이 있으면 제거한다는 간단한 규칙을 지켜나가면 자연스레 아름다운 코드가 펼쳐진다.

#### 테스트 주도 개발

단순한 두 가지 규칙만을 따른다.

- 어떤 코드건 작성하기 전에 실패하는 자동화된 테스트를 작성하라.
- 중복을 제거한다.


#### 작동하는 깔끔한 코드

- 예측 가능한 개발 방법이다. 끊임없이 발생할 버그에 대해 걱정하지 않고, 일이 언제 마무리 될 지 알 수 있다.
- 코드가 가르쳐주는 모든 교훈을 학습할 기회를 갖게 된다.
- 작성하는 동안 기분이 좋다.

#### 프로그래밍 순서

1. 빨강 - 실패하는 작은 테스트를 작성한다. 처음에는 컴파일조차 되지 않을 수 있다.
2. 초록 - 빨리 테스트가 통과하게끔 만든다. 이를 위해 어떤 *죄악* 을 저질러도 좋다.
3. 리팩토링 - 일단 테스트를 통과하게만 하는 와중에 생겨난 모든 중복을 제거한다.

**죄악 ) 기존 코드 복사해서 붙이기, 테스트만 간신히 통과하게끔 함수가 특정 상수를 반환하도록 구현하기 등*

&nbsp;

### 🔖 이 책에서 다루는 내용

- 1부. 자바로 다중 화폐 코드를 작성
- 2부. 파이썬으로 단위 테스팅 프레임워크 작성
- 3부. 테스트 주도 개발을 할 때 자주 등장하는 패턴들을 정리
- 부록. TDD 수련법, 실전 TDD

&nbsp;

### 🔖 index

#### 1부. 화폐 예제  

- [1장. 다중 통화를 지원하는 Money 객체](https://github.com/jeongwon-iee/TDD/blob/master/summary/1%EB%B6%80.%20%ED%99%94%ED%8F%90%20%EC%98%88%EC%A0%9C/01%EC%9E%A5.%20%EB%8B%A4%EC%A4%91%20%ED%86%B5%ED%99%94%EB%A5%BC%20%EC%A7%80%EC%9B%90%ED%95%98%EB%8A%94%20Money%20%EA%B0%9D%EC%B2%B4.md)  
- [2장. 타락한 객체](https://github.com/jeongwon-iee/TDD/blob/master/summary/1%EB%B6%80.%20%ED%99%94%ED%8F%90%20%EC%98%88%EC%A0%9C/02%EC%9E%A5.%20%ED%83%80%EB%9D%BD%ED%95%9C%20%EA%B0%9D%EC%B2%B4.md)  
- [3장. 모두를 위한 평등](https://github.com/jeongwon-iee/TDD/blob/master/summary/1%EB%B6%80.%20%ED%99%94%ED%8F%90%20%EC%98%88%EC%A0%9C/03%EC%9E%A5.%20%EB%AA%A8%EB%91%90%EB%A5%BC%20%EC%9C%84%ED%95%9C%20%ED%8F%89%EB%93%B1.md)  
- [4장. 프라이버시](https://github.com/jeongwon-iee/TDD/blob/master/summary/1%EB%B6%80.%20%ED%99%94%ED%8F%90%20%EC%98%88%EC%A0%9C/04%EC%9E%A5.%20%ED%94%84%EB%9D%BC%EC%9D%B4%EB%B2%84%EC%8B%9C.md)  
- [5장. 솔직히 말하자면](https://github.com/jeongwon-iee/TDD/blob/master/summary/1%EB%B6%80.%20%ED%99%94%ED%8F%90%20%EC%98%88%EC%A0%9C/05%EC%9E%A5.%20%EC%86%94%EC%A7%81%ED%9E%88%20%EB%A7%90%ED%95%98%EC%9E%90%EB%A9%B4.md)  
- [6장. 돌아온 '모두를 위한 평등'](https://github.com/jeongwon-iee/TDD/blob/master/summary/1%EB%B6%80.%20%ED%99%94%ED%8F%90%20%EC%98%88%EC%A0%9C/06%EC%9E%A5.%20%EB%8F%8C%EC%95%84%EC%98%A8%20'%EB%AA%A8%EB%91%90%EB%A5%BC%20%EC%9C%84%ED%95%9C%20%ED%8F%89%EB%93%B1'.md)  
- [7장. 사과와 오렌지](https://github.com/jeongwon-iee/TDD/blob/master/summary/1%EB%B6%80.%20%ED%99%94%ED%8F%90%20%EC%98%88%EC%A0%9C/07%EC%9E%A5.%20%EC%82%AC%EA%B3%BC%EC%99%80%20%EC%98%A4%EB%A0%8C%EC%A7%80.md)  
- [8장. 객체 만들기](https://github.com/jeongwon-iee/TDD/blob/master/summary/1%EB%B6%80.%20%ED%99%94%ED%8F%90%20%EC%98%88%EC%A0%9C/08%EC%9E%A5.%20%EA%B0%9D%EC%B2%B4%20%EB%A7%8C%EB%93%A4%EA%B8%B0.md)  
- [9장. 우리가 사는 시간](https://github.com/jeongwon-iee/TDD/blob/master/summary/1%EB%B6%80.%20%ED%99%94%ED%8F%90%20%EC%98%88%EC%A0%9C/09%EC%9E%A5.%20%EC%9A%B0%EB%A6%AC%EA%B0%80%20%EC%82%AC%EB%8A%94%20%EC%8B%9C%EA%B0%84.md)  
- [10장. 흥미로운 시간](https://github.com/jeongwon-iee/TDD/blob/master/summary/1%EB%B6%80.%20%ED%99%94%ED%8F%90%20%EC%98%88%EC%A0%9C/10%EC%9E%A5.%20%ED%9D%A5%EB%AF%B8%EB%A1%9C%EC%9A%B4%20%EC%8B%9C%EA%B0%84.md)  
- [11장. 모든 악의 근원](https://github.com/jeongwon-iee/TDD/blob/master/summary/1%EB%B6%80.%20%ED%99%94%ED%8F%90%20%EC%98%88%EC%A0%9C/11%EC%9E%A5.%20%EB%AA%A8%EB%93%A0%20%EC%95%85%EC%9D%98%20%EA%B7%BC%EC%9B%90.md)  

&nbsp;

### 용기

> 프로그래밍 하면서 나타나는 두려움  
*"정말 어려운 문제라서 시작 단계인 지금은 어떻게 마무리 될 지 알 수 없군"*

- 불확실한 상태로 있는 대신, 가능하면 재빨리 구체적인 학습을 하기 시작한다.
- 침묵을 지키는 대신, 좀 더 분명하게 커뮤니케이션 한다.
- 피드백을 회피하는 대신, 도움이 되고 구체적인 피드백을 찾는다.
- (자신의 나쁜 성깔을 직접 해결해야 한다.)
1. 단순하게 시작하고
2. 자동화된 테스트를 만들고
3. 새로운 설계 결정을 한 번에 하나씩 도입하기 위해 리팩토링을 할 준비한다.

