package me.himi.love.entity;

/**
 * 秘密
 * @ClassName:Secret
 * @author sparklee liduanwei_911@163.com
 * @date Nov 4, 2014 8:56:37 PM
 */
public class Article implements java.io.Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 2198663806892016620L;

    private int id;

    private boolean isPublic;
    private String content;
    private BSImageUrl contentImageUrl;
    private String tag;
    private int createTime;
    private String lng, lat;

    private int love, hate, comments;

    public int getLove() {
	return love;
    }

    public void setLove(int love) {
	this.love = love;
    }

    public int getComments() {
	return comments;
    }

    public void setComments(int comments) {
	this.comments = comments;
    }

    public boolean isPublic() {
	return isPublic;
    }

    public void setPublic(boolean isPublic) {
	this.isPublic = isPublic;
    }

    public String getContent() {
	return content;
    }

    public void setContent(String content) {
	this.content = content;
    }

    public String getTag() {
	return tag;
    }

    public void setTag(String tag) {
	this.tag = tag;
    }

    public int getCreateTime() {
	return createTime;
    }

    public void setCreateTime(int createTime) {
	this.createTime = createTime;
    }

    public String getLng() {
	return lng;
    }

    public void setLng(String lng) {
	this.lng = lng;
    }

    public String getLat() {
	return lat;
    }

    public void setLat(String lat) {
	this.lat = lat;
    }

    private int userId;
    private int gender;
    private int age;
    private String nickname;
    private int height;

    private int vip;

    public String getHomeplace() {
	return homeplace;
    }

    public void setHomeplace(String homeplace) {
	this.homeplace = homeplace;
    }

    public String getAddress() {
	return address;
    }

    public void setAddress(String address) {
	this.address = address;
    }

    private int weight;
    private String monthlySalary;
    private BSImageUrl faceUrl;

    private String homeplace, address;

    private String interests, personality;

    public String getInterests() {
	return interests;
    }

    public void setInterests(String interests) {
	this.interests = interests;
    }

    public String getPersonality() {
	return personality;
    }

    public void setPersonality(String personality) {
	this.personality = personality;
    }

    public int getGender() {
	return gender;
    }

    public void setGender(int gender) {
	this.gender = gender;
    }

    public int getAge() {
	return age;
    }

    public void setAge(int age) {
	this.age = age;
    }

    public String getNickname() {
	return nickname;
    }

    public void setNickname(String nickname) {
	this.nickname = nickname;
    }

    public int getHeight() {
	return height;
    }

    public void setHeight(int height) {
	this.height = height;
    }

    public int getWeight() {
	return weight;
    }

    public void setWeight(int weight) {
	this.weight = weight;
    }

    public String getMonthlySalary() {
	return monthlySalary;
    }

    public void setMonthlySalary(String monthlySalary) {
	this.monthlySalary = monthlySalary;
    }

    public int getUserId() {
	return userId;
    }

    public void setUserId(int userId) {
	this.userId = userId;
    }

    @Override
    public String toString() {
	return this.userId + "," + this.nickname + "," + this.age + "," + this.gender + "," + this.height;
    }

    public BSImageUrl getFaceUrl() {
	return faceUrl;
    }

    public void setFaceUrl(BSImageUrl faceUrl) {
	this.faceUrl = faceUrl;
    }

    public int getVip() {
	return vip;
    }

    public void setVip(int vip) {
	this.vip = vip;
    }

    public BSImageUrl getContentImageUrl() {
	return contentImageUrl;
    }

    public void setContentImageUrl(BSImageUrl contentImageUrl) {
	this.contentImageUrl = contentImageUrl;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public int getHate() {
	return hate;
    }

    public void setHate(int hate) {
	this.hate = hate;
    }

}
