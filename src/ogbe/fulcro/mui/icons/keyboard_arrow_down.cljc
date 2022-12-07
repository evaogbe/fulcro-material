(ns ogbe.fulcro.mui.icons.keyboard-arrow-down
  #?(:cljs (:require
            ["@mui/icons-material/KeyboardArrowDown" :default KeyboardArrowDown]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-keyboard-arrow-down
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory KeyboardArrowDown)))