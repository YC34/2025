
# 3. Database

- **역할**:
  - **데이터 저장 및 관리**: 모든 데이터(사용자, 게시글, 댓글 등)를 저장하고 관리하는 역할을 합니다.

- **기술 스택**:
  - **PostgreSQL**: 관계형 데이터베이스 관리 시스템(RDBMS)
  - **Dockerfile**:
  - DB를 **Docker** 이미지화하여 환경에 맞는 빠르고 일관된 배포가 가능합니다.
  - **Docker Compose**를 사용하여 여러 서비스(DB, 앱 등)를 하나의 파일로 관리할 수 있습니다.
  - **scaleUP / scaleDown**: Docker의 `docker-compose.yml` 파일을 통해 DB 컨테이너의 수를 동적으로 확장하거나 축소할 수 있습니다.

## TODO
- **자동 백업**: PostgreSQL 데이터를 주기적으로 백업하는 자동화 스크립트 설정 (예: `pg_dump`와 cron 작업을 활용)
- **자동 배포**: CI/CD 파이프라인을 통해 데이터베이스 업데이트 및 배포 자동화 (예: GitHub Actions, Jenkins 등을 사용하여 데이터베이스 스키마 변경 시 자동 배포)
