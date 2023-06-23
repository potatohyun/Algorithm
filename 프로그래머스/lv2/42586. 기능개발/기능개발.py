import math
from collections import deque

def solution(progresses, speeds):
    answer = []
    stan = 0 # 가장 앞의 남은 작업량
    cnt = 0 # 쌓인 배포
    
    for p in range(len(progresses)):
        # progresses[p] = math.ceil((100 - progresses[p])/speeds[p])
        tmp = math.ceil((100 - progresses[p])/speeds[p])
        if stan == 0:
            stan = tmp
            cnt += 1
        elif stan < tmp:
            answer.append(cnt)
            stan = tmp
            cnt = 1
        else:
            cnt += 1
        if p == len(progresses)-1:
            answer.append(cnt)
        
    
    # pro = deque(progresses)
    
    
    return answer