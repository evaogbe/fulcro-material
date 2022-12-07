(ns ogbe.fulcro.mui.icons.arrow-drop-down
  #?(:cljs (:require
            ["@mui/icons-material/ArrowDropDown" :default ArrowDropDown]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-arrow-drop-down
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ArrowDropDown)))