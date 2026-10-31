def student_score():
    name = input("Enter student name: ")
    score = int(input("Enter student score: "))

    print("Student Name:", name)
    print("Student Score:", score)
    
    number_of_students = int(input("Enter number of students:"))
    number_of_subjects = int(input("Enter number of subjects:"))

    students = []
    subjects = []
    scores = []



    print("\n--- Enter Subject Names ---")

    for subject in range(number_of_subjects):
    
        name = input(f"Enter subject subject + 1: ")
        score = int(input("Enter score: "))

        print(name, score)
     
        subjects.append(name)



    print("\n--- Enter Student Information ---")

    for student in range(number_of_students):

        student_name = input(f"\nEnter student (student + 1 name: ")
        students.append(student_name)

        student_scores = []

    for subject in range(number_of_subjects):

        score = int(input("Enter student_name's score for subjects[subject]: "))
            

        
        while score < 0 or score > 100:

            print("Invalid score!")
            print("Score must be between 0 and 100.")

            score = int(input("Enter score again: "))

        student_scores.append(score)

        scores.append(student_scores)


    print("\n========== STUDENT SUMMARY ==========")

    class_total = 0

    for student in range(number_of_students):

        total = 0

    print("\nStudent:", students[student])

    for subject in range(number_of_subjects):

        print(subjects[subject],":", score[student][subject])
            

        total += scores[student][subject]

        average = total / number_of_subjects

    print("Total:", total)
    print("Average:", average)

    class_total += average


    class_average = class_total / number_of_students
