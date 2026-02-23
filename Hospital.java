class Hospital {
 public static String[] findDoctorsBySpecialization(String specialization){
        if(specialization.equals("Cardiac Sciences")){
            String[] doctors={
                "Dr. Arjun Rao","Dr. Meera Iyer","Dr. Karthik Reddy",
                "Dr. Sneha Sharma","Dr. Rajiv Menon","Dr. Anil Kumar",
                "Dr. Priya Nair","Dr. Vikram Joshi","Dr. Deepa Rao",
                "Dr. Suresh Babu","Dr. Neha Kapoor","Dr. Rahul Verma",
                "Dr. Kavita Singh","Dr. Harish Patil","Dr. Mohan Das"
            };
            return doctors;
        }

        else if(specialization.equals("Dental Science")){
            String[] doctors={
                "Dr. Ananya Rao","Dr. Rohit Jain","Dr. Preethi K",
                "Dr. Akash Mehta","Dr. Swathi R","Dr. Kiran B",
                "Dr. Vivek Shah","Dr. Ritu Sharma","Dr. Prakash V",
                "Dr. Pooja Desai","Dr. Ashwin T","Dr. Nisha Gupta",
                "Dr. Sunil Yadav","Dr. Farah Khan","Dr. Abhishek Roy"
            };
            return doctors;
        }

        else if(specialization.equals("Dermatology")){
            String[] doctors={
                "Dr. Rhea Kapoor","Dr. Manish Arora","Dr. Keerthi S",
                "Dr. Aditi Nair","Dr. Varun Malhotra","Dr. Sana Ali",
                "Dr. Pradeep K","Dr. Latha M","Dr. Deepak P",
                "Dr. Pavan S","Dr. Megha R","Dr. Anusha T",
                "Dr. Gopal R","Dr. Kavya L","Dr. Harini V"
            };
            return doctors;
        }

        else if(specialization.equals("Diabetology/Endocrinology")){
            String[] doctors={
                "Dr. Sameer N","Dr. Kavya R","Dr. Lokesh P",
                "Dr. Nithya S","Dr. Rahul K","Dr. Anusha M",
                "Dr. Tejas R","Dr. Priyanka V","Dr. Gautham H",
                "Dr. Sahana T","Dr. Arvind L","Dr. Meghana D",
                "Dr. Deepak S","Dr. Ramesh K","Dr. Shilpa P"
            };
            return doctors;
        }

        else if(specialization.equals("ENT")){
            String[] doctors={
                "Dr. Praveen H","Dr. Suma R","Dr. Kiran M",
                "Dr. Anil T","Dr. Preethi V","Dr. Rohit S",
                "Dr. Asha N","Dr. Mohit K","Dr. Neeraj P",
                "Dr. Rupa L","Dr. Deepika H","Dr. Vikas M",
                "Dr. Nandini R","Dr. Gokul P","Dr. Harsha S"
            };
            return doctors;
        }

        else if(specialization.equals("Emergency and Trauma")){
            String[] doctors={
                "Dr. Akhil R","Dr. Snehal P","Dr. Rohan T",
                "Dr. Kavitha M","Dr. Deeksha N","Dr. Rajesh V",
                "Dr. Pavan K","Dr. Mohini S","Dr. Varsha L",
                "Dr. Sandeep R","Dr. Ritu M","Dr. Lakshmi T",
                "Dr. Naveen B","Dr. Harsha K","Dr. Rohini P"
            };
            return doctors;
        }

        else if(specialization.equals("Foetal Medicine")){
            String[] doctors={
                "Dr. Shalini R","Dr. Meera K","Dr. Pooja S",
                "Dr. Kavitha N","Dr. Anu P","Dr. Rekha T",
                "Dr. Priya M","Dr. Geetha V","Dr. Deepa L",
                "Dr. Nisha K","Dr. Suma R","Dr. Lavanya P",
                "Dr. Anitha G","Dr. Swetha H","Dr. Radhika J"
            };
            return doctors;
        }

        else if(specialization.equals("Gastroenterology and Hepatobiliary Sciences")){
            String[] doctors={
                "Dr. Aravind S","Dr. Lokesh R","Dr. Deepthi M",
                "Dr. Sagar K","Dr. Mohan R","Dr. Karthika L",
                "Dr. Shreyas P","Dr. Rahul N","Dr. Ashwini T",
                "Dr. Harsha M","Dr. Ramesh D","Dr. Kavya S",
                "Dr. Naveen P","Dr. Swathi K","Dr. Ganesh V"
            };
            return doctors;
        }

        else if(specialization.equals("General Surgery")){
            String[] doctors={
                "Dr. Prakash M","Dr. Ajay K","Dr. Sneha L",
                "Dr. Rohan V","Dr. Shyam P","Dr. Manasa K",
                "Dr. Deepak R","Dr. Sushma T","Dr. Vinay S",
                "Dr. Anirudh M","Dr. Prema R","Dr. Harini K",
                "Dr. Arjun T","Dr. Sandeep L","Dr. Vivek P"
            };
            return doctors;
        }

        else if(specialization.equals("Haematology")){
            String[] doctors={
                "Dr. Kavitha R","Dr. Praveen K","Dr. Shalini M",
                "Dr. Nikhil R","Dr. Harsha T","Dr. Megha S",
                "Dr. Ramesh P","Dr. Swetha N","Dr. Anil R",
                "Dr. Lavanya K","Dr. Rohini S","Dr. Deepa V",
                "Dr. Ganesh H","Dr. Priya T","Dr. Manoj K"
            };
            return doctors;
        }

        else if(specialization.equals("Infectious Diseases")){
            String[] doctors={
                "Dr. Anusha R","Dr. Vikram P","Dr. Ritu M",
                "Dr. Sagar L","Dr. Neha K","Dr. Pavan R",
                "Dr. Keerthi M","Dr. Rajesh T","Dr. Shreya V",
                "Dr. Mohit S","Dr. Nandini P","Dr. Akhil K",
                "Dr. Lavanya S","Dr. Deepak H","Dr. Suma R"
            };
            return doctors;
        }

        else if(specialization.equals("Infertility medicine")){
            String[] doctors={
                "Dr. Priyanka M","Dr. Shalini T","Dr. Kavya R",
                "Dr. Anitha P","Dr. Rohit K","Dr. Meera S",
                "Dr. Arvind L","Dr. Nisha R","Dr. Swetha K",
                "Dr. Ganesh P","Dr. Harini M","Dr. Ramesh V",
                "Dr. Sahana R","Dr. Tejas P","Dr. Rekha S"
            };
            return doctors;
        }

        else if(specialization.equals("Internal Medicine")){
            String[] doctors={
                "Dr. Mahesh R","Dr. Kiran S","Dr. Anu L",
                "Dr. Naveen T","Dr. Preethi K","Dr. Sagar P",
                "Dr. Swathi R","Dr. Deepak M","Dr. Harsha K",
                "Dr. Priya V","Dr. Rohan S","Dr. Sneha P",
                "Dr. Lokesh N","Dr. Nithya M","Dr. Ramesh K"
            };
            return doctors;
        }

        else if(specialization.equals("Mental Health and Behavioural Sciences")){
            String[] doctors={
                "Dr. Aditi R","Dr. Mohan P","Dr. Kavya S",
                "Dr. Rahul T","Dr. Sneha K","Dr. Deepthi L",
                "Dr. Arjun M","Dr. Swetha P","Dr. Manish R",
                "Dr. Shalini K","Dr. Priya N","Dr. Harsha S",
                "Dr. Nikhil M","Dr. Suma R","Dr. Ganesh K"
            };
            return doctors;
        }

        else if(specialization.equals("Nephrology")){
            String[] doctors={
                "Dr. Ramesh P","Dr. Kavitha M","Dr. Arvind K",
                "Dr. Sneha T","Dr. Sagar R","Dr. Neha P",
                "Dr. Deepak S","Dr. Rohini M","Dr. Lokesh K",
                "Dr. Swathi N","Dr. Harsha R","Dr. Tejas M",
                "Dr. Anitha S","Dr. Pavan K","Dr. Megha L"
            };
            return doctors;
        }

        else if(specialization.equals("Neurointerventional Radiology")){
            String[] doctors={
                "Dr. Vivek R","Dr. Shreya K","Dr. Rahul M",
                "Dr. Deepa S","Dr. Kiran P","Dr. Nithin R",
                "Dr. Sahana K","Dr. Manoj T","Dr. Arjun L",
                "Dr. Swetha P","Dr. Harini R","Dr. Prakash M",
                "Dr. Ganesh S","Dr. Anu V","Dr. Ramesh K"
            };
            return doctors;
        }

        else if(specialization.equals("Neurology")){
            String[] doctors={
                "Dr. Anil R","Dr. Meera P","Dr. Kavya L",
                "Dr. Rohit M","Dr. Shalini S","Dr. Sagar K",
                "Dr. Deepika R","Dr. Harsha T","Dr. Nikhil P",
                "Dr. Priya S","Dr. Lokesh R","Dr. Meghana K",
                "Dr. Vivek M","Dr. Swathi P","Dr. Ganesh T"
            };
            return doctors;
        }

        else if(specialization.equals("Neurosurgery")){
            String[] doctors={
                "Dr. Arjun K","Dr. Manasa R","Dr. Rohan P",
                "Dr. Sneha L","Dr. Deepak M","Dr. Harini S",
                "Dr. Mohan R","Dr. Kavitha T","Dr. Praveen K",
                "Dr. Swetha M","Dr. Rahul S","Dr. Anitha K",
                "Dr. Sagar R","Dr. Nisha P","Dr. Ganesh M"
            };
            return doctors;
        }

        else if(specialization.equals("Obstetrics and Gynaecology")){
            String[] doctors={
                "Dr. Priya R","Dr. Kavya S","Dr. Shalini M",
                "Dr. Anitha K","Dr. Swetha P","Dr. Deepa R",
                "Dr. Meera S","Dr. Rohini K","Dr. Lavanya M",
                "Dr. Sneha T","Dr. Sahana R","Dr. Rekha P",
                "Dr. Nithya S","Dr. Harini K","Dr. Aditi R"
            };
            return doctors;
        }

        else if(specialization.equals("Oncology")){
            String[] doctors={
                "Dr. Arvind R","Dr. Kavitha M","Dr. Rohit S",
                "Dr. Sneha P","Dr. Deepak K","Dr. Meera L",
                "Dr. Sagar R","Dr. Anitha M","Dr. Rahul T",
                "Dr. Swetha S","Dr. Harsha K","Dr. Ganesh R",
                "Dr. Priya M","Dr. Lokesh S","Dr. Megha P"
            };
            return doctors;
        }
		
			else if(specialization.equals("Ophthalmology")){
    String[] doctors={
        "Dr. Rohan K","Dr. Sneha M","Dr. Kavya P","Dr. Deepak R",
        "Dr. Meera S","Dr. Arjun T","Dr. Swathi K","Dr. Nikhil R",
        "Dr. Harini P","Dr. Ganesh M","Dr. Priya S","Dr. Lokesh T",
        "Dr. Anitha R","Dr. Sagar K","Dr. Megha P"
    };
    return doctors;
}

else if(specialization.equals("Organ Transplant")){
    String[] doctors={
        "Dr. Arvind K","Dr. Rahul M","Dr. Sneha T","Dr. Kavitha S",
        "Dr. Deepak P","Dr. Swetha R","Dr. Mohan K","Dr. Harsha T",
        "Dr. Priya M","Dr. Nithin S","Dr. Ganesh R","Dr. Aditi P",
        "Dr. Ramesh K","Dr. Lokesh M","Dr. Sahana R"
    };
    return doctors;
}

else if(specialization.equals("Orthopaedics")){
    String[] doctors={
        "Dr. Kiran R","Dr. Manoj S","Dr. Sneha K","Dr. Rohit P",
        "Dr. Deepa M","Dr. Arjun R","Dr. Swathi S","Dr. Harsha K",
        "Dr. Nikhil M","Dr. Priya R","Dr. Lokesh T","Dr. Ganesh P",
        "Dr. Anitha S","Dr. Megha R","Dr. Sagar K"
    };
    return doctors;
}

else if(specialization.equals("Paediatrics")){
    String[] doctors={
        "Dr. Priya K","Dr. Sneha M","Dr. Kavya R","Dr. Rohini S",
        "Dr. Deepika P","Dr. Anu T","Dr. Harini K","Dr. Swetha R",
        "Dr. Lokesh M","Dr. Rahul S","Dr. Sahana P","Dr. Ganesh K",
        "Dr. Aditi R","Dr. Megha S","Dr. Nikhil P"
    };
    return doctors;
}

else if(specialization.equals("Physiotherapy and Rehabilitation")){
    String[] doctors={
        "Dr. Ramesh K","Dr. Kavitha M","Dr. Arjun P","Dr. Sneha T",
        "Dr. Rohit R","Dr. Deepa S","Dr. Swathi K","Dr. Harsha M",
        "Dr. Nikhil R","Dr. Priya S","Dr. Lokesh P","Dr. Ganesh T",
        "Dr. Anitha K","Dr. Megha P","Dr. Sagar R"
    };
    return doctors;
}

else if(specialization.equals("Plastic and Reconstructive Surgery")){
    String[] doctors={
        "Dr. Arvind R","Dr. Sneha P","Dr. Kavya S","Dr. Deepak M",
        "Dr. Rohit T","Dr. Swetha R","Dr. Mohan K","Dr. Harini S",
        "Dr. Priya K","Dr. Nithin P","Dr. Ganesh R","Dr. Aditi S",
        "Dr. Ramesh T","Dr. Lokesh M","Dr. Sahana R"
    };
    return doctors;
}

else if(specialization.equals("Pulmonology")){
    String[] doctors={
        "Dr. Rahul K","Dr. Sneha M","Dr. Kavitha P","Dr. Deepak R",
        "Dr. Rohini S","Dr. Arjun T","Dr. Swathi K","Dr. Harsha R",
        "Dr. Nikhil M","Dr. Priya S","Dr. Lokesh T","Dr. Ganesh P",
        "Dr. Anitha R","Dr. Megha K","Dr. Sagar R"
    };
    return doctors;
}

else if(specialization.equals("Radiology")){
    String[] doctors={
        "Dr. Vivek R","Dr. Sneha K","Dr. Kavya M","Dr. Deepak S",
        "Dr. Rohit P","Dr. Swetha R","Dr. Mohan K","Dr. Harsha T",
        "Dr. Priya M","Dr. Nithin S","Dr. Ganesh R","Dr. Aditi P",
        "Dr. Ramesh K","Dr. Lokesh M","Dr. Sahana R"
    };
    return doctors;
}

else if(specialization.equals("Rheumatology")){
    String[] doctors={
        "Dr. Arjun K","Dr. Sneha M","Dr. Kavya R","Dr. Deepika S",
        "Dr. Rohit P","Dr. Swathi K","Dr. Harsha M","Dr. Nikhil R",
        "Dr. Priya S","Dr. Lokesh T","Dr. Ganesh P","Dr. Anitha R",
        "Dr. Megha S","Dr. Sagar K","Dr. Rahul T"
    };
    return doctors;
}

else if(specialization.equals("Support Specialties")){
    String[] doctors={
        "Dr. Ramesh K","Dr. Sneha P","Dr. Kavitha M","Dr. Deepak R",
        "Dr. Rohini S","Dr. Swathi K","Dr. Harsha M","Dr. Nikhil R",
        "Dr. Priya S","Dr. Lokesh P","Dr. Ganesh T","Dr. Anitha K",
        "Dr. Megha R","Dr. Sagar K","Dr. Rahul P"
    };
    return doctors;
}

else if(specialization.equals("Thoracic Surgery")){
    String[] doctors={
        "Dr. Arvind R","Dr. Sneha M","Dr. Kavya S","Dr. Deepak T",
        "Dr. Rohit K","Dr. Swetha R","Dr. Mohan P","Dr. Harini S",
        "Dr. Priya K","Dr. Nithin R","Dr. Ganesh M","Dr. Aditi S",
        "Dr. Ramesh T","Dr. Lokesh P","Dr. Sahana R"
    };
    return doctors;
}

else if(specialization.equals("Transfusion Medicine")){
    String[] doctors={
        "Dr. Rahul M","Dr. Sneha K","Dr. Kavitha R","Dr. Deepika P",
        "Dr. Rohini S","Dr. Swathi K","Dr. Harsha M","Dr. Nikhil R",
        "Dr. Priya S","Dr. Lokesh T","Dr. Ganesh P","Dr. Anitha R",
        "Dr. Megha S","Dr. Sagar K","Dr. Arjun T"
    };
    return doctors;
}

else if(specialization.equals("Urology")){
    String[] doctors={
        "Dr. Arjun R","Dr. Sneha M","Dr. Kavya P","Dr. Deepak S",
        "Dr. Rohit K","Dr. Swetha R","Dr. Mohan T","Dr. Harsha M",
        "Dr. Priya K","Dr. Nithin R","Dr. Ganesh P","Dr. Aditi S",
        "Dr. Ramesh K","Dr. Lokesh M","Dr. Sahana R"
    };
    return doctors;
}

else if(specialization.equals("Endocrine Surgery")){
    String[] doctors={
        "Dr. Vivek R","Dr. Sneha K","Dr. Kavitha M","Dr. Deepak P",
        "Dr. Rohini S","Dr. Swathi K","Dr. Harsha M","Dr. Nikhil R",
        "Dr. Priya S","Dr. Lokesh P","Dr. Ganesh T","Dr. Anitha R",
        "Dr. Megha S","Dr. Sagar K","Dr. Rahul T"
    };
    return doctors;
}

else if(specialization.equals("Vascular Surgery")){
    String[] doctors={
        "Dr. Arvind R","Dr. Sneha M","Dr. Kavya S","Dr. Deepika P",
        "Dr. Rohit K","Dr. Swetha R","Dr. Mohan T","Dr. Harini S",
        "Dr. Priya K","Dr. Nithin R","Dr. Ganesh P","Dr. Aditi S",
        "Dr. Ramesh K","Dr. Lokesh M","Dr. Sahana R"
    };
    return doctors;
}

else if(specialization.equals("Liver Transplant and Hepatobiliary Sciences")){
    String[] doctors={
        "Dr. Rahul K","Dr. Sneha M","Dr. Kavitha P","Dr. Deepak R",
        "Dr. Rohini S","Dr. Swathi K","Dr. Harsha M","Dr. Nikhil R",
        "Dr. Priya S","Dr. Lokesh T","Dr. Ganesh P","Dr. Anitha R",
        "Dr. Megha S","Dr. Sagar K","Dr. Arjun T"
    };
    return doctors;
}

else if(specialization.equals("Palliative Medicine")){
    String[] doctors={
        "Dr. Ramesh K","Dr. Sneha P","Dr. Kavitha M","Dr. Deepak R",
        "Dr. Rohini S","Dr. Swathi K","Dr. Harsha M","Dr. Nikhil R",
        "Dr. Priya S","Dr. Lokesh P","Dr. Ganesh T","Dr. Anitha K",
        "Dr. Megha R","Dr. Sagar K","Dr. Rahul P"
    };
    return doctors;
}

else if(specialization.equals("Medical Genetics")){
    String[] doctors={
        "Dr. Arjun R","Dr. Sneha M","Dr. Kavya P","Dr. Deepika S",
        "Dr. Rohit K","Dr. Swetha R","Dr. Mohan T","Dr. Harini S",
        "Dr. Priya K","Dr. Nithin R","Dr. Ganesh P","Dr. Aditi S",
        "Dr. Ramesh K","Dr. Lokesh M","Dr. Sahana R"
    };
    return doctors;
}

else if(specialization.equals("Pain and Palliative Medicine")){
    String[] doctors={
        "Dr. Vivek R","Dr. Sneha K","Dr. Kavitha M","Dr. Deepak P",
        "Dr. Rohini S","Dr. Swathi K","Dr. Harsha M","Dr. Nikhil R",
        "Dr. Priya S","Dr. Lokesh P","Dr. Ganesh T","Dr. Anitha R",
        "Dr. Megha S","Dr. Sagar K","Dr. Rahul T"
    };
    return doctors;
}

else if(specialization.equals("Geriatric Medicine")){
    String[] doctors={
        "Dr. Arvind R","Dr. Sneha M","Dr. Kavya S","Dr. Deepika P",
        "Dr. Rohit K","Dr. Swetha R","Dr. Mohan T","Dr. Harini S",
        "Dr. Priya K","Dr. Nithin R","Dr. Ganesh P","Dr. Aditi S",
        "Dr. Ramesh K","Dr. Lokesh M","Dr. Sahana R"
    };
    return doctors;
}

else if(specialization.equals("Nuclear Medicine")){
    String[] doctors={
        "Dr. Arjun Rao","Dr. Meera K","Dr. Karthik R",
        "Dr. Sneha P","Dr. Rahul M","Dr. Deepika S",
        "Dr. Mohan T","Dr. Kavya R","Dr. Nithin S",
        "Dr. Harsha M","Dr. Priya K","Dr. Lokesh P",
        "Dr. Ganesh T","Dr. Aditi R","Dr. Ramesh K"
    };
    return doctors;
}

return null;
}

public static void displayDoctors(String[] doctors){
        for(String doctor : doctors){
            System.out.println(doctor);
        }

}
}