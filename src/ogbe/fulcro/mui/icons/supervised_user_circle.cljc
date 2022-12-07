(ns ogbe.fulcro.mui.icons.supervised-user-circle
  #?(:cljs (:require
            ["@mui/icons-material/SupervisedUserCircle" :default SupervisedUserCircle]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-supervised-user-circle
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SupervisedUserCircle)))