(ns ogbe.fulcro.mui.icons.class-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ClassRounded" :default ClassRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-class-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ClassRounded)))