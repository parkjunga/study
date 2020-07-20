import React, { Component } from 'react';
import TOC from "./components/TOC";
import ReadContent from "./components/ReadContents";
import CreateContent from './components/CreateContents';
import Subject from "./components/Subject";
import Control from "./components/Control";
import './App.css';
import { unstable_batchedUpdates } from 'react-dom';

// 최신 자바스크립트는 클래스 안에 속하는 function은 function을 생략 원래 function render이나 생략
// 하나의 최상위 태그만 써야된다 !
// attibute == props



class App extends Component{
  // 컴포넌트 초기화시켜주고 싶은 코드를 여기다 집어넣음
  constructor(props){
    super(props);
    this.max_content_id = 3 ; // max_content_id 데이터를 추가할떄 아이디를 뭐로할지 추가할때 사용하려고 하는거라 임의값이라
    this.state = {
      mode:'create',
      selected_content_id:2,
      subject:{title:"WEB" , sub:"world Wid Web!"},
      Welcome:{title:"Welcome", desc:"Hello, React!!"},
      contents:[
        {id:1, title:'HTML',desc:"HTML is HyperText"},
        {id:2, title:'CSS', desc:"CSS is for design"},
        {id:3, title:'JavaScript', desc:"JS is for for Interactive"}
      ] // 데이터가 많아 배열형태
    }
  }
  render() {
    console.log("App render")
    var _title, _desc, _article = null;
    if(this.state.mode === 'Welcome'){
      _title = this.state.Welcome.title;
      _desc = this.state.Welcome.desc;
      _article = <ReadContent title={_title} desc={_desc}></ReadContent>
    } else if (this.state.mode === 'read'){
      var i = 0;
      while(i < this.state.contents.length){
        var data = this.state.contents[i];
        if (data.id === this.state.selected_content_id){
          _title = data.title;
          _desc = data.desc;
          break;
        }
        i = i + 1;
      }
      _article = <ReadContent title={_title} desc={_desc}></ReadContent>
    } else if (this.state.mode === 'create'){
      _article = <CreateContent onSubmit={function(_title,_desc){
        console.log(_title,_desc);
        this.max_content_id = this.max_content_id + 1;
        // this.state.contents.push(
        //   {id:this.max_content_id, title:_title, desc:_desc}    
        // ); state값 직접수정하면 react 모름
        var _contents = this.state.contents.concat(
          {id:this.max_content_id, title:_title, desc:_desc}
        )
        this.setState({
          contents:_contents
        });
      }.bind(this)}></CreateContent>
    }
  return (
    <div className="App">
      <Subject title={this.state.subject.title} 
                 sub={this.state.subject.sub}
      onChangePage = {function(){
//        alert('hihihi');
// 동적으로 값을 받고있을때는 이렇게 
        this.setState({mode:"Welcome"})
      }.bind(this)}>
      </Subject>
      <TOC 
      onChangePage={function(id){
        this.setState({
          mode:"read",
          selected_content_id:Number(id)
        });
      }.bind(this)} data={this.state.contents}></TOC>
      <Control onChangeMode={function(_mode){
        this.setState({
          mode:_mode
        });
      }.bind(this)}></Control>
      {_article}
    </div>
    );
  }
}
export default App;
