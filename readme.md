# 음악 플레이어
## 구현 기능
- 백그라운드에서 기능 실행
- 음원재생
- 디바이스 이벤트 캐치(네트워크 상태 변경, 전원연결, 배터리 사용량 체크)

## 기능
- MediaPlayer를 이용해 음원 재생
- service를 이용해 음원재생
- Notification에 음원 컨트롤러 제공
- broadcastReceiver를 이용해 LOW_BATTERY 이벤트 캐치

Android
- Media Player
- service
- Notification
  - PendingIntent
  - Intent flag
- BroadCastReceiver


## Service
#### 포그라운드 
사용자에게 잘 보이는 작업  
사용자가 앱과 상호작용 하지 않을 때도 계속 실행

#### 백그라운드
사용자에게 보이지 않은 작업

#### 바인드
바인딩된 서비스는 클라이언트 - 서버 인터페이스를 제공해서 구성요소가 서비스와 상호작용하게 하며, 결과를 받을 수 있고, 심지어 이와 같은 작업을 여러 프로세스에 걸쳐 프로세스 간 통신으로 수행 할 수 있다.
