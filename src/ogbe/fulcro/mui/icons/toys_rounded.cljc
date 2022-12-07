(ns ogbe.fulcro.mui.icons.toys-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ToysRounded" :default ToysRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-toys-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ToysRounded)))