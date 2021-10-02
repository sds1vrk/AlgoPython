# 위장 문제

# 풀이
# 맵으로 구분 key, val로 나눠서
# key 존재 여부 확인은 in으로 확인
# 데이터 확장은 extend를 활용
# 수학 계산식, 경우의 수 (n+1)*(m+1) -1

# 알게 된점
# 1. key 존재 여부는 in으로 확인
#     -key in data.keys()

# 2. append와 extend의 차이점
#     - append
#         x=[1,2,3]
#         x.append([4,5])
#         result : [1,2,3,[4,5]]
#
#    - extend
#         x = [1, 2, 3]
#         x.extend([4, 5])
#         result: [1, 2, 3, 4, 5]

# 3 extend는 return 값이 none이다. -> 따라서 그냥 다시 넣어야 함.

# 4. dictionary에 value값 추가는 키 값을 따로 부를 필요 없이 extend나 append를 이용해서 추가하면 된다.
#     - ex) "a"=[1,2,3]
        # -> 여기에 b=[4,5]라는 데이터 추가
        # -> vals=data["a"]
            # vals.append(b) // 데이터 확장
        # -> data["a"]=vals //를 할필요 없음

def solution(clothes):

    data = dict()
    for i in clothes:
        key = i[1]
        val = [i[0]]
        # 만약 키가 있으면 기존 거에 확장
        if key in data.keys():
            # 기존것
            vals = data.get(key)
            # 결과값을 리턴 하지 않는다.
            # temp=vals.extend(val)
            # data[key]=temp
            # data[key]=vals // 데이터를 다시 넣을 필요 없음.

        #  확장 값을 다시 data[key]에 넣을 필요 없음 // 그냥 extend로 하면 data안에 알아서 확장
            vals.extend(val)


        else:
            data[key] = val
            # print("data",data)

    # print(data)
    # item
    answer =1
    for i in data.keys():
        item= len(data[i])
        answer*=(item+1)

    answer-=1

    print(answer)

    return answer

solution([["yellowhat", "headgear"], ["bluesunglasses", "eyewear"], ["green_turban", "headgear"]])