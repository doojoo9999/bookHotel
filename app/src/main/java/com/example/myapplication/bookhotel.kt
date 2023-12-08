package com.example.myapplication

fun main() {
    println("호텔예약 프로그램 입니다.")
    println("[메뉴]")
    println("1. 방예약")
    println("2. 예약목록 출력")
    println("3. 예약목록 (정렬) 출력")
    println("4. 시스템 종료")
    println("5. 금액 입금-출금 내역 목록 출력")
    println("6. 예약 변경/취소")

    val select1 = readLine()!!.toInt()

    if (select1 == 1) {

        println("예약자분의 성함을 입력해 주세요.")
        var name = readLine()!!.toString()
        while (true) {
            println("예약할 방 번호를 입력해 주세요.")
            var roomnumber = readLine()!!.toInt()
            if (roomnumber in 100..999) {
                break
            } else {
                println("올바르지 않은 방번호 입니다. 방번호는 100~999 영역 이내입니다.")
            }
        }

        println("체크인 날짜를 입력해 주세요. (표기원칙 20230631)")
        var checkin = readLine()!!.toInt()

        while (true) {
            println("체크아웃 날짜를 입력해 주세요. (표기원칙 20230631)")
            var checkout = readLine()!!.toInt()
            if (checkout > checkin) {
                break
            } else {
                println("체크인 날짜보다 이전이거나 같을 수는 없습니다.")
            }
        }

            println("호텔 예약이 완료되었습니다.")
        }
    }

