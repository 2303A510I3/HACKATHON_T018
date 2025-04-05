import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class jobportal {
    static class UserProfile {
        private List<String> skills;
        private String desiredJobRole;
        private String careerGoal;

        public UserProfile(List<String> skills, String desiredJobRole, String careerGoal) {
            this.skills = skills;
            this.desiredJobRole = desiredJobRole;
            this.careerGoal = careerGoal;
        }

        public List<String> getSkills() {
            return skills;
        }

        public String getDesiredJobRole() {
            return desiredJobRole;
        }

        public String getCareerGoal() {
            return careerGoal;
        }
    }
    static class Job 
    {
        private String jobTitle;
        private List<String> requiredSkills;
        private String companyName;

        public Job(String jobTitle, List<String> requiredSkills, String companyName) 
        {
            this.jobTitle = jobTitle;
            this.requiredSkills = requiredSkills;
            this.companyName = companyName;
        }
        public String getJobTitle() 
        {
            return jobTitle;
        }

        public List<String> getRequiredSkills() 
        {
            return requiredSkills;
        }

        public String getCompanyName() 
        {
            return companyName;
        }
    }

    static class JobMatcher 
    {
        public List<Job> matchJobs(UserProfile userProfile, List<Job> jobList) 
        {
            List<Job> matchingJobs = new ArrayList<>();

            for (Job job : jobList) 
            {
                int matchCount = 0;
                for (String skill : job.getRequiredSkills()) 
                {
                    if (userProfile.getSkills().contains(skill)) 
                    {
                        matchCount++;
                    }
                }
                if (matchCount >= job.getRequiredSkills().size() / 2)
                {
                    matchingJobs.add(job);
                }
            }
            return matchingJobs;
        }
    }
    static class SkillGapAnalyzer 
    {
        public List<String> analyzeSkillGaps(UserProfile userProfile, Job job) 
        {
            List<String> missingSkills = new ArrayList<>();
            for (String requiredSkill : job.getRequiredSkills()) 
            {
                if (!userProfile.getSkills().contains(requiredSkill)) 
                {
                    missingSkills.add(requiredSkill);
                }
            }
            return missingSkills;
        }
    }
    static class TrainingRecommender 
    {
        public List<String> recommendCourses(List<String> missingSkills) 
        {
            List<String> recommendedCourses = new ArrayList<>();

            for (String skill : missingSkills) 
            {
                if (skill.equals("Machine Learning")) 
                {
                    recommendedCourses.add("Machine Learning - edX");
                }
                else if (skill.equals("Spring")) 
                {
                    recommendedCourses.add("Spring Framework - Udemy");
                }
                else if (skill.equals("Python")) 
                {
                    recommendedCourses.add("Python for Data Science - Coursera");
                }
                else if (skill.equals("AWS")) 
                {
                    recommendedCourses.add("AWS Certification - LinkedIn Learning");
                } 
                else if (skill.equals("Digital Marketing")) 
                {
                    recommendedCourses.add("Digital Marketing - Coursera");
                }
            }
            return recommendedCourses;
        }
    }
    public static void showJobCategories() 
    {
        System.out.println("Choose a job category:");
        System.out.println("1. Software Development");
        System.out.println("2. Cloud Computing");
        System.out.println("3. Data Science");
        System.out.println("4. Web Development");
        System.out.println("5. Artificial Intelligence");
        System.out.println("6. Cybersecurity");
        System.out.println("7. Digital Marketing");
        System.out.println("8. Product Management");
        System.out.print("Enter your category : ");
    }

    public static void showSpecializedRoles(int choice) 
    {
        switch (choice) 
        {
            case 1:
                System.out.println("Choose a role in Software Development:");
                System.out.println("1. Software Engineer");
                System.out.println("2. Backend Developer");
                System.out.println("3. Frontend Developer");
                break;
            case 2:
                System.out.println("Choose a role in Cloud Computing:");
                System.out.println("1. Cloud Architect");
                System.out.println("2. Cloud Engineer");
                System.out.println("3. DevOps Engineer");
                break;
            case 3:
                System.out.println("Choose a role in Data Science:");
                System.out.println("1. Data Scientist");
                System.out.println("2. Data Analyst");
                System.out.println("3. Machine Learning Engineer");
                break;
            case 4:
                System.out.println("Choose a role in Web Development:");
                System.out.println("1. Full Stack Developer");
                System.out.println("2. Frontend Developer");
                System.out.println("3. Backend Developer");
                break;
            case 5:
                System.out.println("Choose a role in Artificial Intelligence:");
                System.out.println("1. AI Engineer");
                System.out.println("2. AI Researcher");
                System.out.println("3. NLP Engineer");
                break;
            case 6:
                System.out.println("Choose a role in Cybersecurity:");
                System.out.println("1. Cybersecurity Analyst");
                System.out.println("2. Ethical Hacker");
                System.out.println("3. Security Architect");
                break;
            case 7:
                System.out.println("Choose a role in Digital Marketing:");
                System.out.println("1. SEO Specialist");
                System.out.println("2. Social Media Manager");
                System.out.println("3. PPC Specialist");
                break;
            case 8:
                System.out.println("Choose a role in Product Management:");
                System.out.println("1. Product Manager");
                System.out.println("2. Product Owner");
                System.out.println("3. Product Marketing Manager");
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid category.");
                break;
        }
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        showJobCategories();
        int categoryChoice = scanner.nextInt();
        scanner.nextLine();
        showSpecializedRoles(categoryChoice);
        System.out.print("Enter your choice : ");
        int roleChoice = scanner.nextInt();
        scanner.nextLine(); 
        String desiredJobRole = "";
        switch (categoryChoice) 
        {
            case 1:
                if (roleChoice == 1) desiredJobRole = "Software Engineer";
                else if (roleChoice == 2) desiredJobRole = "Backend Developer";
                else if (roleChoice == 3) desiredJobRole = "Frontend Developer";
                break;
            case 2:
                if (roleChoice == 1) desiredJobRole = "Cloud Architect";
                else if (roleChoice == 2) desiredJobRole = "Cloud Engineer";
                else if (roleChoice == 3) desiredJobRole = "DevOps Engineer";
                break;
            case 3:
                if (roleChoice == 1) desiredJobRole = "Data Scientist";
                else if (roleChoice == 2) desiredJobRole = "Data Analyst";
                else if (roleChoice == 3) desiredJobRole = "Machine Learning Engineer";
                break;
            case 4:
                if (roleChoice == 1) desiredJobRole = "Full Stack Developer";
                else if (roleChoice == 2) desiredJobRole = "Frontend Developer";
                else if (roleChoice == 3) desiredJobRole = "Backend Developer";
                break;
            case 5:
                if (roleChoice == 1) desiredJobRole = "AI Engineer";
                else if (roleChoice == 2) desiredJobRole = "AI Researcher";
                else if (roleChoice == 3) desiredJobRole = "NLP Engineer";
                break;
            case 6:
                if (roleChoice == 1) desiredJobRole = "Cybersecurity Analyst";
                else if (roleChoice == 2) desiredJobRole = "Ethical Hacker";
                else if (roleChoice == 3) desiredJobRole = "Security Architect";
                break;
            case 7:
                if (roleChoice == 1) desiredJobRole = "SEO Specialist";
                else if (roleChoice == 2) desiredJobRole = "Social Media Manager";
                else if (roleChoice == 3) desiredJobRole = "PPC Specialist";
                break;
            case 8:
                if (roleChoice == 1) desiredJobRole = "Product Manager";
                else if (roleChoice == 2) desiredJobRole = "Product Owner";
                else if (roleChoice == 3) desiredJobRole = "Product Marketing Manager";
                break;
            default:
                System.out.println("Invalid role choice.");
        }

        System.out.print("Enter your career goal: ");
        String careerGoal = scanner.nextLine();

        System.out.print("Enter your skills (comma separated, e.g., Java, Python, SQL): ");
        String skillsInput = scanner.nextLine();
        List<String> skills = Arrays.asList(skillsInput.split(",\\s*"));

        UserProfile user = new UserProfile(skills, desiredJobRole, careerGoal);

        List<Job> jobs = Arrays.asList(
                new Job("Software Engineer", Arrays.asList("Java", "Python", "SQL", "Machine Learning"), "TechCorp"),
                new Job("Data Scientist", Arrays.asList("Python", "R", "Machine Learning", "SQL"), "DataLab"),
                new Job("Cloud Architect", Arrays.asList("AWS", "Azure", "Cloud Infrastructure"), "CloudTech"),
                new Job("Backend Developer", Arrays.asList("Java", "Spring", "SQL"), "DevWorks"),
                new Job("AI Engineer", Arrays.asList("Python", "Machine Learning", "TensorFlow"), "AI Inc"),
                new Job("Cybersecurity Analyst", Arrays.asList("Network Security", "Penetration Testing", "Firewalls"), "SecureTech"),
                new Job("SEO Specialist", Arrays.asList("SEO", "Google Analytics", "Content Optimization"), "MarketingPro"),
                new Job("Product Manager", Arrays.asList("Product Management", "Agile", "Team Leadership"), "ProductLabs")
        );

        JobMatcher jobMatcher = new JobMatcher();
        List<Job> matchingJobs = jobMatcher.matchJobs(user, jobs);

        System.out.println("\nMatched Jobs for the role: " + user.getDesiredJobRole());
        if (matchingJobs.isEmpty())
        {
            System.out.println("No jobs found matching your skills.");
        }
        else
        {
            for (Job job : matchingJobs) 
            {
                System.out.println(job.getJobTitle() + " at " + job.getCompanyName());
            }
        }
        SkillGapAnalyzer gapAnalyzer = new SkillGapAnalyzer();
        for (Job job : matchingJobs) 
        {
            List<String> missingSkills = gapAnalyzer.analyzeSkillGaps(user, job);
            if (!missingSkills.isEmpty()) 
            {
                System.out.println("\nMissing Skills for " + job.getJobTitle() + ": " + missingSkills);
                TrainingRecommender recommender = new TrainingRecommender();
                List<String> courses = recommender.recommendCourses(missingSkills);
                System.out.println("Recommended Courses: " + courses);
            }
        }
        scanner.close();
    }
}
