(ns ogbe.fulcro.mui.icons.keyboard-arrow-right
  #?(:cljs (:require
            ["@mui/icons-material/KeyboardArrowRight" :default KeyboardArrowRight]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-keyboard-arrow-right
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory KeyboardArrowRight)))