<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>운동 등록</title>

<style>
table {
	border: 1px solid black;
	width: 400px;
	margin: 100px auto;
	border-collapse: collapse;
}

td {
	border: 1px solid black;
	padding: 8px;
}

td:first-child {
	text-align: center;
	font-weight: bold;
	width: 140px;
}

td:last-child {
	text-align: left;
}
</style>

<script>
	function regCheck() {

		let frm = document.frm;

		if (frm.workout_id.value == "") {
			alert("운동 ID 입력");
			frm.workout_id.focus();
			return false;
		}

		if (frm.member_id.value == "") {
			alert("회원 ID 입력");
			frm.member_id.focus();
			return false;
		}

		if (frm.trainer_id.value == "") {
			alert("트레이너 ID 입력");
			frm.trainer_id.focus();
			return false;
		}

		if (frm.exercise_id.value == "") {
			alert("운동 ID 입력");
			frm.exercise_id.focus();
			return false;
		}

		if (frm.sets.value == "") {
			alert("세트 입력");
			frm.sets.focus();
			return false;
		}

		if (frm.reps.value == "") {
			alert("횟수 입력");
			frm.reps.focus();
			return false;
		}

		if (frm.weight.value == "") {
			alert("중량 입력");
			frm.weight.focus();
			return false;
		}

		return true;
	}
</script>
</head>
<body>

	<form name="frm" action="/0417/gymReg" method="post"
		onsubmit="return regCheck()">

		<table>
			<caption>운동 기록 등록</caption>

			<tr>
				<td>운동 ID</td>
				<td><input type="text" name="workout_id"></td>
			</tr>

			<tr>
				<td>회원 ID</td>
				<td><input type="text" name="member_id"></td>
			</tr>

			<tr>
				<td>트레이너 ID</td>
				<td><input type="text" name="trainer_id"></td>
			</tr>

			<tr>
				<td>운동 종류 ID</td>
				<td><input type="text" name="exercise_id"></td>
			</tr>

			<tr>
				<td>세트 수</td>
				<td><input type="number" name="sets"></td>
			</tr>

			<tr>
				<td>횟수</td>
				<td><input type="number" name="reps"></td>
			</tr>

			<tr>
				<td>중량(kg)</td>
				<td><input type="number" name="weight"></td>
			</tr>

			<tr>
				<td colspan="2" style="text-align: center;">
					<button type="submit">등록</button>
					<button type="reset">취소</button>
				</td>
			</tr>

		</table>

	</form>

</body>
</html>