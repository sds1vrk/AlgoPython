# 풀이 방법
# 1. 데이터 분리하기 key value를 이용
# 2. 데이터 정렬 - lambda 이용
# 3. 데이터 2개씩 꺼내기
#
# 알게 된점
# 1. dict를 이용하여 데이터 저장
#   - value 저장할떄는 리스트로 저장
#
# 2. dict data 정렬 : 람다를 이용한 데이터 정렬
#     - sorted(data.items(),key=lambda x:(x[1]),reverse=True)  // 1번인덱스 기준

def solution(genres, plays):
    data = dict()
    #     1. 데이터 정렬
    for idx, play in enumerate(plays):
        key = genres[idx]
        value = [play, idx]  # value는 리스트로 저장될것이기 때문에 리스트로 저장

        if key in data.keys():
            data[key].append(value)

        else:
            data[key] = [value]

    print(data)
    # {'classic': [[500, 0], [150, 2], [800, 3]], 'pop': [[600, 1], [2500, 4]]}

    #     2. value를 오름차순, 내림차순으로 sort하기
    #         - 0번 인덱스는 내림차순, 1번 인덱스는 오름차순 -> key=lambda를 이용
    for i in data.keys():
        val = data[i]
        sort_data = sorted(val, key=lambda x: (x[0], -x[1]), reverse=True)
        data[i]=sort_data

    print(data)
    # {'classic': [[800, 3], [500, 0], [150, 2]], 'pop': [[2500, 4], [600, 1]]}

    # 3. 장르 선택하기 -> 총합의 데이터 추가
    for i in data.keys():
        val=data[i]
        hap=0
        for k in val:
            hap+=k[0]

        data[i].append(hap)

    print(data)
    # {'classic': [[800, 3], [500, 0], [150, 2], 1450], 'pop': [[2500, 4], [600, 1], 3100]}


    # 4. data의 value의 마지막 인덱스(총합)을 기준으로 내림차순 정렬
    # x[1][-1] -> 1450, 3100을 의미 -> 1번 인덱스의 마지막
    print(data.items())
    result=sorted(data.items(), key=lambda x:x[1][-1], reverse=True)
    print("result",result)


    answer=[]
    # result 값 가공하기 -> 앞에 2개 장르 선택하고
    for i in result:
        temp=[]
        length=i[1]
        print("length",len(length))
        for j in range(len(length)-1):
            val=i[1][j]
            temp.append(val[1])

            if len(temp)==2:
                break

        answer.extend(temp)
    print(answer)

    answer = []
    return answer


solution(["classic", "pop", "classic", "classic", "pop"],[500, 600, 150, 800, 2500])