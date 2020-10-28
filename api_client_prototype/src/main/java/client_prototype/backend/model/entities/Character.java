package client_prototype.backend.model.entities;

import java.util.List;

public class Character
{
    private int charId;
    private String name;
    private String birthday;
    private List<String> occupation;
    private String img;
    private String status;
    private String nickname;
    private List<int> appearance;
    private String portrayed;
    private String category;
    private List<int> betterCallSaulAppearance;

    public void setChar_id(int charId)
    {
        this.charId = charId;
    }

    public int getCharId()
    {
        return this.char_id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setBirthday(String birthday)
    {
        this.birthday = birthday;
    }

    public String getBirthday()
    {
        return this.birthday;
    }

    public void setOccupation(List<String> occupation)
    {
        this.occupation = occupation;
    }

    public List<String> getOccupation()
    {
        return this.occupation;
    }

    public void setImg(String img)
    {
        this.img = img;
    }

    public String getImg()
    {
        return this.img;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return this.status;
    }

    public void setNickname(String nickname)
    {
        this.nickname = nickname;
    }

    public String getNickname()
    {
        return this.nickname;
    }

    public void setAppearance(List<int> appearance)
    {
        this.appearance = appearance;
    }

    public List<int> getAppearance()
    {
        return this.appearance;
    }

    public void setPortrayed(String portrayed)
    {
        this.portrayed = portrayed;
    }

    public String getPortrayed()
    {
        return this.portrayed;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    public String getCategory()
    {
        return this.category;
    }

    public void setBetter_call_saul_appearance(List<int> betterCallSaulAppearance)
    {
        this.betterCallSaulAppearance = betterCallSaulAppearance;
    }

    public List<int> getBetterCallSaulAppearance()
    {
        return this.betterCallSaulAppearance;
    }
}