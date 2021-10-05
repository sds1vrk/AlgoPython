# 풀이
# 1. [7,70,45] // [1,30,5] (반올림) ->[7,3,9] 로 만들기
# 2. queue를 이용
#     - 2-1. 큐에서 1개 꺼냄
#     - 2.2 꺼낸 데이터가 다음 큐의 데이터 보다 작으면 (for)
#         cnt+=1
#     - 2.3 크면 break
#     - 2.4 answer.append(cnt)
#
# 방법 1. 다음 꺼를 인덱스로 확인하고 비교한 다음에 빼는 방법
# 방법 2. 미리 뽑고 다음에 조건에 안 맞으면 다시 넣는 방법
#
# 알게 된 점
# - /는 소수점 포함 나눗셈 7/3 =2.333
# - //는 몫 (모듈려) 7//3 =2
# - %는 나머지
# - 파이썬은 큐의 인덱스 접근 및 insert 메소드를 이용하여 인덱스로 삽입이 가능

import math
from collections import deque


def solution(progresses, speeds):

    queue=deque()
    # 1.
    for i in range(len(progresses)):
        val = math.ceil((100 - progresses[i]) / speeds[i])
        queue.append(val)

    answer = []
    # 2. queue
    while queue:
        data=queue.popleft()
        cnt=1

        # 방법 1
        # while queue:
        #     next = queue[0]
        #     if check >= next:
        #         queue.popleft()
        #         cnt += 1
        #
        #     else:
        #         break

        # 방법 2
        while queue:
            next=queue.popleft()
            if data>=next:
                cnt+=1

            else :
                queue.insert(0,next)
                break



        answer.append(cnt)

    print(answer)

    return answer

solution([93, 30, 55],[1, 30, 5])