# onlineTu

**insert tutor**

http://localhost:9090/tutor/insertTutor

INPUT:

[
    {
        "tutorId": 1,
        "name": "Ram",
        "mobile": 999999999,
        "email": "ram@gmail.com",
        "schoolName": "delhi public school",
        "qualification": "m.tech",
        "subject": "Science",
        "city": null
    },
    {
        "tutorId": 2,
        "name": "Lakshman",
        "mobile": 999999991,
        "email": "lakshman@gmail.com",
        "schoolName": "delhi public school",
        "qualification": "m.tech",
        "subject": "Maths",
        "city": null
    },
    {
        "tutorId": 4,
        "name": "Laksha",
        "mobile": 999999991,
        "email": "laksha@gmail.com",
        "schoolName": "delhi public school",
        "qualification": "m.tech",
        "subject": "Maths",
        "city": null
    }
]


**view all tutors**

http://localhost:9090/tutor/viewAllTutors

OUTPUT:

{
        "tutorId": 1,
        "name": "Ram",
        "mobile": 999999999,
        "email": "ram@gmail.com",
        "schoolName": "delhi public school",
        "qualification": "m.tech",
        "subject": "Science",
        "city": null
    }


**count tutors of subject**

http://localhost:9090/tutor/countTutorsOfSubject/science

OUTPUT : 1


**view tutor of city**


http://localhost:9090/tutor/viewTutorOfCity/delhi

OUTPUT:

[
    {
        "tutorId": 2,
        "name": "Lakshman",
        "mobile": 999999991,
        "email": "lakshman@gmail.com",
        "schoolName": "delhi public school",
        "qualification": "m.tech",
        "subject": "Maths",
        "city": "Delhi"
    },
    {
        "tutorId": 3,
        "name": "Laksha",
        "mobile": 999999991,
        "email": "laksha@gmail.com",
        "schoolName": "delhi public school",
        "qualification": "m.tech",
        "subject": "Maths",
        "city": "Delhi"
    }
]


**delete tutor**


http://localhost:9090/tutor/deleteTutor

INPUT:

{
    "tutorId": 3,
    "name": "Laksha",
    "mobile": 999999991,
    "email": "laksha@gmail.com",
    "schoolName": "delhi public school",
    "qualification": "m.tech",
    "subject": "Maths",
    "city": null
}


**update tutor**

http://localhost:9090/tutor/updateTutor

INPUT:

{
    "tutorId": 3,
    "name": "Laksha",
    "mobile": 999999993,
    "email": "laksha@gmail.com",
    "schoolName": "delhi public school",
    "qualification": "m.tech",
    "subject": "Maths",
    "city": "Delhi"
}
