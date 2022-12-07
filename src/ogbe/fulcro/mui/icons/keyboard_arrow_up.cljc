(ns ogbe.fulcro.mui.icons.keyboard-arrow-up
  #?(:cljs (:require
            ["@mui/icons-material/KeyboardArrowUp" :default KeyboardArrowUp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-keyboard-arrow-up
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory KeyboardArrowUp)))