(ns ogbe.fulcro.mui.icons.arrow-drop-down-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ArrowDropDownRounded" :default ArrowDropDownRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-arrow-drop-down-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ArrowDropDownRounded)))