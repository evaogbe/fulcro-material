(ns ogbe.fulcro.mui.icons.add-box-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AddBoxRounded" :default AddBoxRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-add-box-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AddBoxRounded)))