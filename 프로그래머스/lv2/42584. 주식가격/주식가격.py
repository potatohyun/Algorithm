def solution(prices):
    answer = []
    for i in range(len(prices)):
        cnt = 0
        if i == len(prices)-1:
            answer.append(cnt)
        else:
            st = prices[i]
            flag = 0 # 도중에 끊기는지 끝까지 가는지
            for j in range(i+1,len(prices)):
                # print(i,j)
                if st <= prices[j]:
                    cnt += 1
                else:
                    flag = 1
                    break
            if flag == 1:
                cnt += 1             
            answer.append(cnt)
            
    return answer