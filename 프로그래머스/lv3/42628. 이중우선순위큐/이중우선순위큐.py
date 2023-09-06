import heapq

def solution(operations):
    que = []
    answer = []
    variable = 0
    for o in operations:
        spell, num = o.split(' ')
        
        if spell == 'I':
            heapq.heappush(que,int(num))
            # print(que)
        elif spell == 'D' and que:    # 빈 큐라면 무시
            if num =='1':
                que.sort()
                que.pop()
            else:
                heapq.heappop(que)
            
    if que:
        # que.sort()
        # answer.append(que[-1])
        # answer.append(que[0])
        answer = [max(que),min(que)]
    else:
        answer = [0,0]
    tmptmp =[1,1]
    
    return answer