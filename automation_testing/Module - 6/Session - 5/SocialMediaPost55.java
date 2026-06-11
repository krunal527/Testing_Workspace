package sessioin.a5;

//Abstract class — cannot be instantiated directly
abstract class SocialMediaPost55 {

 // Abstract method — no body, MUST be implemented by subclass
 abstract void share();
}

//Subclass 1 — Instagram
class InstagramPost extends SocialMediaPost {

 @Override
 void share() {
     System.out.println("📸 Instagram: Your photo has been shared to your Feed & Story!");
     System.out.println("   Hashtags added: #instagood #photooftheday");
 }
}

//Subclass 2 — Twitter
class TwitterPost extends SocialMediaPost {

 @Override
 void share() {
     System.out.println("🐦 Twitter (X): Your tweet has been posted!");
     System.out.println("   Character limit checked: 280 chars max.");
 }
}

public class SocialMediaDemo {
 public static void main(String[] args) {

     // Abstract class reference pointing to child objects
     SocialMediaPost post;

     post = new InstagramPost();
     post.share();

     System.out.println();

     post = new TwitterPost();
     post.share();
 }
}