package com.nicoroy.subscriberlist.subscriber;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

//Tell the JPA that we want to store objects of this 
//class to the database/ Subscriber table will be created
@Entity
public class Subscriber
{
    
    @Id //Mark the ID field as database primary key
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    @Column //Attribute will be store in DB table 
    //column whose name matches the persistent field 
    @CreationTimestamp //sets value to current datetime
    private Date signedUp;
   
public Subscriber (String firstName, String lastName, String userName, Date signedUp, String email)
{
    this.firstName = firstName;
    this.lastName = lastName;
    this.userName = userName;
    this.signedUp = signedUp;
    this.email = email;

}

public Subscriber() {
    //Non-argument constructor needed for JPA
}

public String getFirstName()
{
    return firstName;
}


public void setFirstName(String firstName)
{
    this.firstName = firstName;
}


public String getLastName()
{
    return lastName;
}


public void setLastName(String lastName)
{
    this.lastName = lastName;
}


public String getUserName()
{
    return userName;
}


public void setUserName(String userName)
{
    this.userName = userName;
}


public Date getSignedUp()
{
    return signedUp;
}


public void setSignedUp(Date signedUp)
{
    this.signedUp = signedUp;
}

public String getEmail()
{
    return email;
}

public void setEmail(String email)
{
    this.email = email;
}

@Override
public String toString()
{
    return "Subscriber [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName + ", email=" + email + ", signedUp=" + signedUp + "]";
}





}