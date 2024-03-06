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
