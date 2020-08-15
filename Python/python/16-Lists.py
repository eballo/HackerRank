
if __name__ == '__main__':

    L = []
    N = int(input())

    for i in range(0, N):
        line = input().split()

        if line[0] == 'insert':
            L.insert(int(line[1]), int(line[2]))
        elif line[0] == 'print':
            print(L)
        elif line[0] == 'remove':
            L.remove(int(line[1]))
        elif line[0] == 'append':
            L.append(int(line[1]))
        elif line[0] == 'sort':
            L.sort()
        elif line[0] == 'pop':
            L.pop()
        elif line[0] == 'reverse':
            L.reverse()
