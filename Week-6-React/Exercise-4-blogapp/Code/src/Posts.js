import React from 'react';
import Post from './Post';

class Posts extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            posts: []
        };
    }

    loadPosts() {
        fetch('https://jsonplaceholder.typicode.com/posts')
            .then(response => response.json())
            .then(data => {
                const posts = data.map(postData => new Post(postData.id, postData.title, postData.body));
                this.setState({ posts: posts });
            })
            .catch(error => {
                console.error("Error fetching posts:", error);
            });
    }

    componentDidMount() {
        this.loadPosts();
    }

    render() {
        const { posts } = this.state;

        return (
            <div>
                <h1>Blog Posts</h1>
                {posts.length > 0 ? (
                    <ol>
                        {posts.map(post => (
                            <li key={post.id}>
                                <h2>{post.title}</h2>
                                <p>{post.body}</p>
                            </li>
                        ))}
                    </ol>
                ) : (
                    <p>Loading posts...</p>
                )}
            </div>
        );
    }

    componentDidCatch(error, info) {
        alert("An error occurred in the Posts component: " + error);
        console.error("Error in Posts component:", error, info);
    }
}

export default Posts;