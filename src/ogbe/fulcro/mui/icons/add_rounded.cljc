(ns ogbe.fulcro.mui.icons.add-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AddRounded" :default AddRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-add-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AddRounded)))