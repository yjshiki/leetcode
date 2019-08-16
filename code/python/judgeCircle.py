class Solution:
    def judgeCircle(self, moves: str) -> bool:
        if moves == "":
            return True
        pos = [0,0]
        for i in range(len(moves)):
            if moves[i] == "U":
                pos[1] += 1
            elif moves[i] == "D":
                pos[1] -= 1
            elif moves[i] == "R":
                pos[0] += 1
            elif moves[i] == "L":
                pos[0] -= 1
        return pos[0]==0 and pos[1] == 0
