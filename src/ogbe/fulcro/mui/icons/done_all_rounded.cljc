(ns ogbe.fulcro.mui.icons.done-all-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DoneAllRounded" :default DoneAllRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-done-all-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DoneAllRounded)))