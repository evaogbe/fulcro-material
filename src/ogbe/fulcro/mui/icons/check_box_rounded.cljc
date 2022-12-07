(ns ogbe.fulcro.mui.icons.check-box-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CheckBoxRounded" :default CheckBoxRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-check-box-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CheckBoxRounded)))