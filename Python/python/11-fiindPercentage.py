if __name__ == '__main__':
    n = int(input())
    student_marks = {}
    for _ in range(n):
        name, *line = input().split()
        scores = list(map(float, line))
        student_marks[name] = scores
    query_name = input()

    #print(student_marks)
    marks = student_marks[query_name]
    size = len(marks)
    percentage = (sum(marks)/size)
    final_percentage = round(percentage, 2)
    #print(final_percentage) # only prints one decimal
    print('%.2f' %final_percentage)
