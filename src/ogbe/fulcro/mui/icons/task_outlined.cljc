(ns ogbe.fulcro.mui.icons.task-outlined
  #?(:cljs (:require
            ["@mui/icons-material/TaskOutlined" :default TaskOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-task-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TaskOutlined)))