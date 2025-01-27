FROM postgres:latest

# PostgreSQL 환경변수 설정
ENV POSTGRES_DB=blog
ENV POSTGRES_USER=postgres
ENV POSTGRES_PASSWORD=postgres

# 타임존 설정
ENV TZ=Asia/Seoul

# tzdata 설치 및 타임존 설정
RUN apt-get update && apt-get install -y \
    postgresql-contrib \
    tzdata \
    && ln -sf /usr/share/zoneinfo/$TZ /etc/localtime \
    && echo "$TZ" > /etc/timezone \
    && rm -rf /var/lib/apt/lists/*

# 초기화 SQL 스크립트 복사 (필요시)
# TODO 첫 실행시 데이터베이스 초기화 스크립트 만들기
# COPY ./init.sql /docker-entrypoint-initdb.d/init.sql

# 포트 설정 (PostgreSQL 기본 포트는 5432)
EXPOSE 5432

# 데이터 디렉토리 설정 (볼륨 설정)
VOLUME ["/var/lib/postgresql/data"]
