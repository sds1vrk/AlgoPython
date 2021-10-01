# 해결 방법
# 1. sort를 이용한 해결법
#     - comple, parti를 sort
#     - for문을 돌면서 comple[i]와 parti[i]가 맞지 않으면 break
#         ex) {eden, leo, kiki} {eden, kiki}
#     - 다 돌았는데도 break에 걸리지 않으면 parti에 마지막 인자값이 정답 (for else)
#
#  주의점은 completion의 길이만큼 for문을 돌아야 함. comple=parti-1 이기 때문에 마지막 i 가 못들어감

# 2. hash를 이용한 해결법
#         - parti에 대해 hashMap을 만든다
#             {eden=2, leo=1, kiki=1}
#         - comple에 빼준다.
#             {eden=1, leo=0, kiki=0}
#
#         - value가 0이 아닌 값이 정답


def solution1(participant, completion):
    participant.sort()
    completion.sort()

    answer = ''
    for i in range(len(completion)):
        if participant[i] != completion[i]:
            answer = participant[i]
            break;

    else:
        answer = participant[len(participant) - 1]

    # print(answer)

    return answer


def solution2(participant, completion):
    answer = ''
    data = dict()
    for i in participant:
        if i in data.keys():
            v = data[i]
            data[i] = v + 1

        else:
            data[i] = 1

    for i in completion:
        v = data[i]
        data[i] = v - 1

    for k, v in data.items():
        if v != 0:
            answer = k

    return answer
