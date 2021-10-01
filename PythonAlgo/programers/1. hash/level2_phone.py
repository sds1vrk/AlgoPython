# 처음 시도 - 정답은 맞지만 효율성에서 시간 초과 발생
#     - 해결법? 자료구조 이용


def solution(phone_book):
    answer = True


    # 방법 1 (시간 초과)
    # phone_book.sort()
    # for i in range(len(phone_book)):
    #     for j in range( i +1 ,len(phone_book)):
    #         if phone_book[j].startswith(phone_book[i]):
    #             return False

    # 방법 2 (sort를 이용하여 바로 앞만 확인)
    # phone_book.sort()
    # for i in range(len(phone_book)-1):
    #     if phone_book[i+1].startswith(phone_book[i]):
    #         answer=False

    # 방법 3. (해시를 이용)
    data = dict()
    for i in phone_book:
        data[i] = 1

    for num in phone_book:
        temp = ""
        for j in num:
            temp += j
            if temp in phone_book and temp != num:
                answer = False



    return answer