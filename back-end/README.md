# back-end

# AWS EC2 PostgreSQL Install & Config

AWS EC2 instance impormation

Free Tier EC2
* VCPU 1
* RAM 2G
* Storage 8G
    
Network    
* public IP 3.37.xx.xxx    
* private IP 172.31.xx.xxx

OS    
* Ubuntu 18.04 LTS    
    
user ID    
* ID : ubuntu     

# How to connect ssh on AWS EC2 instance?
참고링크 : [https://docs.aws.amazon.com/ko_kr/AWSEC2/latest/UserGuide/putty.html]

1. 인스턴스가 준비되었는지 확인  
    * AWS 계정주인이 인스턴스 실행 중인지 확인, 종료 시 인스턴스가 삭제되니 유의할것
2. Putty 설치
3. PuttyGen을 사용하여 프라이빗 키 변환    
    * PuttyGen RSA check -> Load (your .pom file load) -> Save private key
4. .ppk 파일 열기
    * 파일 실행 시 오른쪽 밑 작업표시줄게 putty아이콘 추가된것을 확인
5. Putty 실행
    * 실행 후 public ip:22 로 연결

# PostgreSQL Install
참고링크 : [https://www.postgresql.org/download/linux/ubuntu/]

PostgreSQL port : Default-Port
