(ns ogbe.fulcro.mui.icons.keyboard-arrow-left
  #?(:cljs (:require
            ["@mui/icons-material/KeyboardArrowLeft" :default KeyboardArrowLeft]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-keyboard-arrow-left
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory KeyboardArrowLeft)))