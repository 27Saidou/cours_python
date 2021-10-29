class Utilisateurs():

    def __init__(self,user_email,name,password,current_job_title):
        self.user_email = user_email
        self.name=name
        self.password=password
        self.current_job_title=current_job_title

    def change_password(self,new_password):
        self.password=new_password

    def change_job_title(self,new_job_title):
        self.current_job_title=new_job_title

    def get_user_info(self):
        return f"Utilisateur {self.name} currently works as a {self.current_job_title} vous pouvez le contactez via{self.user_email}" 


app_utilisateur_one=Utilisateurs("massoud@yahoo.com","alfa diallo","pwd123","DevOps engineer") 
print(app_utilisateur_one.get_user_info())
