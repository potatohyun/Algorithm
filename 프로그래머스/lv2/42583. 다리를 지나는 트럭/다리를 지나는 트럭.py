# from collections import deque
from collections import deque
def solution(bridge_length, weight, truck_weights):
    answer = 0
    que = deque(truck_weights)
    bridge = deque([0]*bridge_length)
    
    sum = 0
    while bridge or que:
        sum -= bridge.popleft()
        # truck_weights는 없고, bridge 남은 경우
        # 무게 초과한 경우
        if que:
            if (sum + que[0]) > weight:
                bridge.append(0)
            # 아닌경우
            else:
                tmp = que.popleft()
                bridge.append(tmp)
                sum += tmp
        answer += 1
    return answer