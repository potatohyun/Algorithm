import heapq

def solution(operations):
    que = []
    answer = []
    variable = 0
    for o in operations:
        spell, num = o.split(' ')
        
        if spell == 'I':
            heapq.heappush(que,int(num))
        elif spell == 'D' and que:    # 빈 큐라면 무시
            if num =='1':
                que.pop()
            else:
                heapq.heappop(que)
            
    if que:
        # answer.append(que[-1])
        # answer.append(que[0])
        answer.append(max(que))
        answer.append(min(que))
    else:
        answer = [0,0]
    # print(answer)
    
    return answer