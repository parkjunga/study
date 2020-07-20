import React, { Component } from 'react';

class TOC extends Component {
  shouldComponentUpdate(newProps, newState){
    console.log('========TOC render shoudComponentUpdate',
    newProps.data, this.props.data);
    // 원본바꾸면 해당 내용 비교가 힘듦 
    if (this.props.data === newProps.data){
      return false;
    }
    return true;
  }
    render(){
        var lists = []; //리턴문에 나타나야할 데이터를 lists에 담음
        var data = this.props.data;
        var i = 0; 
        while(i < data.length){
            // key값은 리액트에서 필요해서 사용하는것임
            lists.push(
            <li key={data[i].id}>
              <a 
                  href={"/content/"+data[i].id}
                  data-id= {data[i].id}
                  onClick={function(e){
                    e.preventDefault();
                    this.props.onChangePage(e.target.dataset.id);
                  }.bind(this)}
                  >{data[i].title}</a>
            </li>)
            i = i + 1;
        }
      return(
        <nav>
          <ul>
            {lists}
          </ul>
        </nav>
      )
    }
  }

  export default TOC //외부에서 사용할 수 있게 하는 부분