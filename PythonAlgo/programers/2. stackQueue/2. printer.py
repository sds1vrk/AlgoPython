# 풀이 방법
# 1. enumerate로 [인덱스, 데이터]로 만들고 queue에 넣기
# 2. check 함수만들기, 뽑은 데이터보다 더 큰 데이터가 있는지 확인하는 함수
# 3. 큐
#     3-1. 만약 check()가 true이라면 맨 뒤에 넣기
#     3-2. false 출력하고 몇번째로 출력되는지 알기 위해 answer 증가시키기
#             idx하고 주어진 location이 맞으면 break로 종료하기

# 알게 된 점
# - enumerate

from collections import deque


def solution(priorities, location):
    # 1. enumerate로 [인덱스, 데이터]로 만들고 queue에 넣기
    queue = deque()
    for idx, pri in enumerate(priorities):
        temp = [idx, pri]
        queue.append(temp)

    print(queue)

    # 2. check 함수만들기, 뽑은 데이터보다 더 큰 데이터가 있는지 확인하는 함수
    def check(val):
        for idx, data in queue:
            if val < data:
                return True

        else:
            return False


    answer = 0
    # 3. 큐
    while queue:
        idx, val = queue.popleft()
        pan = check(val)
        # 3-1. 만약 check()가 true이라면 맨 뒤에 넣기
        if pan:
            queue.append((idx, val))
        # 3-2. false 출력하고 몇번째로 출력되는지 알기 위해 answer 증가시키기, idx하고 주어진 location이 맞으면 break로 종료하기
        else:
            answer += 1
            if idx == location:
                break

    print(answer)

    return answer