(ns ogbe.fulcro.mui.icons.arrow-drop-down-circle
  #?(:cljs (:require
            ["@mui/icons-material/ArrowDropDownCircle" :default ArrowDropDownCircle]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-arrow-drop-down-circle
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ArrowDropDownCircle)))